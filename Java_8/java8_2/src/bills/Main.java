
package bills;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
 
     public static void main(String[] args) {
 
       
        double[] sal= {10000,20000,30000,40000};
        Arrays.stream(sal).map((i)->i+(i+0.05)).forEach((i)->System.out.println(i));
        
        List<Integer> Marks=new ArrayList<>();
        
        Marks.add(100);
        Marks.add(200);
        Marks.add(300);
        
        List <Integer>r=		 Marks.stream().
       		 map((i)->i+2).
       		 collect(Collectors.toList());
        
        System.out.println(r);
        
        
       	
       		List<String> users= new ArrayList();
       		users.add("ASha");
       		users.add("Pooja");
       		users.add("kavita");
       		users.add("deepa");
       		
       		List<String> res=users.stream().filter((i)->Character.isUpperCase(i.charAt(0))).collect(Collectors.toList());
       		
       		System.out.println(res);
       	   
       		
       		// create one list that list contains thouse name with start from the upper case
        
 	}
 
}
 

//cretae arrayList add salary of 5 emps 
//then display salary +5%