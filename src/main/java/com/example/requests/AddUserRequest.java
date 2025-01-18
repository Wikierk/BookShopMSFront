package com.example.requests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AddUserRequest {
    public final AddUserDto user;

    public AddUserRequest(AddUserDto user) {
        this.user = user;
    }

    public AddUserRequest(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        user = objectMapper.readValue(json, AddUserDto.class);
    }

   public String create() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String header = RequestType.toHeader(RequestType.AddUser);
        String content = objectMapper.writeValueAsString(user);

        return header + ":" + content;
    }
}
