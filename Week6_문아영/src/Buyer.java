public class Buyer {
	private int money; //���� ���� money��� �ν��Ͻ������� ����. (private���� ����)
	private int i; //
	int bonusPoint=0;
	Product item[]=new Product[10]; //�������� item�� ������ Product �迭 ���� (�ִ� 10������)
	
	public void setMoney(int money) { //private���� ������ �ν��Ͻ����� money�� �����ϰ� �� �� �ִ� �޼���
		this.money=money;
	}
	public int getMoney() { //�ν��Ͻ� ������ �ٸ� Ŭ������ ������ �� �ֵ��� �ϴ� �޼���
		return money;
	}
	public void buy(Product pd) { //ProductŬ����(�������� pd)�� �Ű������� buy�޼���
		if(pd.price>money) { //pd�� price�� money(���� ��)���� Ŭ ��
			System.out.println("Money is not enough.\n");//���� ���� ������� �ʴٴ� �� ����ϰ�
			summary(); //�� �������� �������� summary�޼��带 ȣ���ؼ� ����ϰ�
			System.exit(0); //����
		}
		else { //pd�� price�� money���� �۰ų� ���� ��
			System.out.println("You bought "+pd+"("+pd.price+")."); //����ڰ� �� pd�� price�� ������ �˷���
			money=money-pd.price; //���µ����� pd�� price�� �A ���� �ٽ� money�� ������
			bonusPoint=bonusPoint+pd.bonusPoint; //������� bonusPoint�� pd�� bonusPoint�� ���� �ٽ� ������� bonusPoint�� ����
			item[i++]=pd; //item �迭�� i��° �ε����� pd ����.
		}
	}
	public void summary() { //summary��� �޼��� ����
		System.out.print("SHOPPING LIST: ");
		for(int j=0;j<i;j++) System.out.print(item[j]+" "); //������ ��ǰ�̸� ������.item[j]=item[j].toString()
		System.out.println("\nMONEY LEFT: "+money); //���� �� �˷���
		System.out.println("CURRENT BONUS POINT: "+bonusPoint);//���� ���ʽ�����Ʈ ���
	}
	
	
}
