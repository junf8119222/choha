package Day09;

public class tire {// Ŭ���� ����
	//�ʵ� 
	public int maxRotation;// �ִ� ȸ����[ȸ�����ɼ�]
	public int accumulatedRotation;// ���� ȸ����
	public String location;// Ÿ�̾� ��ġ
	
	//22.������[��ü ������ �ʱⰪ(ó����)
	public Tire( String location , int maxRotation) {
		//Ÿ�̾� ��ġ, �ִ� ȸ����
		this.location =location; //�ܺηκ��� ���޹��� �μ��� ���κ����� ����
		this.maxRotation =maxRotation;
	}	

	//�޼ҵ�
	public boolean roll() {//Ÿ�̾� ȸ�� ���� �޼ҵ�
		if(accumulatedRotation < maxRotation){
		//���࿡ ����ȸ������ �ִ�ȸ���� ������[ ������ ]
		}
	}//me
}//ce
