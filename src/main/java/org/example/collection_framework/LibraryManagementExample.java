package org.example.collection_framework;

/*
    Classes
    1. Student
       id, name, rollNo, batch, mobileNo, emailId
    2. Book
       id, name, description, authorName, subject, year, serialNo, price
    3. IssuedBooks
       id, studentId, bookId, issueDate





 */

import org.example.oops.constructor.Students;

import java.util.*;

public class LibraryManagementExample
{

    public static void main(String[] args)
    {
            Books book1 = new Books();
            book1.setId(101);
            book1.setName("E Balaguru swami");
            book1.setAuthorName("Balaguru swami");
            book1.setDescription("c language programming book by balaguru swami");
            book1.setSubject("c language");
            book1.setYear("2004");
            book1.setPrice(799);

            Student student1 = new Student();
            student1.setId(201);
            student1.setName("Arpit");
            student1.setBatch("java");
            student1.setMobileNo("123456");
            student1.setEmailId("arpit@gmail.com");

            Student student2 = new Student();
            student2.setId(202);
            student2.setName("Vipul");
            student2.setBatch("java");
            student2.setMobileNo("123456");
            student2.setEmailId("viput@gmail.com");

            IssuedBooks issuedBook1 = new IssuedBooks();
            issuedBook1.setId(301);
            issuedBook1.setStudentId(student1.getId());
            issuedBook1.setBookId(book1.getId());
            issuedBook1.setIssueDate(new Date());

            HashMap<Integer, ArrayList<Books>> hashMap = new LinkedHashMap<>();

            List<Student> studentsList = new ArrayList<>();
            studentsList.add(student1);
            studentsList.add(student2);
            System.out.println(studentsList);
            Student student1_Object= studentsList.get(0);
            Student student2_Object= studentsList.get(1);
            System.out.println(student1_Object.getName());
            System.out.println(student2_Object.getName());
    }

}
