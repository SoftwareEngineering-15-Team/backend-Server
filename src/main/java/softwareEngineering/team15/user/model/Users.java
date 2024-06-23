package softwareEngineering.team15.user.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "user")
    private UserStatuses userStatus;

}
