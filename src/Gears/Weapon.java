/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
package Gears;

import java.util.*;

public class Weapon extends Gear{    
    
	/*
	 *private String gearID; //unique ID for this gear
	 *protected String gearType; // weapon, armor, accessory, gems, follower, etc.
	 *protected String basicName; // a string to name the gear    
	 *protected int gearLevel; //level 1 to 65
	 *protected int gearPrice; // buy/sell price of this gear
	 *protected String gearQuality; //ragged, normal, good, rare, epic, set, etc.
	 *protected AffixList gearAttributes;
	 *public String memo;
	*/
	
	
    private List<String> classLimit; //
    private String weaponType;
    private int useHand;
    private double attackSpeed;
    private int basicDamage;
    private int minDamage;
    private int maxDamage;
    private int durable;
    public String wmemo;

    public Weapon(String basicName, String weaponType, int useHand, double attackSpeed, int minDamage, int maxDamage, int durable) {
		super();
		this.basicName = basicName;
		this.weaponType = weaponType;
		this.useHand = useHand;
		this.attackSpeed = attackSpeed;
		this.basicName = basicName;
		//this.basicDamage = basicDamage;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.durable = durable;
	}

    public Weapon(){}
    
    public void setGearAttributes(AffixList aflist){
    	this.gearAttributes = aflist; 
    }
    
	public void showWeapon(){
    	System.out.println("["+basicName+"] ["+weaponType+"]");
    	System.out.println("[Use Hand(s)] "+ useHand+", [Attack Speed] "+ attackSpeed+", [Damage range] "+minDamage+" - "+maxDamage);
    	gearAttributes.showPrefixList();
    	
    }

	/**
	 * @return the minDamage
	 */
	public int getMinDamage() {
		return minDamage;
	}

	/**
	 * @param minDamage the minDamage to set
	 */
	public void setMinDamage(int minDamage) {
		this.minDamage = minDamage;
	}

	/**
	 * @return the maxDamage
	 */
	public int getMaxDamage() {
		return maxDamage;
	}

	/**
	 * @param maxDamage the maxDamage to set
	 */
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}

}


