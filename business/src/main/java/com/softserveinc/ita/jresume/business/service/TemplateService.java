package com.softserveinc.ita.jresume.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softserveinc.ita.jresume.common.entity.Template;
import java.util.List;
import com.softserveinc.ita.jresume.persistence.dao.impl.TemplateDAO;
/**
* Class for working with Template.
* 
*/
@Service
public class TemplateService {
    
    /** TemplateDAO for access to data storage. */
    @Autowired
    private TemplateDAO templateDao;
    /**
    * Create a new template.
    * 
    * @param template
    *            to be created.
    * @return created template.
    */
    public final Template create(final Template template) {
    return templateDao.create(template);
    }
    /**
    * Update information template.
    * 
    * @param template
    *            object template to be updated.
    *            
    * @return updated template.
    */
    public final Template update(final Template template) {
    return templateDao.update(template);
    }
    /**
    * Delete template from data storage.
    * 
    * @param template
    *            the template to be deleted.
    */
    public final void delete(final Template template) {
    templateDao.delete(template);
    }
    /**
    * Find all templates.
    * 
    * @return a list of all templates.
    */
    public final List<Template> findAll() {
    return templateDao.findAll();
    }
    /**
     * Find the template by id.
     * @param id looking for id to loading object template   
     * 
     * @return the template.
     */

    public final Template findById(final long id) {
        return templateDao.findById(id);
    }
}
