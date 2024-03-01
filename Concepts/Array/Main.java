

public class Main {
    public static void main(String[] args) {
        Student s1=new Student("张三",18,"北京");
        Student s2=new Student("Travis Scott", 23, "Vancouver");
        Student s3=new Student("Drake", 28, "Toronto");


       
        Student stud[] = new Student[3];
        stud[0]=s1;
        stud[1]=s2;
        stud[2]=s3;

        //These Will not Generate Hashcode And Other Types Of DumbShits
        for(int i=0;i<3;i++){
            System.out.println("Name :"+ stud[i].name +"\n"+"Age : "+stud[i].age+"\n"+"Address : "+ stud[i].address);
        }
        System.out.println("-".repeat(32));
        for(Student m:stud){
            System.out.println("Name :"+ m.name +"\n"+"Age : "+m.age+"\n"+"Address : "+ m.address);
        }
        System.out.println("-".repeat(32));
        //These will Generate HashCodes 
        for(int i =0 ;i<3 ; i ++){
            System.out.println(stud[i]);
        }
        System.out.println("-".repeat(32));

        for(Student n:stud){
            System.out.println(n);
        }
        
    }
}
