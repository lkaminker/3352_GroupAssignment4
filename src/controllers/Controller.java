package controllers;

public class Controller{

    models.Model model;
    views.View view;

    public Controller(models.Model model, views.View view){

        this.model = model;
        this.view = view;
        this.view.setController(this);

        view.show();
    }

    public void updateModel(String functionNameNumber){

        //split the name from the number
        String functionName = "";
        String functionNumber = "";

        model.setFunctionName(functionName);
        model.setFunctionNumber(functionNumber);

        view.show();
    }
}