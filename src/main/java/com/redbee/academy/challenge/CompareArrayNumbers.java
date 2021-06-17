package com.redbee.academy.challenge;

import java.util.*;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with the max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
	  List<Integer> nuevaLista =  new ArrayList<Integer>();
	  List<Integer> minLengthList, maxLengthList;
	  if(a.size() <= b.size()) {
		  minLengthList = a;
		  maxLengthList = b;
	  } else {
		  minLengthList = b;
		  maxLengthList = a;
	  }
	  int i;
	  for (i = 0; i < minLengthList.size() ; i++) {
		  if(a.get(i) > b.get(i)) nuevaLista.add(a.get(i)); else nuevaLista.add(b.get(i));
	  }
	  while(i < maxLengthList.size()) {
		  nuevaLista.add(maxLengthList.get(i));
		  i++;
	  }
	  return nuevaLista;
  }



}
