package com.adobe.aem.msil.core.models.Impl;

import com.adobe.aem.msil.core.models.Editor;
import com.day.cq.wcm.api.Page;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.*;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables =Resource.class,
      adapters =Editor.class,
      defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class EditorImpl implements Editor {

   // @ScriptVariable
   // Page currentPage;
    @ValueMapValue
    @Default(values = "AEM")
    @Optional
    private String fname;
    @ValueMapValue
    @Required
    private String lname;
    //@ValueMapValue
   // boolean professor;


    @Override
    public String getFirstName() {
        return fname;
    }

    @Override
    public  String getLastName() {

        return lname;
    }

    /*@Override
    public boolean getProfessor() {
        return professor;
    }

    @Override
    public String getPageTitle() {
        return currentPage.getPageTitle();
    }*/
}

