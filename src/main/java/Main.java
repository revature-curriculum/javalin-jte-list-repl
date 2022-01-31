import io.javalin.Javalin;
import java.util.*;
import io.javalin.http.Handler;

public class Main {

    static ArrayList<String> items = new ArrayList<>();

    public static void main(String[] args) {


        // Adding new ShoppingItems to the list
        items.add("Shirt");
        items.add("Pants");
        
        Javalin app = Javalin.create().start(4100);

        app.get("/", itemHandler);

    }

    public static Handler itemHandler = ctx -> {
        
        ctx.render("index.jte", Collections.singletonMap("items", items));

    };


}
