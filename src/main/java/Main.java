import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;

public class Main {

    static ArrayList<String> items = new ArrayList<>();

    static ArrayList<String> seaCreatures = new ArrayList<>();

    public static void main(String[] args) {


        // Adding new ShoppingItems to the list
        items.add("Shirt");
        items.add("Pants");

        seaCreatures.add("Orca");
        seaCreatures.add("Sea Leopard");
        seaCreatures.add("Colossal Squid");
        seaCreatures.add("Greenland Shark");
        
        Javalin app = Javalin.create().start(4100);

        app.get("/", itemHandler);
        
        app.get("/seaCreatures", scHandler);

    }

    public static Handler itemHandler = ctx -> {
        
        ctx.render("index.jte", Collections.singletonMap("items", items));

    };

    public static Handler scHandler = ctx -> {
        
        ctx.render("seaCreatures.jte", Collections.singletonMap("seaCreatures", seaCreatures));

    };


}
