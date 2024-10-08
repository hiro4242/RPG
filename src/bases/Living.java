package bases;

public abstract class Living {
	protected String name ;
	protected String weapon ;
	protected int hp ;
	protected int offensive ;

	public Living(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;		
	}
	
	public abstract void attack(Living target);
	
	
	public String getName(){
		return name;		
	}
	public String getWeapon(){
		return weapon;		
	}
	public int getHp(){
		return hp;
	}
	public void setHp(int hp) {
        this.hp = hp;
    }
	public int getOffensive(){
		return offensive;
	}
		
	public void setOffensive(int offensive) {
	    this.offensive = offensive;
	}
		
	@Override
	public String toString() {
		String alert = "";
		if (this.hp <= 50) {
			alert = "★ HP残りわずか！アブナイ";
		}
		return String.format("[名前]: %s, [ヒットポイント]: %d, [攻撃力]: %d %s", this.name, this.hp, this.offensive, alert);
	}


}

