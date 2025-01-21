package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Pear extends Fruit {

    //Attribute


    public Pear(double x, double y){
        //this.x = x;
        //this.y = y;
        //speed = 150;
        //width = 25;
        //height = 35;
        this.setNewImage("src/main/resources/graphic/forelle.png");
    }


    @Override
    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(0,255,0,255);
        //drawTool.drawFilledRectangle(x,y,width,height);
        //drawTool.setCurrentColor(0,0,0,255);
        //drawTool.drawRectangle(x,y,width,height);
        drawTool.drawImage(this.getMyImage(),this.x,this.y);
    }

    @Override
    public void update(double dt) {
        //TODO 03 Eine Birne soll von oben herab fallen. Sobald sie unten den Bildschirmrand berührt wird die Methode jumpBack() aufgerufen (siehe TODO 04).
        y = y + speed*dt;
        if(y > 1030) {
            jumpBack();
        }
    }

    //TODO 02 Lege eine Methode jumpBack() an, die bei Aufruf das Apple-Objekt oben am oberen Bildschirmrand an einer zufälligen x-Position positioniert.
//    public void  jumpBack(){
//        y = -30;
//        x = Math.random()*1000;
//    }
//}

}

