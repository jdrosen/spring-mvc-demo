package net.jdrosen.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //Controller method for initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //Controller method to process the form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    // new controller method to read form data
    // add data to the model

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        // read request param

        String theName = request.getParameter("studentName");

        // covert the data to all capps
        theName = theName.toUpperCase();

        // create the message
        String result = "Yo! " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return("helloworld");

    }

    @RequestMapping("/processFormVersionThree")
    public String letsShoutDude(
            @RequestParam("studentName") String theName,
            Model model) {

        // covert the data to all capps
        theName = theName.toUpperCase();

        // create the message
        String result = "New Message using RParam " + theName;

        // add message to the model
        model.addAttribute("message", result);

        return("helloworld");

    }
}
