package com.company;

public class Main {
    public static void main(String[] args) {
        class User{
            int score;
            String id;
            public boolean hasWon () {
                if (score == 100) {
                    return true;
                }
                return false;
            }
            public int getScore(){return this.score;}
            public String getId(){return this.id;}
            public void setScore(int score){
                this.score = score;         //"this" points to the class itself 
            }
            public void setId(String id){
                this.id = id;
            }
        }


        User user1 = new User();
        user1.setId("ckse93");
        user1.setScore(99);
        System.out.println(user1.hasWon());
    }
}
