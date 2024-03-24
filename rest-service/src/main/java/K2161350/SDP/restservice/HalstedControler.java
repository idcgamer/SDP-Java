
package K2161350.SDP.restservice;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HalstedControler {
	@PostMapping(value = "/hcc", consumes = "application/json", produces = "application/json")
	public HalstedTemplate codeForHcscoring(@RequestBody HalstedTemplate codeForHcscoring) {
		return new HalstedTemplate(SDPHC.CodeForFindingScore(codeForHcscoring.getCode()), LanguageDetection.detectLanguage(codeForHcscoring.getCode()));
	}
}