package poker;

public class Poker {
	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isFullHouse(String cards[], int n) {
		return isThreeOfaKind(cards, n) && isTwoPairs(cards, n);
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isThreeOfaKind(String cards[], int n) {
		for (int i = 0; i < n - 2; i++) {
			if (extracted(cards, i)
					&& extracted(cards, i+1))
				return true;
		}

		return false;
	}

	// change 3
	
	// change 5 
	private boolean extracted(String[] cards, int i) {
		return cards[i].charAt(1) == cards[i + 1].charAt(1);
	}

	// Precondition: A hand of n cards have been sorted by card number.
	public boolean isTwoPairs(String cards[], int n) {
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			if (extracted(cards, i)) {
				count++;
				i++;
			}
		}
		if (count == 2)
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		System.out.println(new Poker().isFullHouse(new String[] { "C2", "D2",
				"H2", "S3", "S4" }, 5));
	}
}
