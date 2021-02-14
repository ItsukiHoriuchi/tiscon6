package com.tiscon.domain;

import java.io.Serializable;

public class CustomerOptionService implements Serializable {

    private int customerId;

    private int serviceId;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

}
