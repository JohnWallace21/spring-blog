package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RollDIceController {

    @GetMapping("/roll-dice")
    public String diceRoller() {
        return "roll-dice-form";
    }



    @GetMapping("/roll-dice/{guess}")
    public String play(@PathVariable int guess, Model model) {
        int num = (int )(Math.random() * 6 + 1);
        boolean res = (guess == num);
        model.addAttribute("result", res);
        model.addAttribute("number", num);
        return "dice-results";
    }

}



