package webapp.familyTogether.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import webapp.familyTogether.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserToFamilyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertWithQuery(User user) {
        entityManager.createNativeQuery("INSERT INTO user_family (user, family) VALUES (?,?)")
                .setParameter(1, user.getId())
                .setParameter(2, 1)
                .executeUpdate();
    }
}
