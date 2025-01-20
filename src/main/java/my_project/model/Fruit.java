package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Fruit extends GraphicalObject {

    protectet double speed;
    this.speed = 150;

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
