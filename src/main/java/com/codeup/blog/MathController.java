package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class MathController {


    @GetMapping("/add/{first}/and/{second}")
     public @ResponseBody
     String add(@PathVariable int first, @PathVariable int  second) {
        return String.format("%d + %d  = %d ", first,second, first+second) ;
    }


    @GetMapping("/subtract/{first)/from/{second}")
    public @ResponseBody
    String subtract(@PathVariable int first,  @PathVariable int second) {
        return String.format("%d - %d  = %d ", first,second, first-second) ;
    }

    @GetMapping("/multiply/{first)/and/{second}")
    public @ResponseBody
    String multiply(@PathVariable int first, @PathVariable int second) {
        return String.format("%d * %d  = %d ", first,second, first*second) ;
    }


    @GetMapping("/divide/{first)/by/{second}")
    public @ResponseBody
    String divide(@PathVariable int first,@PathVariable int second) {
        return String.format("%d / %d  = %d ", first,second, first/second) ;
    }

}
