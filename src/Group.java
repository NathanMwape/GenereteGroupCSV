import java.util.ArrayList;
import java.util.List;

public class Group {

    private List<Personne> personnes;

    public Group(Personne personne1, Personne personne2) {
        personnes = new ArrayList<>();
        personnes.add(personne1);
        personnes.add(personne2);
    }

    public Group(Personne personne) {
        personnes = new ArrayList<>();
        personnes.add(personne);
    }

    public String[] toArray() {
        String[] array = new String[personnes.size() * 5];
        int index = 0;

        StringBuilder nomBuilder = new StringBuilder();
        for (int i = 0; i < personnes.size(); i++) {
            Personne personne = personnes.get(i);
            nomBuilder.append(personne.getNom());
            if (i < personnes.size() - 1) {
                nomBuilder.append(" et ");
            }
        }

        for (Personne personne : personnes) {
            array[index++] = String.valueOf(personne.getNumero());
            array[index++] = personne.getNom();
            array[index++] = personne.getPost();
            array[index++] = personne.getPrenom();
            array[index++] = personne.getSexe();
        }

        return array;
    }


}
