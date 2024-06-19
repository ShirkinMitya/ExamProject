package Models;

import java.util.Random;

public class Sluice extends PathSegment {

    private boolean isDown;

    public Sluice(String name) {
        super(name);
        this.isDown = new Random().nextBoolean();
    }

    @Override
    int getLength(Ship ship) {
        if (ship.isGoesDown()!= this.isDown) {
            return 18;
        } else {
            return 13;
        }
    }
}
