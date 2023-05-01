import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileFinder fileFinder = new FileFinder();
        List<String> identifiedFiles = fileFinder.findAndPrintIdentifiedFilesInText();

        if (identifiedFiles.isEmpty()) {
            System.out.println("No identified files found.");
        } else {
            System.out.println("Identified files:");
            for (String fileName : identifiedFiles) {
                System.out.println(fileName);
            }
        }
    }
}
