package models;

public class Model extends Subject{
    private String functionName;
    private String functionNumber;

    public String getFunctionName(){

        return functionName;
    }
    public void setFunctionName(String functionName){
        this.functionName = functionName;
    }

    public String getFunctionNumber(){
        return functionNumber;
    }
    public void setFunctionNumber(String functionNumber){
        this.functionNumber = functionNumber;
    }

}