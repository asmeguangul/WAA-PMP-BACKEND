package edu.miu.waapmp.service.impl;

import edu.miu.waapmp.entity.Activity;
import edu.miu.waapmp.repository.ActivityRepo;
import edu.miu.waapmp.service.ActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImp implements ActivityService {

    private final ActivityRepo activityRepo;

    public ActivityServiceImp(ActivityRepo activityRepo) {
        this.activityRepo = activityRepo;
    }

    @Override
    public List<Activity> getAllActivities() {
        return activityRepo.findAll();
    }

    @Override
    public Activity getActivityById(int id) {
        return activityRepo.findById(id).get();
    }

    @Override
    public void saveActitvity(Activity activity) {
        activityRepo.save(activity);
    }

    @Override
    public void deleteActivity(int id) {
     activityRepo.deleteById(id);
    }

    @Override
    public void updateActivity(int id, Activity activity) {
      activityRepo.save(activity);
    }

    @Override
    public List<Activity> getLast10Rented() {
        return activityRepo.getLast10Rented();
    }

    @Override
    public List<Activity> getLastActivities() {
        return activityRepo.getLastActivities();
    }

    @Override
    public List<Activity> getAllApplied() {
        return activityRepo.getAllApplied();
    }
}
