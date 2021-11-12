package homework;

public class MyList {

	String[] Liste;

	public MyList() {
		this.Liste = new String[0];
	}

	public String[] add(String Object) {
		String[] tempListe = new String[Liste.length + 1];

		for (int i = 0; i < Liste.length; i++) {
			tempListe[i] = Liste[i];
		}
		tempListe[Liste.length - 1] = Object;
		Liste = new String[tempListe.length];
		for (int i = 0; i < tempListe.length; i++) {
			Liste[i] = tempListe[i];
		}
		return Liste;
	}

	public void list() {
	}

	{
		for (String result : Liste) {
			System.out.println(result);
		}
	}

	public void remove(String Object) {
		String[] tempListe = new String[Liste.length + 1];

		for (int i = 0; i < Liste.length; i++) {
			tempListe[i] = Liste[i];
		}
		Liste = new String[Liste.length - 1];
		int empty = 0;
		for (int i = 0; i < Liste.length; i++) {
			if (tempListe[i] == Object) {
				continue;
			} else {
				Liste[empty] = tempListe[i];
			}
			empty++;
		}
	}

	public void remove(int index) {
		String[] tempListe = new String[Liste.length + 1];

		for (int i = 0; i < Liste.length; i++) {
			tempListe[i] = Liste[i];
		}
		Liste = new String[Liste.length - 1];
		int empty = 0;
		for (int i = 0; i < Liste.length; i++) {
			if (i == index) {
				continue;
			} else {
				Liste[empty] = tempListe[i];
			}
			empty++;
		}
	}
}
