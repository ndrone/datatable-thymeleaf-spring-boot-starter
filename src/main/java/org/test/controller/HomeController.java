package org.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.model.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Home Controller
 */
@Controller
public class HomeController
{
    @RequestMapping(value = {"/table"}, method = RequestMethod.GET)
    public String table(Model model)
    {
        List<Person> persons = new ArrayList<>(100);
        for (int i = 0; i < 100; i++)
        {
            Person person = new Person();
            person.setId(String.valueOf(i));
            person.setFirstName("John" + i);
            person.setLastName("Doe" + i);
            persons.add(person);
        }
        model.addAttribute("persons", persons);
        return "table";
    }
}