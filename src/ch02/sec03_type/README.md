# Kotlin 기본 타입

코틀린은 자바와 달리 **모든 타입이 객체**로 취급된다.
기본 타입은 실제로는 객체지만, JVM 상에서는 성능 최적화를 위해 primitive로 변환된다.

---

## 🔢 숫자 타입 (Numbers)

| 타입       | 크기 (비트) | 범위                                 |
| -------- | ------- | ---------------------------------- |
| `Byte`   | 8       | -128 \~ 127                        |
| `Short`  | 16      | -32,768 \~ 32,767                  |
| `Int`    | 32      | -2,147,483,648 \~ 2,147,483,647    |
| `Long`   | 64      | -2⁶³ \~ 2⁶³-1                      |
| `Float`  | 32      | 1.4E-45 \~ 3.4E38 (소수점 6자리 정밀도)    |
| `Double` | 64      | 4.9E-324 \~ 1.8E308 (소수점 15자리 정밀도) |

### 특징

* 정수 기본 타입은 `Int`, 실수 기본 타입은 `Double`.
* 타입 변환은 **명시적**으로 해야 함 (`toInt()`, `toLong()` 등).

```kotlin
val a: Int = 100
val b: Long = a.toLong()
val c: Double = 3.14
```

---

## 🔤 문자와 문자열

### Char

* 문자 하나를 표현 (`'A'`, `'b'` 등).
* `Char`는 숫자가 아님 → 산술 연산 불가.

```kotlin
val ch: Char = 'K'
```

### String

* 문자열은 `String` 타입.
* **이스케이프 문자열** 지원: `\n`, `\t`, `\\`, `\"`
* **여러 줄 문자열**: `""" ... """`

```kotlin
val str1 = "Hello"
val str2 = """ 
    Kotlin 
    Multiline 
""".trimIndent()
```

---

## ✅ 불리언 (Boolean)

* 값: `true` 또는 `false`
* 논리 연산 지원: `&&`, `||`, `!`

```kotlin
val isOn: Boolean = true
val isOff = !isOn  // false
```

---

## 📚 배열 (Array)

* 동일 타입의 데이터를 모아둔 구조.
* 코틀린 배열은 객체 `Array<T>`.

```kotlin
val arr = arrayOf(1, 2, 3)       // [1, 2, 3]
val arr2 = Array(5) { i -> i*2 } // [0, 2, 4, 6, 8]
```

* 원시 타입 특화 배열도 있음:
  `IntArray`, `DoubleArray`, `BooleanArray` 등.

```kotlin
val nums: IntArray = intArrayOf(1, 2, 3, 4)
```

---

## 📌 타입 검사 & 변환

* `is` → 타입 검사
* `as` → 타입 변환

```kotlin
val x: Any = "Kotlin"
if (x is String) {
    println(x.length) // 스마트 캐스트
}
```

---

## 📝 정리

* 코틀린 기본 타입은 **객체**로 동작하지만 JVM에서는 primitive로 최적화됨.
* 변환은 명시적으로 해야 함.
* 문자열은 `String`, 문자는 `Char`.
* 배열은 `Array<T>`와 원시타입 특화 배열 제공.