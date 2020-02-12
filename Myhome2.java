
public class Myhome {

	String home;
	Windows frontWindows;
	Windows backWindows;
	Door MyhomeDoor;


	public Myhome(String home) {

	  this.home = home;


		frontWindows = new Windows("front");
		backWindows = new Windows("back");
		MyhomeDoor = new Door("Myhome");
		}

	void open() {

	 System.out.println(home + "に帰りました。");

		MyhomeDoor.open();
		frontWindow.open();
		backWindow.open();

	}

   void close() {

	 System.out.println(home + "に出ました。");
	  MyhomeDoor.close();
	  frontWindow.close();
	  backWindow.close();


   }


public static void main(String[] args) {

	Myhome home= new home("私の家");

	Myhome.open();
	Myhome.close();

  }
}
