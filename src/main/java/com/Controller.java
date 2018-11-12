package com;


import com.model.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    Route route;

    @RequestMapping(method = RequestMethod.GET, value = "/test", produces = "text/plan")
    public @ResponseBody
    String getFields() {
        try {
            return route.toString();
        }catch (Exception e){
            return e.getMessage();
        }
    }
}
