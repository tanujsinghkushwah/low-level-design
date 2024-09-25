package org.example.responsibilitychaindesign.models;

import org.example.responsibilitychaindesign.interfaces.SupportHandler;

import java.util.Objects;

public class HighHandler implements SupportHandler {

    SupportHandler nextHandler;

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.nextHandler = supportHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority().equals(Priority.HIGH)) {
            System.out.println("Request was handled by advanced handler.");
        } else if (Objects.nonNull(nextHandler)) {
            nextHandler.handleRequest(request);
        }
    }
}
