package com.tardin.todo_app.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "todo", description = "the todo API")
@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {

    @Operation(summary = "Get all things to do", description = "Return sample value")
    @ApiResponses(
            @ApiResponse(responseCode = "200", description = "Success")
    )
    @GetMapping
    public String sample(){
        return "Todo sample";
    }
}
