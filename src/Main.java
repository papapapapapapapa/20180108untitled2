import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=Integer.parseInt(scn.nextLine()),tmpVal=0;
        String str,tmpStr= "";
        for (int i=0;i<n;i++){
            str=scn.nextLine();
            String dataStr[]=str.split(" ");
            int arraySize = dataStr.length;
            int values[] = new int[arraySize];
            for (int j=0;j<arraySize;j++){
                switch (dataStr[j].charAt(0)){
                    case 'C':
                        values[j]=0;
                        break;
                    case 'D':
                        values[j]=13;
                        break;
                    case 'H':
                        values[j]=26;
                        break;
                    case 'S':
                        values[j]=39;
                        break;
                }
                values[j] += Integer.parseInt(dataStr[j].substring(1));
            }
            for (int j=0;j<arraySize;j++){
                for (int k = j+1;k<arraySize;k++){
                    if (values[j] < values[k]){
                        tmpVal = values[j];
                        values[j] = values[k];
                        values[k] = tmpVal;
                        tmpStr = dataStr[j];
                        dataStr[j] = dataStr[k];
                        dataStr[k] = tmpStr;
                    }
                }
                System.out.print(dataStr[j]+" ");
            }
            System.out.println();
        }

    }
}
