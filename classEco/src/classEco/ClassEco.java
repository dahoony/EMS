package classEco;

/*
 * ���ǽ� ȯ��üũ ����
 *  - üũ��� : ���οµ�, ���ν���, ���θ���, �ܺθ���
 *  - ��Ƽ������ �����Ͽ� �ǽð�(1����) ������ �ݿ�
 */
public class ClassEco {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(new ThreadTask());
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		ThreadTask tt = new ThreadTask();
		tt.dataControl();
	}
}
