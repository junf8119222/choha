package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2_1 {

	public static void main(String[] args) {
		
		//p.539
			//Date Ŭ����(java.util): �ý��� ��¥/�簣
		Date date = new Date();//date ��ü ����
		System.out.println("���� ��¥/�ð�"+ date);
		
			//SimpleDateFormat Ŭ���� : ��¥/�ð� ����(����=���) ��ȯ
		SimpleDateFormat sdf
			= new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm �� ss��");
		//��¥�� ���� �����ϱ�[date ���� -> String�� ��ȯ]
		
		//p.540
			//Calendar Ŭ���� :�ü�� �ð����� ��¥/�ð��� ���� ����
		Calendar now = Calendar.getInstance(); //CalendarŬ������ ��ü ȣ��
			//�̹� CalendarŬ������ ��ü ����!! =������ ��ü����x
		System.out.println("����:"+ now.get(Calendar.YEAR)); //����
		System.out.println("��:"+(now.get(Calendar.MONTH)+1));//��: 0~11[0:1��]
		
		//����[����]-> �ѱ� ��ȯ
		int week = now.get(Calendar.DAY_OF_WEEK);
		String ���� = null;//�ѱ� ������ ������ ���� ����� ����
		switch (week) {
			case 1 : ���� = "�Ͽ���"; break;
			case 2 : ���� = "������"; break;
			case 3 : ���� = "ȭ����"; break;
			case 4 : ���� = "������"; break;
			case 5 : ���� = "�����"; break;
			case 6 : ���� = "�ݿ���"; break;
			case 7 : ���� = "�����"; break;
		}
		System.out.println("����[�ѱ�]:"+ ����);
		
		//����/����
		System.out.println("����/���� :"+ now.get(Calendar.AM_PM));//0:���� 1:����
		//�ѱ� ��ȯ
		int ampm = now.get(Calendar.AM_PM);
		String �������� = null;
		if(am==0) �������� = "����";
		else �������� ="����";
		System.out.println("����/����:" +��������);
		
		//�߰��Է�
		System.out.println("");
		
		//ZoneDateTime Ŭ���� : ���� �����ð�	//�߰��Է�
		ZonedDateTime ������ = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println("������:"+ ������);
		������ = ZonedDateTime.now(ZoneId.of)
		
			
			
			
		
	}
	
}
