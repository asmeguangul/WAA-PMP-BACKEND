package edu.miu.waapmp.repository;

import edu.miu.waapmp.entity.Property;
import edu.miu.waapmp.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepo extends CrudRepository<Users, Integer> {
    @Query("SELECT u.properties FROM Users u  where u.id=1")
    List<Property> getFavoritePropertiesById();
}
