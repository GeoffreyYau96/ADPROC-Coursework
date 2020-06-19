/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework;

import java.text.DecimalFormat;

/**
 *
 * @author up819561, up823183
 */
public abstract class pipeAbstract {

    //Create varibles for holding the pipe info and calculation
    protected double length, diameter, radius, volume, cost, basicCost, addInsulation, addReinforcement, addResistance, addColour;
    protected int grade, colour, quantity;
    protected boolean insulation, reinforcement, resistance;
    protected double[] costPerInch = {0.4, 0.6, 0.75, 0.8, 0.95};
    protected double[] colourCost = {0, 0.12, 0.16};
    protected int pipeType;

    //Empty cunstructor
    public pipeAbstract() {
    }

    //Constructor
    public pipeAbstract(double pipeLength, double pipeDiameter, int pipeGrade, int pipeColour, boolean pipeInsulation, boolean pipeReinforcement, boolean pipeResistence, int pipeQuantity) {
        length = pipeLength * 39.37;    //meters to inches
        diameter = pipeDiameter;
        radius = diameter / 2;
        grade = pipeGrade;
        colour = pipeColour;
        insulation = pipeInsulation;
        reinforcement = pipeReinforcement;
        resistance = pipeResistence;
        quantity = pipeQuantity;
    }

    //Accessors - return the corresponding varilbe
    public double getLength() {
        return length / 39.37;
    }

    public double getDiameter() {
        return diameter;
    }

    public int getGrade() {
        return grade;
    }

    public int getColour() {
        return colour;
    }

    public boolean getInsulation() {
        return insulation;
    }

    public boolean getReinforcement() {
        return reinforcement;
    }

    public boolean getResistance() {
        return resistance;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getRadius() {
        return radius;
    }

    public double getVolume() {
        return volume;
    }

    public double getCost() {
        return cost;
    }

    //OTHER METHODS
    //Print info to the textArea box
    public String printInfo() {
        double price = calcTotalCost();
        DecimalFormat df = new DecimalFormat("£#,##0.00");
        return getType() + "\n"+"Length:"+getLength()+ "\n"+"Diameter:"+getDiameter()+ "\n"+"Plastic grade: "+getGrade()+ "\n"+"Colour: "+getColour()+ "\n"+"Insulation: "+getInsulation()+"\n"+"Reinforcement: "+getReinforcement()+ "\n"+"Resistance: "+getResistance()+ "\n"+"Cost: "+df.format(price) + "\n\n";
    }

    //Calculate and return the pipe volume
    public double calcVolume(double length, double radius) {
        //Whole volume  - inner volume
        volume = ((Math.PI * Math.pow(radius, 2) * length) - (Math.PI * Math.pow(radius * 0.9, 2) * length));
        return volume;
    }
    
    //Calculate and return the basic pipe cost (base cost * quantity)
    public double calcBasicCost() {
        this.volume = calcVolume(length, radius);
        basicCost = volume * costPerInch[grade - 1];
        return basicCost * quantity;
    }

    //Return the pipeType
    public abstract String getType();

    //Return the Total cost
    public abstract double calcTotalCost();
}
