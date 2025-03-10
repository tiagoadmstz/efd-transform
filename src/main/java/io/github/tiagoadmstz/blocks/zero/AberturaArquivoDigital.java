package io.github.tiagoadmstz.blocks.zero;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.tiagoadmstz.interfaces.EfdBlockPart;
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
import java.util.List;

@Data
public class AberturaArquivoDigital implements EfdBlockPart {

    @JsonProperty("registro")
    private String register = "0000";
    @JsonProperty("versao")
    private String codVer;
    @JsonProperty("tipo-escrita")
    private String tipoEscrit;
    @JsonProperty("ind-sit-esp")
    private String indSitEsp;
    @JsonProperty("numero-rec-anterior")
    private String numRecAnterior;
    @JsonProperty("data-inicio")
    private LocalDate dtIni;
    @JsonProperty("data-final")
    private LocalDate dtFin;
    @JsonProperty("nome")
    private String nome;
    @JsonProperty("cnpj")
    private String cnpj;
    @JsonProperty("uf")
    private String uf;
    @JsonProperty("codigo-municipio")
    private String codMun;
    @JsonProperty("suframa")
    private String suframa;
    @JsonProperty("ind-nat-pessoa-juridica")
    private String indNatPJ;
    @JsonProperty("ind-ativo")
    private String indAtiv;

    public void writeToExcel(String filePath) throws IOException {
        try (Workbook workbook = new XSSFWorkbook()) {
            // Criar uma nova planilha para este objeto FileOpen
            Sheet sheet = workbook.createSheet(register);

            // Criar o cabeçalho
            Row headerRow = sheet.createRow(0);
            String[] headers = {"Reg", "CodVer", "TipoEscrit", "IndSitEsp", "NumRecAnterior", "DtIni", "DtFin", "Nome", "CNPJ", "UF", "CodMun", "Suframa", "IndNatPJ", "IndAtiv"};
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Criar a linha com os dados
            Row dataRow = sheet.createRow(1);
            dataRow.createCell(0).setCellValue(register);
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
            //writer.write(toTxtFormat());
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
