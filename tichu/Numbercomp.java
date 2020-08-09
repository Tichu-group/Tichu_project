package tichu;
import java.util.Comparator;
import java.util.Arrays;
import java.util.List;

public class Numbercomp implements Comparator<Card>{
	private static String[] PATTERNS = {"dragon","phoenix","dog","bird"};
	private List<String> S_PATTERNS = Arrays.asList(PATTERNS);
	@Override
	public int compare(Card card1,Card card2) {
		String card1_p = card1.getPattern();
		String card2_p = card2.getPattern();
		if(S_PATTERNS.contains(card1.getPattern())) {
			return 1;
		}
		else if(S_PATTERNS.contains(card2.getPattern())) {
			return -1;
		}
		else if(card1_p.compareTo(card2_p) == 0) {
			Integer card1_n = Integer.parseInt(card1.getNumber());
			Integer card2_n = Integer.parseInt(card2.getNumber());
			return card1_n.compareTo(card2_n);
		}
		else {
			return card1_p.compareTo(card2_p);
		}
	}
	
}
