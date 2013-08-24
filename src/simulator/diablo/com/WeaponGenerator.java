package simulator.diablo.com;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Vector;

import Gears.*;

public class WeaponGenerator {
	
	Weapon wp1 = new Weapon();
	Vector<Weapon> wlist2 = null;
	AffixGenerator ag = new AffixGenerator();
	
	
	public void getWeapon(){
		int weaponSn;
		Random randomGenerator = new Random();
		wlist2 = getWeaponList();
		weaponSn = randomGenerator.nextInt(wlist2.size());
    	wp1 = wlist2.get(weaponSn);
    	wp1.setGearAttributes(ag.generateAffix());
    	wp1.showWeapon();
	}
	
	
	public Vector<Weapon> getWeaponList(){
		Vector<Weapon> wlist = new Vector<Weapon>();
		StringBuffer sb= new StringBuffer("");
		String str = null;
        FileReader reader = null;
        //Vector<Weapon> wlist = null;
        String[] wepatt;
		try {
			reader = new FileReader("g:\\weaponlist.txt");
			BufferedReader br = new BufferedReader(reader);
			while((str = br.readLine()) != null) {
					wepatt = str.split(",");
					if(! wepatt[0].equals("#")){
					//protected Weapon(String basicName, String weaponType, int useHand, double attactSpeed, int minDamage, int maxDamage, int durable) {
					//#SN, weapon type, use hand(s), minimum damage, maximun damage, attack speed, Chinese Name, durable
						wlist.add(new Weapon(wepatt[6], wepatt[1], new Integer(wepatt[2]).intValue(),new Double(wepatt[5]).doubleValue(),new Integer(wepatt[3]).intValue(),new Integer(wepatt[4]).intValue(),new Integer(wepatt[7]).intValue()));
					}
			}
			br.close();
			reader.close();
			//System.out.println("Weapon list generated, length is:"+ wlist.size());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wlist;
	}
	
}
