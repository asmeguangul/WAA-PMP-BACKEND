package edu.miu.waapmp.service;

import edu.miu.waapmp.entity.Property;

import java.util.List;

public interface PropertyService {

    public List<Property> getAllProperties();
    public List<Property> getRentProperties();
    public List<Property> getSaleProperties();

    public Property getPropertyById(int id);
    public void saveProperty(Property property);
    public void deleteProperty(int id);
    public void updateProperty(int id, Property property);

    List<Property> getAllPropertiesOfOwner(Integer userId);

    List<Property> getAllPropertiesByQuery(Long price, String location, Integer rooms, String propertyType, String homeType);
}
