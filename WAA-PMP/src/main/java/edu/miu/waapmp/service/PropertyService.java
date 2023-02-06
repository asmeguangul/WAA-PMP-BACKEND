package edu.miu.waapmp.service;

import edu.miu.waapmp.entity.Property;

import java.util.List;

public interface PropertyService {

    public List<Property> getAllProperties();
    public Property getPropertyById(int id);
    public void saveProperty(Property property);
    public void deleteProperty(int id);
    public void updateProperty(int id, Property property);

}
