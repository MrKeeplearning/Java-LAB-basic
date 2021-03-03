# 객체 지향프로그래밍(Object-Oriented Programming, OOP)과 클래스

* 객체(object)란?
  - 사전적 의미: 의사나 행위가 미치는 대상
  - 구체적, 추상적 데이터 단위
* 객체지향 프로그래밍(Object Oriented Programming, OOP)
  - 객체를 기반으로 하는 프로그래밍
  - cf. 절차지향 프로그래밍(Procedural Programming, ex. C언어): 시간의 흐름에 따른 프로그래밍
  - 객체지향 프로그래밍 구현 방법
    a. 객체를 정의: 클래스의 속성과 메소드 구현
    b. 객체의 기능 구현
    c. 객체 사이의 협력 구현

## 1. 클래스(class)

* 클래스란?
  * 객체에 대한 속성과 기능을 코드로 구현한 것.
  * 객체에 대한 청사진(blueprint)
* 객체가 가진 특성, 속성들을 멤버 변수로 나타낸다.
* 객체가 하는 기능들을 메서드(method)로 구현한다.

### 1.1. 클래스 정의하기
학생 클래스를 만든다고 가정해본다.
```
(접근 제어자) class 클래스_이름 {
  멤버변수;
  메서드;
}
```
* 속성: 학번, 이름, 학년, 거주지 등등... --> **멤버변수**로 구현한다.
* 기능: 수강신청, 수업듣기, 시험보기 등등... --> **메서드**로 구현한다.<br><br>
* class는 대부분 대문자로 시작한다.
* 하나의 java 파일에 하나의 클래스를 두는 것이 원칙이다. 다만, 여러 개의 클래스가 같이 있는 경우 public 클래스는 단 하나이며, public 클래스와 자바 파일의 이름은 동일해야 한다.
* 자바의 모든 코드는 class 내부에 위치한다.

### 1.2. 클래스의 속성
* 클래스의 특징을 나타낸다.
* property, attribute 라고도 한다.
* 자료형을 이용하여 멤버변수로 선언한다.


## 2. 메서드(method)
함수의 일종으로 객체의 기능을 제공하기 위해 클래스 내부에 구현되는 함수이다.
* 함수란?
  * 하나의 기능을 수행하는 일련의 코드.
  * 중복되는 기능을 함수로 구현하여 함수를 호출하는 방식으로 사용.

### 2.1. 함수 정의하기
더하는 기능을 제공하는 함수를 코드로 구현해보자. 함수를 정의할 때는 함수의 이름, 매개변수, 반환 값을 선언하고 코드를 구현한다.
```
int add(int num1, int num2) {
  int result;
  result = num1 + num2;
  return result;
}
```
:one: 함수 이름(`add`): 함수의 기능과 관련하여 명명<br>
:two: 매개 변수(`int num1, int num2`): 함수의 수행을 위해 필요한 변수
  * 매개변수는 없을 수도 있음.
  * 입력을 받지 않고 기능을 수행하는 경우도 있음.

:three: `return` 예약어: 함수 수행 결과를 반환하기 위한 예약어<br>
:four: 함수 반환형(`int`): 반환 값의 자료형을 나타냄. 반환 값이 없는 경우 `void`라고 씀.<br>

add함수에서 매개변수 `int num1, int num2` 는 add함수 내에서 선언한 변수이다. 따라서 나중에 add함수를 호출해서 사용할 때 `num1`과 `num2`는 add함수에 넣어준 값을 받는 역할을 한다.
```
public class FunctionTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 30;
		
		int sum = add(n1, n2);
		System.out.println(sum);
	}
	
	public static int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
}
```
호출한 add 메서드의 변수 n1과 n2는 add 메서드의 매개변수와 별개이다.

### 2.2. 함수와 스택 메모리
함수가 호출될 때 사용하는 메모리를 스택(stack)이라고 한다. 이것은 함수의 기능 수행이 끝나면 자동으로 해당 함수가 사용했던 메모리 공간을 반환한다.
<img src = "https://raw.githubusercontent.com/MrKeeplearning/Java-LAB-basic/main/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%20%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/img/java_MethodnStack.png">


## 3. class & instance
클래스는 static 코드인데 이것을 생성하면 인스턴스, 혹은 객체라고 한다.

### 3.1. 클래스 생성하기
* 클래스를 사용하기 위해서는 클래스를 생성해야 한다.
* 생성할 때는 new 예약어를 사용하며 `클래스형 변수이름 = new 생성자;`와 같은 형태를 취한다.
```
Student studentA = new Student();
```
참조변수 studentA를 이용해서 Student 클래스에 있는 멤버변수나 메서드등을 사용할 수 있다.

### 3.2. 인스턴스와 힙(heap) 메모리
* 하나의 클래스 코드로부터 여러 개의 인스턴스를 생성.
* 인스턴스는 힙(heap) 메모리에 생성됨.
* 각각의 인스턴스는 다른 메모리에 다른 값을 가짐.

```
public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "제주특별자치도 제주시 첨단로 242";

		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "경기도 성남시 분당구 불정로 6";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
	}
}
```
위 코드에는 studentLee와 studentKim이라는 지역변수가 2개 존재하는데 이 지역변수들은 stack에 선언되어 있다.
이 2개의 지역변수에는 각각 Student객체가 heap 메모리 영역에 생성되었다. 그리고 studentLee와 studentKim은 각각 생성된 객체의 주소를 가리킨다.

#### stack 메모리
* 함수가 호출되면 지역변수가 쌓이게 된다.
* 함수가 종료되면 생성된 stack이 자연스럽게 사라진다.

#### heap 메모리
* 동적으로 필요할 때마다 생성되는 것.
* 필요할 때 요청하면 필요한 만큼 allocation 해준다.
* new라는 키워드에 의해서 생성된다.
* stack처럼 자동으로 사라지지 않고 직접 제거해주어야 한다. 다만, 자바에서는 garbage collector가 제거해준다.

<img src = "https://raw.githubusercontent.com/MrKeeplearning/Java-LAB-basic/main/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%20%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/img/StacknHeap.png">
이처럼 heap 메모리에는 Student클래스 변수가 참조하는 Student 객체가 생성되어 있고, 따라서 studentLee.address와 같은 것이 가능한 것이다.

#### 용어정리
| 용어 | 설명 |
|:---:|:---:|
|객체|객체 지향 프로그램의 대상, 생성된 인스턴스|
|클래스|객체를 프로그래밍하기 위해 코드로 만든 상태|
|인스턴스|클래스가 메모리에 생성된 상태|
|멤버 변수|클래스의 속성, 특성|
|참조 변수|인스턴스 생성 시 선언하는 변수|
|참조값|인스턴스가 생성되는 힙 메모리 주소|

### 3.3. 생성자(constructor)
생성자는 new연산자와 함께 사용되어 클래스로부터 객체를 생성할 때 호출되어 객체의 초기화를 담당한다. 즉, 내가 처음 이 객체를 생성하면서 해야될 일, 하고 싶은 일들을 구현하는 것이다.
> `Student studentLee = new Student()`에서 `Student()`는 생성자이다.
여기서 객체의 초기화는 필드를 초기화하거나, 메소드를 호출해서 객체를 사용할 준비를 하는 것을 말한다.

#### 기본 생성자(Default Constructor)
모든 클래스는 생성자가 반드시 하나 이상 존재하며, 만약 클래스 내부에 생성자가 선언되어 있지 않다면 자바 컴파일러가 자동으로 기본 생성자를 생성해준다.
> `public Student() {}`

위의 예시처럼 기본 생성자는 매개변수도, 구현코드도 존재하지 않는다.
* 클래스 내부에 생성자가 하나도 없을 때 기본 생성자가 생성되는 것이다. 그런데 만약 임의로 사용자가 생성자를 생성하면 에러가 발생한다.
* 동일한 이름을 가진 생성자는 존재할 수 있다. 하지만 매개변수는 반드시 달라야 한다. 이러한 경우를 **생성자 오버로딩(Constructor Overloading)** 이라고 한다.
