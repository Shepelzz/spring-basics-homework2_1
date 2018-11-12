package com.model;

import java.util.Map;


public class Step {
    private Long id;
    private Service serviceFrom;
    private Service serviceTo;
    private Map paramsServiceFrom;
    private Map paramsServiceTo;

    public Step(Long id, Service serviceFrom, Service serviceTo, Map paramsServiceFrom, Map paramsServiceTo) {
        this.id = id;
        this.serviceFrom = serviceFrom;
        this.serviceTo = serviceTo;
        this.paramsServiceFrom = paramsServiceFrom;
        this.paramsServiceTo = paramsServiceTo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Service getServiceFrom() {
        return serviceFrom;
    }

    public void setServiceFrom(Service serviceFrom) {
        this.serviceFrom = serviceFrom;
    }

    public Service getServiceTo() {
        return serviceTo;
    }

    public void setServiceTo(Service serviceTo) {
        this.serviceTo = serviceTo;
    }

    public Map getParamsServiceFrom() {
        return paramsServiceFrom;
    }

    public void setParamsServiceFrom(Map paramsServiceFrom) {
        this.paramsServiceFrom = paramsServiceFrom;
    }

    public Map getParamsServiceTo() {
        return paramsServiceTo;
    }

    public void setParamsServiceTo(Map paramsServiceTo) {
        this.paramsServiceTo = paramsServiceTo;
    }

    @Override
    public String toString() {
        return "Step{" +
                "id=" + id +
                ", serviceFrom=" + serviceFrom.toString() +
                ", serviceTo=" + serviceTo.toString() +
                ", paramsServiceFrom=" + paramsServiceFrom.toString() +
                ", paramsServiceTo=" + paramsServiceTo.toString() +
                '}';
    }
}
