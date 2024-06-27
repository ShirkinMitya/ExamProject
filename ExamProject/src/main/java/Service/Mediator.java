package Service;

import Gui.Gui;
import Models.PathSegment;
import Models.Route;
import Models.Ship;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Mediator {

    Gui gui;

    public Mediator(Gui gui) {
        this.gui = gui;
    }

    public void updateGui(Route route) {
        gui.replacePanelInScrollPane(createPathSegmentPanel(route));
        gui.updateNumberOfTacts(route.getTotalTacts());
    }

    private JPanel createPathSegmentPanel(Route route) {
        Map<Integer, List<Ship>> shipIndexes = new HashMap<>();
        for (Ship ship : route.getShipList()) {
            if (!ship.isEndPath()) {
                int indexofShip = ship.getPathSegmentIndex();
                if (shipIndexes.containsKey(indexofShip)) {
                    List<Ship> shipList = shipIndexes.get(indexofShip);
                    shipList.add(ship);
                    continue;
                }
                List<Ship> shipList = new ArrayList<>();
                shipList.add(ship);
                shipIndexes.put(indexofShip, shipList);
            }
        }
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JLabel labelStart = new JLabel("МОСКВА");
        panel.add(labelStart);
        for (int i = 0; i < route.getPath().size(); i++) {
            PathSegment segment = route.getPath().get(i);
            JLabel label = new JLabel(segment.toString());
            label.setOpaque(true);
            if (shipIndexes.containsKey(i)) {
                List<Ship> shipList = shipIndexes.get(i);
                if (shipList.size() > 1) {
                    label.setBackground(Color.BLUE);
                } else {
                    label.setBackground(shipList.get(0).isGoesDown() ? Color.RED : Color.GREEN);
                }
            } else {
                label.setBackground(Color.YELLOW);
            }
            panel.add(label);
        }
        JLabel labelfinish = new JLabel("САНКТ-ПЕТЕРБУРГ");
        panel.add(labelfinish);
        return panel;
    }

    public void EndMessage(List<Integer> totalTactsForEachShip, int totalTacts) {
        gui.endMessage(totalTacts, totalTactsForEachShip);
    }

}
