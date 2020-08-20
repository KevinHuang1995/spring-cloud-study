package com.kevin.spring.cloud.auth.client.common.util.jwt;

import java.io.Serializable;
import java.util.Objects;

public class JWTInfo implements Serializable, IJWTInfo {

    private String username;
    private String userId;
    private String name;

    public JWTInfo(String username, String userId, String name) {
        this.username = username;
        this.userId = userId;
        this.name = name;
    }

    @Override
    public String getUniqueName() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JWTInfo jwtInfo = (JWTInfo) o;
        return Objects.equals(username, jwtInfo.username) &&
                Objects.equals(userId, jwtInfo.userId) &&
                Objects.equals(name, jwtInfo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, userId, name);
    }
}
