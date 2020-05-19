package troney.springframework.joke.jokeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import troney.springframework.joke.jokeapp.services.JokeService;
@Controller
public class JokeController {
    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    private String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());

        return "chucknorris";


    }
}
