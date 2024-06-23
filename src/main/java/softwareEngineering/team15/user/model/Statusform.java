package softwareEngineering.team15.user.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Statusform {
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

    public Statusform setStatus(UserStatuses userStatuses){
        this.gender = userStatuses.getGender();
        this.age = userStatuses.getAge();
        this.hypertension = userStatuses.getHypertension();
        this.heartDisease = userStatuses.getHeartDisease();
        this.stroke = userStatuses.getStroke();
        this.smoking = userStatuses.getSmoking();
        this.avg_glucose_level = userStatuses.getAvg_glucose_level();
        this.BMI = userStatuses.getBMI();
        this.ever_married = userStatuses.getEver_married();
        this.work_type = userStatuses.getWork_type();
        this.residence_type = userStatuses.getResidence_type();

        return this;
    }

}
