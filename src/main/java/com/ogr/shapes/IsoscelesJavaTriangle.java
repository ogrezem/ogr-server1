package com.ogr.shapes;

import com.ogr.shapes.Color;

public class IsoscelesJavaTriangle extends Triangle {
    public IsoscelesJavaTriangle(Color color, Double equalSidesLength, Double thirdSideLength) {
        super(color, equalSidesLength, equalSidesLength, thirdSideLength);
        this.equalSidesLength = super.getSidesLength()[0];
        this.thirdSideLength = super.getSidesLength()[2];
    }

    private Color color;
    private Double equalSidesLength;
    private Double thirdSideLength;
    private Double[] sidesLength;

    public Double getEqualSidesLength() {
        return equalSidesLength;
    }

    public Double getThirdSideLength() {
        return thirdSideLength;
    }

    public void printInfo() {

    }
}
