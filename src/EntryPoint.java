public class EntryPoint {
    public static void main(String [] args){

        models.Model m = new models.Model();
        views.View v = new views.View();

        controllers.Controller c = new controllers.Controller(m,v);
    }
}