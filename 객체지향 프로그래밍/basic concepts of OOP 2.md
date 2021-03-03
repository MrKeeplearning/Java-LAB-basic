## 1. this가 하는 일
* 자기 자신의 인스턴스를 가리키는 일을 한다. 즉, 자신의 메모리를 가리킨다.
* 생성자에서 다른 생성자를 호출
* 자신의 주소를 반환.

### 1.1 자신의 메모리를 가리키는 this
this는 생성된 인스턴스 스스로를 가리키는 예약어이다.
```
public static void main(String[] args) {

	BirthDay day = new BirthDay();
	day.setYear(2000);
	...

}
```

* Birthday라는 클래스 생성
* day.setYear() 메서드 호출
	* 여기서 day는 생성된 Birthday 클래스의 주소를 가리킨다.
	* day는 참조변수

* main함수의 지역변수가 stack 메모리에 담겼다.
	* 이 때 지역변수: args, day
	* day는 heap 메모리 영역의 BirthDay를 가리킨다.
* day는 setYear() 메서드를 호출
	* setYear()는 Birthday 클래스의 메서드
	* stack에서 setYear()의 영역 안에 존재하는 this는 heap 영역의 Birthday를 가리킨다.
<img src = "https://raw.githubusercontent.com/MrKeeplearning/Java-LAB-basic/main/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%20%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%B0%8D/img/ClassnObject2-01.png">

```
class Birthday{
	// Birthday 클래스의 멤버변수
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		// 자기자신 메모리 인스턴스의 year라는 변수에 year를 넣어라.
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisExample {

	public static void main(String[] args) {
		
		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		// b1의 주소값
		System.out.println(b1);
		b1.printThis();
	}
```

위 코드를 실행하면 다음과 같은 결과를 얻을 수 있다.

```
thisex.Birthday@54bedef2
thisex.Birthday@54bedef2
```
즉, this는 현재 자기 자신의 주소값을 가리킨다는 것을 확인할 수 있다.

#### 참고
```
public Person(String name, int age){
	this.name = name;
	this.age = age;
}
```
만약 위의 코드에서 this를 생략하면 어떻게 될까? 오류는 발생하지 않지만, name과 age는 파라미터로 사용되는 name과 age로 인식된다.


### 1.2. 생성자에서 다른 생성자를 호출하는 this
생성자는 객체가 생성될 때 초기화하는 작업(주로 멤버변수의 값을 세팅)을 수행한다. 이 때, 같은 생성자는 하나 이상일 수 있고, 이런 경우를 생성자 overloading이라고 한다.
생성자가 한 개 이상일 때 어떤 생성자가 불렸다. 그 생성자가 또 다른 생성자를 호출하고 싶다면 this를 사용할 수 있다.

```
package thisex;

class Person {
	String name;
	int age;
  
  // 초기생성자
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name);
		
	}

}
```
초기 생성자가 호출되고 매개변수가 없는 경우에는 default 값으로 name에는 "이름없음"을, age에는 "1"을 넣어주고 싶다고 가정해보자.
이 때 이미 name과 age를 초기화해주는 생성자가 존재하기 때문에 this를 사용해서 호출할 수가 있는 것이다.

#### 참고
위 코드에서 초기 생성자 부분을 다음과 같이 수정했다고 가정해보자.
```
public Person() {
  name = "test"
  this("이름 없음", 1);
}
```
이렇게 작성할 경우 오류가 발생한다. 생성자 안에 생성자 오버로딩을 할 때는 this 앞에 어떠한 선언도 해서는 안된다.

name이라는 변수는 Person()이라는 instance가 모두 생성되어야 만들어지는 멤버변수이다. 생성자의 생성은 다른 생성자에서 초기화가 모두 이루어진 다음에 생성되는 것이다. 생성되지 않은 메모리에 값을 assign하는 등의 문제가 발생할 수 있기 때문에 생성자에서 다른 생성자를 호출하는 this를 사용할 때 this는 가장 먼저 나오는 statement이어야 한다.








