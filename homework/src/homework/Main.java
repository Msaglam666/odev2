package homework;

public class Main {

	public static void main(String[] args) {
		MyList list= new MyList();
		list.add("Trabzon");
		list.add("Samsun");
		list.add("Ankara");
		list.remove("Samsun");
		list.list();
	}

}
