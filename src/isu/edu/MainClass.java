package isu.edu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Queue<Integer> line= new LinkedList<Integer>();
		line.offer(1);
		line.offer(1);
		line.offer(2);
		Integer a= line.poll();
		
		line.offer(a);
		if(line.poll()==a)
			System.out.println("yes");
		//added from web
		
		
	}

}
