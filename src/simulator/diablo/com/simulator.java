package simulator.diablo.com;

import Heros.*;
import java.util.*;
        
public class simulator {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		/**Affix rules:
		 * 4 prefix + 4 suffix rule (maximum up to 4 for each affix)
		 * Same affix only can appear once in one weapon
		 * Affix display by affix level
		 * 5% chance for generate 4 affix (prefix or suffix) on a weapon, as well as 10% for 3 , 20% for 2 affix(s)  
		 * 
		*/
		
/*		
		AffixGenerator ag = new AffixGenerator();
		for(int t=0;t<150;t++){
			System.out.println((t+1)+">> Dropped a weapon with following magic attribute(s):");
			ag.generateAffix().showPrefixList();	
			System.out.println();
		}
*/
		
		WeaponGenerator wg = new WeaponGenerator();
		System.out.println(">>>> Diablo wepson generator");	
                System.out.println("Affix rules:\n" +
                        "* 4 prefix + 4 suffix rule (maximum up to 4 for each affix)\n" +
                        "* Same affix only can appear once in one weapon\n" +
                        "* Affix display by affix level\n" +"* 5% chance for generate 4 affix (prefix or suffix) on a weapon, as well as 10% for 3 , 20% for 2 affix(s) ");
                for(int t=0;t<150;t++){
                    System.out.println((t+1)+">> Dropped a weapon with following magic attribute(s):");	
                    System.out.println("Weapon serial number is:"+(t+1));
                        
			wg.getWeapon();	
			System.out.println();
		} 
                
                
                // Generate a new hero
                Hero thehero = new Hero();
                //java.text.SimpleDateFormat d=new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                System.out.print(Calendar.getInstance().getTime()+" - A new hero object was created.");
                
		
	}
	enum theweapon{
		axe,sword,mace,staff,ward,bow,crossbow,
	}

	
/*
	private Vector<Weapon> initWeaponList(){
		Vector<Weapon> weaponList = new Vector<>();
		weaponList.add(0,new Weapon("1 Hand Sword","short sword",5));
		weaponList.add(1,new Weapon("1 Hand Sword","saber",10));
		weaponList.add(2,new Weapon("1 Hand Sword","long sword",15));
		weaponList.add(3,new Weapon("2 Hand Sword","heavy sword",25));
		weaponList.add(4,new Weapon("2 Hand Sword","samurai sword",35));
		weaponList.add(5,new Weapon("2 Hand Sword","titan sword",55));
		return weaponList;
		
	}
*/	
}
