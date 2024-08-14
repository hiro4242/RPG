package bases;

import utils.Dice;

//人間を表現する抽象クラス
public abstract class Human extends Living {
	// コンストラクタ
	public Human(String name , String  weapon) {
		super(name, weapon);
	}		
	
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int damage = Dice.get(1,10) * this.getOffensive();
		// 相手のHPをダメージ値だけ減らす
		target.setHp(target.getHp() - damage);
		// 自分の攻撃力を1だけ減らす
		this.setOffensive(this.getOffensive() - 1);
		// コンソールにステータスを表示		
		System.out.printf("「%s」が「%s」で攻撃！「%s」に %d のダメージを与えた。\n しかし自分の攻撃力も1減少した。", this.getName(), this.getWeapon(), target.getName(), damage);
	}

}
