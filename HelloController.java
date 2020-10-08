package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
        String[] names = {"tuyano","hanako","taro","sachiko","ichiro"};
        String[] mails = {"syoda@tuuyano.com","hanako@flower","taro@yamada","sachiko@happy","ichiro@baseball"};

        @RequestMapping("/{id}")
        public ModelAndView index(@PathVariable int id, ModelAndView mav){
            mav.setViewName("index");
            mav.addObject("id", id);
            mav.addObject("check",id % 2 == 0);
            mav.addObject("trueVal","Even number!");
            mav.addObject("falseVal","Odd number...");
            return mav;

        }
}
class DataObject{
    private int id;
    private String name;
    private String value;


public DataObject(int id,String name,String value){
    super();
    this.id = id;
    this.name = name;
    this.value = value;
}

public int getId(){
    return id;
}
public void setId(int id){
    this.id = id;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public String getValue(){
    return value;
}
public void setValue(String value){
        this.value= value;
}
}

