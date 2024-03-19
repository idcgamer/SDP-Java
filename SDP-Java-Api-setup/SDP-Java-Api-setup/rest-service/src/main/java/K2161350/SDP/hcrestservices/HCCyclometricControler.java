/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package K2161350.SDP.hcrestservices;

/**
 *
 * @author georg
 */


import K2161350.SDP.restservice.LanguageDetection;
import K2161350.SDP.hcrestservices.SDPHC;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HCCyclometricControler {
	@PostMapping(value = "/hcc", consumes = "application/json", produces = "application/json")
	public HCCodeTemplate codeForHcscoring(@RequestBody HCCodeTemplate codeForHcscoring) {
		return new HCCodeTemplate(SDPHC.CodeForFindingScore(codeForHcscoring.getHcCode()), LanguageDetection.detectLanguage(codeForHcscoring.getHcCode()));
	}
}