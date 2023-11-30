package Es1;

public class Dipendente {
    public static double stipendioBase = 1000;

    private String matricola;
    private double stipendio;
    private double importoOrarioStraordinario;
    private Livello livello;
    private Dipartimento dipartimento;

    //    Costruttore
    public Dipendente(String matricola, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.dipartimento = dipartimento;
        this.stipendio = stipendioBase;
        this.importoOrarioStraordinario = 30;
        this.livello = Livello.OPERAIO;
    }

    public Dipendente(String matricola, double stipendio, double importoOrarioStraordinario, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.importoOrarioStraordinario = importoOrarioStraordinario;
        this.livello = livello;
        this.dipartimento = dipartimento;
    }

    //Getters
    public String getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public double getImportoOrarioStraordinario() {
        return importoOrarioStraordinario;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }
//    Setters

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
//    Stampiamo i dati del dipendente

    @Override
    public String toString() {
        return "Dipendente{" +
                "matricola='" + matricola + '\'' +
                ", stipendio=" + stipendio + " " + "euro" + " " +
                ", importoOrarioStraordinario=" + importoOrarioStraordinario + " " + "euro" + " " +
                ", livello=" + livello +
                ", dipartimento=" + dipartimento +
                '}';
    }

    // metodo promuovi
    public void promuovi() {
        switch (livello) {
            case OPERAIO:
                livello = Livello.IMPIEGATO;
                break;
            case IMPIEGATO:
                livello = Livello.QUADRO;
                break;
            case QUADRO:
                livello = Livello.DIRIGENTE;
                break;
            case DIRIGENTE:
                System.out.println("Il dipendente è già un dirigente. Promozione non possibile.");
                break;
            default:
                System.out.println("E' Morfeo! non lavora qui!");
                break;
        }
    }

    public Livello aggiorna() {
        switch (livello) {
            case IMPIEGATO:
                stipendio = stipendioBase * 1.2;
                break;
            case QUADRO:
                stipendio = stipendioBase * 1.5;
                break;
            case DIRIGENTE:
                stipendio = stipendioBase * 2;
                break;
            default:
                System.out.println("STRA Non Pagati per tutti!");
                break;
        }
        return livello;
    }

    public static void calcolaPaga(Dipendente nomeDelDipendente) {
        System.out.println("Il dipendente numero matricola: " + " " + nomeDelDipendente.matricola + " " + "percipisce mensilmente" + " " + nomeDelDipendente.stipendio + " euro");
    }

    public static void calcolaPaga(Dipendente nomeDelDipendente, int oreDiStraordinatio) {
        double PagaTotale = nomeDelDipendente.stipendio + (oreDiStraordinatio * nomeDelDipendente.importoOrarioStraordinario);
        System.out.println("Il dipendente numero matricola: " +
                " " + nomeDelDipendente.matricola +
                " " + "percipisce mensilmente con " + oreDiStraordinatio +
                " " + " ore extraordinarie" +
                " " + "L'importo Lordo di:" +
                " " + +PagaTotale + " euro");
    }
}
