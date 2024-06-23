package softwareEngineering.team15.user.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class UserStatuses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gender;
    private int age;

    private String hypertension;
    private String heartDisease;
    private String stroke;

    private String smoking;
    private int avg_glucose_level;
    private int BMI;

    private String ever_married;

    private String work_type;
    private String residence_type;


    @OneToOne
    @JoinColumn(name = "user")
    private Users user;

    public UserStatuses(){}
    public void setUserStatuses(Statusform statusform, Users user) {
        this.gender = statusform.getGender();
        this.age = statusform.getAge();
        this.hypertension = statusform.getHypertension();
        this.heartDisease = statusform.getHeartDisease();
        this.stroke = statusform.getStroke();
        this.avg_glucose_level = statusform.getAvg_glucose_level();
        this.BMI = statusform.getBMI();
        this.ever_married = statusform.getEver_married();
        this.work_type = statusform.getWork_type();
        this.residence_type = statusform.getResidence_type();

        this.user = user;
    }
}
