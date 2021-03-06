package s9017.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import s9017.Procesory;



public class ProcesoryDB {

	private Connection conn;
	private Statement stmt;
	private PreparedStatement addProcesory;
	private PreparedStatement getProcesory;

	public ProcesoryDB(){
		try {
				conn= DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb");
				stmt=conn.createStatement();
				boolean ProcesoryTableExists=false;
				ResultSet rs= conn.getMetaData().getTables(null, null, null, null);
				while(rs.next()){
					if("Procesory".equalsIgnoreCase(rs.getString("TABLE_NAME"))){
						ProcesoryTableExists=true;
						break;
					}
				}
				if(!ProcesoryTableExists)
				{
					stmt.executeUpdate("" +	"CREATE TABLE Procesory(" +"id bigint GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY," + "name varchar(30)," + "" + ")");
}					addProcesory=conn.prepareStatement("" +	"INSERT INTO Procesory (name) VALUES (?)" +	"");
					getProcesory=conn.prepareStatement("" +	"SELECT * FROM Procesory" + "");

				} catch (SQLException e) {
						e.printStackTrace();
				}
}

	public void addProcesory(Procesory p){
		try {
			addProcesory.setString(1, p.getNazwaP());
			addProcesory.executeUpdate();
			} catch (SQLException e) {
					e.printStackTrace();
			}
	}

	public List<Procesory> getAllProcesory(){
		List<Procesory> proc=new ArrayList<Procesory>();
		try {
			ResultSet rs= getProcesory.executeQuery();
			while(rs.next()){
				proc.add(new Procesory(rs.getString("name"), null));
			}
			} catch (SQLException e) {
			e.printStackTrace();
			}
		return proc;
	}
}
