package pack;

public class Students {
    String uni_name;
    String stu_major;
    String stu_name;
    int stu_age;
    int stu_grade;

    public void setStu_info(String stu_name) {
        this.uni_name = "DongseoUniversity";
        this.stu_major = "Computer";
        this.stu_name = stu_name;
        this.stu_age = 20;
        this.stu_grade = 1;
    }

    public void setStu_info(String stu_name, int stu_age, int stu_grade){
        if(stu_age < 20) {
            System.out.println("20살 미만은 입력이 불가능합니다.");
        } else if( stu_age >= 20) {
            if(stu_age == 20) {
                this.stu_grade = 1;
            } else {
                this.stu_grade = stu_grade;
            }
            this.uni_name = "DongseoUniversity";
            this.stu_major = "Computer";
            this.stu_name = stu_name;
            this.stu_age = stu_age;
        }
    }

    public void setStu_info(String stu_name, int stu_age, int stu_grade, String uni_name, String stu_major){
        if(stu_age < 20) {
            System.out.println("20살 미만은 입력이 불가능합니다.");
        } else if ( stu_age >= 20) {
            if(stu_age == 20) {
                this.stu_grade = 1;
            } else {
                this.stu_grade = stu_grade;
            }
            this.uni_name = uni_name;
            this.stu_major = stu_major;
            this.stu_name = stu_name;
            this.stu_age = stu_age;
        }
    }

    public void print_stu_info(){
        System.out.println("대학교: " + this.uni_name);
        System.out.println("학과 : " + this.stu_major);
        System.out.println("학년 : " + this.stu_grade);
        System.out.println("나이 : " + this.stu_age);
        System.out.println("이름 : " + this.stu_name);
    }
}