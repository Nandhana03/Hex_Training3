package com.spring.practice.springcore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
           	
    	int[] arr= {1,3,2,9,7,10,6};
    	
//    	Filter even numbers and square them.
    	Arrays.stream(arr).filter((i)->i%2==0).forEach((i)->System.out.println(i*i));
    	
//    	➤ Find the max, min, sum, and average.
    	
    	//max
        OptionalInt max_no=Arrays.stream(arr).max();
        System.out.println(Integer(max_no));
        
        //min
        OptionalInt min_no=Arrays.stream(arr).min();
        System.out.println(Integer(min_no));
        
        //sum
        int sum=Arrays.stream(arr).sum();
        System.out.println(sum);
        
        //avg
        OptionalDouble avg=Arrays.stream(arr).average();
        System.out.println(Double(avg));


//    	List of strings
//    	➤ Get strings starting with "A".
        String[] fruits= {"apple","mango","guava","pineapple","guava","pineapple"};
        Arrays.stream(fruits).filter((i)->Character.toUpperCase(i.charAt(0))=='A').forEach((i)->System.out.println(i));
        
//    	➤ Convert all to uppercase and sort.
        List<String> sorted_fruits=Arrays.stream(fruits).map((i)->i.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(sorted_fruits.toString());
//
//    	Set of integers
//    	➤ Remove duplicates from a list using Set and collect back to list.
        Set<String> set=Arrays.stream(fruits).collect(Collectors.toSet());
        System.out.println(set.toString());
        
        
// -------------------------------------TASK - 2 -------------------------------------------------------------------------------------------------------------
        
//        List-Based
//        List<String> of names
          List<String> names=new ArrayList<>(Arrays.asList("Jane Eyre","Elizabeth bennet","Darcy","Rochester","Jane Austen"));
          
//        ➤ Return the longest name.
          Optional<String> max_lengthed=names.stream().max(Comparator.comparingInt(String::length));
          System.out.println(max_lengthed.toString());
          
//        ➤ Return names sorted by length.
          List<String> max_sorted=names.stream().sorted(Comparator.comparingInt(String::length).reversed()).collect(Collectors.toList());
          System.out.println(max_sorted);
          
//        ➤ Count how many names have length > 5.
          int count=(int) names.stream().filter((i)->i.length()>5).count();
          System.out.println("Names with length more than 5 is: "+count);

          
//        List<Integer> of marks
          List<Integer> marks=new ArrayList<>(Arrays.asList(34,67,45,90,77));
          
//        ➤ Partition marks into pass and fail (>=35).
          List<Integer> passed=marks.stream().filter((i)->i>=35).collect(Collectors.toList());
          System.out.println("pass marks:"+passed);
          List<Integer> failed=marks.stream().filter((i)->i<=35).collect(Collectors.toList());
          System.out.println("fail marks:"+failed);
          
//        ➤ Get top 3 marks.
          List<Integer> top_marks=marks.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
          System.out.println("Top 3 marks:"+ top_marks);

//        List<Employee>
          List<Employee> emp=new ArrayList<>();
          Employee e1=new Employee("Sam",23,"IT Support",30000);
          Employee e2 = new Employee("Lisa", 26, "Software Developer", 55000);
          Employee e3 = new Employee("John", 30, "Data Analyst", 47000);
          Employee e4 = new Employee("Ava", 28, "Project Manager", 68000);
          Employee e5 = new Employee("Raj", 25, "QA Engineer", 42000);
          Employee e6 = new Employee("Maya", 27, "UI/UX Designer", 49000);
          Employee e7 = new Employee("Daniel", 32, "DevOps Engineer", 60000);

          emp.add(e1);
          emp.add(e2);
          emp.add(e3);
          emp.add(e4);
          emp.add(e5);
          emp.add(e6);
          emp.add(e7);
          System.out.println(emp.size());
          
          
//        ➤ Filter employees with salary > 50k.
          emp.stream().filter((i)->i.getSalary()>50000).forEach((i)->System.out.println(i.toString()));
          
//        ➤ Group by department.
          Map<String, List<Employee>> groupedByDept = emp.stream()
        		    .collect(Collectors.groupingBy(Employee::getDept));
          
          groupedByDept.forEach((dept, employees) -> {
        	    System.out.println("Department: " + dept);
        	    employees.forEach(System.out::println);
        	    System.out.println(); // line break for readability
        	});

          
//        ➤ Find highest paid employee in each department.
          Map<String, Optional<Employee>> highestPaidInEachDept = emp.stream()
                  .collect(Collectors.groupingBy(
                      Employee::getDept,
                      Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                  ));
          
          highestPaidInEachDept.forEach((dept, employeeOpt) -> {
              employeeOpt.ifPresent(e -> System.out.println(dept + " → " + e));
          });
          
          
//        ➤ Sort by salary descending.
          List<Employee> sortedBySalaryDesc = emp.stream()
        		    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
        		    .collect(Collectors.toList());
          
          System.out.println(sortedBySalaryDesc.toString());

          
    }

	private static double Double(OptionalDouble avg) {
		// TODO Auto-generated method stub
		return avg.getAsDouble();
	}

	private static int Integer(OptionalInt max_no) {
		// TODO Auto-generated method stub
		return max_no.getAsInt();
	}
}
