package webapp.FamilyTogether.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "calendar")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //id form family
    private String event;
    private LocalDate date;
    //user_id
}
