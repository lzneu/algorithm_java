package demo2;

import java.util.Arrays;
import java.util.Comparator;

public class UserComparator implements Comparator<User>{
    public int compare(User obj1, User obj2){
        return obj1.getAge() - obj2.getAge();
    }

    public static void main(String args[]){
        User[] users = {new User("faaaa", 50), new User("adfdf", 40)};
        Arrays.sort(users, new UserComparator());  // 用比较算子排序
        for (int i = 0; i < users.length; i ++){
            System.out.println(users[i]);
        }
    }
}
