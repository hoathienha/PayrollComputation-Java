public class Screen {

	static void scrollscreen(int n) {
		for(int i = 0; i < n; i++)
			System.out.println();
	}
	
	static void scrollscreen(String a, int n) {
		for(int i = 0; i < n; i++)
			System.out.println(a);
	}
}
