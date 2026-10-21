package model;

public class Exercise {

    private Long Id;
    private String title;
    private String category;
    private Trainer trainer;

    public Exercise(Long id, String title, String category, Trainer trainer) {
        Id = id;
        this.title = title;
        this.category = category;
        this.trainer = trainer;
    }

    public Long getId() {
        return Id;
    }


    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
