package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    private static final String URL="jdbc:sqlite:database.db";
    private static Connection connessione;

    //Apro la connessione al database
    public static Connection getConnessione() throws SQLException {
        if(connessione==null || connessione.isClosed()){
            connessione = DriverManager.getConnection(URL);
        }
        return connessione;
    }

    //Creo la tabella degli utenti se non esiste
    public static void inizializzaDB() throws SQLException{
        Connection conn=getConnessione();
        Statement st=conn.createStatement();
        st.execute("""
                CREATE TABLE IF NOT EXISTS utenti(
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    nome TEXT NOT NULL,
                    cognome TEXT NOT NULL,
                    email TEXT NOT NULL,
                    password TEXT NOT NULL,
                    sesso TEXT,
                    lingua TEXT,
                    dataNascita TEXT,
                    indirizzo TEXT,
                    cellulare TEXT,
                    citta TEXT
                )
            """);
    }

    //Alla chiusura del programma, chiudo la connessione al database
    public static void chiudi() throws SQLException{
        if (connessione!=null && !connessione.isClosed()){
            connessione.close();
        }
    }
}


