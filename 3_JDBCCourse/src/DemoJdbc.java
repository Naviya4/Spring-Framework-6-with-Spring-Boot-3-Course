import java.sql.*; // step 1

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
        import package
        load and register
        create connection
        create statement
        execute statement
        process the results
        close
        */

        int sid = 6;
        String sname = "Maxwell";
        int marks = 89;

        String url = "jdbc:postgresql://localhost:5432/demo"; // jdbc, dbms, database name
        String uname = "postgres";
        String pass = "011614";

        String sql = "insert into student values (?,?,?)";

        Class.forName("org.postgresql.Driver"); // step 2. This line is not compulsory.
        Connection con = DriverManager.getConnection(url, uname, pass); // step 3. Then create url, uname, pass variables above.
        System.out.println("Connection Established");

        PreparedStatement st = con.prepareStatement(sql); // step 4. Then assign the query to a variable above.
        st.setInt(1, sid);
        st.setString(2, sname);
        st.setInt(3, marks);

        st.execute();

        con.close(); // step 7
        System.out.println("Connection Closed");

    }

}
