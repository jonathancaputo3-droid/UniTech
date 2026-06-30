package Util;

import Model.Utente;

public class SessioneUtente {

    private static Utente utenteCorrente;
    public static void setUtente(Utente u){utenteCorrente = u;}
    public static Utente getUtente(){return utenteCorrente;}

}
