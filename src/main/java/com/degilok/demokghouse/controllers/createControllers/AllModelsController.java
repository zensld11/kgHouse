package com.degilok.demokghouse.controllers.createControllers;

import com.degilok.demokghouse.model.DealType;
import com.degilok.demokghouse.service.AllModelsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/")
public class AllModelsController {

    private final AllModelsService allModelsService;

    public AllModelsController(AllModelsService allModelsService) {
        this.allModelsService = allModelsService;
    }

    @GetMapping("/get/deal-types")
    public ResponseEntity<List<DealType>> getDealTypes(){
        try {
            List<DealType> dealTypes = allModelsService.getAllDealTypes();
            return ResponseEntity.ok(dealTypes);
        }
        catch (Exception e){
            e.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
}