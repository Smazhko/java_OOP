public class TEMP {

	public static abstract class BaseHero {
		private int hp;
		private int mp;

		public BaseHero(int hp, int mp) {
			this.hp = hp;
			this.mp = mp;
		}

		public BaseHero() {
			this.hp = 100;
			this.mp = 100;
		}

		public int getHp() {
			return hp;
		}

		public int getMp() {
			return mp;
		}

		public void setHp(int hp) {
			this.hp = hp;
		}

		public void setMp(int mp) {
			this.mp = mp;
		}
	}

	public static class Druid extends BaseHero {
		public Druid() {
		}

		private int hpp = getHp();

		public int getHp() {
			return hpp;
		}
	}

	public static class Dwarf extends Druid {
	}


	public static void main(String[] args) {

		BaseHero dwarvenMistic = new Druid();

		System.out.println(dwarvenMistic.getClass());

		int qw;
		int wer;

		qw = wer = 10;

		System.out.println(qw + " " + wer);



	}
}
