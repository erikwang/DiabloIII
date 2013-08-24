/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gears;


/**
 *
 * @author Erik
 * add GIT support
 */
public class Affix {
	protected int affixSn;
	protected int affixAvailableMinLevel; //which level could has this prefix minimum
	protected String affixString;
	protected String affixInChinese;
	protected String affixValue; // value of ability
	protected String affixMeaning;
	protected String affixType; //prefix or suffix
	
	
	/**
	 * @return the prefixAvailableMinLevel
	 */
	public int getAffixAvailableMinLevel() {
		return affixAvailableMinLevel;
	}
	
	public String getAffixString(){
		return affixString;
	}
	
	public void setAffixType(String _type){
		this.affixType = _type;
	}

	/**
	 * @param prefixAvailableMinLevel the prefixAvailableMinLevel to set
	 */
	public void setAffixAvailableMinLevel(int _affixAvailableMinLevel) {
		this.affixAvailableMinLevel = _affixAvailableMinLevel;
	}

	public Affix(int affixSn, int affixAvailableMinLevel,
			String affixString, String affixInChinese, String affixValue, String affixMeaning) {
		this.affixSn = affixSn;
		this.affixAvailableMinLevel = affixAvailableMinLevel;
		this.affixString = affixString;
		this.affixInChinese = affixInChinese;
		this.affixValue = affixValue;
		this.affixMeaning = affixMeaning;
	}
    
	protected void showAffix(){
		System.out.println("*LV ["+affixType+"]["+affixAvailableMinLevel+"] "+affixMeaning+", "+affixValue+" | "+affixString+" ("+affixInChinese+")");
                System.out.println("Completed.");
                
	}
}
