package org.example.responsibilitychaindesign.models;

import org.example.responsibilitychaindesign.interfaces.SupportHandler;

import java.util.Objects;

public class BasicHandler implements SupportHandler {

    SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.nextHandler = supportHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority().equals(Priority.BASIC)) {
            System.out.println("Request was handled by basic handler.");
        } else if (Objects.nonNull(nextHandler)) {
            nextHandler.handleRequest(request);
        }
    }
}
