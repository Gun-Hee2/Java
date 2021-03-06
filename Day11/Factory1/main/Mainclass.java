package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class Mainclass {

	public static void main(String[] args) {
		/*
		    Factory Pattern
		    원하는 형태의 object를 생성할 수 있는 패턴
		  
		*/
		
		/*
		Animal ani1 = AnimalFactory.create("멍멍이");
		Animal ani2 = AnimalFactory.create("야옹이");
		Animal ani3 = AnimalFactory.create("황소");
		
		ani1.printDescript();
		ani2.printDescript();
		ani3.printDescript();
		
		((Dog)ani1).dogMethod();
		
		Cat c = (Cat)ani2;
		c.catMethod();
		
		((Cow)ani3).cowMethod();
		*/
		
		String aniName[] = { "야옹이", "멍멍이", "멍멍이", "황소", "야옹이" };
		
	    List<Animal> list = new ArrayList<Animal>();
	    
	    // 추가
	    for (int i = 0; i < aniName.length; i++) {
			Animal a = AnimalFactory.create(aniName[i]);
			list.add(a);
		}
	    
	    // 산출
	    for (int i = 0; i < list.size(); i++) {
			Animal a = list.get(i);
			a.printDescript();
			
			if(a instanceof Dog) {
				((Dog)a).dogMethod();
			}else if(a instanceof Cat) {
				Cat c = (Cat)a;
				c.catMethod();
			}else if(a instanceof Cow) {
				((Cow)a).cowMethod();
			}
			
		}
		

	}

}
