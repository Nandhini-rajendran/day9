import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc
{
    public static  void main(String args[])
    {
        try {
            //load the driver class
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/student?characterEncoding=utf8","root","root");
            if(connection!=null)
            {
                //Create update and delete ,select
                String insertQuery="insert into student values(null,'nirvak',23,5),(null,'nandhu',45,2)";
                Statement statement= connection.createStatement();
                statement.executeUpdate(insertQuery);
                String updateQuery="update student set name='komal' where rollno=23";
                statement= connection.createStatement();
                statement.executeUpdate(updateQuery);
                String deleteQuery="delete from student where name='nirvak' ";
                statement= connection.createStatement();
                statement.executeUpdate(deleteQuery);
                System.out.println("connection successful");
                String query="select * from student";
                statement= connection.createStatement();
                ResultSet set= statement.executeQuery(query);
                //retrun true if there is data otherwise
                while(set.next())
                {
                    System.out.println("id =="+set.getInt(1));
                    System.out.println("name =="+set.getString(2));
                    System.out.println("rollno =="+set.getInt(3));
                    System.out.println("subjectid =="+set.getInt(4));
                }
            }
            else
            {
                System.out.println("Not connection successful");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


