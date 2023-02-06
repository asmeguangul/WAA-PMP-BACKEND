package edu.miu.waapmp.service.impl;

import edu.miu.waapmp.entity.Property;
import edu.miu.waapmp.repository.PropertyRepo;
import edu.miu.waapmp.service.PropertyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImp implements PropertyService {

    private final PropertyRepo propertyRepo;

    public PropertyServiceImp(PropertyRepo propertyRepo) {
        this.propertyRepo = propertyRepo;
    }

    @Override
    public List<Property> getAllProperties() {
        return propertyRepo.findAll();
    }

    @Override
    public Property getPropertyById(int id) {
        return propertyRepo.findById(id).get();
    }

    @Override
    public void saveProperty(Property property) {
      propertyRepo.save(property);
    }

    @Override
    public void deleteProperty(int id) {
     propertyRepo.deleteById(id);
    }

    @Override
    public void updateProperty(int id, Property property) {
    propertyRepo.save(property);
    }
}
