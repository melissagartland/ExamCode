package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.GameRuleDomainModel;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Melissa", "Ann", "Gartland", dBirthDate, "3014 Limestone Road", "610-209-4352", "magart@udel.edu", "CISC");
		Student stu3 = new Student("Sara", "Ann", "Gartland", dBirthDate, "3014 Limestone Road", "484-684-6323", "sgart@udel.edu","MATH");
		Student stu4 = new Student("Kaye", "Pauline", "Bortle", dBirthDate, "14 Colton Drive", "484-867-5309", "kbort@udel.edu", "PHYS");
		Student stu5 = new Student("Nomad", "Non","Existent", dBirthDate, "0123 Bridge To Nowhere", "000-111-2222", "cisc181@udel.edu", "NON");
		
		public static HashMap<String, Student> getStudentSet()
		{
			HashMap<String, Student> HashStudentSet = new HashMap<String, Student>();
			
			for (Student gr: getStudentSet())
			{
				HashStudentSet.put(gr.getStudentSet(), gr);
			}
			return HashStudentSet;


		assertTrue(5==5);
	}

}
