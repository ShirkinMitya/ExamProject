package Service;

import Models.PathSegment;
import Models.Route;
import Models.Ship;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Manager {

    private Route route;

    public Manager() {
        this.route = new Route();
    }

    public JPanel createPathSegmentPanel() {
        Set<Integer> shipIndexes = new HashSet<>();
        for (Ship ship : route.getShipList()) {
            shipIndexes.add(ship.getPathSegmentIndex());
        }
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        JLabel labelStart = new JLabel("CП");
        labelStart.setOpaque(true);
        panel.add(labelStart);
        for (int i = 0; i < route.getPath().size(); i++) {
            PathSegment segment = route.getPath().get(i);
            JLabel label = new JLabel(segment.getName());
            label.setOpaque(true);
            if (shipIndexes.contains(i)) {
                label.setBackground(Color.RED);
            } else {
                label.setBackground(Color.YELLOW);
            }
            panel.add(label);
        }
        JLabel labelfinish = new JLabel("CП");
        labelfinish.setOpaque(true);
        panel.add(labelfinish);
        return panel;
    }

}
