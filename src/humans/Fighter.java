package humans;

import utils.Dice;
import bases.Human;

public class Fighter extends Human {
	public Fighter(String name , String weapon){
		super(name, weapon);
		this.setHp(Dice.get(240, 300));
		this.setOffensive(Dice.get(17, 23));
	}

}
