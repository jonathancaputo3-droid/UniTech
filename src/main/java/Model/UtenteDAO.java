package Model;

import Util.DatabaseConnection;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtenteDAO {

    //Metodo per registare un utente nel database con password criptata
    public static boolean registra(Utente u) throws SQLException{
        String passwordCriptata= BCrypt.hashpw(u.getPassword(),BCrypt.gensalt(12));
        Connection conn= DatabaseConnection.getConnessione();
        PreparedStatement st= conn.prepareStatement(
                "INSERT INTO utenti (nome,cognome,email,password) VALUES (?,?,?,?) ",
                    PreparedStatement.RETURN_GENERATED_KEYS
        );
        st.setString(1, u.getNome());
        st.setString(2, u.getCognome());
        st.setString(3, u.getEmail());
        st.setString(4, passwordCriptata);
        int righe=st.executeUpdate();
        if(righe>0){
            ResultSet keys= st.getGeneratedKeys();
            if(keys.next()){
                u.setId(keys.getInt(1));
            }
        }
        return righe>0;
    }

    //Metodo per eseguire il login con email e password
    public static Utente login(String email, String password) throws SQLException {
        Connection conn = DatabaseConnection.getConnessione();
        PreparedStatement stmt = conn.prepareStatement(
                "SELECT * FROM utenti WHERE email = ?"
        );
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            String passwordCriptata = rs.getString("password");
            //BCrypt.checkpw confronta la password in chiaro con quella criptata
            if (BCrypt.checkpw(password, passwordCriptata)) {
                Utente u = new Utente(
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("email"),
                        passwordCriptata
                );
                u.setId(rs.getInt("id"));
                u.setSesso(rs.getString("sesso"));
                u.setLingua(rs.getString("lingua"));
                u.setDataNascita(rs.getString("dataNascita"));
                u.setIndirizzo(rs.getString("indirizzo"));
                u.setCellulare(rs.getString("cellulare"));
                u.setCitta(rs.getString("citta"));
                return u;
            }
        }
        return null; //email non trovata o password errata
    }

    //Metodo per aggiornare i dati del profilo
    public static boolean aggiornaProfilo(Utente u) throws SQLException{
        Connection conn = DatabaseConnection.getConnessione();
        PreparedStatement st = conn.prepareStatement("""
            UPDATE utenti SET
                nome = ?,
                cognome = ?,
                email = ?,
                sesso = ?,
                lingua=?,
                dataNascita = ?,
                indirizzo   = ?,
                cellulare   = ?,
                citta = ?
            WHERE id = ?
                
        """);
        st.setString(1, u.getNome());
        st.setString(2, u.getCognome());
        st.setString(3, u.getEmail());
        st.setString(4, u.getSesso());
        st.setString(5, u.getLingua());
        st.setString(6, u.getDataNascita());
        st.setString(7, u.getIndirizzo());
        st.setString(8, u.getCellulare());
        st.setString(9, u.getCitta());
        st.setInt(10, u.getId());
        return st.executeUpdate()>0;
    }

    //Metodo per verificare se l'email inserita è già presente nel db
    public static boolean emailEsistente(String email) throws SQLException{
        Connection conn = DatabaseConnection.getConnessione();
        PreparedStatement st = conn.prepareStatement("""
                SELECT COUNT(*) FROM utenti WHERE email = ?
        """);
        st.setString(1, email);
        ResultSet rs = st.executeQuery();
        return rs.next() && rs.getInt(1)>0;
    }

    //Metodo per eliminare l'account
    public static boolean eliminaAccount(int id) throws SQLException{
        Connection conn = DatabaseConnection.getConnessione();
        PreparedStatement st = conn.prepareStatement("""
            DELETE FROM utenti WHERE id = ?
        """);
        st.setInt(1, id);
        return st.executeUpdate()>0;
    }

    //Metodo per cambiare la password inserendo l'email
    public static boolean cambiaPassword(String email,String password) throws SQLException{
        Connection conn= DatabaseConnection.getConnessione();
        String passwordCriptata= BCrypt.hashpw(password,BCrypt.gensalt(12));
        PreparedStatement st= conn.prepareStatement("""
            UPDATE utenti SET
                password= ?
            WHERE email= ?
        """);
        st.setString(1,passwordCriptata);
        st.setString(2,email);
        return st.executeUpdate()>0;
    }
}
