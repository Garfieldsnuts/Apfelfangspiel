package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

public class Apple extends Fruit {

    public Apple(double x, double y, ProgramController pc){
        super(x,y,pc);
        value = 1;
        this.setNewImage("src/main/resources/graphic/Marcel.png");
    }

}
