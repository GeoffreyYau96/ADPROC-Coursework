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
public class pipeThree extends pipeAbstract {

    //Creates a new instance of Pipe Type 1
    public pipeThree() {
    }

    //Constructor
    public pipeThree(double pipeLength, double pipeDiameter, int pipeGrade, int pipeColour, boolean pipeInsulation, boolean pipeReinforcement, boolean pipeResistence, int pipeQuantity) {
        super(pipeLength, pipeDiameter, pipeGrade, 2, false, false, pipeReinforcement, pipeQuantity);
    }

    // overide the method to return the total cost of pipeThree with or without the Resistence plus any additonal cost
    @Override
    public double calcTotalCost() {
        basicCost = calcBasicCost();
        addColour = basicCost * colourCost[colour];
        if (getResistance() == true) {
            addResistance = basicCost * 0.14;
            cost = basicCost + addResistance + addColour;
        } else {
            cost = basicCost + addColour;
        }
        return cost;
    }

    // overide the metheod to return the name, pipeThree
    @Override
    public String getType() {
        return "Pipe Type Three";
    }

}
