package Models;

public class Channel extends PathSegment {

    private int lengthinTacts;

    public Channel(String name, double length) {
        super(name);
        this.lengthinTacts = (int) Math.ceil(length / 6 * 60 / 3);
    }

    @Override
    int getLength(Ship ship) {
        return lengthinTacts;
    }

}
