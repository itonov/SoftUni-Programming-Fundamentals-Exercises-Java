import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NoteStatistics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        List<String> inputLine = Arrays.asList(console.nextLine().split(" "));
        List<Double> inputNumbers = ConvertToDoubleList(inputLine);

        List<String> notes = new ArrayList<>();
        List<String> naturalNotes = new ArrayList<>();
        List<String> sharpNotes = new ArrayList<>();

        double naturalNotesSum = 0;
        double sharpNotesSum = 0;

        for (double number:inputNumbers) {

            if (number == 261.63){
                notes.add("C");
                naturalNotesSum += 261.63;
            }
            else if (number == 277.18){
                notes.add("C#");
                sharpNotesSum += 277.18;
            }
            else if (number == 293.66){
                notes.add("D");
                naturalNotesSum += 293.66;
            }
            else if (number == 311.13){
                notes.add("D#");
                sharpNotesSum += 311.13;
            }
            else if (number == 329.63){
                notes.add("E");
                naturalNotesSum += 329.63;
            }
            else if (number == 349.23){
                notes.add("F");
                naturalNotesSum += 349.23;
            }
            else if (number == 369.99){
                notes.add("F#");
                sharpNotesSum += 369.99;
            }
            else if (number == 392.00){
                notes.add("G");
                naturalNotesSum += 392.00;
            }
            else if (number == 415.30){
                notes.add("G#");
                sharpNotesSum += 415.30;
            }
            else if (number == 440.00){
                notes.add("A");
                naturalNotesSum += 440.00;
            }
            else if (number == 466.16){
                notes.add("A#");
                sharpNotesSum += 466.16;
            }
            else if (number == 493.88){
                notes.add("B");
                naturalNotesSum += 493.88;
            }
        }

        for (String note:notes) {
            if (note.contains("#")){
                sharpNotes.add(note);
            }
            else {
                naturalNotes.add(note);
            }
        }

        System.out.print("Notes: ");

        for (String note :notes) {
            System.out.print(note + " ");
        }

        System.out.println();
        System.out.print("Naturals: ");

        for (int i = 0; i < naturalNotes.size(); i++) {
            if (i + 1 == naturalNotes.size()){
                System.out.print(naturalNotes.get(i));
            }
            else {
                System.out.print(naturalNotes.get(i) + ", ");
            }
        }

        System.out.println();
        System.out.print("Sharps: ");

        for (int i = 0; i < sharpNotes.size(); i++) {
            if (i + 1 == sharpNotes.size()){
                System.out.print(sharpNotes.get(i));
            }
            else {
                System.out.print(sharpNotes.get(i) + ", ");
            }
        }

        DecimalFormat df = new DecimalFormat("##.##");

        System.out.println();
        System.out.print("Naturals sum: " + df.format(naturalNotesSum));
        System.out.println();
        System.out.print("Sharps sum: " + df.format(sharpNotesSum));

    }

    private static List<Double> ConvertToDoubleList(List<String> text) {
        List<Double> convertedList = new ArrayList<>();

        for (String word:text) {
            convertedList.add(Double.parseDouble(word));
        }

        return convertedList;
    }
}