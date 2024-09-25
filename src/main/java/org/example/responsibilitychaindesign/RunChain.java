package org.example.responsibilitychaindesign;

import org.example.responsibilitychaindesign.models.*;

public class RunChain {

    public void runPattern() {
        Request basicRequest = new Request(Priority.BASIC);
        Request intermediateRequest = new Request(Priority.INTERMEDIATE);
        Request advancedRequest = new Request(Priority.HIGH);

        BasicHandler basicHandler = new BasicHandler();
        IntermediateHandler intermediateHandler = new IntermediateHandler();
        HighHandler advancedHandler = new HighHandler();

        basicHandler.setNextHandler(intermediateHandler);
        intermediateHandler.setNextHandler(advancedHandler);

        basicHandler.handleRequest(intermediateRequest);
        basicHandler.handleRequest(basicRequest);
        basicHandler.handleRequest(advancedRequest);

        intermediateHandler.handleRequest(advancedRequest);
        intermediateHandler.handleRequest(basicRequest);
    }
}
