public class Cylinder extends Circle{

    private double height;
    private double square;
    private double volume;

    public Cylinder(final double radius, final double height)
    {
        super(radius);
        setHeight(height);
        this.setSquare();
        this.setVolume();
    }

    public double getVolume()
    {
        return volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height)
    {
        if (height > 0) {
            this.height = height;
        }
        else {
            this.height = 1;
        }
    }

    @Override
    public void setSquare()
    {
        this.square = Math.round(2 * Math.PI * getRadius() * (height + getRadius()) + this.getLength() * height);
    }

    @Override
    public String toString()
    {
        return "\nCylinder\nRadius: " + getRadius() + "\nHeight: " + height + "\nSquare: " + square
                + "\nVolume: " + volume + "\n";
    }

    public void setVolume()
    {
        this.volume = Math.round(Math.PI * Math.pow(getRadius(), 2) * height);
    }
}