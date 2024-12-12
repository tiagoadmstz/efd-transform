package io.github.tiagoadmstz.blocks.zero;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.tiagoadmstz.annotations.EfdBlockPart;
import io.github.tiagoadmstz.commons.AbstractEfdBlockPart;
import lombok.Data;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

@Data
@EfdBlockPart(register = "0000", order = 1)
public class AberturaArquivoDigital extends AbstractEfdBlockPart {

    private final String reg = "0000";
    private String codVer;
    private String tipoEscrit;
    private String indSitEsp;
    private String numRecAnterior;
    private LocalDate dtIni;
    private LocalDate dtFin;
    private String nome;
    private String cnpj;
    private String uf;
    private String codMun;
    private String suframa;
    private String indNatPJ;
    private String indAtiv;

    public void writeToExcel(String filePath) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            // Criar uma nova planilha para este objeto FileOpen
            Sheet sheet = workbook.createSheet(reg);

            // Criar o cabeçalho
            Row headerRow = sheet.createRow(0);
            String[] headers = {"Reg", "CodVer", "TipoEscrit", "IndSitEsp", "NumRecAnterior", "DtIni", "DtFin", "Nome", "CNPJ", "UF", "CodMun", "Suframa", "IndNatPJ", "IndAtiv"};
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Criar a linha com os dados
            Row dataRow = sheet.createRow(1);
            dataRow.createCell(0).setCellValue(reg);
            dataRow.createCell(1).setCellValue(codVer);
            dataRow.createCell(2).setCellValue(tipoEscrit);
            dataRow.createCell(3).setCellValue(indSitEsp != null ? indSitEsp : "");
            dataRow.createCell(4).setCellValue(numRecAnterior != null ? numRecAnterior : "");
            dataRow.createCell(5).setCellValue(dtIni != null ? dtIni.toString() : "");
            dataRow.createCell(6).setCellValue(dtFin != null ? dtFin.toString() : "");
            dataRow.createCell(7).setCellValue(nome != null ? nome : "");
            dataRow.createCell(8).setCellValue(cnpj != null ? cnpj : "");
            dataRow.createCell(9).setCellValue(uf != null ? uf : "");
            dataRow.createCell(10).setCellValue(codMun != null ? codMun : "");
            dataRow.createCell(11).setCellValue(suframa != null ? suframa : "");
            dataRow.createCell(12).setCellValue(indNatPJ != null ? indNatPJ : "");
            dataRow.createCell(13).setCellValue(indAtiv != null ? indAtiv : "");

            // Escrever o arquivo no disco
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
            }
        }
    }

    public void writeToTxtFile(String filePath) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(toTxtFormat());
        }
    }

    private String toJson() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(this);
    }

    public void writeToJsonFile(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(filePath), this);
    }
}
