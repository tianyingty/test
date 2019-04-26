package test;

/**
 * ATM机允许4或6位PIN码,PIN码不能包含4位数或6位数字。 如果函数传递了有效的PIN字
 * @author Administrator
 *
 */
public class Solution {
	public static boolean validatePin(String pin) {
		return pin.matches("\\d{4}|\\d{6}");
	}

	public static void main(String args[]) {
		boolean a = Solution.validatePin("000000");
		System.out.println(a);
	}
}
