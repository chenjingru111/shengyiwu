package com.example.shengyiwuadd;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomFucking {

    public List<String> randomEntry(){
        String[] texts = {"攻击力", "攻击力2", "防御力", "防御力2", "生命值", "生命值2", "暴击率", "暴击伤害", "元素充能效率", "元素精通"};

        ArrayList<String> textsList  = new ArrayList<>();
        Collections.addAll(textsList, texts);

        Collections.shuffle(textsList);

        int randomLength = (int) (Math.random() * 2) + 3;

        List<String> result = textsList.subList(0, randomLength);

        return  result;
    }


    public  Float numberAdd3(float a1,float a2,float a3) {
        float num1 = a1;
        float num2 = a2;
        float num3 = a3;

        List<Float> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);

        int randomIndex = new Random().nextInt(numbers.size());
        float randomValue = numbers.get(randomIndex);

        return randomValue;
    }

    public  Float numberAdd4(float a1,float a2,float a3,float a4) {
        float num1 = a1;
        float num2 = a2;
        float num3 = a3;
        float num4 = a4;

        List<Float> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);
        numbers.add(num4);


        int randomIndex = new Random().nextInt(numbers.size());
        float randomValue = numbers.get(randomIndex);

        return randomValue;
    }




/*
    public void addNumber2Entry(String s, TextView tv_11){
        if (s.equals("攻击力")){
            Float aFloat = numberAdd();
            tv_11.setText(String.valueOf(aFloat));

        }
    }
*/


}
