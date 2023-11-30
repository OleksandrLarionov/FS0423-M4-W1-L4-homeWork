package Es1;

import Es1.entities.Dipartimento;
import Es1.entities.Dipendente;

public class Main {
    public static void main(String[] args) {
//        Creo un dipendente
        Dipendente dipendenteUno = new Dipendente("123456", Dipartimento.VENDITE);
//        System.out.println(dipendenteUno);
        dipendenteUno.promuovi();

        System.out.println(dipendenteUno);
//        Dipendente.calcolaPaga(dipendenteUno);
//        Dipendente.calcolaPaga(dipendenteUno, 20);
        System.out.println(dipendenteUno.promuovi());
    }
}