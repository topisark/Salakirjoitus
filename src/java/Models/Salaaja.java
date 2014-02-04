package Models;

import java.util.HashMap;

public class Salaaja {

    private final HashMap<Character, String> aakkosto;

    /**
     * Konstruktori luo salauksessa käytettävän aakkoston.
     *
     * @param aakkosto
     */
    public Salaaja(HashMap<Character, String> aakkosto) {
        this.aakkosto = aakkosto;
    }

    /**
     * Salaa parametrina annetun tekstin valmiiksi generoidun aakkoston avulla.
     *
     * @param teksti
     * @return Salattu teksti.
     */
    public String salaa(String teksti) {
        char[] kirjaimet = teksti.toLowerCase().toCharArray();
        String salattu = "";
        for (char c : kirjaimet) {
            if (aakkosto.get(c) != null) {
                salattu += aakkosto.get(c);
            }
        }
        return salattu;
    }
}
