// 13
interface Writable
{
    void writes();
}
interface Readable 
{   
    void reads();
     
}
class Student implements Readable,Writable
{
    public void reads()
    {
    System.out.print("Student reads.. ");
    }
    public void writes()
    {
    System.out.print("Student writes..");
    }
 
    
}
/**
 * Students
 */
public class Students {

    public static void main(String args[])
    {
    Student s = new Student();
    s.reads();
    s.writes();
    }
}