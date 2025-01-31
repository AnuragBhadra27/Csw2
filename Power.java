
public class Power {
public static int Pow(double x, int y) {
	int result=1;
	if (y<0) {
		y=-y; 
		x=1/x;
	}
	while(y!=0) {
		if((y & 1)!=0) {
			result=(int)(result*x);
		}
		if(y>1) {
			x=x*x;
			y=y>>1;
		}
		return result;
	}}

public static void main(String []args) {
	int x=2,y=3;
	System.out.println(Pow(x,y));
}
}
