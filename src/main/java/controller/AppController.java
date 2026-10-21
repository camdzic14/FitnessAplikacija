package controller;


import data.DemoData;
import model.Trainer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class AppController {
    @GetMapping("/trainers")
    public String getTrainers(Model model){
        model.addAttribute("trainers", DemoData.trainers);
        return "listA";
    }
    @GetMapping("/exercise")
    public String getExercise(Model model){
        model.addAttribute("exercise",DemoData.exercises);
        return "listB";
    }
    @GetMapping("/a/action/{id}")
    public String getTrainerAction(Long id,Model model){
        Trainer selectedTrainer = DemoData.trainers.stream()
                .filter(t-> t.getId().equals(id)).findFirst().orElse(null);

        model.addAttribute("trainer",selectedTrainer);
        return "action";
    }


}
