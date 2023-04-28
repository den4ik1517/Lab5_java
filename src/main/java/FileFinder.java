import java.util.regex.Pattern;

import edu.emory.mathcs.backport.java.util.LinkedList;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

public class FileFinder {
    private Scanner scanner;

    private Integer inputLastNumbersInCaptionOfDeserableFile(Scanner scanner) {
        System.out.println("Input num: ");
        Integer lastNumbers = scanner.nextInt();
        scanner.nextLine();
        return lastNumbers;
    }

    private String inputText(Scanner scanner) {
        System.out.println("Input textString: ");
        String textString = scanner.nextLine();
        return textString;
    }

    public List<String> findAndPrintIdentifiedFilesInText(/* Integer lastNumbers, String textString */) {
        scanner = new Scanner(System.in);
        Integer lastNumbers = inputLastNumbersInCaptionOfDeserableFile(scanner);
        String textString = inputText(scanner);
        scanner.close();
        String lastNumberString = String.valueOf(lastNumbers);
        StringBuilder reString = new StringBuilder("(\\S+((.txt)|(.odb)|(.docx)|(.doc)))");
        reString.insert(reString.indexOf("((.txt)", 2), lastNumberString);
        Pattern pattern = Pattern.compile(reString.toString());
        Matcher matcher = pattern.matcher(textString);
        List<String> list = new LinkedList();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }
}