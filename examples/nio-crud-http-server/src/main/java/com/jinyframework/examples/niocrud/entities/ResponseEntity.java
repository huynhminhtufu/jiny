package com.jinyframework.examples.niocrud.entities;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ResponseEntity {
    String message;
    String error;
}
