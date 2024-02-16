package hackerrank;

class Student{
    public String name;
    public int studentClass;
    public float result;
    public Student(String s, int sClass){
        this.name=s;
        this.studentClass=sClass;
        System.out.println("Added student: "+this.name+" to the roll of class: "+this.studentClass);
    }

    public String getName(){
        return this.name;
    }
    public String publish(){
        if(this.result>=33.33){
            return this.name+" has been promoted to class: "+(this.studentClass+1);
        }else{
            return this.name+" has been retained in class: "+(this.studentClass);
        }
        //return "***ERROR-In Student class - Method publish()***";
    }
}
/**************************************  END CLASS STUDENT **************************************/
class Result11 extends Student{
    public int subject1;
    public int subject2;
    public int subject3;

    public Result11(int a, int b, int c, String s, int sClass){
        super(s,sClass);
        super.name = s;
        super.studentClass = sClass;
        this.subject1 = a;
        this.subject2 = b;
        this.subject3 = c;
        System.out.println(s+" obtained "+a+" in subject1");
        System.out.println(s+" obtained "+b+" in subject2");
        System.out.println(s+" obtained "+c+" in subject3");
    }

    public String calculateResult(){
        super.result = ((this.subject1 + this.subject2 + this.subject3)*100)/300;
        return publish();
    }

    public String changeMarks(int newMarks, String subject){
        System.out.println(super.name+" has ordered a recheck in "+subject);
        if(subject.equals("subject1")){
            this.subject1 = newMarks;
        }else if(subject.equals("subject2")){
            this.subject2 = newMarks;

        }else if(subject.equals("subject3")){
            this.subject3 = newMarks;
        }
        calculateResult();
        if(super.result>=33.33){
            return "Following is the new result: "+super.name+" has been promoted to class: "+(super.studentClass+1);
        }else{
            return "Following is the new result: "+super.name+" has been retained in class: "+(super.studentClass);
        }
    }
}

/**************************************  END CLASS RESULT **************************************/

public class StudentEnrollment {

    public static void main(String[] args) {
        String[] names = {"John", "Smith", "Lenon", "Mary", "Lity"};
        //int[][] marks = new int [names.length][3];
        int[][] marks = {{35,34,67},{21,18,8},{36,93,25},{47,37,81},{42,48,62}};
        String[] cla = {"1","10","8","1","8"};

        Result11 r1 = new Result11(marks[0][0], marks[0][1], marks[0][2],names[0], Integer.parseInt(cla[0]));
        Result11 r2 = new Result11(marks[1][0], marks[1][1], marks[1][2],names[1], Integer.parseInt(cla[1]));
        Result11 r3 = new Result11(marks[2][0], marks[2][1], marks[2][2],names[2], Integer.parseInt(cla[2]));
        Result11 r4 = new Result11(marks[3][0],marks[3][1], marks[3][2], names[3],Integer.parseInt(cla[3]));
        Result11 r5 = new Result11(marks[4][0], marks[4][1], marks[4][2], names[4], Integer.parseInt(cla[4]));

        String sub = "subject3";
        int newMarks = 43;

        System.out.println(r1.calculateResult());
        System.out.println(r2.calculateResult());
        System.out.println(r3.calculateResult());
        System.out.println(r4.calculateResult());
        System.out.println(r5.calculateResult());

        System.out.println(r1.changeMarks(newMarks,sub));
        System.out.println(r3.changeMarks(newMarks,sub));
        System.out.println(r5.changeMarks(newMarks,sub));
    }
}
