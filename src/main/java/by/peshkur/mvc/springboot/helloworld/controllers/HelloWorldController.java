package by.peshkur.mvc.springboot.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "hello/helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "hello/helloworld";
    }


    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {
        //read request from the HTML form
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo! " + theName;

        //add message to model
        model.addAttribute("message", result);

        return "hello/helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String processFormVersionThree(
            //request param
            @RequestParam("studentName") String theName,
            Model model) {

        theName = theName.toUpperCase();
        String result = "Hey My Friend from v3! " + theName;

        //add message to model
        model.addAttribute("message", result);

        return "hello/helloworld";
    }

}
