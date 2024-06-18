package explore.Hagar.swaggerboot.repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import explore.Hagar.swaggerboot.entity.UserEntity;

import java.util.List;
@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
    UserEntity findByName(String name);
    List<UserEntity> findAll();
    UserEntity findByNameAndEmail(String name, String email);
}