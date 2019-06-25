import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


import static javax.swing.UIManager.get;
import static spark.Spark.staticFileLocation;
import static spark.route.HttpMethod.get;

public class App {

    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/hero- form", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Hero-form.hbs");
        }, new HandlebarsTemplateEngine());


        get("/squad- form", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Squad-form.hbs");
        }, new HandlebarsTemplateEngine());


    }

    }
