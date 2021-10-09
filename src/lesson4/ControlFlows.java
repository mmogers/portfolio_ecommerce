package lesson4;

public class ControlFlows {
    //BRANCHING
    public static void main(String[] args) {
        int myAge = 31;
        // Simple if dtatement
        if(myAge > 64 ){
            System.out.println("Retirement tome");
        }
        else if (myAge < 7){
            System.out.println("Kindergarten time");
        }else{
            System.out.println("Its time to work");
        }
        //SWITCH
        switch (myAge){
            case 5:
                System.out.println("5 years old");
                break;
            case 31:
                System.out.println("31 years old");
                break;
            case 55:
                System.out.println("55 years old");
                break;
            default:
                System.out.println("Some other non-mentioned age");
        }

        //FOREACH LOOP
        String[] students = new String[5];
        students[0] = "Laura";
        students[1] = "Jekaterina";
        students[2]= "Marina";
        students[3] = "Tatjana";

        for (String studentName:students) {
            System.out.println(studentName);
        }
        //WHILE when we don't know the end condition
        int i = 0;
        while (i<20){
            System.out.println("Loop is still running " + i) ;
            i++;
        }


//BREAK CONTINUE
        //INFINITE LOOP
        //we will stop the loop when break condition > 10
        int breakCondition = 0;
        do{
            if(breakCondition > 10){
                break;
            }
            breakCondition++;
            System.out.println("BreakCondition : " + breakCondition);
        }while(true);
        System.out.println("wea re out of loop");


        //a loop where we keep elements from 3 to 7

        for (int j = 0;j<10;j++){
            if(j>3 && j<7){
                continue;
            }
            System.out.println("Some element that is not between 3 and 7 not included " + j);
        }
    }

}
