package com;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping(method = RequestMethod.POST, value = "/orderSave", produces = "text/plan")
    public @ResponseBody
    String getFields(InputStream dataStream) {
        try {
            return "test";
        }catch (Exception e){
            return e.getMessage();
        }
    }

}
