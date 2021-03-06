package webapp.familyTogether.model;

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
                ", whoWillBuyIt=" + whoWillBuyIt +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getiWant() {
        return iWant;
    }

    public void setiWant(String iWant) {
        this.iWant = iWant;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public User getWhoWillBuyIt() {
        return whoWillBuyIt;
    }

    public void setWhoWillBuyIt(User whoWillBuyIt) {
        this.whoWillBuyIt = whoWillBuyIt;
    }
}
