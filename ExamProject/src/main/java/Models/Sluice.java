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
        if (ship.isGoesDown() != this.isDown) {
            return 13;
        } else {
            return 18;
        }
    }

    @Override
    void reset() {
        this.isDown = new Random().nextBoolean();
    }

    @Override
    public String toString() {
        String status = isDown ? "(Камера спущена)" : "(Камера наполнена)";
        return getName() + " " + status;
    }

}
