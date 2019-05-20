package com.example.human;

import android.util.Log;



        public class Human {
            private String name;
            private int age;
            private int weight;
            private int height;


            public Human(String name, int age, int weight, int height) {
                this.name = name;
                this.age = age;
                this.weight = weight;
                this.height = height;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }


            public int eat() {
                return  Log.d("human", "i am eating the food"); }


            public  int sleep() {
                return  Log.d("Human", "zzzzzz");}

            public int sleep(int sleep)
            {
                return Log.d("Human", "I am sleeping for five hours");
            }
            public int speak(String speech) {
                return Log.d("Human","i won't make promise for today");
            }
            public void  birthday (int increment){
                age = age + 1;
                return;
            }


        }
