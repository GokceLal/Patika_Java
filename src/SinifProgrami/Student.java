package SinifProgrami;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int matSozlu;

    int fizikSozlu;
    int kimyaSozlu;
    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,int fizikSozlu,int matSozlu,int kimyaSozlu) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.fizikSozlu =fizikSozlu;
        this.matSozlu =matSozlu;
        this.kimyaSozlu = kimyaSozlu;
        calcAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }
    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = ((((this.fizikSozlu * 0.2) + (this.fizik.note * 0.8)) + ((this.kimya.note*0.8)+(this.kimyaSozlu*0.2))
                + ((this.mat.note*0.8)+ (this.matSozlu*0.2 )))/ 3);
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }


}


