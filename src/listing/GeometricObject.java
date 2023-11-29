package listing;

import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dataCreated;

    public GeometricObject(String color, boolean filled) {
        dataCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDataCreated() {
        return dataCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated;
    }

    public String toString() {

        return "created on " + dataCreated + "\ncolor: " + color +
                " and filled: " + filled;
    }
}
