package org.example.responsibilitychaindesign.interfaces;

import org.example.responsibilitychaindesign.models.Request;

public interface SupportHandler {

    void setNextHandler(SupportHandler supportHandler);

    void handleRequest(Request request);
}
