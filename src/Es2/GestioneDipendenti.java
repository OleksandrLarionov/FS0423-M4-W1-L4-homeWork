package Es2;

import Es1.entities.Dipartimento;
import Es1.entities.Dipendente;
import Es1.entities.Livello;

public class GestioneDipendenti {
    public static void main(String[] args) {
        //Creazione dei dipendenti
        Dipendente dipendenteOperaio1 = new Dipendente("2253", Dipartimento.PRODUZIONE);
        Dipendente dipendenteOperaio2 = new Dipendente("2153", Dipartimento.PRODUZIONE);
        Dipendente dipendenteAmministrativo = new Dipendente("0111", Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendenteDirigente = new Dipendente("00001", 2000, 30, Livello.DIRIGENTE, Dipartimento.VENDITE);
        //Promozioni
        dipendenteAmministrativo.promuovi();
        dipendenteOperaio1.promuovi();
        //Stampa a video i dati dei dipendenti
        System.out.println(dipendenteDirigente);
        System.out.println(dipendenteAmministrativo);
        System.out.println(dipendenteOperaio1);
        System.out.println(dipendenteOperaio2);
        //Applico gli straordinari a ciascun dipendente
        Dipendente.calcolaPaga(dipendenteDirigente, 5);
        Dipendente.calcolaPaga(dipendenteAmministrativo, 5);
        Dipendente.calcolaPaga(dipendenteOperaio1, 5);
        Dipendente.calcolaPaga(dipendenteOperaio2, 5);

        System.out.println("L'azienda paga agli dipendenti:" + " " + sumStipendiDipendenti(dipendenteDirigente, dipendenteAmministrativo, dipendenteOperaio1, dipendenteOperaio2) + " " + "euro");
    }

    public static double sumStipendiDipendenti(Dipendente d1, Dipendente d2, Dipendente d3, Dipendente d4) {
        return d1.getStipendio() + d2.getStipendio() + d3.getStipendio() + d4.getStipendio();
    }
}
