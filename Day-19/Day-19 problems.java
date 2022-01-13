import java.util.*;
class java{
        static Map<String, String> map = new HashMap<String,String>();
        static String search;
        static int result;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String[] sarr=new String[n];
        for(int i=0;i<n;i++) sarr[i]=sc.next();
        search=sc.next();
        for(int i=0;i<n;i++){
            String[] arr=sarr[i].split(",");
        map.put(arr[0],arr[1]);   
    }
  
    findchild();
    if(result!=0)
    System.out.print(result);
    else 
    System.out.print("-1");
    }
    public static void findchild(){
         boolean flag=true;
        
        for(String s:map.keySet() ){
            if(map.get(s).equals(search)) {
               flag= findgrandchild(s,flag);
               if(flag){
                ++result;
               }
        }
        
    }
    }
    public static boolean findgrandchild(String se,boolean flag){
        for(String s:map.keySet()){
            if(map.get(s).equals(se)){
                flag=false;
                ++result;
            }
        }
      return flag;  
    }
}


/*


def find(n):
    list1=[]
    list2=[]
    for i in range(1, int(pow(n, 1 / 2))+1):
        if n % i == 0:
            list1.append((i ,int(n / i)))
            list2.append(abs(i-int(n/i)))
    #print(list1)
    #print(list2)
    index=list2.index(min(list2))
    m=list1[index]
    if(m[0]<m[1]):
        print(str(m[1])+" "+str(m[0]))
    else:
        print(str(m[0])+" "+str(m[1]))
n = int(input())
find(n)




find minimum difference of pairs which equal to the product of given numbmer.
*/
