package com.example.myapplication

fun main() {
    testFunction();
    println(add(4,5));

    // String Template

    val name = "Jungmin"
    val lastName = "Kim"
    println("my name is ${name + lastName}")

    println("this is 2\$")

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