package com.softserveinc.ita.jresume.common.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Class represents template table in database.
 */
@Entity
@Table(name = "template")
public class Template extends Base {
    
    /** The name of this template. */
    @Column(name = "name")
    private String name;
    
    /** Description of this template. */
    @Column(name = "description")
    private String description;
    
    /** Price of this template. */
    @Column(name = "price")
    private double price;
    
    /**
     * All marks associated with this template. One to many relationship
     * references with mark table.
     */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "template")
    private List<Mark> marks;
    
    /** public constructor. */
    public Template() {
        super();
    }
    
    /**
     * Gets the name of this template.
     * 
     * @return this template name.
     */
    public final String getName() {
        return name;
    }
    
    /**
     * Changes the name of this template.
     * 
     * @param newName
     *            this template's new name
     */
    public final void setName(final String newName) {
        name = newName;
    }
    
    /**
     * Gets description of this template.
     * 
     * @return this template description
     */
    public final String getDescription() {
        return description;
    }
    
    /**
     * Changes description of this template.
     * 
     * @param newDescription
     *            this template's new description
     */
    public final void setDescription(final String newDescription) {
        description = newDescription;
    }
    
    /**
     * Gets price of this template.
     * 
     * @return this template price
     */
    public final double getPrice() {
        return price;
    }
    
    /**
     * Changes price of this template.
     * 
     * @param newPrice
     *            this template's new price
     */
    public final void setPrice(final double newPrice) {
        price = newPrice;
    }
    
    /**
     * Gets all marks associated with this template.
     * 
     * @return list with all mark associated with template
     */
    public final List<Mark> getMarks() {
        return marks;
    }
    
    /**
     * Changes list with all marks associated with this template.
     * 
     * @param newMarks
     *            list with marks for this template
     */
    public final void setMarks(final List<Mark> newMarks) {
        marks = newMarks;
    }
    
}
