import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static List<Personne> lireFichierCSV(String filePath) {
        List<Personne> personnes = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (nextLine.length == 5) {
                    String numero = nextLine[0];
                    String nom = nextLine[1];
                    String post = nextLine[2];
                    String prenom = nextLine[3];
                    String sexe = nextLine[4];
                    personnes.add(new Personne(numero, nom, post, prenom, sexe));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personnes;
    }

    public static List<Group> creerGroupes(List<Personne> personnes) {
        List<Group> groupes = new ArrayList<>();
        List<Personne> personnesRestantes = new ArrayList<>(personnes);
        Collections.shuffle(personnesRestantes);
        int nombrePersonnes = personnesRestantes.size();

        for (int i = 0; i < nombrePersonnes; i += 2) {
            if (i + 1 < nombrePersonnes) {
                Personne personne1 = personnesRestantes.get(i);
                Personne personne2 = personnesRestantes.get(i + 1);
                Group groupe = new Group(personne1, personne2);
                groupes.add(groupe);
            } else {
                // Si le nombre de personnes est impair, ajouter une personne seule dans un groupe
                Personne personne = personnesRestantes.get(i);
                Group groupe = new Group(personne);
                groupes.add(groupe);
            }
        }

        return groupes;
    }

    public static void ecrireFichierCSV(String filePath, List<Group> groupes) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            for (Group groupe : groupes) {
                String[] line = groupe.toArray();
                writer.writeNext(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\NATHAN\\Music\\fichier\\DONNEE.csv";
        String outputFilePath = "C:\\Users\\NATHAN\\Music\\fichier\\ALEATOIRE.csv";

        List<Personne> personnes = lireFichierCSV(inputFilePath);
        List<Group> groupes = creerGroupes(personnes);

        ecrireFichierCSV(outputFilePath, groupes);
    }
}