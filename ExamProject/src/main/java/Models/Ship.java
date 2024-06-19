package Models;

public class Ship {

    private boolean goesDown;
    private int totalTacts;
    private int pathSegmentIndex;
    private int segmentTacts;
    private int CurentSegmentTakts;

    public Ship(boolean goesDown) {
        this.goesDown = goesDown;
        this.totalTacts = 0;
        this.pathSegmentIndex = 0;
        this.segmentTacts = 0;
        this.CurentSegmentTakts = 0;

    }

    public void setGoesDown(boolean goesDown) {
        this.goesDown = goesDown;
    }

    public boolean isGoesDown() {
        return goesDown;
    }

    public int getTotalTacts() {
        return totalTacts;
    }

    public void setTotalTacts(int totalTacts) {
        this.totalTacts = totalTacts;
    }

    public int getPathSegmentIndex() {
        return pathSegmentIndex;
    }

    public void setPathSegmentIndex(int pathSegmentIndex) {
        this.pathSegmentIndex = pathSegmentIndex;
    }

    public int getSegmentTacts() {
        return segmentTacts;
    }

    public void setSegmentTacts(int segmentTacts) {
        this.segmentTacts = segmentTacts;
    }

    public int getCurentSegmentTakts() {
        return CurentSegmentTakts;
    }

    public void setCurentSegmentTakts(int CurentSegmentTakts) {
        this.CurentSegmentTakts = CurentSegmentTakts;
    }

}
