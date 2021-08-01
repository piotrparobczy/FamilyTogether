package webapp.FamilyTogether.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "wishlists")
public class Wishlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn
    private User user;
    private String iWant;
    private String link;
    private Boolean sbWillBuyIt;
    @ManyToOne
    @JoinColumn
    private User whoWillBuyIt;

    @Override
    public String toString() {
        return "Wishlist{" +
                "id=" + id +
                ", user=" + user +
                ", iWant='" + iWant + '\'' +
                ", link='" + link + '\'' +
                ", sbWillBuyIt=" + sbWillBuyIt +
                ", whoWillBuyIt=" + whoWillBuyIt +
                '}';
    }
}
