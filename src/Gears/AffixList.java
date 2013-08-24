package Gears;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

import simulator.diablo.com.PrefixListSort;

public class AffixList {
	
	Vector<Affix> prefixList = new Vector<>();
	Vector<Affix> suffixList = new Vector<>();
	
	public AffixList(){
		new Vector<Affix>();
	}
	
	public int getPrefixListSize(){
		return prefixList.size();
	}
	
	public AffixList(Vector<Affix> vp){
		
		
	}
	
	public int getPrefixListLength(){
		return prefixList.size();
	}
	
	public Affix getPrefix(int place){
		return prefixList.get(place);
	}
	
	public Affix getSuffix(int place){
		return suffixList.get(place);
	}
	
	public void addPrefix(int place, Affix _affix){
		prefixList.add(place,_affix);
	}
	
	public void showPrefixList(){
		for (int t=0;t<prefixList.size();t++){
			prefixList.get(t).showAffix();
		}
	}
	
	/*public void showSuffixList(){
		for (int t=0;t<suffixList.size();t++){
			suffixList.get(t).showAffix();
		}
		
	}*/
	
	
	//Read affixs from affix list file. And return Vector<Affix> structure
        //Need to indicate affixlist file in local directions
	public Vector<Affix> getAffixList(String _type){
		StringBuffer sb= new StringBuffer("");
		String str = null;
		String[] affixlist;
                
        FileReader reader = null;
		try {
			if(_type.equals("p")){
				reader = new FileReader("g:\\prefixlist.txt");
			}else if(_type.equals("s")){
				reader = new FileReader("g:\\suffixlist.txt");
			}
			BufferedReader br = new BufferedReader(reader);
			while((str = br.readLine()) != null) {
					affixlist = str.split(",");
					if(_type.equals("p")){
						prefixList.add(new Affix(new Integer(affixlist[0]).intValue(),new Integer(affixlist[4]).intValue(),affixlist[5],affixlist[6],affixlist[3],affixlist[1]));
					}else if(_type.equals("s")){
						suffixList.add(new Affix(new Integer(affixlist[0]).intValue(),new Integer(affixlist[4]).intValue(),affixlist[5],affixlist[6],affixlist[3],affixlist[1]));
					}
			}
			br.close();
			reader.close();
			//System.out.println("Affix list generated, prefix length is:"+ prefixList.size()+", suffix length is: "+suffixList.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(_type.equals("p")){
			return prefixList;
		}else if(_type.equals("s")){
			return suffixList;
		}
		return null;
			
	}
	
	public void sortPrefixList(){
		 Collections.sort(prefixList, new PrefixListSort());
	}
	
	public void sortSuffixList(){
		 Collections.sort(suffixList, new PrefixListSort());
	}
	
}
