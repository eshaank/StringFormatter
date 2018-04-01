
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class StringFormatter {
	public static void main(String[] args) {
		StringFormatter format = new StringFormatter();
		List<String> wordList1 = Arrays.asList("AP", "COMP", "SCI", "ROCKS");
		List<String> wordList2 = Arrays.asList("GREEN", "EGGS", "AND", "HAM");
		List<String> wordList3 = Arrays.asList("BEACH", "BALL");
		// format.totalLetters(wordList1);
		// format.totalLetters(wordList2);
		// format.totalLetters(wordList3);

		//format.basicGapWidth(wordList1, 20);
		//format.basicGapWidth(wordList2, 20);
		format.basicGapWidth(wordList3, 20);
	}

	public static int totalLetters(List<String> wordList) {
		int sum = 0;

		for (String w : wordList) {
			String str = w.toString();
			String leng = str.substring(0, str.length());
			 System.out.println(str.substring(0, str.length()));
			leng.length();
			 System.out.println(leng.length());
			sum += leng.length();
			 System.out.println(sum);

		}
		System.out.println(sum);
		return sum;

	}

	public static int basicGapWidth(List<String> wordList, int i) {
		int sum = 0;

		for (String w : wordList) {
			String str = w.toString();
			String leng = str.substring(0, str.length());
			 System.out.println(str.substring(0, str.length()));
			leng.length();
			 System.out.println(leng.length());
			sum += leng.length();
			 System.out.println(sum);

		}
		System.out.println(sum);

		int leftOver = i - sum;

		System.out.println(leftOver);

		int basic = leftOver / (wordList.size() - 1);

		System.out.println(basic);
		return basic;

	}

}