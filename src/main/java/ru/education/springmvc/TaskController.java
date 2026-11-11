package ru.education.springmvc;

import java.time.OffsetDateTime;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    @GetMapping(value = "/about", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    public String about() {
        return "Имя: Илья, группа: РИМ-250950";
    }

    @GetMapping(value = "/time", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    public String time() {
        return OffsetDateTime.now().toString();
    }

    @GetMapping(value = "/length", produces = MediaType.TEXT_PLAIN_VALUE + ";charset=UTF-8")
    public String length(@RequestParam(name = "text") String text) {
        return String.valueOf(text.length());
    }
}
