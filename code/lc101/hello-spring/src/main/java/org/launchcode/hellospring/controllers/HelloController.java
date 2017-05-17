package org.launchcode.hellospring.controllers;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;

/**
 * Created by area on 5/15/17.
 */

@Controller
public class HelloController {

    @RequestMapping(value="")
    @ResponseBody
    public String index(HttpServletRequest request){

        String name = request.getParameter("name");
        String langHello = "Hello ";

        if (name == null) {
            name = "World";
        }

        return "Hello " + name;
    }
    @RequestMapping(value="hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloform() {
        String html = "<form method='post'>" +
                "<input type='text' name='name' />" +
                "<select name='lang'>" +
                "  <option value='english' selected>English</option>" +
                "  <option value='french'>French</option>" +
                "  <option value='spanish'>Spanish</option>" +
                "  <option value='latin'>Latin</option>" +
                "  <option value='greek'>Greek</option>" +
                "</select>" +
                "<input type='submit' value='Greet Me!' />";
        return html;
    }

    @RequestMapping (value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String createMessage(HttpServletRequest request) {
        String name = request.getParameter("name");
        String lang = request.getParameter("langHello");
        String langHello = "Hello ";


    }


    /*@RequestMapping(value="hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request) {

        String name = request.getParameter("name");

        return "Hello " + name;
    }*/

    @RequestMapping(value ="hello/{name}")
    @ResponseBody
    public String helloUrlSegment (@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @RequestWrapper
    @ResponseBody
    public String goodbye(){
        return "Goodbye";
    }
}
