class Student {
    private int marks;

    public void addMarks(int number) {
        if (number > 33) 
            marks += number;
        
    }
    

    public int getMarks() {
        return marks;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student st = new Student();
        st.addMarks(32);
        System.out.println("Total Marks: " + st.getMarks());
    }
}
