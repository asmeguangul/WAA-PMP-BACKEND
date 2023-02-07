package edu.miu.waapmp.controller;

import edu.miu.waapmp.entity.Property;
import edu.miu.waapmp.service.PropertyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/properties")
public class PropertyController {
    private final PropertyService propertyService;


    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }


    @GetMapping
    public List<Property> getAllProperties(
            @RequestParam(value = "userID", required = false) Integer userId,
            @RequestParam(value = "price", required = false) Long price,
            @RequestParam(value = "location", required = false) String location,
            @RequestParam(value = "rooms", required = false) Integer rooms,
            @RequestParam(value = "propertyType", required = false) String propertyType,
            @RequestParam(value = "homeType", required = false) String homeType) {
        if(userId != null) return propertyService.getAllPropertiesOfOwner(userId);
        else if (price != null || location !=null || rooms != null || propertyType != null || homeType != null)
            return propertyService.getAllPropertiesByQuery(price, location, rooms, propertyType, homeType);
        else return propertyService.getAllProperties();
    }

    @GetMapping("/{id}")

    public Property getPropertyById(@PathVariable int id){
        return propertyService.getPropertyById(id);
    }

    @PostMapping
    public void saveProperty(@RequestBody Property property){
        propertyService.saveProperty(property);
    }

    @DeleteMapping("/{id}")

    public void deletePropertyById(@PathVariable int id){
        propertyService.deleteProperty(id);
    }

    @PutMapping("/{id}")
    public void updateProperty(@PathVariable int id, @RequestBody Property property){
        propertyService.updateProperty(id, property);
    }
}
