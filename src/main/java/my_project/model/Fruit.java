package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

public class Fruit extends GraphicalObject {
    // Attribute
    protected double speed;
    protected int value;

    //Referenzen
    private ProgramController pc;

    public Fruit(double x, double y, ProgramController pc){
        this.x = x;
        this.y = y;
        this.pc = pc;
        speed = 150;
    }


    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(255,0,0,255);
        drawTool.drawImage(this.getMyImage(),this.x,this.y);
    }

    //TODO 02 Lege eine Methode jumpBack() an, die bei Aufruf das Apple-Objekt oben am oberen Bildschirmrand an einer zufälligen x-Position positioniert.
    public void  jumpBack(){
        y = -30;
        x = Math.random()*1000;
        pc.addPoints(value);
    }
    @Override
    public void update(double dt) {
        //TODO 03 Eine Birne soll von oben herab fallen. Sobald sie unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 04).
        y = y + speed * dt;
        if (y > 1030) {
            jumpBack();
        }
    }

    public int getValue() {
        return value;
    }


}
