# Exception Handling in Java

## 📌 What is an Exception?
An **Exception** is an error that occurs at runtime or is identified by the JVM.  
When an exception occurs, the program will be terminated **abnormally** unless handled properly.

---

## ⚡ Types of Exceptions
Java exceptions are classified into two types:

### 1. Checked Exceptions
- Exceptions that are **checked at compile-time** by the compiler.  
- These exceptions must be handled using **try-catch** or declared using `throws`.  
- Inheritance: Classes that inherit from the **`Exception`** class (excluding `RuntimeException`).  

**Examples:**  
- `ClassNotFoundException`  
- `SQLException`  
- `ServletException`

---

### 2. Unchecked Exceptions
- Exceptions that occur at **runtime** and are **not checked** by the compiler.  
- Inheritance: Classes that inherit from the **`RuntimeException`** class.  

**Examples:**  
- `ArithmeticException`  
- `NullPointerException`  
- `ArrayIndexOutOfBoundsException`

---

## 🛠 Exception Object
When an exception occurs:
- An **object** of the respective exception class is created.  
- This object contains details such as:
  - **Why** the exception occurred  
  - **Where** it occurred  
  - **What** caused it  

---

## 🛡 Exception Handling
The process of allowing the program to **continue execution** even if an exception occurs is called **Exception Handling**.  
This is achieved using the **try-catch** mechanism.

### ✅ Syntax
```java
try {
    // Code that might throw an exception
} catch (ExceptionClassName variableName) {
    // Alternative code to handle exception
}
