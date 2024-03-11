/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package K2161350.SDP.restservice;

/**
 *
 * @author georg
 */
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
//This class is responsible for handling the requests and responses for the cyclomatic complexity
public class CyclometricControler {
	@PostMapping(
		value="/cc", consumes = "application/json",produces = "application/json")
		public CodeTemplate codeForScoring(@RequestBody CodeTemplate codeForScoring) {
		return new CodeTemplate(SDP.CodeForFindingScore(codeForScoring.getCode()), LanguageDetection.detectLanguage(codeForScoring.getCode()));
	}
}
