package com.bookit.step_definitions;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public abstract class Base {
    protected static RequestSpecification request;
    protected static Response response;
}
