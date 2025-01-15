package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Apple extends Fruit {

    //Attribute
    private double speed;

    public Apple(double x, double y){

        speed = 150;

        this.setNewImage("src/main/resources/graphic/Marcel.png");
    }



    @Override
    public void update(double dt) {
        //TODO 01 Ein Apfel soll von oben herab fallen. Sobald er unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 02).
        y = y + speed*dt;
        if(y > 1030) {
            jumpBack();
        }
    }

    //TODO 02 Lege eine Methode jumpBack() an, die bei Aufruf das Apple-Objekt oben am oberen Bildschirmrand an einer zufälligen x-Position positioniert.
    public void  jumpBack(){
        y = -30;
        x = Math.random()*1000;
    }




}
