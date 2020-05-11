package com.earch.cursos.javase7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Streams {

	public static void main(String[] args) {
		
		List<String> lstAbc = new ArrayList<>();
		lstAbc.add("I");
		lstAbc.add("J");
		lstAbc.add("K");
		lstAbc.add("L");
		lstAbc.add("E");
		lstAbc.add("F");
		lstAbc.add("A");
		lstAbc.add("B");
		lstAbc.add("C");
		lstAbc.add("D");
		lstAbc.add("G");
		lstAbc.add("H");
	
		Collections.sort(lstAbc);
		
		for(String letra: lstAbc) {
			System.out.println(letra);
		}

	}

}
