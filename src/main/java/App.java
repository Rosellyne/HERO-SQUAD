import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import static spark.Spark.*;


import static spark.Spark.staticFileLocation;

public class App {

    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());


        get("/hero-form", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Hero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/new/hero",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            String name=req.queryParams("name");
            int age= Integer.parseInt(req.queryParams("age"));
            String power = req.queryParams("power");
            String weakness=req.queryParams("weakness");
            Hero newHero = new Hero(name,age,power,weakness);
            return new ModelAndView(model,"success2.hbs");
        },new HandlebarsTemplateEngine());

        get("/heroes",(req,res)->{
                Map<String, Object> model = new HashMap<>();
                ArrayList<Hero> heroes=Hero.getAll();
                model.put("heroes",Hero.getAll());
                return new ModelAndView(model, "HeroList.hbs");
            }, new HandlebarsTemplateEngine());


        get("/squad-form", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "Squad-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/new/squad",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            String newName=req.queryParams("squad-name");
            int newSize = Integer.parseInt(req.queryParams("squad-size"));
            String newCause=req.queryParams("squad-cause");
            Squad newSquad = new Squad(newName,newSize,newCause);
            int SquadId=newSquad.getId();
            model.put("id",SquadId);
            return new ModelAndView(model,"success1.hbs");

        },new HandlebarsTemplateEngine());


        get("/squad/details/:id",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            int squadId =Integer.parseInt(req.params(":id"));
           Squad newSquad =Squad.find(squadId);
           System.out.println("------------------"+ newSquad.getName());
//           model.put("thisSquad",newSquad);
            model.put("squad-name", newSquad.getName());
            model.put("squad-size", newSquad.getName());
            model.put("squad-cause", newSquad.getName());
            return new ModelAndView(model, "SquadLst.hbs");
        }, new HandlebarsTemplateEngine());




    }

    }
