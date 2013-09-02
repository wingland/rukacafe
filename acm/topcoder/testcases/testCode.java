package com.rukacafe.acm.topcoder.testcases;

import com.rukacafe.acm.topcoder.equi.BinaryCode;
import com.rukacafe.acm.topcoder.equi.sortByOdds;
import com.rukacafe.acm.topcoder.tc1_13.BridgeCrossing;
import com.rukacafe.acm.topcoder.tc1_13.PowerOutage;
import com.rukacafe.acm.topcoder.tc1_13.VendingMachine;
import com.rukacafe.acm.topcoder.tc1_13.YahtzeeScore;
import com.rukacafe.acm.topcoder.tc1_14.GoldenChain;
import com.rukacafe.acm.topcoder.tc1_15.MessageMess;
import com.rukacafe.acm.topcoder.tc1_21.TheSquareRootDilemma;
import com.rukacafe.acm.topcoder.tc1_29.TheSimilarNumbers;
import com.rukacafe.acm.topcoder.tc2_25.CityMap;
import com.rukacafe.acm.topcoder.tc2_25.PolygonTraversal2;
import com.rukacafe.acm.topcoder.tc2_25.TheNumberGameDiv2;
import com.rukacafe.acm.topcoder.tc2_25.TheNumberGameDivTwo;
import com.rukacafe.acm.topcoder.tc2_25.TheSwapsDivTwo;


public class testCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/****BinaryCode Test******/
	/*	BinaryCode code=new BinaryCode();
		System.out.println(code.decode("123210122")[0]);

		System.out.println(code.decode("123210122")[1]);*/
		/****sortByOdds Test******/
	/*	sortByOdds testCase2=new sortByOdds();
		String[] test1={"PICK ANY TWO: 10 2 F F"
				,"PICK TWO IN ORDER: 10 2 T F"
				,"PICK TWO DIFFERENT: 10 2 F T"
				,"PICK TWO LIMITED: 10 2 T T"};
		String[] test2={"INDIGO: 93 8 T F",
				 "ORANGE: 29 8 F T",
				 "VIOLET: 76 6 F F",
				 "BLUE: 100 8 T T",
				 "RED: 99 8 T T",
				 "GREEN: 78 6 F T",
				 "YELLOW: 75 6 F F"};
		String[] myresult=testCase2.sortByOddd(test2);
		for(int i=0;i<myresult.length;i++){
			System.out.println(myresult[i]);
		}*/
		/****PowerOutage Test****/
	/*	int[][] testCase1={{0},{1},{10}};
		int[][] testCase2={{0,1,0},
		{1,2,3},
		{10,10,10}};
		int[][] testCase3={{0,0,0,1,4,4,6,7,7,7,20},
		{1,3,4,2,5,6,7,20,9,10,31},
		{10,10,100,10,5,1,1,100,1,1,5}};
		int[][] testCase4={{0,0,0,0,0},
		{1,2,3,4,5},
		{100,200,300,400,500}};
		int[][] testCase=testCase4;
		PowerOutage testClass=new PowerOutage();
		System.out.println(testClass.estimateTimeOut(testCase[0],testCase[1],testCase[2]));
*/
		/***VendingMachine Test****/
/*		String[][] testCase1={{"100 100 100"},
		{"0,0:0", "0,2:5", "0,1:10"}};
		String[][] testCase2={{"100 200 300 400 500 600"},
		{"0,2:0", "0,3:5", "0,1:10", "0,4:15"}};
		String[][] testCase3={{"100 200 300 400 500 600"},
		{"0,2:0", "0,3:4", "0,1:8", "0,4:12"}};
		String[][] testCase4={{"100 100 100"},
		{"0,0:10", "0,0:11"}};
		String[][] testCase5={{"100 200 300",
		 "600 500 400"},
		{"0,0:0", "1,1:10", "1,2:20",
		 "0,1:21", "1,0:22", "0,2:35"}};
		String[][] testCase=testCase5;
		VendingMachine testClass=new VendingMachine();
		System.out.println(testClass.motorUse(testCase[0],testCase[1]));*/
		/****Verifying BridgeCross***/
/*		BridgeCrossing testClass=new BridgeCrossing();
		int[] testCase={ 1, 2, 3, 4, 5 };
		System.out.println(testClass.minTime(testCase));
		int[] testCase={ 2, 2, 3, 5, 4 };
		YahtzeeScore testClass=new YahtzeeScore();
		System.out.println(testClass.maxPoints(testCase));*/
		/****Verifying GoldenChain***/
/*		GoldenChain testClass=new GoldenChain();
		int[] testCase={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
				38,39,40,41,42,43,44,45,46,47,48,49,50};
		System.out.println(testClass.mintCuts(testCase));*/
/*		*//***Verfying MessgaeMess***//*
		MessageMess testClass=new MessageMess();
		String[] arg1_1={"A", "AA", "AAA", "AAAA", "AAAAA", "AAAAAA", "AAAAAAA", "AAAAAAAA", "AAAAAAAAA", "AAAAAAAAAA", "AAAAAAAAAAA", "AAAAAAAAAAAA", "AAAAAAAAAAAAA", "AAAAAAAAAAAAAA", "AAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"};
		String arg2_1="AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB";
		String[] arg1={"A", "BA", "BABA", "AR", "ABA", "ABAB"};
		String arg2="ABABABABABABABABABABABABABABABABABABABABABABAR";
		System.out.println(testClass.restore(arg1_1,arg2_1));*/
	/*	TheSquareRootDilemma testClass=new TheSquareRootDilemma();
		int arg1=4;
		int arg2=65;
		System.out.println(testClass.countPairs(arg1,arg2));
*/
		/*TheSimilarNumbers acase=new TheSimilarNumbers();
		System.out.println("test"+acase.find(10
				,10110));*/
	/*	CityMap testcase=new CityMap();
		String[] a={"AIAAARRI.......GOAI.",
				 ".O..AIIGI.OAAAGI.A.I",
				 ".A.IAAAARI..AI.AAGR.",
				 "....IAI..AOIGA.GAIA.",
				 "I.AIIIAG...GAR.IIAGA",
				 "IA.AOA....I....I.GAA",
				 "IOIGRAAAO.AI.AA.RAAA",
				 "AI.AAA.AIR.AGRIAAG..",
				 "AAAAIAAAI...AAG.RGRA",
				 ".J.IA...G.A.AA.II.AA"};
		int[] b={16,7,1,35,11,66};
		System.out.println(testcase.getLegend(a,b));*/
		/*TheNumberGameDiv2 testcase=new TheNumberGameDiv2();
		int a=9798147
				;
		int b=79817;
		System.out.println(testcase.minimumMoves(a, b));*/
		/*int a=11;
		int[] b={1, 5, 10};
		PolygonTraversal2 testcase=new PolygonTraversal2();
		System.out.println(testcase.count(a,b));*/
		/*int m=747;
		TheNumberGameDivTwo testcase =new TheNumberGameDivTwo();
		System.out.println(testcase.find(m));*/
	}

}
