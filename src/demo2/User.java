package demo2;

import java.util.Arrays;


public class User implements Comparable<User>{
    private String username;
    private int age;

    public User(String username, int age){
        this.username = username;
        this.age = age;
    }

    public String getUsername(){
        return username;
    }

    public int getAge(){
        return age;
    }

    public String toString(){
        return username + ":" + age;
    }

    public int compareTo(User obj){
        return this.age - obj.age;
    }

    public static void main(String args[]){
        User[] users = {new User("张三", 30), new User("李四", 20)};
        Arrays.sort(users);  //用Arrays类的sort方法对数组进行排序
        for (int i = 0; i < users.length; i++){
            System.out.println(users[i]);
        }

    }

}
