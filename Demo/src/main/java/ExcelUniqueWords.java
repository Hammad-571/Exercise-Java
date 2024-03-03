import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExcelUniqueWords {

    public static void main(String[] args) {
        // List of input file paths
        String[] inputFiles = {"C:\\Users\\hamma\\OneDrive\\Desktop\\output.xlsx", "C:\\Users\\hamma\\Downloads\\finalb.xlsx", "C:\\Users\\hamma\\Downloads\\finalcqc.xlsx"};

        // Set to store unique words from all input files
        Set<String> uniqueWords = new HashSet<String>();


        // Process each input file
        for (String inputFile : inputFiles) {
            processExcelFile(inputFile, uniqueWords);
        }

        // Create a new Excel workbook to write the unique words
        Workbook newWorkbook = new XSSFWorkbook();
        Sheet newSheet = newWorkbook.createSheet("UniqueWords");
        int rownum = 0;

        // Write unique words to the new Excel sheet
        for (String word : uniqueWords) {
            Row newRow = newSheet.createRow(rownum++);
            Cell cell = newRow.createCell(0, CellType.STRING);
            cell.setCellValue(word);
        }

        // Save the new Excel file
        try (FileOutputStream outputStream = new FileOutputStream("C:\\Users\\hamma\\OneDrive\\Desktop\\output.xlsx")) {
            newWorkbook.write(outputStream);
            System.out.println("Unique words have been written to output.xlsx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processExcelFile(String filePath, Set<String> uniqueWords) {
        try (FileInputStream fileInputStream = new FileInputStream(new File(filePath));
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            // Iterate through each sheet in the Excel file
            for (Sheet sheet : workbook) {
                // Iterate through each row in the sheet
                for (Row row : sheet) {
                    // Iterate through each cell in the row
                    for (Cell cell : row) {
                        // Check if the cell contains a string value
                        if (cell.getCellType() == CellType.STRING) {
                            String cellValue = cell.getStringCellValue();

                            // Split the cell value into words and add them to the set
                            String[] words = cellValue.split("\\s+");
                            for (String word : words) {
                                uniqueWords.add(word);
                            }
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
