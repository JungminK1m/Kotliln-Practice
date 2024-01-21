package com.example.myapplication

fun main() {
    testFunction();
    println(add(4,5));

    // String Template

    val name = "Jungmin"
    val lastName = "Kim"
    println("my name is ${name + lastName}")

    println("this is 2\$")

    chkNum(1)

}

// 조건식
fun maxBy(a: Int, b: Int) : Int{

    if (a>b){
        return a
    }else{
        return b
    }


}

// 같지만 다른 표현식 - 삼항 연산자 없기 때문에 이런 식으로 표현
fun maxBy2(a: Int, b : Int) : Int = if(a>b) a else b

fun chkNum(score : Int){
    when(score) { // switch 역할
        0-> println("this is 0")
        1-> println("this is 1")
        2,3-> println("this is 2 or 3")
        else -> println("I don't know") // else 안써도 됨
    }

    // 아래의 경우에는 else 경우를 꼭 써야함
    var b = when(score){
        1->1
        2->2
        else ->3
    }

    println("b : ${b}")

    when(score){
        in 99..100 -> println("You are genius")
        in 10..80 -> println("Not bad")
        else-> println("Okay")
    }
}

fun testFunction() {
    println("하하하");
    println("키키키");
}

fun add(a : Int, b : Int) : Int {   // 변수 이름 먼저. 타입을 뒤에. : 뒤에는 리턴 타입 (대문자 주의)

    return a+b;
}

// val vs var

fun hi(){

    val a : Int = 10;   // value라서 값을 다시 할당할 수 없음
    var b : Int = 9;    // var은 하나의 변수이기 때문에 다시 할당 가능
    
    // a = 100; ==> 에러
    // 변수 타입을 추론하기 때문에 타입을 쓰지 않아도 됨.
    // 값을 할당하지 않을거라면 타입 선언해야 함.

    
}