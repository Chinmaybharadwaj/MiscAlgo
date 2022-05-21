
public class Pallindrom {
	public static void main(String args[]) {
		boolean val;
		val = check("HjH",0,2);
		System.out.println(val);
	}
	
	static boolean check(String s,int i,int j) {
		if(i>=j) {
			return true;
		}
		if(s.charAt(i) == s.charAt(j)) {
			return(check(s,i+1,j-1));
		}
		else {
			return false;
		}
	}
}
