package Day13;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import javax.xml.ws.handler.MessageContext;

public class Day13_4_1 {
	
	public static void main(String[] args) {
		
		//p.544 DecimalFormat Ŭ���� : ���� �����͸� ���ϴ� �������� ǥ��
			//���� ����
				//0: �ڸ���[���ڸ��� 0���� ä��]
				//#: �ڸ���[���ڸ��� ä���]
	
		double num =123467.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000000.000000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println();
		
		//******õ���� ���� ��ǥ*****[#,##0]
		df = new DecimalFormat(df.format("�ݾ� #,##0��"));
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.0E0");//E : ��������
		System.out.println(df.format(num));
		
		df = new DecimalFormat("[��]+#,### ; [��]-#.###");// ��� ; ����
		System.out.println(df.format(num));
		
		//*****��ǻ�ʹ� ����� x [���� 1:100]
		df = new DecimalFormat("#,###%");
		System.out.println(df.format(0)));
		
		df = new DecimalFormat()
		System.out.println(df.format(num));		
		
		//p.544: DecimalFormat Ŭ����: ���� ���� ��ȯ
		//p.545: SimpleDateFormat Ŭ���� : ��¥ ���� ��ȯ
		//p.547: MessageFormat Ŭ���� : ���� ���� ��ȯ
		
		String id ="java";
		String name="�ſ��";
		String tel = "010-123-5678";
		
		String text = "ȸ�� ID : {0} \n ȸ���̸�:{1} \nȸ�� ��ȭ: %s";
		String result1 = MessageFormat.format(text, id, name, tel);
											//����, {0},{1},{2}
		System.out.println( result1 ); System.out.println();
		
		//***�����ͺ��̽� ���� ����� ����***
		
		//java 7���� ���� Date ���Ŀ��� �������� ��¥ API �߰���
		localDate currDate = LocalDate.now();// new[x] static �޼ҵ� now()
		System.out.println("���� ��¥:"+currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð�:"+ currTime);
		
		//Date ���糯¥/�ð�[������ �ȵǰų� �񱳱�� �����]
		// vs
		// LocalDate : ���糯¥ 		LocalTime: ����ð�
		
		LocalDateTime currdateTime = LocalDateTime.now();
		System.out.println("���糯¥/�ð�:"+ currdateTime);
		
		//*** �ð� ���
		Instant instant1 = Instant.now();//�ð�1
		Thread.sleep(1000);//�и���// 1�� ���[�ڵ��帧 1�ʰ� ����] //�Ϲݿ���
		Instant instant2 = Instant.now();//�ð�2
		
		if(instant1.isBefore(instant2)) {
			System.out.println("instant1 �� ����");
		}else if(instant1.isAfter(instant2)){
			System.out.println("instant2 �� �� �ʽ��ϴ�.");
		}else(){
			System.out.println("������ �ð����Դϴ�.");
		}
		
		System.out.println(" �ð� ��:"+ instant1.until(instant2, ChronoUnit.NANOS));
					//
		
		
		
	}

}
