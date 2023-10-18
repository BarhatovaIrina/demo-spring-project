package com.example.demospringproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class DayController {

    @GetMapping("/day")
    public String hello(@RequestParam(value = "name", defaultValue = "monday") String name) {
        String day_rus="";
        name = name.toLowerCase(Locale.ROOT);
        switch (name) {
            case ("monday"): day_rus="понедельник";
                break;
            case ("tuesday"): day_rus="вторник";
                break;
            case ("wednesday "): day_rus="среда";
                break;
            case ("thursday "): day_rus="четверг";
                break;
            case ("friday"): day_rus="пятница";
                break;
            case ("saturday "): day_rus="суббота";
                break;
            case ("sunday "): day_rus="воскресенье";
                break;
            default:
                day_rus = "понедельник";
                break;
        }
        return String.format("Сегодня %s!", day_rus);
    }
}
