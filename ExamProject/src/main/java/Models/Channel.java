package Models;

public class Channel extends PathSegment {

    private int lengthInTacts;

    public Channel(String name, double length) {
        super(name);
        this.lengthInTacts = (int) Math.ceil(length / 6 * 60 / 3);
    }

    @Override
    int getLength(Ship ship) {
        return lengthInTacts;
    }

    @Override
    void reset() {
    }

    @Override
    public String toString() {
        return getName();
    }

}
