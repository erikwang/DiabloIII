package simulator.diablo.com;

import java.util.Random;
import java.util.Vector;

import Gears.Affix;
import Gears.AffixList;

public class AffixGenerator {
	
	static Vector<Affix> plist = new AffixList().getAffixList("p");
	static Vector<Affix> slist = new AffixList().getAffixList("s");
	
	protected static AffixList generateAffix(){
		
		AffixList weaponPrefix = new AffixList();
		Random randomGenerator = new Random();
        int affixCount = 0;
        int factorRandom;
        int affixSn;
        boolean flag = false;
        
        while(! flag){
        	affixCount = randomGenerator.nextInt(4)+1;
            factorRandom = randomGenerator.nextInt(100);
            
            switch (affixCount){
        	case 4: 
        		if (factorRandom < 5){
        			affixCount = 4;
        			flag = true;
        			break;
        		}
        		
        	
        	case 3: 
        		if (factorRandom < 10){
        			affixCount = 3;
        			flag = true;
        			break;
        		}
        		
        		
        	case 2: 
        		if (factorRandom < 20){
        			affixCount = 2;
        			flag = true;
        			break;
        		}

        		
        		default: 
        		if(affixCount < 2 ){
        			flag = true;	
        		}else{
        			flag = false;
        		}
        		break;
            }
       }
        
        Affix pfix;
        boolean pflag = false;
        
        for(int t=0;t < affixCount;t++ ){
        	affixSn = randomGenerator.nextInt(plist.size());
        	pfix = plist.get(affixSn);
        	pfix.setAffixType("Prefix");
        	if (checkDuplicatedAttribute(pfix,weaponPrefix)){
        		weaponPrefix.addPrefix(t, plist.get(affixSn));	
        	}else{
        		//a duplicated affix was found! skip it!
        		System.out.println("{!}");
        		t--;
        	}
        }

        //////
        
        flag = false;
        
        while(! flag){
        	affixCount = randomGenerator.nextInt(4)+1;
            factorRandom = randomGenerator.nextInt(100);
            
            switch (affixCount){
        	case 4: 
        		if (factorRandom < 5){
        			affixCount = 4;
        			flag = true;
        			break;
        		}
        		
        	
        	case 3: 
        		if (factorRandom < 10){
        			affixCount = 3;
        			flag = true;
        			break;
        		}
        		
        		
        	case 2: 
        		if (factorRandom < 20){
        			affixCount = 2;
        			flag = true;
        			break;
        		}

        		
        		default: 
        		if(affixCount < 2 ){
        			flag = true;	
        		}else{
        			flag = false;
        		}
        		break;
            }
       }
        
        Affix sfix;
        boolean sflag = false;
        
        for(int t=0;t < affixCount;t++ ){
        	affixSn = randomGenerator.nextInt(slist.size());
        	sfix = slist.get(affixSn);
        	sfix.setAffixType("Suffix");
        	if (checkDuplicatedAttribute(sfix,weaponPrefix)){
        		weaponPrefix.addPrefix(t, slist.get(affixSn));	
        	}else{
        		System.out.println("{!}");
        		t--;
        	}
        }        
        
        weaponPrefix.sortPrefixList();
        return weaponPrefix;
      }

	static boolean  checkDuplicatedAttribute(Affix _pf, AffixList _pflist){
		for(int tt = 0; tt < _pflist.getPrefixListSize(); tt++){
			//System.out.println("{!}"+ _pf.getPrefixString() +" "+ (_pflist.getPrefix(tt)).getPrefixString());
			if (_pf.getAffixString().equals((_pflist.getPrefix(tt)).getAffixString())){
    			return false;
    		}
    	}
    	return true;	
    }
	
}
