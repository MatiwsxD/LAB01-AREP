package edu.escuelaing.arep;
import org.json.JSONObject;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(getPort());
        staticFileLocation("/public");
        get("/convertir/:tipo/:numero", (req, res) -> (controlConversor(req.params(":tipo"), req.params(":numero"))));

    }

    public static JSONObject controlConversor(String tipo, String numero){
        Convert x = new Convert();
        String y;
        if(tipo.equals("C")){
            y = x.celToFa(Float.parseFloat(numero));
        }
        else{
            y = x.faToCel(Float.parseFloat(numero));
        }
        JSONObject respuestaJSON = new JSONObject();
        respuestaJSON.put("respuesta",y);
        return  respuestaJSON;

    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set

    }

}
