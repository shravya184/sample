package notes;

public class MainPriority {

	public static void main(String[] args) {
		        PriorityDemo p = new PriorityDemo();
		        PriorityDemo p1 = new PriorityDemo();

		        p.setPriority(1);
		        p1.setPriority(10);

		        p.start();
		        p1.start();
		    }
		}
		
