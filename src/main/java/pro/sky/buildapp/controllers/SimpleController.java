package pro.sky.buildapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping
    public String initApp() {
        return "Приложение запущено";
    }

    @GetMapping("info")
    public String getProjectInfo() {
        return "Евгний<br>" +
                "buildApp<br>" +
                "30.05.2023<br>" +
                "описание проекта";
    }
}
