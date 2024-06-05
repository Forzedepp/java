package lr10.Excel;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class createExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Организация");

        Row headerRow = sheet.createRow(2);
        headerRow.createCell(2).setCellValue("Фамилия");
        headerRow.createCell(3).setCellValue("Должность");
        headerRow.createCell(4).setCellValue("Зарплата");

        Row dataRow1 = sheet.createRow(3);
        dataRow1.createCell(2).setCellValue("Петров");
        dataRow1.createCell(3).setCellValue("Директор");
        dataRow1.createCell(4).setCellValue("5000$");

        Row dataRow2  = sheet.createRow(4);
        dataRow2.createCell(2).setCellValue("Иванов");
        dataRow2.createCell(3).setCellValue("Заместитель директора");
        dataRow2.createCell(4).setCellValue("4500$");

        String filepath = "G:\\Labs\\labs\\src\\lr10\\Excel\\excel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filepath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Файл успешно создан");


    }
}
