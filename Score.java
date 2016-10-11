//creator aku
package parts;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Score {
	private static Map<Integer,Double> scoro=new HashMap<Integer,Double>();
	private static List<String> list=new ArrayList<>();
	
	public Score(){
		for(int i=0;i<34;i++){
			double a=(i+1)*0.51;
			scoro.put(i+1,a);
		}
		String  thisLine = null;
		try{
			File file = new File("routes.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((thisLine = br.readLine()) != null) {
				list.add(thisLine);
			}
		}catch(Exception e){
	         e.printStackTrace();
	      }
		
	}
	
	
	public Double getScoro(Integer key) {
		return scoro.get(key);
	}

	public static boolean getList(String KeyW) {
		return list.contains(KeyW);
	}



}
