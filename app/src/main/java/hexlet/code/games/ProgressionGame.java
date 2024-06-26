package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class ProgressionGame {
    public static final int MENU_ITEM = 5;
    public static final String GAME_RULES = "What number is missing in the progression?";
    public static final int PROGRESSION_LENGTH = 10;

    public static String[] createQuestionAndAnswer() {
        String[] result = new String[2];
        int indexOfHidden = Engine.START_WITH + Utils.generateRandomNumber(PROGRESSION_LENGTH - 1);
        int begin = Engine.START_WITH + Utils.generateRandomNumber(PROGRESSION_LENGTH);
        int difference = Engine.START_WITH + Utils.generateRandomNumber(PROGRESSION_LENGTH);
        int[] progression = new int[PROGRESSION_LENGTH];
        progression[0] = begin;

        for (int i = 1; i < progression.length; i++) {
            progression[i] = progression[i - 1] + difference;
        }

        int answer = progression[indexOfHidden];
        result[1] = String.valueOf(answer);
        result[0] = getQuestion(progression, begin, difference, indexOfHidden);

        return result;
    }

    public static String getQuestion(int[] progression, int startWith, int difference, int hiddenElement) {
        String result = String.valueOf(startWith);
        for (int i = 1; i < progression.length; i++) {
            result += " ";
            if (i == hiddenElement) {
                result += "..";
            } else {
                result += String.valueOf(startWith + difference * i);
            }
        }
        return result;
    }
}
