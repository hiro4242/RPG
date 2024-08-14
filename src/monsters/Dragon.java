package monsters;

import utils.Dice;
import bases.Monster;

public class Dragon extends Monster {
	public Dragon(String name , String weapon){
		super(name, weapon);
		this.setHp(Dice.get(270, 330));
		this.setOffensive(Dice.get(12, 18));
	}

}