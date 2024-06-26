package Service;

import Gui.Gui;
import Models.PathSegment;
import Models.Route;
import Models.Ship;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;
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
        Set<Integer> shipIndexes = new HashSet<>();
        for (Ship ship : route.getShipList()) {
            if (!ship.isEndPath()) {
                shipIndexes.add(ship.getPathSegmentIndex());
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
            if (shipIndexes.contains(i)) {
                label.setBackground(Color.RED);
            } else {
                label.setBackground(Color.YELLOW);
            }
            panel.add(label);
        }
        JLabel labelfinish = new JLabel("САНКТ-ПЕТЕРБУРГ");
        panel.add(labelfinish);
        return panel;
    }

    public void EndMessege(int numberOfTacts) {
        gui.EndMessage(numberOfTacts);
    }

}
