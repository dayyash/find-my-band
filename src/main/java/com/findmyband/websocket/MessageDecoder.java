package com.findmyband.websocket;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.findmyband.model.Message;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.IOException;

public class MessageDecoder implements Decoder.Text<Message> {
    @Override
    public Message decode(String s) throws DecodeException {
//        Message message = gson.fromJson(s, Message.class);
        ObjectMapper objectMapper = new ObjectMapper();
        Message message = null;
        try {
            message = objectMapper.readValue(s, Message.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return message;
    }

    @Override
    public boolean willDecode(String s) {
        return (s != null);
    }

    @Override
    public void init(EndpointConfig endpointConfig) {

    }

    @Override
    public void destroy() {

    }
}
