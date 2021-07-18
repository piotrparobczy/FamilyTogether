package webapp.FamilyTogether.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "families")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String designation;

}
