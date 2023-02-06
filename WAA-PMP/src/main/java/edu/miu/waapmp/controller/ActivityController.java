package edu.miu.waapmp.controller;

import edu.miu.waapmp.entity.Activity;
import edu.miu.waapmp.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/activities")
public class ActivityController {

   private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }


    @GetMapping
    public List<Activity> getAllActivities(){
        return activityService.getAllActivities();
    }

    @GetMapping("/{id}")
    public Activity getActivityById(@PathVariable int id){
        return activityService.getActivityById(id);
    }

    @PostMapping
    public void saveActitvity(@RequestBody Activity activity){
        activityService.saveActitvity(activity);
    }

    @DeleteMapping("/{id}")

    public void deleteActivityById(@PathVariable int id){
        activityService.deleteActivity(id);
    }

    @PutMapping("/{id}")
    public void updateActivity(@PathVariable int id, @RequestBody Activity activity){
        activityService.updateActivity(id, activity);
    }
}
