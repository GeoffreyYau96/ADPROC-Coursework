/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacoursework;

/**
 *
 * @author up819561, up823183
 */
public class pipeFour extends pipeThree {

    //Creates a new instance of Pipe Type 1
    public pipeFour() {
    }

    //Constructor
    public pipeFour(double pipeLength, double pipeDiameter, int pipeGrade, int pipeColour, boolean pipeInsulation, boolean pipeReinforcement, boolean pipeResistence, int pipeQuantity) {
        super(pipeLength, pipeDiameter, pipeGrade, 2, true, false, pipeReinforcement, pipeQuantity);
    }

    // overide the method to return the total cost of pipeFour with or without the Resistence plus any additonal cost
    @Override
    public double calcTotalCost() {
        basicCost = calcBasicCost();
        addColour = basicCost * colourCost[colour];
        addInsulation = basicCost * 0.13;
        if (getResistance() == true) {
            addResistance = basicCost * 0.14;
            cost = basicCost + addResistance + addColour + addInsulation;
        } else {
            cost = basicCost + addColour + addInsulation;
        }
        return cost;
    }

    // overide the metheod to return the name, pipeFour
    @Override
    public String getType() {
        return "Pipe Type Four";
    }

}
