package com.sykang.swaggertest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
@Tag(name = "Main API")
public class mainController {

    //@ApiOperation(value="[Main] root", notes="메인 루트 화면")
    @Operation(summary = "[Main] root page", description = "root page")
    @RequestMapping(value="/", method = {RequestMethod.GET, RequestMethod.POST})
    public ResponseEntity<String> main() {
        return ResponseEntity.ok().body("Swagger TEST API");
    }

}
