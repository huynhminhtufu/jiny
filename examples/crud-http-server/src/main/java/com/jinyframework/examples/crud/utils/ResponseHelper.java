package com.jinyframework.examples.crud.utils;

import com.google.gson.Gson;
import com.jinyframework.examples.crud.entities.ResponseEntity;
import com.jinyframework.core.RequestBinderBase.HttpResponse;
import lombok.val;

public final class ResponseHelper {
    public static HttpResponse success(String msg) {
        val gson = new Gson();
        val obj = ResponseEntity.builder().message(msg).build();
        return HttpResponse.of(obj).transform(gson::toJson);
    }

    public static HttpResponse error(String msg) {
        val gson = new Gson();
        val obj = ResponseEntity.builder().error(msg).build();
        return HttpResponse.of(obj).transform(gson::toJson).status(400);
    }
}