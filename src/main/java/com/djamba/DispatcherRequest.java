package com.djamba;

import static spark.Spark.get;

public class DispatcherRequest {

    private static final String API_CONTEXT = "/api/v1";

    private final DispatcherService dispatcherService;

    public DispatcherRequest(DispatcherService dispatcherService) {
        this.dispatcherService = dispatcherService;
        setupEndpoints();
    }

    private void setupEndpoints() {
//        post(API_CONTEXT + "/todos", "application/json", (request, response) -> {
//            //todoService.createNewTodo(request.body());
//            response.status(201);
//            return response;
//        }, new JsonTransformer());

        get(API_CONTEXT + "/chat", "application/json", (request, response)

                -> dispatcherService.getHelloMessage(), new JsonTransformer());

//        get(API_CONTEXT + "/todos", "application/json", (request, response)
//
//                -> todoService.findAll(), new JsonTransformer());
//
//        put(API_CONTEXT + "/todos/:id", "application/json", (request, response)
//
//                -> todoService.update(request.params(":id"), request.body()), new JsonTransformer());
    }

}
