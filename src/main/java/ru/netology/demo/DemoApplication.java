package ru.netology.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @RestController
    @RequestMapping("/")
    public class ProfileController {
        private SystemProfile profile;

        public ProfileController(SystemProfile profile) {
            this.profile = profile;
        }

        @GetMapping("profile")
        public String getProfile() {
            return profile.getProfile();
        }
    }
}