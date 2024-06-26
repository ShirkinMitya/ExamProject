package Models;

import ExcelReader.ExcelReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Route {

    private int totalTacts = 0;
    private List<Ship> shipList = new ArrayList<>();
    private List<PathSegment> path = new ArrayList<>();

    public Route() {
        try {
            path = new ExcelReader().parseExcel();
        } catch (IOException ex) {
            System.out.println("Oшибка при чтении файта" + ex.getMessage());
        }
        shipList.add(new Ship(true));
    }

    public void reset() {
        totalTacts = 0;
        shipList.forEach(s -> s.reset());
        path.forEach(s -> s.reset());
    }

    public boolean nextTact() {
        totalTacts++;
        for (Ship ship : shipList) {
            if (ship.isEndPath()) {
                continue;
            }
            ship.nextTact();
            if (ship.getCurentSegmentTakts() >= ship.getSegmentTacts()) {
                int index = ship.isGoesDown() ? ship.getPathSegmentIndex() + 1 : ship.getPathSegmentIndex() - 1;
                if (index < 0 || index >= path.size()) {
                    ship.setEndPath(true);
                } else {
                    ship.nextPathSegment(path.get(index).getLength(ship), index);
                }
            }
        }
        return shipList.stream().allMatch(s -> s.isEndPath());
    }

    public List<Ship> getShipList() {
        return shipList;
    }

    public List<PathSegment> getPath() {
        return path;
    }

    public int getTotalTacts() {
        return totalTacts;
    }

}
