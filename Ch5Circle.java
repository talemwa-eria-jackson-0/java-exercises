/*
 * Program to put if else statements into practice
 * It allows a user to input the radius and uses it to calculate other values proided it is valid
 * 
 * program works with Ch5Sample.java
 */

 class Ch5Circle {
    //declaring data members
    private static final int INVALID_IDENTIFIER = -1;
    public double radius;

    //constructor
    public Ch5Circle(double r) {
        setRadius(r);               //everytime the object of this class is created, functtion setRadius is called
    }

    //setting radius
    public void setRadius(double r) {
        if (r > 0)
            radius = r;
        else
            radius = INVALID_IDENTIFIER;
    }

    //function to check if radius is valid
    public boolean isRadiusValid() {
        return radius != INVALID_IDENTIFIER;
    }

    //setting diameter
    public void setDiameter(double d) {
        if (d > 0)
            setRadius(d / 2);
        else
            setRadius(INVALID_IDENTIFIER);
            
    }

    //getting radius
    public double getRadius() {
        return radius;
    }

    // getting diameter
    public double getDiameter() {
        double diameter = INVALID_IDENTIFIER;
        if (isRadiusValid())
            diameter = radius * 2;
        return diameter;
    }

    // gettting area
    public double getArea() {
        double area = INVALID_IDENTIFIER;
        if (isRadiusValid())
            area = Math.PI * Math.pow(radius, 2);

        return area;
    }

    //getting circumference
    public double getCircumference() {
        double circumference = INVALID_IDENTIFIER;
        if (isRadiusValid())
            circumference = 2 * Math.PI * radius;

        return circumference;
    }
 }