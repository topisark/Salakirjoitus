package Models;

import java.util.HashMap;

public class Purkaja {

    private final HashMap<String, Character> koodisto;

    /**
     * Konstruktori.
     *
     * @param koodisto
     */
    public Purkaja(HashMap<String, Character> koodisto) {
        this.koodisto = koodisto;
    }

    /**
     * Yrittää ensin kääntää kahta merkkiä kirjaimeksi ja jos se ei toimi, niin
     * kokeilee yhdellä. Tämä vähensi koodin hajoilua 2-alkuisten koodien
     * kanssa.
     *
     * @param koodi
     * @return Purettu teksti.
     */
    public String pura(String koodi) {
        String teksti = "";
        String apu = "";
        if (koodi.length() == 1 && koodisto.get(koodi) != null) {
            return "" + koodisto.get(koodi);
        }
        for (int i = 0; i < koodi.length(); i++) {
            if (i < koodi.length() - 1) {
                apu += koodi.charAt(i);
                apu += koodi.charAt(i + 1);
                i++;                
            } else {
                apu += koodi.charAt(i);                
            }
            if (koodisto.get(apu) == null && apu.length() == 2) {
                i--;
                apu = "" + koodi.charAt(i);                            
            }
            if (koodisto.get(apu) != null) {
                teksti += koodisto.get(apu);                
            }
            apu = "";
        }
        return teksti;
    }

}
