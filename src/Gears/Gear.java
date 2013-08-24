/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erik
 */
package Gears;

import Attributes.*;
import java.util.*;

public class Gear {
    private String gearID; //unique ID for this gear
    protected String gearType; // weapon, armor, accessory, gems, follower, etc.
    protected String basicName; // a string to name the gear
    protected int gearLevel; //level 1 to 65
    protected int gearPrice; // buy/sell price of this gear
    protected String gearQuality; //ragged, normal, good, rare, epic, set, etc.
    protected AffixList gearAttributes;
	public String memo;
    
    /**
	 * @return the gearID
	 */
	public String getGearID() {
		return gearID;
	}
	/**
	 * @param gearID the gearID to set
	 */
	public void setGearID(String gearID) {
		this.gearID = gearID;
	}
	/**
	 * @return the gearType
	 */
	public String getGearType() {
		return gearType;
	}
	/**
	 * @param gearType the gearType to set
	 */
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	/**
	 * @return the basicName
	 */
	public String getBasicName() {
		return basicName;
	}
	/**
	 * @param basicName the basicName to set
	 */
	public void setBasicName(String basicName) {
		this.basicName = basicName;
	}
	/**
	 * @return the gearLevel
	 */
	public int getGearLevel() {
		return gearLevel;
	}
	/**
	 * @param gearLevel the gearLevel to set
	 */
	public void setGearLevel(int gearLevel) {
		this.gearLevel = gearLevel;
	}
	/**
	 * @return the gearPrice
	 */
	public int getGearPrice() {
		return gearPrice;
	}
	/**
	 * @param gearPrice the gearPrice to set
	 */
	public void setGearPrice(int gearPrice) {
		this.gearPrice = gearPrice;
	}
	/**
	 * @return the gearQuality
	 */
	public String getGearQuality() {
		return gearQuality;
	}
	/**
	 * @param gearQuality the gearQuality to set
	 */
	public void setGearQuality(String gearQuality) {
		this.gearQuality = gearQuality;
	}
	/**
	 * @return the gearAttributes
	 */
	public AffixList getGearAttributes() {
		return gearAttributes;
	}
	/**
	 * @param gearAttributes the gearAttributes to set
	 */
	public void setGearAttributes(AffixList gearAttributes) {
		this.gearAttributes = gearAttributes;
	}
}
