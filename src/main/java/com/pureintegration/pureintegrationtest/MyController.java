package com.pureintegration.pureintegrationtest;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.HashMap;

@RestController
@RequestMapping(path = "api")
@AllArgsConstructor
public class MyController {




    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getJson() throws IOException {

        File file = ResourceUtils.getFile("classpath:myjson.json");

        //Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        String result = new HashMap<String, String>(){{{put("message", content);}}}.toString();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
