package database;

import model.Afdeling;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AfdelingDAO extends AbstractDAO {

    public AfdelingDAO(DBaccess dBaccess) {
        super(dBaccess);
    }

    public void slaAfdelingOp(Afdeling afdeling) {
        String sql = "INSERT INTO afdeling(afdelingsnaam, afdelingsplaats) VALUES (?,?);";
        try {
            setupPreparedStatement(sql);
            preparedStatement.setString(1, afdeling.getAfdelingsNaam());
            preparedStatement.setString(2, afdeling.getAfdelingsPlaats());
            executeManipulateStatement();
        } catch (SQLException sqlFout) {
            System.out.println("SQL fout: " + sqlFout.getMessage());
        }
    }
    public ArrayList<Afdeling> geefAfdelingen() {
        ArrayList<Afdeling> afdelingen = new ArrayList<>();
        String sql = "SELECT * FROM afdeling;";
        try {
            setupPreparedStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                afdelingen.add(new Afdeling(resultSet.getString("afdelingsnaam"),
                        resultSet.getString("afdelingsplaats")));

            }
        } catch (SQLException sqlFout) {
            System.out.println("SQL fout: " + sqlFout.getMessage());
        }
        return afdelingen;
    }
    public ArrayList<Afdeling> geefAfdelingenMetPlaats(String afdelingsPlaats) {
        ArrayList<Afdeling> afdelingen = new ArrayList<>();
        String sql = "SELECT * FROM afdeling WHERE afdelingsplaats = ?;";
        try {
            setupPreparedStatement(sql);
            preparedStatement.setString(1, afdelingsPlaats);
            ResultSet resultSet = executeSelectStatement();
            while (resultSet.next()) {
                afdelingen.add(new Afdeling(resultSet.getString("afdelingsnaam"),
                        resultSet.getString("afdelingsplaats")));
            }
        } catch (SQLException sqlFout) {
            System.out.println("SQL fout: " + sqlFout.getMessage());
        }
        return afdelingen;
    }
}