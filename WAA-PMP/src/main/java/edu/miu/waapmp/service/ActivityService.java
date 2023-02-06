package edu.miu.waapmp.service;

import edu.miu.waapmp.entity.Activity;

import java.util.List;

public interface ActivityService {

    public List<Activity> getAllActivities();
    public Activity getActivityById(int id);
    public void saveActitvity(Activity activity);
    public void deleteActivity(int id);
    public void updateActivity(int id, Activity activity);

}
