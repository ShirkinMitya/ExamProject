package Models;

public abstract class PathSegment {

    private String name;

    public PathSegment(String name) {
        this.name = name;
    }

    abstract int getLength(Ship ship);
    
    abstract void reset();

    public String getName() {
        return name;
    }

}
