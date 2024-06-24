package softwareEngineering.team15.info.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Infoform {
    private Long id;
    private String title;
    private String detail;

    public Infoform(Information information){
        this.id = information.getId();
        this.title = information.getTitle();
        this.detail = information.getDetail();
    }
}
