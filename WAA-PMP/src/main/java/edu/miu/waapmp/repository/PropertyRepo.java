package edu.miu.waapmp.repository;

import edu.miu.waapmp.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PropertyRepo extends JpaRepository<Property, Integer> {
    //@Query("SELECT p FROM Property p JOIN p.users u WHERE u.id = :userId AND p. = 'OWNER'")
    @Query("SELECT p FROM Property p")
    List<Property> getAllPropertiesOfOwner(Integer userId);

//    @Query("SELECT p\n" +
//        "FROM Property p\n" +
//        "WHERE (p.price IS NULL OR p.price = :price)\n" +
//        "AND (p.location IS NULL OR p.location = :location)\n" +
//        "AND (p.numberOfRooms IS NULL OR p.numberOfRooms = :rooms)\n" +
//        "AND (p.propertyType IS NULL OR p.propertyType = :propertyType)\n" +
//        "AND (p.homeType IS NULL OR p.homeType = :homeType)")
   // @Query("SELECT p FROM Property p where p.numberOfRooms = :rooms")
@Query("SELECT p FROM Property p\n" +
        "WHERE (:price IS NULL OR p.price <= :price)\n" +
        "AND (:location IS NULL OR p.location = :location)\n" +
        "AND (:rooms IS NULL OR p.numberOfRooms = :rooms)\n" +
        "AND (:propertyType IS NULL OR p.propertyType = :propertyType)\n" +
        "AND (:homeType IS NULL OR p.homeType = :homeType)")

List<Property> getAllPropertiesByQuery(Long price, String location, Integer rooms, String propertyType, String homeType);
}
