//creator aku
package parts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortingwordsbyCharandLength {
	static Map<Character,Map<Integer,List<String>>> dict2=new HashMap<Character,Map<Integer,List<String>>>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  thisLine = null;
		long startTime = System.nanoTime(); 
	      List<String> list=new ArrayList<>();
	   
	      try{
	         // open input stream test.txt for reading purpose.
	    	 File file = new File("words.txt");
	         BufferedReader br = new BufferedReader(new FileReader(file));
	         while ((thisLine = br.readLine()) != null) {
	            //System.out.println(thisLine);
	        	 // we define the two keys by we will osrt our hashmap
	        	 char key = thisLine.charAt(0);
	        	 int key1=thisLine.length();
	        	 // creating hashmap by Character
	        	 if(!dict2.containsKey(key)){
	        		 dict2.put(key, new HashMap<Integer, List<String>>());
	        		 //System.out.println(thisLine);
	        		 //System.out.println(key1);
	        		 //dict2.get(key).put(key1, new ArrayList<>());
	        	 }
	        	 // Second part by second key
	        	 if(!dict2.get(key).containsKey(key1)){
	        		 dict2.get(key).put(key1, new ArrayList<>());
	        	 }
	        	 
	        		 
	        	 //System.out.println(thisLine);
	        	 //System.out.println(key1);
	        	 //Storing the corresponding word
	            	dict2.get(key).get(key1).add(thisLine);
	         }       
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	     
	
	      System.out.println(dict2.keySet());
	      System.out.println(dict2.get('f').keySet());
	      System.out.println(dict2.get('f').get(24));
	      long estimatedTime = System.nanoTime() - startTime;
	      System.out.println(estimatedTime/1000000);
 
 }
	
	public static boolean checkoro(String word){
        Character key = word.charAt(0);
        Integer length = word.length();

        return dict2.get(key).get(length).contains(word);
		
		
	}
	
	
 }