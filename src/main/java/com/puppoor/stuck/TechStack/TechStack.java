package com.puppoor.stuck.TechStack;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "TECH_STACK")
@Entity
public class TechStack {
    public TechStack(){

    }
    public TechStack(String techName, String serviceType, LocalDate creationDate, String createdBy, String lastUpdatedDate, String lastUpdatedBy) {
        this.techName = techName;
        this.serviceType = serviceType;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public TechStack(Long techstackid, String techName, String serviceType, LocalDate creationDate, String createdBy, String lastUpdatedDate, String lastUpdatedBy) {
        this.techstackid = techstackid;
        this.techName = techName;
        this.serviceType = serviceType;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdatedDate = lastUpdatedDate;
        this.lastUpdatedBy = lastUpdatedBy;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TECH_STACK_ID", nullable = false)
    private Long techstackid;

    @Column(name = "TECH_NAME", nullable = false)
    private String techName;


    @Column(name = "SERVICE_TYPE", nullable = false)
    private String serviceType;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;


    @Column(name = "CREATED_BY")
    private String createdBy;


    @Column(name = "LAST_UPDATED_DATE")
    private String lastUpdatedDate;


    @Column(name = "LAST_UPDATED_BY")
    private String lastUpdatedBy;

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public Long getId() {
        return techstackid;
    }

    public void setId(Long id) {
        this.techstackid = techstackid;
    }
}