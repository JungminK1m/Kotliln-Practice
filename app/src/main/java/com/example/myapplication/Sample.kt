package com.example.myapplication

fun main() {
    testFunction();
    println(add(4,5));
}

fun testFunction() {
    println("하하하");
    println("키키키");
}

fun add(a : Int, b : Int) : Int {   // 변수 이름 먼저. 타입을 뒤에. : 뒤에는 리턴 타입 (대문자 주의)

    return a+b;
}