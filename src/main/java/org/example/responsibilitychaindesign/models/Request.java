package org.example.responsibilitychaindesign.models;

public class Request {

    Priority priority;

    public Request(Priority priority) {
        this.priority = priority;
    }

    Priority getPriority() {
        return priority;
    }
}
