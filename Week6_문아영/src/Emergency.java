public class Emergency {
	public Car[] emgList=new Car[10]; //클래스형이 Car인 인스턴스 배열(크기:10) 생성 
	int i; //emgList의 index. 0으로 자동초기화
	
	public void EM_Call(Car car) { //Call할 번호를 출력하는 메서드
		if(car instanceof FireEngine) { //클래스형이 Car인 변수의 인스턴스형이 FireEngine이거나 자손이면
			emgList[i]=new FireEngine(); //emgList배열의 i번째는 FireEngine 객체 생성
		}
		else if(car instanceof Ambulance) { //아래는 같은 내용 반복
			emgList[i]=new Ambulance();
		}
		else if(car instanceof PoliceCar) {
			emgList[i]=new PoliceCar();
		}
		System.out.println("Call "+emgList[i++].getNumber()); //emgList의 i번째 number을 출력하고 i=i+1함.
	}
	public void EM_record() { //record한 정보들 출력하는 메서드
		System.out.println("Emergency	Number		Car_Type	Requird"); //열머리글 지정
		for(int j=0;j<i;j++) { //여기서 i는 emgList에서 실제로 객체를 생성한 마지막 index의 값이다.
			System.out.println(emgList[j]); //emgList[j]는 emgList[j].toString()와 같다.
			}
		}
	}

