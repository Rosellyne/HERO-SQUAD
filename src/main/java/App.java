import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.get;
import static spark.Spark.post;
import static spark.Spark.staticFileLocation;

public class App {

    public static void main(String[] args) {

        staticFileLocation("/public");

        
        post("/squad", (request, response) -> { //URL to make new post on POST route
            Map<String, Object> model = new HashMap<>();

            String content = request.queryParams("content");
            Post newSquad = new Post(content);
            model.put("post", newPost);
            return new ModelAndView(model, "success.hbs");
        }, new HandlebarsTemplateEngine());
    }

    get("/squad", (req, res) -> {
        Map<String, Object> model = new HashMap<>();
        return new ModelAndView(model, "newpost-form.hbs");
    }, new HandlebarsTemplateEngine());


}
