package com.iesemilidarder.xml.rules.data;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * com.iesemilidarder.xml.rules.data
 * Class User
 * 28/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
@Data
@Document(collection = "users")
public class User {

    @Id
    private String id;
    private String name;
    private String address;
    private Double salary;

    public User(String name, String address, Double salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}