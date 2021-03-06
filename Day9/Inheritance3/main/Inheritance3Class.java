package main;

import cls.ChildOneClass;
import cls.ChildTwoClass;
import cls.ParentsClass;

public class Inheritance3Class {

	public static void main(String[] args) {
		/*
		ParentsClass pc = new ParentsClass();
		pc.overRideMethod();
		
		ChildOneClass coc = new ChildOneClass();
		coc.overRideMethod();
		
		ChildTwoClass ctc = new ChildTwoClass();
		ctc.overRideMethod();
		*/
		
		/*
		ParentsClass pc1 = new ChildOneClass();
		pc1.overRideMethod();
		
		ParentsClass pc2 = new ChildTwoClass();
		pc2.overRideMethod();
		*/
		
		ChildOneClass arrCOC[] = new ChildOneClass[10];
		ChildTwoClass arrCTC[] = new ChildTwoClass[10];
		
		/*
		// 고급? 보통?
		arrCOC[0] = new ChildOneClass();
		arrCTC[0] = new ChildTwoClass();
		arrCTC[1] = new ChildTwoClass();
		arrCTC[2] = new ChildTwoClass();
		arrCOC[1] = new ChildOneClass();
		arrCTC[3] = new ChildTwoClass();
		arrCTC[4] = new ChildTwoClass();
		arrCOC[2] = new ChildOneClass();
		arrCTC[5] = new ChildTwoClass();
		arrCTC[6] = new ChildTwoClass();
		
		for (int i = 0; i < arrCOC.length; i++) {
			if(arrCOC[i] != null) {
				arrCOC[i].overRideMethod();
			}
		}
		
		for (int i = 0; i < arrCTC.length; i++) {
			if(arrCTC[i] != null) {
				arrCTC[i].overRideMethod();
			}
		}
		*/
		
		
		
		
		ParentsClass arrPar[] = new ParentsClass[10];
		
		arrPar[0] = new ChildOneClass();
		arrPar[1] = new ChildTwoClass();
		arrPar[2] = new ChildTwoClass();
		arrPar[3] = new ChildTwoClass();
		arrPar[4] = new ChildOneClass();
		arrPar[5] = new ChildTwoClass();
		arrPar[6] = new ChildTwoClass();
		arrPar[7] = new ChildOneClass();
		arrPar[8] = new ChildTwoClass();
		arrPar[9] = new ChildTwoClass();
		
		for (int i = 0; i < arrPar.length; i++) {
			arrPar[i].overRideMethod();
			
			if(arrPar[i] instanceof ChildOneClass) {
				ChildOneClass cOne = (ChildOneClass)arrPar[i];
				cOne.OneMethod();
			}
			else if(arrPar[i] instanceof ChildTwoClass) {
				ChildTwoClass cTwo = (ChildTwoClass)arrPar[i];
				cTwo.TwoFunc();
			}
		}
		
	//	ChildOneClass cOne = (ChildOneClass)arrPar[0];
	//	cOne.OneMethod();
		
		/*
		// instanceof
		if(arrPar[1] instanceof ChildOneClass) {
			ChildOneClass cOne = (ChildOneClass)arrPar[1];
			cOne.OneMethod();
		}
		else if(arrPar[1] instanceof ChildTwoClass) {
			ChildTwoClass cTwo = (ChildTwoClass)arrPar[1];
			cTwo.TwoFunc();
		}
		*/
		
		
		

	}

}
