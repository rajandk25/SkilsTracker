package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String listOfSkills(){
        return "<html>" +
                "<body>" +
                "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    public String skillsForm(){
    return "<html>" +
            "<body>" +
            "<form action= 'completedForm' method= 'post'>" +
            "<h2> Name: </h2>" +
            "<input type= 'text' name= 'name'>" +
            "<h2> My favorite language: </h2>" +
            "<select name = 'firstLanguage'>" +
            "<option value= 'java'> Java </option>" +
            "<option value= 'javaScript'> JavaScript </option>" +
            "<option value= 'python'> Python </option>" +
            "</select>" +

            "<h2> My second favorite language: </h2>" +
            "<select name = 'secondLanguage'>" +
            "<option value= 'java'> Java </option>" +
            "<option value= 'javaScript'> JavaScript </option>" +
            "<option value= 'python'> Python </option>" +
            "</select>" +


            "<h2> My third favorite language: </h2>" +
            "<select name = 'thirdLanguage'>" +
            "<option value= 'java'> Java </option>" +
            "<option value= 'javaScript'> JavaScript </option>" +
            "<option value= 'python'> Python </option>" +
            "</select>" +
            "<br>" +
            "<input type= 'submit' value= 'Submit'>"+
            "</form>" +
            "</body>" +
            "</html";

    }

    @PostMapping("completedForm")
    public String completeTheForm(String name, String firstLanguage, String secondLanguage, String thirdLanguage){
        String favorites = "<h1>" + name + "</h1> <h3> 1. " + firstLanguage + "</h3>";
        favorites += "<h3> 2. " + secondLanguage + "</h3>";
        favorites += "<h3> 3. " + thirdLanguage + "</h3>";

        return favorites;
    }
}
