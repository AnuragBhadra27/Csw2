                                                                                                                                               
public class Divid {
public static long Div(long x, long y) {
	long quotient =0 ,k=0 , y2k;
	y2k=(y<<k);
			while(x>=y) {
				while(y2k>=x) {
					k=k-1;
					y2k=y2k>>1;
				}
				quotient =quotient+(1<<k);
						x=x-y2k;
			}
			return quotient;
}
	public static void main(String[] args) {
		long x=11,y=2;
		System.out.println(Div(x,y));
	}

}
