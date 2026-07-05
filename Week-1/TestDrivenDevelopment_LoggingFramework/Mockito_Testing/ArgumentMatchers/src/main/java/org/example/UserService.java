package org.example;

public class UserService {

    private final ExternalApi externalApi;

    public UserService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchUser(String userId) {
        return externalApi.getUserData(userId);
    }
}