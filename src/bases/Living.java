package bases;

abstract class Living {
	protected String name ;
	protected String weapon ;
	protected int hp ;
	protected int offensive ;

	public Living(String name, String weapon) {
		this.name = name;
		this.weapon = weapon;		
	}
	
	public abstract void attack();
	
	
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
        String status = String.format("名前: %s, 武器: %s, HP: %d, 攻撃力: %d",
                                      name, weapon, hp, offensive);
        if (hp <= 50) {
            status += " 警告: 残り HP が少ないです]";
        }
        return status;
    }
}

