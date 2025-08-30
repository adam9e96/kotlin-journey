# 조건문 When

## 1. 기본 구조

```kotlin
when (조건값) {
    조건1 -> 실행문1
    조건2 -> 실행문2
    else -> 기본실행문N // (선택) 모든 경우를 커버하지 않으면 필수
}
```
## when 특징
* 자바의 `switch`와 비슷하지만, 훨씬 강력하고 유연함.
* `switch` 와 다르게 `break`이 필요없음 -> 조건 맞으면 실행 후 자동 종료.
* `else`는 `switch`문의 `default` 역할.
* `else`는 default 용도 외에도 컴파일러가 "모든 경우가 커버했는지" 검사할 수도 있음.
---

## 2. 값 비교 예시

```kotlin
val x = 2

when (x) {
    1 -> println("x는 1")
    2 -> println("x는 2")
    else -> println("x는 1이나 2가 아님")
}
```

---

## 3. 여러 조건 묶기(여러 값 매칭)

```kotlin
val x = 3

when (x) {
    1, 2 -> println("x는 1 또는 2")
    3, 4, 5 -> println("x는 3~5 중 하나")
    else -> println("그 외")
}
```

---

## 4. 범위(`in`) / 컬렉션 포함 여부
* in 90..100 : 90부터 100까지 범위 포함
* `!in` : 포함하지 않을때
```kotlin
val score = 85

when (score) {
    in 90..100 -> println("A 학점")
    in 80..89 -> println("B 학점")
    in 70..79 -> println("C 학점")
    else -> println("D 학점")
}
```

---

## 5. 타입 검사 (`is`)

```kotlin
fun checkType(value: Any) {
    when (value) {
        is String -> println("문자열 타입")
        is Int -> println("정수 타입")
        else -> println("다른 타입")
    }
}

checkType(123)     // 정수 타입
checkType("abc")   // 문자열 타입
```

---

## 6. 인자 없는 `when`

```kotlin
val x = 10

when {
    x % 2 == 0 -> println("짝수")
    x % 2 != 0 -> println("홀수")
}
```

* `when` 뒤에 값을 생략하면 **조건식 자체**를 검사 가능.
* `if ~ else if` 문을 대체 가능
---

## 7. 표현식으로 사용

`when`은 **값을 반환하는 표현식**으로도 사용 가능.

```kotlin
val grade = 92
val result = when {
    grade >= 90 -> "A"
    grade >= 80 -> "B"
    grade >= 70 -> "C"
    else -> "D"
}

println("학점: $result")
```
## 8. 반환값이 없는 경우
```kotlin
val num = 2

when (num) {
    1 -> println("one")
    2 -> println("two")
    else -> println("other")
}
```
* 단순히 실행만 하고 값 반환 없음.
* 자바 `switch`와 비슷한 케이스

---