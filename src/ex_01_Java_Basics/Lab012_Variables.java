package ex_01_Java_Basics;

public class Lab012_Variables {
    public static void main(String[] args) {
        // How to create a Variables
        // data_type variable_name = variable_value;

        byte age_pramod = 65;
        short age_saurabh = 65;

        //byte -> Data_type
        //age_pramod -> Variable_name/Identifier
        //= -> Assignment Operator.
        //65 -> Variable_value

    //Now Can I change the value of already declared variable? Yes.
        age_pramod = 122;
        System.out.println("Age of Pramod is " + age_saurabh);
    }
}
