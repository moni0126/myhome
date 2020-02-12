
public class Myhome {

	String home;
	Windows frontWindows;
	Windows backWindows;
	Door MyhomeDoor;


	public Myhome(String home) {

	  this.home = home;


		frontWindows = new Windows();
		backWindows = new Windows();
		MyhomeDoor = new Door();
		}

	void open() {

		System.out.println(home + "に帰りました。");

		Myhomedoor.open();
		frontwindow.open();
		backwindow.open();

	}

	void close() {

		System.out.println(home + "出ました。");
	  Myhomedoor.close());
	  frontwindow.close();
	  backwindow.close();


   }


public static void main(String{} args) {

	home Myhome = new home("私の家")；

	Myhome.open();
	Myhome.close();

  }
}
