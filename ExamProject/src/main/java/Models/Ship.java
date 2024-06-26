package Models;

public class Ship {

    private boolean goesDown;
    private boolean endPath;
    private int totalTacts;
    private int pathSegmentIndex;
    private int segmentTacts;
    private int curentSegmentTacts;

    public Ship(boolean goesDown) {
        this.endPath = false;
        this.goesDown = goesDown;
        this.totalTacts = 0;
        this.pathSegmentIndex = 0;
        this.segmentTacts = 0;
        this.curentSegmentTacts = 0;
    }

    public void nextTact() {
        totalTacts++;
        curentSegmentTacts++;
    }

    public void nextPathSegment(int tacts, int index) {
        pathSegmentIndex = index;
        curentSegmentTacts = 0;
        segmentTacts = tacts;
    }

    public void reset() {
        this.endPath = false;
        this.totalTacts = 0;
        this.pathSegmentIndex = 0;
        this.segmentTacts = 0;
        this.curentSegmentTacts = 0;
    }

    public boolean isGoesDown() {
        return goesDown;
    }

    public boolean isEndPath() {
        return endPath;
    }

    public void setGoesDown(boolean goesDown) {
        this.goesDown = goesDown;
    }

    public void setEndPath(boolean endPath) {
        this.endPath = endPath;
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
        return curentSegmentTacts;
    }

    public void setCurentSegmentTakts(int CurentSegmentTakts) {
        this.curentSegmentTacts = CurentSegmentTakts;
    }

}
