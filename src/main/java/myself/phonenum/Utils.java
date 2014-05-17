package myself.phonenum;

import java.util.ArrayList;

public class Utils {

	public static ArrayList<String> letterCombinations(String digits) {
		ArrayList<String> result = new ArrayList<String>();
		if (digits == null)
			return result;
		String[] keyboard = {"abc", "def", "ghi", "jkl", "mno",
				"pqrs", "tuv", "wxyz" };
		StringBuilder current = new StringBuilder();
		int index = 0;
		buildResult(digits, index, current, keyboard, result);
		return result;
	}

	public static void buildResult(String digits, int index, StringBuilder current,
			String[] keyboard, ArrayList<String> result) {
		if (index == digits.length()) {
			result.add(current.toString());
			return;
		}
		int num = digits.charAt(index) - '2';
		for (int i = 0; i < keyboard[num].length(); i++) {
			current.append(keyboard[num].charAt(i));
			buildResult(digits, index + 1, current, keyboard, result);
			current.deleteCharAt(current.length() - 1);
		}
	}
}
