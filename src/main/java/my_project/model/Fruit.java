package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

public class Fruit extends GraphicalObject {
    // Attribute
    protected double speed;

    //Refferenzen
    protected Player player01;
    protected ProgramController pc;

    public Fruit(double x,double y, Player player01, ProgramController pc){
        this.x = x;
        this.y = y;
        this.player01 = player01;
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
    }
}
