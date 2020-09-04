# Spring IoC 컨테이너와 DI 예제

reference: https://www.tutorialsteacher.com/ioc/introduction

<br>

### ✔️ IoC(Inversion Of Control), 제어의 역전
클래스들 간의 의존성을 낮추기 위해 제어의 주도권을 반대로 바꾼다는 원칙이다.

### ✔️ DIP(Dependency Inversion Principle), 의존 역전 원칙
객체 지향 설계 5원칙 중에 하나다. <br>
high-level의 모듈이 low-level의 모듈에 의존하면 안되고, 둘 다 abstraction(interface)에 의존해야 한다는 원칙이다.

### ✔️ DI(Dependency Injection), 의존성 주입
IoC 원칙을 구현하기 위해 의존성을 가지는 객체의 생성에 대한 주도권을 역전시키는 디자인 패턴이다.

### ✔️ IoC Container
객체의 생명주기와 의존성 주입을 관리하는 프레임워크다.

<br>

## 🍃 Spring IoC Container
Car 객체에서 Engine 객체를 사용하기 위해서는 Car 클래스 안에서 Engine 클래스를 생성해야 한다.
Car 클래스는 Engine 클래스에 의존성을 가진다.

``` JAVA
public class Car {
    private Engine = new engine();

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
    ...
}
```
<br>

Spring @Autowired 어노테이션을 사용해서 의존성을 주입시키면 제어의 주도권이 Spring Framework에게 넘어가게 된다. <br>
Car 클래스 안에서 Engine 객체를 직접 생성하지 않고 Engine 객체를 사용할 수 있다.

``` JAVA
@Component
public class Car {
    @Autowired
    private Engine engine;
    
    public void setEngine(Engine engine) {  //DI
        this.engine = engine;
    }
    
    ...
}
```

### ✔️ @Autowired 대신 생성자를 통해 의존성 주입하기 
만약 두 클래스에서 서로 객체에 대하여 의존성을 주입할 경우, 순환 참조 문제가 발생한다. <br>
@Autowired 어노테이션을 사용하여 의존성을 주입할 경우에는 순환 참조 문제를 런타임에 체크한다. <br>
반면 생성자를 활용하여 의존성을 주입할 경우에는 순환 참조 문제를 컴파일할 때에 체크한다. <br>
