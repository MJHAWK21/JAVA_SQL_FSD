package curd;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		Food f1=new Food("vegmeals",80,1);
		Food f2=new Food("fishcurry meals",120,2);
		Food f3=new Food("chappathi and veg curry",40,3);
		Food f4=new Food("chappathi and chicken curry",120,4);
		Food f5=new Food("veg fried rice",60,5);
		Food f6=new Food("chicken curry",150,6);
		
		List<Food>ls=Arrays.asList(f1,f2,f3,f4,f5,f6);
		ls.forEach(t->System.out.println(t));
		
		Scanner n=new Scanner(System.in);
		Employee e=new Employee(0,null);
		System.out.println("enter ther details:\n");
		System.out.println("enter the uid");
		e.setUid(n.nextInt());
		System.out.println("enetr the name");
		e.setName(n.next());
		
		List<Employee>em=Arrays.asList(e);
		em.forEach(t->System.out.println(t));
		int ans,ch;
		do {
			System.out.println("enetr the food details\n");
			ls.forEach(t->System.out.println(t.getFoodname()+" "+t.getFoodprice()+" "+t.getId()));
			System.out.println("enetr your choice");
			ch=n.nextInt();
			System.out.println("Is it the right choice?0 for right choice,1 for wrong choice\n");
			ans=n.nextInt();
			}while(ans==1);
					
		int a;
		a=ch;
		List<Food> lss=ls.stream().filter(t->t.getId()==a).toList();
		em.forEach(t->System.out.println("uid :"+t.getUid()+"\nname :"+t.getName()));
		lss.forEach(t->System.out.println("\nfood name :"+t.getFoodname()+"\nfood price:"+t.getFoodprice()+"food id\n:"+t.getId()));
	}

}
