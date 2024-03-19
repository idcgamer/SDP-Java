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

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;


@EnableAutoConfiguration
@RestController
@CrossOrigin(origins = "*")
//This class is responsible for handling the requests and responses for the cyclomatic complexity
public class CyclometricControler {
	@RequestMapping(
		value="/cc", consumes = "application/json",produces = "application/json")
		public CodeTemplate codeForScoring(@RequestBody CodeTemplate codeForScoring) {
		return new CodeTemplate(SDP.CodeForFindingScore(codeForScoring.getCode()), LanguageDetection.detectLanguage(codeForScoring.getCode()));
	}
}
