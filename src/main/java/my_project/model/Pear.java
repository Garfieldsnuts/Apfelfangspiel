package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;
import my_project.control.ProgramController;

public class Pear extends Fruit {

    public Pear(double x, double y, ProgramController pc) {
        super(x,y,pc);
        value = 2;
        this.setNewImage("src/main/resources/graphic/forelle.png");
    }

}

