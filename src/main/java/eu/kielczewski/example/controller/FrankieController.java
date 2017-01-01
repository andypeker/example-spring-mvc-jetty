package eu.kielczewski.example.controller;

/**
 * Created by franklin on 1/1/2017.
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SuppressWarnings("UnusedDeclaration")
public class FrankieController {

    @RequestMapping(value = "/frankie", method = RequestMethod.GET)
    @ResponseBody
    public String showFrankie() {
        return "Frankie Yang";
    }

}
