class bank{
	int getRateOfInt() {
		return 0;
	}
}
class SBI extends bank{
	int getRateOfInt() {
		return 8;
	}
}
class AXIS extends bank{
	int getRateOfInt() {
		return 7;
	}
}
public class BankQues {

	public static void main(String[] args) {
		SBI s = new SBI();
		AXIS a=new AXIS();
		System.out.println(s.getRateOfInt());
		System.out.println(a.getRateOfInt());

	}

}
