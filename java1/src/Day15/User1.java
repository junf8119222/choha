package Day15;

import Day07.Caculator;

public class User1 extends Thread {

	//�ʵ� 
	private Calculator calculator;
	//�޼ҵ�
	public void setCalculator( Calculator calculator) {
		this.setName("user1");
		this.calculator = Caculator;
	}
	//����ó��
	@Override
	public void run() {
		calculator.setmemory(100);
		
	}
}
