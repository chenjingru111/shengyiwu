package com.example.shengyiwuadd;

import android.widget.TextView;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class AddDB {


    private int a;
    private int a1;
    private int a2;
    private int a3;
    private int a4;

    public int[] addEntry(/*Context context*/){
        Random random = new Random();
        Set<Integer> uniqueNumbers = new HashSet<>();

        a = random.nextInt(2)+1;
        int numOfNumbers = a == 1 ? 3 : 4;

        while (uniqueNumbers.size() < numOfNumbers) {
            uniqueNumbers.add(random.nextInt(10) + 1);
        }

        Integer[] numbersArray = uniqueNumbers.toArray(new Integer[0]);
        a1 = numbersArray[0];
        a2 = numbersArray[1];
        a3 = numbersArray[2];
        a4 = numOfNumbers == 4 ? numbersArray[3] : 0;
        int[]aa={a1, a2, a3, a4};
        System.out.println("kkkkkkkkkkkkkkkkkkkk"+"   "+a);

        return aa;

    }
    public void number2Entry(TextView tv_1,int num){
        switch (num){
            case 1:
                tv_1.setText("攻击力");
                break;
            case 2:
                tv_1.setText("攻击力");
                break;
            case 3:
                tv_1.setText("防御力");
                break;
            case 4:
                tv_1.setText("防御力");
                break;
            case 5:
                tv_1.setText("生命值");
                break;
            case 6:
                tv_1.setText("生命值");
                break;
            case 7:
                tv_1.setText("暴击率");
                break;
            case 8:
                tv_1.setText("暴击伤害");
                break;
            case 9:
                tv_1.setText("元素充能效率");
                break;
            case 10:
                tv_1.setText("元素精通");
                break;

        }
    }
    public void addNumber(TextView tv,int a1234){

        RandomFucking randomFucking = new RandomFucking();

        switch (a){
            case 1:
                Float gongji_3 = randomFucking.numberAdd3(13.62f,15.56f,17.51f);
                Float gongji2_3 = randomFucking.numberAdd3(4.08f,4.66f,5.25f);
                Float fangyu_3 = randomFucking.numberAdd3(16.2f,18.52f,20.83f);
                Float fangyu2_3 = randomFucking.numberAdd3(5.10f,5.83f,6.56f);
                Float shengming_3 = randomFucking.numberAdd3(209.13f,239f,268.88f);
                Float shengming2_3 = randomFucking.numberAdd3(4.08f,4.66f,5.25f);
                Float baoji_3 = randomFucking.numberAdd3(2.72f,3.11f,3.50f);
                Float baojishanghai_3 = randomFucking.numberAdd3(5.44f,6.22f,6.99f);
                Float yuansuchongenngxiaolv_3 = randomFucking.numberAdd3(4.53f,5.18f,5.83f);
                Float yuansujingtong_3 = randomFucking.numberAdd3(16.32f,18.65f,20.98f);


                switch (a1234){
                    case 1:
                        tv.setText(String.valueOf(gongji_3));
                        break;
                    case 2:
                        tv.setText(String.valueOf(gongji2_3)+"%");
                        break;
                    case 3:
                        tv.setText(String.valueOf(fangyu_3));
                        break;
                    case 4:
                        tv.setText(String.valueOf(fangyu2_3)+"%");
                        break;
                    case 5:
                        tv.setText(String.valueOf(shengming_3));
                        break;
                    case 6:
                        tv.setText(String.valueOf(shengming2_3)+"%");
                        break;
                    case 7:
                        tv.setText(String.valueOf(baoji_3)+"%");
                        break;
                    case 8:
                        tv.setText(String.valueOf(baojishanghai_3)+"%");
                        break;
                    case 9:
                        tv.setText(String.valueOf(yuansuchongenngxiaolv_3)+"%");
                        break;
                    case 10:
                        tv.setText(String.valueOf(yuansujingtong_3));
                        break;
                }
                break;

            case 2:
                Float gongji_4 = randomFucking.numberAdd4(13.62f,15.56f,17.51f,19.45f);
                Float gongji2_4 = randomFucking.numberAdd4(4.08f,4.66f,5.25f,5.83f);
                Float fangyu_4 = randomFucking.numberAdd4(16.2f,18.52f,20.83f,23.15f);
                Float fangyu2_4 = randomFucking.numberAdd4(5.10f,5.83f,6.56f,7.29f);
                Float shengming_4 = randomFucking.numberAdd4(209.13f,239f,268.88f,298.75f);
                Float shengming2_4 = randomFucking.numberAdd4(4.08f,4.66f,5.25f,5.83f);
                Float baoji_4 = randomFucking.numberAdd4(2.72f,3.11f,3.50f,3.89f);
                Float baojishanghai_4 = randomFucking.numberAdd4(5.44f,6.22f,6.99f,7.77f);
                Float yuansuchongnengxuailv_4 = randomFucking.numberAdd4(4.53f,5.18f,5.83f,6.48f);
                Float yuansujingtong_4 = randomFucking.numberAdd4(16.32f,18.65f,20.98f,23.31f);


                switch (a1234){
                    case 1:
                        tv.setText(String.valueOf(gongji_4));
                        break;
                    case 2:
                        tv.setText(String.valueOf(gongji2_4)+"%");
                        break;
                    case 3:
                        tv.setText(String.valueOf(fangyu_4));
                        break;
                    case 4:
                        tv.setText(String.valueOf(fangyu2_4)+"%");
                        break;
                    case 5:
                        tv.setText(String.valueOf(shengming_4));
                        break;
                    case 6:
                        tv.setText(String.valueOf(shengming2_4)+"%");
                        break;
                    case 7:
                        tv.setText(String.valueOf(baoji_4)+"%");
                        break;
                    case 8:
                        tv.setText(String.valueOf(baojishanghai_4)+"%");
                        break;
                    case 9:
                        tv.setText(String.valueOf(yuansuchongnengxuailv_4)+"%");
                        break;
                    case 10:
                        tv.setText(String.valueOf(yuansujingtong_4));
                        break;
                }
                break;
        }


    }
}
