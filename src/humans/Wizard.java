package humans;

import utils.Dice;
import bases.Human;

public class Wizard extends Human {
	public Wizard(String name , String weapon){
		super(name, weapon);
		this.setHp(Dice.get(120, 180));
		this.setOffensive(Dice.get(12, 18));
	}

}