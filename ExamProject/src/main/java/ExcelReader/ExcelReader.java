package ExcelReader;

import Models.Channel;
import Models.PathSegment;
import Models.Sluice;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    private String filePath = "Data.xlsx";

    public List<PathSegment> parseExcel() throws IOException {
        Map<Double, PathSegment> pathSegments = new TreeMap<>();
        ClassLoader classLoader = ExcelReader.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rowIterator = sheet.iterator();
        if (rowIterator.hasNext()) {
            rowIterator.next();
        }
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            String name = row.getCell(0).getStringCellValue();
            double length = row.getCell(1).getNumericCellValue();
            double lowerCoordinate = row.getCell(2).getNumericCellValue();
            String type = row.getCell(3).getStringCellValue();
            if (type.equals("Канал")) {
                pathSegments.put(lowerCoordinate, new Channel(name, length));
            } else if (type.equals("Шлюз")) {
                pathSegments.put(lowerCoordinate, new Sluice(name));
            }
        }
        workbook.close();
        return new ArrayList<>(pathSegments.values());
    }
}
