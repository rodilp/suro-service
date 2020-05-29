package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.dto.response.ModelTypeResponse;
import com.example.demo.service.ModelTypeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "dashboard")
@RestController
@RequestMapping(value = "/main")
public class MainController {
	
    @Autowired
    ModelTypeService mainService;
    
    
    @GetMapping(value = "/dashboard")
    @ApiOperation(value = "Información Dashboard", notes = "Obtiene la información del dashboard principal del app")
    ResponseEntity<ModelTypeResponse> modelTyoe(
            @RequestHeader(value = "documentNumber") String documentNumber) {
        return ResponseEntity.ok(mainService.getModelType(documentNumber));
    }

}
