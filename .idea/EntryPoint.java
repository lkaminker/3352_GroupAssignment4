public class Entry Point{
    public static void main(String [] args){

        models.Model m = new models.Model();
        views.View v = new View();

        controllers.Controller c = new controllers.Controller(m,v);
    }
}