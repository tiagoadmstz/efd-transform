package io.github.tiagoadmstz.commons;

import io.github.tiagoadmstz.interfaces.IEfdBlockPart;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Objects;
import java.util.StringJoiner;

import static org.apache.commons.lang3.StringUtils.defaultIfBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

public abstract class AbstractEfdBlockPart implements IEfdBlockPart {

    protected final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");

    @Override
    public void setBySplitedLine(String[] fields) {
        try {
            final Field regField = getClass().getDeclaredField("reg");
            regField.setAccessible(true);
            final String regValue = regField.get(this).toString();

            if (regValue.equals(fields[1])) {
                int cont = 2;
                int fieldsCont = 1;
                final Field[] declaredFields = getClass().getDeclaredFields();
                if (declaredFields.length > 1) {
                    for (int i = 2; i < fields.length; i++) {
                        if (declaredFields.length != fieldsCont) {
                            final Field field = declaredFields[fieldsCont++];
                            field.setAccessible(true);
                            final String entryValue = fields[cont++];
                            if (field.getType().equals(Number.class)) {
                                field.set(this, isNotBlank(entryValue) ? Long.parseLong(entryValue) : null);
                            } else if (field.getType().equals(BigDecimal.class)) {
                                final NumberFormat numberFormat = NumberFormat.getInstance(Locale.of("pt", "BR"));
                                field.set(this, isNotBlank(entryValue) ? new BigDecimal(numberFormat.parse(entryValue).toString()) : null);
                            } else if (field.getType().equals(LocalDate.class)) {
                                field.set(this, isNotBlank(entryValue) ? LocalDate.parse(entryValue, dateTimeFormatter) : null);
                            } else if (field.getType().equals(String.class)) {
                                field.set(this, defaultIfBlank(entryValue, null));
                            }
                        }
                    }
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public String toTxtFormat() {
        if (isAllNull()) return null;
        try {
            final StringJoiner stringJoiner = new StringJoiner("|").add("");
            final Field[] fields = getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                final Object value = field.get(this);
                if (value instanceof LocalDate) {
                    stringJoiner.add(value != null ? ((LocalDate) value).format(dateTimeFormatter) : "");
                } else if (value instanceof BigDecimal) {
                    stringJoiner.add(value != null ? String.format("%.2f", value).replace(".", ",") : "");
                } else {
                    stringJoiner.add(value != null ? value.toString() : "");
                }
            }
            return stringJoiner.add("").toString();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean isAllNull() {
        try {
            final Field[] fields = getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                final Object value = field.get(this);
                if (!"reg".equalsIgnoreCase(field.getName()) && Objects.nonNull(value)) {
                    return false;
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean isAllNonNull() {
        return !isAllNull();
    }
}
