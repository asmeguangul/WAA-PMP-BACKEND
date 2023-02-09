package edu.miu.waapmp.controller;

import edu.miu.waapmp.entity.Activity;
import edu.miu.waapmp.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/activities")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ActivityController {

   private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    //@GetMapping
    //public List<Activity> getAllActivities(){
    //    return activityService.getAllActivities();
    //}
//    @GetMapping
//    public List<Activity> getAllActivities(@RequestParam (value = "last10", required = false) String last10) {
//        System.out.println(last10);
//        if(last10 == null) return activityService.getAllActivities();
//        else if(last10.equals("last10")) return activityService.getLast10Rented();
//        else return (List<Activity>) ResponseEntity.ok("Param is not value1");
//    }
    @GetMapping
    public List<Activity> getAllActivities(
            @RequestParam (value = "last10", required = false) String last10,
            @RequestParam (value = "applied", required = false) String status) {
        System.out.println(last10);
        if(last10 == null && status == null) return activityService.getAllActivities();
        else if(last10.equals("last10")) return activityService.getLast10Rented();
        else if (status.equals("applied")) return activityService.getAllApplied();
        else return (List<Activity>) ResponseEntity.ok("Param is not value1");
    }
    @GetMapping("/{id}")
    public Activity getActivityById(@PathVariable int id){
        return activityService.getActivityById(id);
    }

    @PostMapping
    public void saveActitvity(@RequestBody Activity activity){
        activityService.saveActitvity(activity);
    }

    @GetMapping("users")
    public List<Activity> getThe10Activity(@RequestParam(value = "users10", required = false) String users10){
        if(users10==null)
            return activityService.getAllActivities();
        else if(users10.equals("users10"))
            return activityService.getLastActivities();
        else
            return (List<Activity>) ResponseEntity.ok("Param is not value1");

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
