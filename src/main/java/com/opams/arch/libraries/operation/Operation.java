package com.opams.arch.libraries.operation;

import lombok.Getter;

@Getter
public class Operation {
    private final StatusCode statusCode;
    private final String statusMessages;
    public Operation(StatusCode statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessages = statusMessage;
    }
}
