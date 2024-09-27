package com.navindu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }

    @RequestMapping("/")
    public String home(){        // Responsible to call the index.jsp
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv){

        // Get the value from the req object. Because when a client sends a request to the server,
        // the request object will have all the data. So we just have to fetch the data. So you have to say get parameter.
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));

        int result = num1 + num2;

//        session.setAttribute("result", result);

//        model.addAttribute("result", result);

        mv.addObject("result", result);
        mv.setViewName("result");

        return mv;
    }

    @RequestMapping("addAlien")
    public String addAlien(@ModelAttribute Alien alien){

//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);

//        mv.addObject("alien", alien);
//        mv.setViewName("result");

        return "result";
    }

}