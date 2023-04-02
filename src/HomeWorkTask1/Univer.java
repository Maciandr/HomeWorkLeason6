package HomeWorkTask1;

public class Univer {
    public static void main(String[] args) {
        Student[] students = initialize();
        System.out.println("Cписок всех студетов");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].information());
        }
        System.out.println("Факультет Слесарка и список студентов ");
        Student[] slesarka = getStudentForFaculy(students, "Cлесарка");
        for (int i = 0; i < slesarka.length; i++) {
            if (slesarka[i] != null) {
                System.out.println(slesarka[i].information());
            }
        }
        System.out.println("Факультет Телекамуникации и список студентов курса ");
        Student[] telekom = getStudentForFaculy(students, "Телекомуникация");
        for (int i = 0; i < telekom.length; i++) {
            if (telekom[i] != null) {
                System.out.println(telekom[i].information());
            }
        }
        System.out.println("Список студентов Слесарка 1 курс");
        Student[] slesarka1Curs = getStudentForFacultyAndCurs(students, "Cлесарка", 1);
        for (int i = 0; i < slesarka1Curs.length; i++) {
            if (slesarka1Curs[i] != null) {
                System.out.println(slesarka1Curs[i].information());
            }
        }
        System.out.println("Список студентов Телекомуникация 3 курс ");
        Student[] telekom1Curs = getStudentForFacultyAndCurs(students, "Телекомуникация", 3);
        for (int i = 0; i < slesarka1Curs.length; i++) {
            if (telekom1Curs[i] != null) {
                System.out.println(telekom1Curs[i].information());
            }
        }
        System.out.println("Cписок студентов Слесарка 2 курс");
        Student[] slesarka2Curs = getStudentForFacultyAndCurs(students, "Cлесарка", 2);
        for (int i = 0; i < slesarka2Curs.length; i++) {
            if (slesarka2Curs[i] != null) {
                System.out.println(slesarka2Curs[i].information());
            }
        }
        System.out.println("Список студентов 1993 года рождения и старше");
        Student[] theAge = getAges(students, 1993);
        for (int i = 0; i < theAge.length; i++) {
            if (theAge[i] != null) {
                System.out.println(theAge[i].information());
            }
        }
        System.out.println("Список учебной группы : 13");
        Student[] spisokGroup = getSpisokGroup(students, 13);
        {
            for (int i = 0; i < spisokGroup.length; i++) {
                if (spisokGroup[i] != null) {
                    System.out.println(spisokGroup[i].information());
                }
            }

        }
        System.out.println("Список учебной группы : 23");
        Student[] spisokGroup23 = getSpisokGroup(students, 23);
        {
            for (int i = 0; i < spisokGroup23.length; i++) {
                if (spisokGroup23[i] != null) {
                    System.out.println(spisokGroup23[i].information());

                }
            }
        }
        System.out.println("Список учебной группы : 35");
        Student[] spisokGroup35 = getSpisokGroup(students, 35);
        {
            for (int i = 0; i < spisokGroup35.length; i++) {
                if (spisokGroup35[i] != null) {
                    System.out.println(spisokGroup35[i].information());

                }
            }
        }
        System.out.println("Все студенты С телекомуникации переведены на КСИС");
        perevod(students, "Телекомуникация");

        System.out.println("Cписок всех студетов");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].information());
        }
    }

    static Student[] initialize() {
        Student[] students = new Student[6];
        Student Student1 = new Student(1, "Петров", "Петя", 1994, "Cлесарка", 1, 13);
        Student Student2 = new Student(2, "Иванов", "Иван", 1993, "Cлесарка", 2, 23);
        Student Student3 = new Student(3, "Сидоров", "Колян", 1994, "Cлесарка", 1, 13);
        Student Student4 = new Student(4, "Петренко", "Сергей", 1993, "Cлесарка", 2, 23);
        Student Student5 = new Student(5, "Иванова", "Яна", 1992, "Телекомуникация", 3, 35);
        Student Student6 = new Student(6, "Троцкий", "Ваня", 1992, "Телекомуникация", 3, 35);
        students[0] = Student1;
        students[1] = Student2;
        students[2] = Student3;
        students[3] = Student4;
        students[4] = Student5;
        students[5] = Student6;
        return students;
    }

    public static Student[] getStudentForFaculy(Student[] students, String faculty) {
        Student[] newStudents = new Student[students.length];
        int j = 0;
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                newStudents[j] = student;
                j++;
            }
        }
        return newStudents;
    }

    public static Student[] getStudentForFacultyAndCurs(Student[] students, String faculty, int curs) {
        Student[] newStudents = new Student[students.length];
        int i = 0;
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                if (student.getCurs() == curs) {
                    newStudents[i] = student;
                    i++;
                }
            }
        }
        return newStudents;
    }

    public static Student[] getAges(Student[] students, int age) {
        Student[] newStudents = new Student[students.length];
        int i = 0;
        for (Student student : students) {
            if (student.getAge() >= age) {
                newStudents[i] = student;
                i++;
            }
        }
        return newStudents;
    }

    public static Student[] getSpisokGroup(Student[] students, int group) {
        Student[] newStudents = new Student[students.length];
        int i = 0;
        for (Student student : students) {
            if (student.getGroup() == group) {
                newStudents[i] = student;
                i++;
            }
        }
        return newStudents;
    }

    static Student[] perevod(Student[] students, String faculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(faculty)) {
                students[i].setFaculty("КСИП");
            }
        }
        return students;
    }

}


class Student {

    private int id;
    private String surname;
    private String name;
    private int age;
    private String faculty;
    private int curs;
    private int group;

    public Student(int id, String surname, String name, int age, String faculty, int curs, int group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.faculty = faculty;
        this.curs = curs;
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setAge(int Age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public int getCurs() {
        return this.curs;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return this.group;
    }

    public String information() {
        return "id: " + id + ",Имя: " + name + ",Фамилия: " + surname + ",Год рождения " +
                age + ",Факультатет: " + faculty + ",Курс: " + curs + ",Группа: " + group;
    }
}
