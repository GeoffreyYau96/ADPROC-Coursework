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
public class pipeOne extends pipeAbstract {

    //Creates a new instance of Pipe Type 1
    public pipeOne() {
    }

    //Constructor
    public pipeOne(double pipeLength, double pipeDiameter, int pipeGrade, int pipeColour, boolean pipeInsulation, boolean pipeReinforcement, boolean pipeResistence, int pipeQuantity) {
        super(pipeLength, pipeDiameter, pipeGrade, 0, false, false, pipeResistence, pipeQuantity);
    }

    // overide the method to return the total cost of pipeOne with or without the Resistence plus any additonal cost
    @Override
    public double calcTotalCost() {
        basicCost = calcBasicCost();
        addColour = basicCost * colourCost[colour];
        if (getResistance() == true) {
            addResistance = basicCost * 0.14;
            cost = basicCost + addResistance;
        } else {
            cost = basicCost;
        }
        return cost;
    }

    // overide the metheod to return the name, pipeOne
    @Override
    public String getType() {
        return "Pipe Type One";
    }
}
