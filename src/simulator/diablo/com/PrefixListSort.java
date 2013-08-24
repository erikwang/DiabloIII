package simulator.diablo.com;

import java.util.Comparator;
import Gears.*;

public class PrefixListSort implements Comparator {
	public int compare(Object obj1, Object obj2){
		Affix o1 = (Affix) obj1;
		Affix o2 = (Affix) obj2;
		
		if(o1.getAffixAvailableMinLevel() > o2.getAffixAvailableMinLevel()){
			return 1;
		}
		
		if(o1.getAffixAvailableMinLevel() < o2.getAffixAvailableMinLevel()){
			return -1;
		}
		
		return 0;
	}
}
