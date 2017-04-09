package com.alexlby.springdemo.dto;

/**
 * Created by Alex on 2017/4/9.
 */
public class UserDto {

    String id;

    String name;

    public String getId() {
        return id;
    }

    public UserDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserDto setName(String name) {
        this.name = name;
        return this;
    }
}
