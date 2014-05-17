package myself.phonenum;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
// @RequestMapping("/admin")
public class PhoneNumController {

	@RequestMapping(value = "/phnum", method = RequestMethod.GET)
	public @ResponseBody String phoneNum(@RequestParam("digits") String inputText) {
		ArrayList<String> list = Utils.letterCombinations(inputText);
		StringBuilder sb = new StringBuilder();
		for (String ls : list)
			sb.append(ls + " ");
		return sb.toString();
	}
}
