package LandUseChangeDetection;

public class LandUseChangeDetectionResult {
    private double area;
    private int before;
    private int after;

    public LandUseChangeDetectionResult(double area, int before, int after) {
        this.area = area;
        this.before = before;
        this.after = after;
    }
}
