package com.coco.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author cocoLin
 * @create 2021-07-19 7:26
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/say")
    public ModelAndView sayHello(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","hello springboot!!");
        mv.setViewName("say");
        return mv;
    }
}
