## 1. 최상위 타입(`Any`)

* 코틀린의 모든 클래스가 상속하는 최상위 타입.
* 자바의 `Object`와 비슷하지만, **nullable 여부**에서 차이가 있음.

### 특징

* `Any`는 **널을 허용하지 않음**

  ```kotlin
  var x: Any = "Hello"   // 가능
  var y: Any = 123       // 가능
  var z: Any? = null     // nullable로 선언해야 null 가능
  ```
* `Any`에 들어간 값은 실제 타입으로 캐스팅해서 사용해야 함

  ```kotlin
  val data: Any = "Kotlin"
  if (data is String) {
      println(data.length)  // 스마트 캐스트 덕분에 바로 사용 가능
  }
  ```
* 기본적으로 모든 타입(Int, String, 클래스, 배열 등)의 부모 타입 역할.

---

## 2. 확장 함수(`any()`)

컬렉션(List, Set 등)이나 시퀀스(Sequence)에서 쓰이는 함수.

### 사용 형태

* `fun <T> Iterable<T>.any(): Boolean`

    * 컬렉션이 **비어있지 않으면 true**
* `fun <T> Iterable<T>.any(predicate: (T) -> Boolean): Boolean`

    * 조건(predicate)을 만족하는 원소가 **하나라도 있으면 true**

### 예시

```kotlin
val nums = listOf(1, 2, 3, 4, 5)

// 아무 값이 있나?
println(nums.any())   // true (비어있지 않음)

// 짝수가 있나?
println(nums.any { it % 2 == 0 })  // true (2, 4 존재)

// 10보다 큰 수가 있나?
println(nums.any { it > 10 })  // false
```

---

## 정리

* **`Any` (타입)** → 모든 타입의 최상위 타입, 자바의 `Object` 유사.
* **`any()` (함수)** → 컬렉션/시퀀스에서 사용, 원소 존재 여부 또는 조건 만족 여부 확인.