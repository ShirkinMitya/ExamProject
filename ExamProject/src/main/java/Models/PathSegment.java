package Models;

public abstract class PathSegment {

    private String name;

    public PathSegment(String name) {
        this.name = name;
    }

    abstract int getLength(Ship ship);

    public String getName() {
        return name;
    }

}
