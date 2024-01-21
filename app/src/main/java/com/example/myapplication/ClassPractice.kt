package com.example.myapplication


open class Human constructor(val name : String = "Anonymous"){

//    val name = name

    // 부생성자로서도 constructor 사용가능
    // 부생성자는 주생성자로부터 항상 위임을 받아야 함 = this
    constructor(name : String, age : Int) : this(name){
        println("my name is ${name}, ${age} years old")
    }

    // init이 constructor보다 먼저 실행됨. 제일 먼저 실행됨
    init {  // 처음 클래스를 생성할 때, 어떤 동작을 하고 싶은 지 적는 곳
        println("New human has been born!")
    }
    open fun eatingCake(){
        println("This is so yummy")
    }
}

// 코틀린은 기본적으로 모든 클래스가 final 클래스여서 같은 파일내에서도 상속 쓰지 못함. => 오픈 해 줘야 쓸 수 있음
class Korean : Human(){

    override fun eatingCake() {
        // 부모 클래스것도 사용하고 싶다면 super
        super.eatingCake()
        println("너무 맛있어!!!")
        println("내 이름은 ${name}")
    }

}

fun main(){

    val human = Human("minsu")

    val stranger = Human()

    val mom = Human("Hee", 55)
    human.eatingCake()
    println("this human's name is ${human.name}")
    println("this human's name is ${stranger.name}")

    val korean = Korean()
    korean.eatingCake()
}