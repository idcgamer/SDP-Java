package com.mycompany.SDP5;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@RestController
public class CodeFileController {

    @PostMapping("/api/code-files/upload")
    public ResponseEntity<Integer> uploadCodeFile(@RequestPart MultipartFile file) throws IOException {
        if (file.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        List<String> codeLines = Arrays.asList(new String(file.getBytes()).split("\\n"));
        int complexity = CyclomaticComplexityCalculator.calculateCyclomaticComplexity(codeLines);
        return ResponseEntity.ok(complexity);
    }
}
