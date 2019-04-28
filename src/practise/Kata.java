package practise;

/**
 * 在这个kata中，您可以获得区域的起始编号和结束编号，并且应该返回除了数字为5的数字之外的所有数字的计数。起点和终点都包含在内！
 * @author Administrator
 *
 */
public class Kata {

	public static int dontGiveMeFive(int start, int end) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			if(!String.valueOf(i).contains("5")){
				sum++;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(Kata.dontGiveMeFive(1, 9));
		System.out.println(Kata.dontGiveMeFive(4,17));
	}

}
