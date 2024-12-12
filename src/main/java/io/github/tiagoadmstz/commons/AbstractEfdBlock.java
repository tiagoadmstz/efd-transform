package io.github.tiagoadmstz.commons;

import io.github.tiagoadmstz.annotations.EfdBlock;
import io.github.tiagoadmstz.interfaces.IEfdBlock;
import io.github.tiagoadmstz.interfaces.IEfdBlockPart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public abstract class AbstractEfdBlock implements IEfdBlock {

    protected final Map<String, Object> blockParts = HashMap.newHashMap(1);

    public void setList(final String blockIndex, List<String> lines, Class<? extends IEfdBlockPart> blockPartType) {
        final List<String> stringList = lines.stream().filter(s -> s.startsWith("|" + blockIndex + "|")).collect(Collectors.toList());
        final List<IEfdBlockPart> list = (List<IEfdBlockPart>) blockParts.get(blockIndex);
        stringList.forEach(line -> {
            try {
                final IEfdBlockPart abstractEfdBlockPart = blockPartType.getConstructor().newInstance();
                abstractEfdBlockPart.setBySplitedLine(line.split("\\|"));
                list.add(abstractEfdBlockPart);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    @Override
    public void setBySplitedLine(String[] fields) {
        try {
            final EfdBlock[] declaredAnnotationsByType = this.getClass().getDeclaredAnnotationsByType(EfdBlock.class);
            getClass().getDeclaredAnnotation(EfdBlock.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (fields[1].startsWith("0")) {
            final Object blockPart = blockParts.get(fields[1]);
            if (blockPart instanceof IEfdBlockPart) {
                ((IEfdBlockPart) blockParts.get(fields[1])).setBySplitedLine(fields);
            }
        }
    }

    @Override
    public String toTxtFormat() {
        final StringJoiner stringJoiner = new StringJoiner("\n");
        blockParts.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEachOrdered(entry -> {
                    final Object blockPart = entry.getValue();
                    if (blockPart instanceof List) {
                        ((List<IEfdBlockPart>) blockPart).forEach(efdBlockPart -> stringJoiner.add(efdBlockPart.toTxtFormat()));
                    } else {
                        final IEfdBlockPart efdBlock = (IEfdBlockPart) entry.getValue();
                        if (efdBlock.isAllNonNull()) stringJoiner.add(efdBlock.toTxtFormat());
                    }
                });
        return stringJoiner.toString();
    }
}
