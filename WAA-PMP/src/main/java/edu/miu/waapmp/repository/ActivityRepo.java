package edu.miu.waapmp.repository;

import edu.miu.waapmp.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepo extends JpaRepository<Activity, Integer> {
    @Query("SELECT a FROM Activity a where a.status = 'accepted' ORDER BY a.date ASC LIMIT 10")
    List<Activity> getLast10Rented();

    @Query(value = "SELECT a FROM Activity a ORDER BY a.date ASC limit 10")
    List<Activity> getLastActivities();

    @Query("SELECT a FROM Activity a where a.status = 'applied' ORDER BY a.date ASC LIMIT 10")
    List<Activity> getAllApplied();
}
