package com.Bootcamp.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ResourcePath;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import java.util.Collections;
import java.util.Iterator;

@Model(adaptables = Resource.class)
public class MyModel {

    @ResourcePath(path ="/content/my-options/")
    Resource resource;

    public String getResourceText()
    {
        return resource.getName();
    }
    public Iterator<Resource> getResourceChildren()
    {
        return resource.listChildren();
    }
    
}

