package Models;

import java.util.HashMap;

public class Aakkosto {

    private final HashMap<Character, String> aakkosto;
    private final HashMap<String, Character> koodisto;
    private final String tapa1 = "acegikmoqsuwy";
    private final String tapa2 = "bdfhjlnprtvxz";
    private final String erikoismerkit = ",.!? ";
    
    /**
     * Konstruktori luo HashMapit aakkosille ja koodeille ja laittaa ne
     * täyttymään.
     */
    public Aakkosto() {
        aakkosto = new HashMap<Character, String>();
        koodisto = new HashMap<String, Character>();
        luoAakkostoJaKoodisto();
    }

    public HashMap<Character, String> getAakkosto() {        
        return aakkosto;
    }

    public HashMap<String, Character> getKoodisto() {        
        return koodisto;
    }

    /**
     * Lähettää aakkoset käännettäväksi ja lisää aakkostoon ja koodistoon
     * kirjaimen ja sitä vastaavan koodin.
     */
    private void luoAakkostoJaKoodisto() {
        String aakkoset = "abcdefghijklmnopqrstuvwxyz,.!? ";
        for (char c : aakkoset.toCharArray()) {
            String koodi = lajittele(c);
            aakkosto.put(c, koodi);
            koodisto.put(koodi, c);
            System.out.println(c + " = " + koodi);
        }
        //22 eli q aiheuttaa ongelmia :(
        koodisto.remove("22");        
    }

    /**
     * Lajittelee kirjaimet oikeisiin salausmetodeihin.
     */
    private String lajittele(char c) {
        if (tapa1.contains(Character.toString(c))) {
            return tapa1(c);
        } else if (tapa2.contains(Character.toString(c))) {
            return tapa2(c);
        } else if (erikoismerkit.contains(Character.toString(c))) {
            return erikoismerkki(c);
        } else {
            return "";
        }
    }

    private String tapa1(char c) {
        return Integer.toHexString((c - 'a' + 1) * 2);
    }

    private String tapa2(char c) {
        return Integer.toHexString(((32 - (c - 'a' + 1)) * 4) - 1);
    }

    private String erikoismerkki(char c) {
        if (c == ',') {
            return "01";
        } else if (c == '.') {
            return "05";
        } else if (c == '!') {
            return "09";
        } else if (c == '?') {
            return "13";
        } else if (c == ' ') {
            return "00";
        } else {
            return null;
        }
    }
}
