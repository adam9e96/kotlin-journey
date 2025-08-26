# Kotlin 입력 함수

## 1. `readLine()`

```kotlin
fun readLine(): String?
```

* **반환 타입**: `String?` (nullable)
* **특징**: 입력이 없거나 EOF 도달 시 `null` 반환
* **사용 예시**:

  ```kotlin
  val input: String? = readLine()
  if (input != null) {
      println("입력값: $input")
  }
  ```
* **Null 강제 처리**:
!!은 널 방지기능을 무시시킴
  ```kotlin
  val a = readLine()!!.toInt()   // null이면 NPE 발생
  ```

---

## 2. `readln()` <-- 추천

```kotlin
fun readln(): String
```

* **반환 타입**: `String` (non-null)
* **특징**: 입력이 없거나 EOF 도달 시 `RuntimeException` 발생
* **사용 예시**:

  ```kotlin
  val input: String = readln()
  println("입력값: $input")
  ```
* **형 변환**:

  ```kotlin
  val a = readln().toInt()
  val b = readln().toInt()
  println(a + b)
  ```

---

## 3. 비교 표

| 함수           | 반환 타입     | EOF 시 동작           | Null 처리 필요 여부   | 권장 여부        |
| ------------ | --------- | ------------------ | --------------- | ------------ |
| `readLine()` | `String?` | `null` 반환          | 필요 (`!!`, `?:`) | 구식(가능하면 안 씀) |
| `readln()`   | `String`  | `RuntimeException` | 불필요             | ✅ 권장         |

---

정리:
* `readLine()` → 옛날 방식, `String?` 반환.
* `readln()` → 최신 방식, `String` 반환.
