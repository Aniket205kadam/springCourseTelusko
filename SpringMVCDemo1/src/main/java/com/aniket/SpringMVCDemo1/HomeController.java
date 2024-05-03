package com.aniket.SpringMVCDemo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    //its return the view technology
//    @RequestMapping("/")
//    public String home() {
//        System.out.println("home() method called");
//        return "index";
//    }
    @RequestMapping("/")
    public ModelAndView home(ModelAndView modelAndView) {
        System.out.println("home() method called");
        modelAndView.setViewName("index");
        return modelAndView;
    }

//    @RequestMapping("add")
//    public String add(HttpServletRequest request, HttpSession session) {
//        //this is the servlet way not the spring way
//        //the request object is assign by the spring
//        //the session object is assign by the spring
//
//        int num1 = Integer.parseInt(request.getParameter("num1"));
//        int num2 = Integer.parseInt(request.getParameter("num2"));
//        int result = num1 + num2;
//        System.out.println("Result is: " + result);
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }

//    @RequestMapping("add")
//    public String add(@RequestParam("num1") int num, @RequestParam int num2, HttpSession session) {
//        int result = num + num2;
//
//        session.setAttribute("result", result);
//        return "result.jsp";
//    }

/*use Model object*/
//@RequestMapping("add")
//public String add(@RequestParam("num1") int num, @RequestParam int num2, Model model) {
//    int result = num + num2;
//
//    model.addAttribute("result", result);
//    return "result";
//}

    @RequestMapping("add")
    public ModelAndView add(int num1, int num2, ModelAndView modelAndView) {
        int result = num1 + num2;

        modelAndView.addObject("result", result);
        modelAndView.setViewName("result");

        return modelAndView;
    }

//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int id, @RequestParam("aname") String name, ModelAndView modelAndView) {
//        Alien alien = new Alien();
//        alien.setId(id);
//        alien.setName(name);
//
//        modelAndView.addObject("alien", alien);
//        modelAndView.setViewName("showAlien");
//
//        return modelAndView;
//    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien /*, Model model*/) {
//    public String addAlien(@ModelAttribute("programmer") Alien alien) {
        //for course object
//        String courseIs = "java";
//        model.addAttribute("course", courseIs);
        return "showAlien";
    }

    @ModelAttribute("course")
    public String courseName() {
        String courseIs = "java";

        return courseIs;
    }
}

