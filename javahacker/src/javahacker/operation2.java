package javahacker;

public class operation2 extends Car implements operations{

	public operation2(String Type, int Model, double Price, double MilesDriven) {
		super(Type, Model, Price, MilesDriven);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int sum(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1+n2*2;
	}

	@Override
	public int sub(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2*2;
	}

	@Override
	public double div(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2*2;
	}

	@Override
	public int mul(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2*2;
	}

}
