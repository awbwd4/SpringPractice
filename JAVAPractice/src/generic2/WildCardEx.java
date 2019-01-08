package generic2;

import java.util.Arrays;

public class WildCardEx {

	public static void registerCourse(Course<?> course) {//모든 과정  출력
		System.out.println(course.getName()+" 수강생 "+
				Arrays.toString(course.getStudents())
				);
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {//학생과정  출력
		System.out.println(course.getName()+" 수강생 "+
				Arrays.toString(course.getStudents())
				);
	}
	
	public static void registerCouseWorker(Course<? super Worker> course) {//직장인과 일반인 과정  출력
		System.out.println(course.getName()+" 수강생 "+
				Arrays.toString(course.getStudents())
				);
	}
	
	public static void main(String[] args) {
		
		Course<Person> personCourse =  new Course<Person>("일반인 과정", 5); //일반인과정, 수강생 5명 개설
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new Student("고등학생"));
		
		
		registerCourse(personCourse);
		
		
		
		
	}
	
	
	
	
	
	
	
}


class Course<T>{
	
	private String name;
	private T[] students;
	
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
	}
	
	public String getName() {
		return name;
	}
	public T[] getStudents() {
		return students;
	}
	
	public void add(T t) {//배열에 비어있는 부분을 찾아서 수강생을 추가하는 메소드
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}

class Person{
	private String lv;
	public Person(String level) {
		this.lv = level;
		}
	
}

class Worker extends Person{
	private String lv;
	
	public Worker(String level) {
		super(level);
		this.lv = level;
		}}

class Student extends Person{

	public Student(String level) {
		super(level);
	}}

class HighStudent extends Student{
	public HighStudent(String level) {
		super(level);
	}}