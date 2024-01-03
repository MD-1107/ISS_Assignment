package collection;
import java.util.*;


class Student 
{
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getId()
	{
		return id;
	}
	
	@Override
	public String toString()
	{
		return "Student{"+"id="+id+", name='"+name+'\''+", age="+age+'}';
	}
	
}

public class CollectionWithObject 
{
	public static void main(String args[])
	{
		Set<Student> studentSet=new HashSet<Student>(); //creating the set of Student objects 
		
		studentSet.add(new Student(1, "John", 20));
		studentSet.add(new Student(2, "Elle", 23));
		studentSet.add(new Student(3, "Andrew", 21));
		
		
		Map<Integer,Student> studentMap=new HashMap<Integer,Student>(); //map of student object with the id as the key and the whole object as the value 
		
		for (Student student : studentSet) 
		{
            studentMap.put(student.getId(), student);
        }
		
		List<Student> studentList = new ArrayList<>(studentSet); //list of the student object 

        // Display Set, Map, and List
        System.out.println("Set of Students:");
        displayStudents(studentSet);

        System.out.println("\nMap of Students:");
        displayStudents(studentMap.values());

        System.out.println("\nList of Students:");
        displayStudents(studentList);
	}
	
	public static void displayStudents(Collection<Student> students)
	{
		for (Student student:students)
		{
			System.out.println(student.toString());
		}
	}

}
