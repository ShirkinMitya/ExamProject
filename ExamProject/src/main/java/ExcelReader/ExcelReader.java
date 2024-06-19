package ExcelReader;

import Models.Channel;
import Models.PathSegment;
import Models.Sluice;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
    
    String filePath = "";

    public List<PathSegment> parseExcel() {
        Map<Double, PathSegment> pathSegments = new TreeMap<>();
        try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }
                String name = row.getCell(0).getStringCellValue();
                double length = row.getCell(1).getNumericCellValue();
                double lowerCoordinate = row.getCell(2).getNumericCellValue();
                String type = row.getCell(4).getStringCellValue();
                if (type.equals("Канал")) {
                    pathSegments.put(lowerCoordinate, new Channel(name, length));
                } else if (type.equals("Шлюз")) {
                    pathSegments.put(lowerCoordinate, new Sluice(name));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pathSegments.values().stream().toList();
    }

}
