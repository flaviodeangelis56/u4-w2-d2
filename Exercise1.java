import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci il numero di parole da inserire (N): ");
        int N = input.nextInt();

        input.nextLine(); // Consuma il newline

        Set<String> paroleDistinte = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci le " + N + " parole:");
        for (int i = 0; i < N; i++) {
            String parola = input.nextLine().trim();

            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        input.close();

        System.out.println("Parole Duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        System.out.println("Numero di Parole Distinte: " + paroleDistinte.size());

        System.out.println("Elenco delle Parole Distinte:");
        for (String parola : paroleDistinte) {
            System.out.println(parola);
        }
    }
}
