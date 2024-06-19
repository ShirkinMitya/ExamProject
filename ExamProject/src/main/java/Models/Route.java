package Models;

import ExcelReader.ExcelReader;
import java.util.ArrayList;
import java.util.List;

public class Route {

    private List<Ship> shipList = new ArrayList<>();
    private List<PathSegment> path = new ArrayList<>();

    public Route() {
        path = new ExcelReader().parseExcel();
        shipList.add(new Ship(true));
    }

    
}
