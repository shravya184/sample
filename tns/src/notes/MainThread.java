package notes;

public class MainThread {
	public static void main(String [] args) {
	        ThreadDemo d = new ThreadDemo();
	        d.setPriority(1);
	        d.start();

	        ThreadDemo d1 = new ThreadDemo();
	        d1.setPriority(8);
	        d1.start();
	    }
	}


