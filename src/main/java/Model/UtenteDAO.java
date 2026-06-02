package Model;

import Util.DatabaseConnection;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtenteDAO {

    public static boolean registra(Utente u) throws SQLException{
        String passwordCriptata= BCrypt.hashpw(u.getPassword(),BCrypt.gensalt(12));
        Connection conn= DatabaseConnection.getConnessione();
        PreparedStatement st= conn.prepareStatement(
                "INSERT INTO utenti (nome,cognome,email,password) VALUES (?,?,?,?) "
        );
        st.setString(1, u.getNome());
        st.setString(2, u.getCognome());
        st.setString(3, u.getEmail());
        st.setString(4, passwordCriptata);
        return st.executeUpdate()>0;
    }

    public static Utente login(String email, String password) throws SQLException {
        Connection conn = DatabaseConnection.getConnessione();
        PreparedStatement stmt = conn.prepareStatement(
                "SELECT * FROM utenti WHERE email = ?"
        );
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            String passwordCriptata = rs.getString("password");
            // BCrypt.checkpw confronta la password in chiaro con quella criptata
            if (BCrypt.checkpw(password, passwordCriptata)) {
                Utente u = new Utente(
                        rs.getString("nome"),
                        rs.getString("cognome"),
                        rs.getString("email"),
                        passwordCriptata
                );
                u.setId(rs.getInt("id"));
                return u;
            }
        }
        return null; // email non trovata o password errata
    }
}
