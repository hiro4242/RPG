package monsters;

import utils.Dice;
import bases.Monster;

public class Slime extends Monster {
	public Slime(String name , String weapon){
		super(name, weapon);
		this.setHp(Dice.get(70, 130));
		this.setOffensive(Dice.get(5, 11));
	}

}