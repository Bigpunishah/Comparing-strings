import java.util.Scanner;

class StringInfo{
    Scanner sc = new Scanner(System.in);                //sc for scanner
    private String str1, str2;                          //Private Strings
    StringInfo(){                                       //Constructor
        System.out.print("Enter first string:");      //Getting info     
        str1 = sc.nextLine();
        str1 = str1.toLowerCase();
        System.out.print("Enter second string:");
        str2 = sc.nextLine();
        str2 = str2.toLowerCase();                      //Setting inputs to lowecase for reading
    }

    public void compareString(){                        //Function

        System.out.print("Enter starting index for first string:");     //Starting point on string
        int index1 = sc.nextInt();

        System.out.print("Enter starting index for second string:");    
        int index2 = sc.nextInt();

        System.out.print("Enter number of characters to be compared:"); //How many values should be compared?
        int num = sc.nextInt();
        
        String str1_subString = str1.substring(index1);                   //Substring of the Strings to search those specified index's
        String str2_subString = str2.substring(index2);

        char str1_ch[] = str1_subString.toCharArray();                    //Dividning the strings into array of characters to be compared
        char str2_ch[] = str2_subString.toCharArray();
        for(int i = 0; i < num; i++){                                     //for how many numbers you want searhced...
            if(str1_ch[i] != str2_ch[i]){                                 //if thee value is not the same in each character beng compared then..
                System.out.print("false");                              //print false
                return;                                                   //Quit
            }
            else
                continue;
        }
        System.out.println("true");
        
    }
}

public class StringCompare{
    public static void main(String[] args){
        StringInfo strComp = new StringInfo();                          //New Class & start the compare function.
        strComp.compareString();
    }
}