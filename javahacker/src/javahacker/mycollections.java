package javahacker;

import java.util.ArrayList;

public class mycollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ArrayList<employee> emp = new ArrayList<employee>();
		ar.add("developer");
		ar.add("tester");
		ar.add("manager");
		ar.remove(1);
		for(String st: ar)
		System.out.println(st);
		
		
		emp.add(new employee("mark", 27));
		emp.add(new employee("sam", 20));
		emp.add(new employee("peter", 327));
		for (employee st: emp)
			System.out.println(st.name);
		for (employee employee : emp)
			System.out.println(employee.age);
		
	}
		static class employee{
			String name;
			int age;
			public employee(String name, int age){
				this.name=name;
				this.age=age;
			}
			
		}

	}


