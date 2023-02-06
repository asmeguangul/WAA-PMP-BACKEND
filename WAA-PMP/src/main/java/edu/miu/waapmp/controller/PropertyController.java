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
    public List<Property> getAllProperties(){
        return propertyService.getAllProperties();
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
