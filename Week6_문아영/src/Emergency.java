public class Emergency {
	public Car[] emgList=new Car[10]; //Ŭ�������� Car�� �ν��Ͻ� �迭(ũ��:10) ���� 
	int i; //emgList�� index. 0���� �ڵ��ʱ�ȭ
	
	public void EM_Call(Car car) { //Call�� ��ȣ�� ����ϴ� �޼���
		if(car instanceof FireEngine) { //Ŭ�������� Car�� ������ �ν��Ͻ����� FireEngine�̰ų� �ڼ��̸�
			emgList[i]=new FireEngine(); //emgList�迭�� i��°�� FireEngine ��ü ����
		}
		else if(car instanceof Ambulance) { //�Ʒ��� ���� ���� �ݺ�
			emgList[i]=new Ambulance();
		}
		else if(car instanceof PoliceCar) {
			emgList[i]=new PoliceCar();
		}
		System.out.println("Call "+emgList[i++].getNumber()); //emgList�� i��° number�� ����ϰ� i=i+1��.
	}
	public void EM_record() { //record�� ������ ����ϴ� �޼���
		System.out.println("Emergency	Number		Car_Type	Requird"); //���Ӹ��� ����
		for(int j=0;j<i;j++) { //���⼭ i�� emgList���� ������ ��ü�� ������ ������ index�� ���̴�.
			System.out.println(emgList[j]); //emgList[j]�� emgList[j].toString()�� ����.
			}
		}
	}

