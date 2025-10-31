## 📘 **Student Record Manager**

### 📖 Project Summary

**Student Record Manager** is a simple Java console-based program that allows users to manage student information efficiently.
It takes multiple students’ details as input (ID, full name, blood group, and CGPA), supports query-based searches, and identifies the student with the lowest CGPA.

---

### ⚙️ **Features**

* Accepts multiple students' information dynamically.
* Searches student records based on:

  * Last name
  * Blood group
* Displays all matching students’ details.
* Finds and displays the student with the **lowest CGPA**.
* Demonstrates **encapsulation** and **immutability** principles in Java.

---

### 🧩 **Technologies Used**

* **Language:** Java
* **IDE (optional):** IntelliJ IDEA / Eclipse / VS Code
* **Version Control:** Git & GitHub

---

### 🧱 **Project Structure**

```
student-record-manager/
│
├── src/
│   ├── com/imrul/hasan/sifat/
│   │   ├── Main.java
│   │   └── Student.java
│
├── .gitignore
└── README.md
```

---

### 🚀 **How to Run the Program**

1. **Clone this repository**

   ```bash
   git clone https://github.com/Sifathasan578/student-record-manager.git
   cd student-record-manager
   ```

2. **Compile the Java files**

   ```bash
   javac src/com/imrul/hasan/sifat/*.java
   ```

3. **Run the program**

   ```bash
   java com.imrul.hasan.sifat.Main
   ```

4. **Follow the prompts**
   Example input:

   ```
   Enter number of students: 3
   Enter id: 101
   Enter Full Name: Imrul Hasan Sifat
   Enter Blood Group: O+
   Enter CGPA: 3.75
   ...
   Enter Query: O+
   ```

   Example output:

   ```
   Student Information Based on Matching Criteria
   ID: 101
   Full Name: Imrul Hasan Sifat
   Blood Group: O+
   CGPA: 3.75

   Student Information Based on Lowest CGPA
   ID: 103
   Full Name: John Smith
   Blood Group: A+
   CGPA: 2.90
   ```

---

### 🧠 **Object-Oriented Design Highlights**

* **Encapsulation:** All student properties are private and accessible only via getters.
* **Immutability:** `Student` class is declared `final` with final fields — once created, it cannot be modified.
* **Reusability:** Methods are modular (`matchingCriteriaCheck`, `display`, `findStudentWithLowestCgpa`).

---

### 🧾 **Key Methods**

| Method                                          | Description                                               |
| ----------------------------------------------- | --------------------------------------------------------- |
| `display()`                                     | Prints all student details.                               |
| `matchingCriteriaCheck(String query)`           | Returns `true` if query matches last name or blood group. |
| `findStudentWithLowestCgpa(ArrayList<Student>)` | Finds the student with the lowest CGPA.                   |

---

### 🏅 **Learning Outcomes**

* Practice with Java Classes & Objects
* Implement encapsulation & immutability
* Handle user input and string operations
* Perform filtering and aggregation (search + lowest CGPA logic)

---

### 🧑‍💻 **Author**

**Imrul Hasan Sifat**
📧 [ihsifatbd1999@gmail.com](mailto:ihsifatbd1999@gmail.com)
🌐 [GitHub Profile](https://github.com/Sifathasan578)

---

### 🪪 **License**

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
