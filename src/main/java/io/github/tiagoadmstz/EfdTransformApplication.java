package io.github.tiagoadmstz;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.github.tiagoadmstz.modules.EfdModule;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

public class EfdTransformApplication {

    private final Injector injector = Guice.createInjector(new EfdModule());

    public static void main(String[] args) {
        new EfdTransformApplication().start();
    }

    void start() {
        try {
            final File efdInputFile = FileUtils.getFile("src/main/resources/EFD_CONTRIB_26820241644 teste.txt").getAbsoluteFile();
            //final File efdInputFile = FileUtils.getFile("src/main/resources/SpedPisCofins_08226125000146_20241211_123636.txt").getAbsoluteFile();
            List<String> lines = Files.readAllLines(efdInputFile.toPath(), StandardCharsets.ISO_8859_1);
            lines = lines.stream().filter(line -> line.startsWith("|")).collect(Collectors.toList());
            final EfdFile efdFile = injector.getInstance(EfdFile.class);
            efdFile.setEfdFile(lines);
            System.out.println(efdFile);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
