public class S07_79_EX31 {

        // write code here
        private String firstName;
        private String lastName;
        private int age;
        
         public String getFirstName() {
            return this.firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return this.lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public int getAge() {
            return this.age;
        }
    
        public void setAge(int age) {
            if((age<0)||(age>100)){
                this.age=0;
            }else{
            this.age = age;
        }
        }
        public boolean isTeen(){
            if(this.age>12&&age<20){
                return true;
            }else{
                return false;
            }
        }
        public String getFullName(){
            
            if(firstName.isEmpty()){
                return lastName;
            }
            if(lastName.isEmpty()){
                return firstName;
            }
            if(lastName.isEmpty()&&firstName.isEmpty()){
                return "";
            }
            return firstName +" "+ lastName;
        }
        
        
     
    }
    
    
    
    
    

