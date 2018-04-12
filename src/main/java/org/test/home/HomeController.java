package org.test.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Home Controller
 */
@Controller
class HomeController {

    @RequestMapping(value = {"/table"}, method = RequestMethod.GET)
    String table(Model model) {

        List<Person> persons = new ArrayList<>(100);

        for (int i = 0; i < 100; i++) {
            persons.add(new Person(String.valueOf(i), "John" + i, "Doe" + i));
        }

        model.addAttribute("persons", persons);
        return "table";
    }
}