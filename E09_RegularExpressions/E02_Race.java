package E09_RegularExpressions;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class E02_Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names = scanner.nextLine();
        List<String> racersNames = Arrays.stream(names.split(", ")).collect(Collectors.toList());
        Map<String, Integer> racersDistances = new LinkedHashMap<>();
        racersNames.forEach(name -> racersDistances.put(name, 0));
         String regexLetters = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetters);
        String regexDigit = "[0-9]";
        Pattern patternDigit = Pattern.compile(regexDigit);
        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input);
            while (matcherLetter.find()) {
                nameBuilder.append(matcherLetter.group());
            }
            int distance = 0;
            Matcher matcherDigit = patternDigit.matcher(input);
            while (matcherDigit.find()) {
                distance += Integer.parseInt(matcherDigit.group());
            }
            String racerName = nameBuilder.toString();
            if (racersDistances.containsKey(racerName)) {
                int currentDistance = racersDistances.get(racerName);
                racersDistances.put (racerName, currentDistance + distance);
            }

            input = scanner.nextLine();
        }

        List<String> nameOfFirstThree = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));



    }
}