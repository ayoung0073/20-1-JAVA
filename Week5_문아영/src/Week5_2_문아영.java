import java.util.Scanner;
public class Week5_2_���ƿ� {

	public static void main(String[] args) {
		System.out.println("============");
		System.out.println("����: ���̹�����");
		System.out.println("�й�: 1971068");
		System.out.println("����: ���ƿ�");
		System.out.println("============");
		
		Dog[] dog=new Dog[3]; //Ŭ������ �̿��� �迭 ����
		Cat[] cat=new Cat[3];
		
		Scanner kbd=new Scanner(System.in); //Scanner��ü ����
		
		for (int i=0;i<dog.length;i++) { //dog�迭 ����(3)��ŭ for�� �ݺ�
			dog[i]=new Dog();//dog i��° �ε����� Dog��ü ����
			int j=i+1; //�ε����� 0���� �����ϱ� ������ int�� j�� i+1�� �ʱ�ȭ�� ex)i=0�̸� <<Dog 1>>�� ����ϰ� ��
			System.out.println("<<Dog "+j+">>");
			System.out.print("Name :"); //�ǳʶ����ʰ� �Է¹ޱ� ���� print�� ��
			dog[i].setName(kbd.nextLine()); //�Է¹��� ���ڿ��� PetŬ����(�θ�Ŭ����)�� setName�޼��带 �̿��ؼ� dog[i]�� name�� ����
			System.out.print("Age :");
			dog[i].setAge(kbd.nextInt()); //�Է¹��� ������ PetŬ������ setAge�޼��带 �̿��ؼ� age����.
			System.out.print("Weight :");
			dog[i].setWeight(kbd.nextDouble());//�Է¹��� double���Ǽ��� PetŬ������ setWeight�޼��带 �̿��ؼ� weight����
			System.out.print("BoosterShot(y/n) :"); 
			String yesOrNo=kbd.next(); //String�� �������� yesOrNo�� ����� ���ÿ� �Է¹��� ���ڿ�("y"or"n")�� �Է¹���
			if(yesOrNo.equals("y")) { //���� yesOrNo�� "y"�̸� dog[i]�� �ν��Ͻ� ���� boosterShot�� true����
				dog[i].setBoosterShot(true);
			}
			else if(yesOrNo.equals("n")){//���� yesOrNo�� "n"�̸� dog[i]�� �ν��Ͻ� ���� boosterShot�� false����
				dog[i].setBoosterShot(false);
			}
			kbd.nextLine(); //EnterŰ ��������
			System.out.println(); //���� �ǳʶپ ���� ���� �Է� �ޱ�
		}
		
		for (int i=0;i<cat.length;i++) { //cat�迭����(3)��ŭ for�� �ݺ�
			cat[i]=new Cat(); //cat i��° �ε����� Cat��ü ����
			int j=i+1;
			System.out.println("<<Cat "+j+">>"); 
			System.out.print("Name :"); //���� ���� ���ϰ� �Է¹ޱ� ���� println�� �ƴ� print��
			cat[i].setName(kbd.nextLine());//�Է¹��� ���ڿ��� PetŬ����(�θ�Ŭ����)�� setName�޼��带 �̿��ؼ� cat[i]�� name�� ����
			System.out.print("Age :");
			cat[i].setAge(kbd.nextInt());//�Է¹��� ���ڿ��� PetŬ����(�θ�Ŭ����)�� setAge�޼��带 �̿��ؼ� cat[i]�� age�� ����
			System.out.print("Weight :");
			cat[i].setWeight(kbd.nextDouble());//�Է¹��� ���ڿ��� PetŬ����(�θ�Ŭ����)�� setWeight�޼��带 �̿��ؼ� cat[i]�� weight�� ����
			System.out.print("Color:");
			cat[i].setColor(kbd.next()); //�Է¹��� ���ڿ��� CatŬ������ setColor�޼��带 �̿��ؼ� �ν��Ͻ����� color����
			kbd.nextLine(); //EnterŰ��������
			System.out.println();//���ٰǳʶٱ�
		}
		
		System.out.println("<<Dog List>>"); //dog�迭 ������ ���
		for (int i=0;i<dog.length;i++) { //dog�迭������ŭ for�� �ݺ�
			dog[i].writeOutput(); //PetŬ������ writeOutput �޼��带 �������̵��� DogŬ������ writeOutput�޼��� ȣ���� ���� ���
			dog[i].move(); //PetŬ������ move�޼��带 �������̵��� DogŬ������ move�޼��� ȣ��
			System.out.println(); //���� ���� ����ϱ� �� ���� �ǳʶٱ�
		}
		
		System.out.println(); //cat�迭���� ����ϱ� �� ���� ���� (�� ���� ����� �տ� for���ȿ��� ���� ���� �� �ֱ� �����̴�)
		
		System.out.println("<<Cat List>>"); //cat�迭 ������ ���
		for(int i=0;i<cat.length;i++) { //cat�迭������ŭ for�� �ݺ�
			cat[i].writeOutput();//PetŬ������ writeOutput�޼��带 �������̵��� �޼��� ȣ��
			cat[i].move();//PetŬ������ move�޼��带 �������̵��� �޼��� ȣ��
			System.out.println();//���� �ǳʶٱ�
		}
		System.out.println(); 
		
		System.out.println("* Dogs older than 2 years and no boostershot are...");
		for(int i=0;i<dog.length;i++) { //dog�迭 ������ŭ for�� �ݺ�
			if(dog[i].getAge()>2 && dog[i].getBoosterShot()==false) {//���� dog[i]�� age�� 2���� ũ��, boosterShot�� false(�������� x)���
				System.out.print(dog[i].getName()+" ");//name�� ����ϰ� ��ĭ �ǳʶڴ�.print�̱� ������ ���ٷ� ��µ�
			}
		}
		System.out.println();
		System.out.println("* Black cats weighs more than 3Kg are...");
		for(int i=0;i<cat.length;i++) {//cat�迭 ������ŭ for�� �ݺ�
			if(cat[i].getColor().equalsIgnoreCase("black") && cat[i].getWeight()>=3.0) {//���� cat�� color�� black�̰�(��ҹ��� ����x), weight�� 3.0�̻��̸�
				System.out.print(cat[i].getName()+" ");//name����ϰ� ��ĭ ���. print�̱� ������ ���ٷ� ��µ�
			}
		}
		
	}

}
