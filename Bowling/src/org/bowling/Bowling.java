package org.bowling;

public class Bowling {

	public static int getScore(int... pins) {
		if (pins.length == 0) {
			return 0;
		}

		int score = 0, finalScore = 0;
		boolean spare = false;
		boolean strike = false;

		for (int i = 0; i < pins.length; i++) {

			if (pins[i] == 10) {
				score += 10;
				strike = true;
				continue;
			}

			if ((i + 1) % 2 == 0) {
				if (pins[i] != -1) {
					int tempScore = pins[i - 1] + pins[i];
					if (tempScore == 10) {
						spare = true;
						continue;
					} else { // if the score is not spare
						finalScore += pins[i - 1] + pins[i];
					}
					if (strike) {
						strike = false;
						finalScore += score + pins[i - 1] + pins[i];
						score = 0;
					}
				}
			}

			if (spare) { // previous frame was spare then
				spare = false;
				finalScore += pins[i - 2] + pins[i - 1] + pins[i];
			}
		}
		return finalScore;
	}
}
