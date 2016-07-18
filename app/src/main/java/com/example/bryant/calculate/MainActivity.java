package com.example.bryant.calculate;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    public  static int a = 1;
    public  static int i = 0;
    public  boolean b =false;
    public  double  num1=0;
    public  double  result=0;
    public  TextView expression;
    public  TextView resultExpression;
    public  String suffixExpression = "";
    public  Button c;
    public  Button delete;
    public  Button drop;
    public  Button plus;
    public  Button subtract;
    public  Button multiply;
    public  Button divide;
    public  Button equals;
    public  Button button0;
    public  Button button1;
    public  Button button2;
    public  Button button3;
    public  Button button4;
    public  Button button5;
    public  Button button6;
    public  Button button7;
    public  Button button8;
    public  Button button9;
    public List<Character> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        expression = (TextView)findViewById(R.id.expression);
        resultExpression = (TextView)findViewById(R.id.result);
        button0 = (Button)findViewById(R.id.button0);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        drop = (Button)findViewById(R.id.drop);
        equals = (Button)findViewById(R.id.equals);
        plus = (Button)findViewById(R.id.plus);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        delete = (Button)findViewById(R.id.clear);
        c = (Button)findViewById(R.id.c);

        ButtonClickListener listener = new ButtonClickListener();

        button0.setOnClickListener(listener);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);
        drop.setOnClickListener(listener);
        equals.setOnClickListener(listener);
        plus.setOnClickListener(listener);
        subtract.setOnClickListener(listener);
        multiply.setOnClickListener(listener);
        divide.setOnClickListener(listener);
        delete.setOnClickListener(listener);
        c.setOnClickListener(listener);
    }
    public class ButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.button0){                          //数字0
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString+="0";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button1){                          //数字1
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "1";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button2){                          //数字2
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "2";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button3){                          //数字3
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "3";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button4){                          //数字4
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "4";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button5){                          //数字5
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "5";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button6){                          //数字6
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "6";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button7){                          //数字7
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "7";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button8){                          //数字8
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "8";
                expression.setText(myString);
            }
            if(v.getId() == R.id.button9){                          //数字9
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                myString += "9";
                expression.setText(myString);
            }
            if(v.getId() == R.id.drop){                             //小数点
                if(b){
                    expression.setText(null);
                    resultExpression.setText(null);
                    b = false;
                }
                String myString = expression.getText().toString();
                if(expression.getText().equals(""))
                    return ;
                else if(myString.charAt(myString.length()-1) == '.'){
                    return ;
                }else if(myString.charAt(myString.length()-1) == '+'
                        ||myString.charAt(myString.length()-1) == '-'
                        ||myString.charAt(myString.length()-1) == '*'
                        ||myString.charAt(myString.length()-1) == '/'){
                    return;
                }else if(i == 1){
                    return ;
                }
                else {
                    myString += ".";
                    i = 1;
                }
                expression.setText(myString);
            }
            if(v.getId() == R.id.plus){                             //加法运算
                if(expression.getText().equals(""))
                    return;
                String myString = expression.getText().toString();
                myString += "+";
                expression.setText(myString);
                b = false;
                a = 1;
                i = 0;
            }
            if(v.getId() == R.id.subtract){                         //减法运算
                if(expression.getText().equals(""))
                    return;
                String myString = expression.getText().toString();
                myString += "-";
                expression.setText(myString);
                b = false;
                a = 2;
                i = 0;
            }
            if(v.getId() == R.id.multiply){                         //乘法运算
                if(expression.getText().equals(""))
                    return ;
                String myString = expression.getText().toString();
                myString += "*";
                expression.setText(myString);
                b = false;
                a = 3;
                i = 0;
            }
            if(v.getId() == R.id.divide){                           //除法运算
                if(expression.getText().equals(""))
                    return ;
                String myString = expression.getText().toString();
                myString += "/";
                expression.setText(myString);
                b = false;
                a = 4;
                i = 0;
            }
            if(v.getId() == R.id.clear){                            //回退
                if(expression.getText().equals("")){
                    return;
                }
                if(!resultExpression.getText().equals("")){
                    expression.setText("");
                    resultExpression.setText("");
                    a = 0;
                    i = 0;
                    return;
                }
                String myString = expression.getText().toString();
                myString =  myString.substring(0,myString.length()-1);
                expression.setText(myString);
            }
            if(v.getId() == R.id.c) {                               //清除
                expression.setText("");
                resultExpression.setText("");
                a = 0;
                i = 0;
            }
            if(v.getId() == R.id.equals){                           //运算
                b = true;
                if(expression.getText().equals("")) {
                    return ;
                }
                String myString = expression.getText().toString();
                for(int i =0;i<myString.length();i++){
                    if(myString.charAt(i) == '+'||myString.charAt(i) == '-'){                       //将加减添加到后缀表达式
                        if(list.isEmpty()){
                            list.add(myString.charAt(i));
                        }else {
                            while (!list.isEmpty()) {
                                if(!(suffixExpression.charAt(suffixExpression.length()-1) == ' '))
                                    suffixExpression += " ";
                                suffixExpression += list.get(list.size() - 1);
                                suffixExpression += " ";
                                list.remove(list.size() - 1);
                            }
                            list.add(myString.charAt(i));
                        }
                    }else if(myString.charAt(i) == '*'||myString.charAt(i) == '/'){                 //将乘除添加到后缀表达式
                        if(list.isEmpty()){
                            list.add(myString.charAt(i));
                        }else if(list.get(list.size() - 1) == '*'
                                ||list.get(list.size() - 1) == '/') {
                            do {
                                if(!(suffixExpression.charAt(suffixExpression.length()-1) == ' '))
                                    suffixExpression += " ";
                                suffixExpression += list.get(list.size() - 1);
                                suffixExpression += " ";
                                list.remove(list.size() - 1);
                                if(list.isEmpty())
                                    break;
                            }while (list.get(list.size() - 1) == '+'
                                    ||list.get(list.size() - 1) == '-');
                            list.add(myString.charAt(i));
                        }
                        else {
                            list.add(myString.charAt(i));
                        }
                    }else {                                                                         //将数字添加到后缀表达式
                        suffixExpression += myString.charAt(i);
                        if(i+1<myString.length() && !(myString.charAt(i+1) == '.')
                                && !(myString.charAt(i+1)>=48 && myString.charAt(i+1)<=57))
                            suffixExpression += " ";
                    }
                }
                while(!list.isEmpty()){                                                             //所有符号出栈
                    if(!(suffixExpression.charAt(suffixExpression.length()-1) == ' '))
                        suffixExpression += " ";
                    suffixExpression += list.get(list.size() - 1);
                    list.remove(list.size() - 1);
                }
                System.out.println("000000");
                System.out.println(suffixExpression);
                for(int i = 0;i<suffixExpression.length();i++){
                    if(suffixExpression.charAt(i) == '+') {
                        int j = i-2;
                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第一个空格
                            j--;
                            if(j == 0)
                                break;
                        }
                        if(j == 0){
                            result = Double.parseDouble(suffixExpression.substring(j,i-1));         //当输入不完整时   ??? +
                            suffixExpression = String.valueOf(result);
                            break;
                        }else
                            num1 = Double.parseDouble(suffixExpression.substring(j + 1, i - 1));    //获取第一个数
                        System.out.println(num1);
                        int n = j;  j--;                                                            //标记第一个空格的位置

                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第二个空格
                            if(j == 0)
                                break;
                            else
                                j--;
                        }
                        if(j == 0) {                                                                //运算结束
                            result = Double.parseDouble(suffixExpression.substring(j,n));
                            System.out.println(result);
                            result = result + num1;
                            System.out.println(result);
                            if(i == suffixExpression.length()-1) {
                                suffixExpression = suffixExpression.replace(suffixExpression.substring(j), String.valueOf(result));
                                System.out.println(suffixExpression);
                                break;
                            }
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j,i+1), String.valueOf(result));
                        }else{
                            result = Double.parseDouble(suffixExpression.substring(j+1,n));         //寻找第二个数
                            result += num1;
                            System.out.println(result);
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j+1,i+1), String.valueOf(result));
                            System.out.println(suffixExpression);
                        }
                        System.out.println(suffixExpression);
                        i = 0;
                    }
                    if(suffixExpression.charAt(i) == '-') {
                        int j = i-2;
                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第一个空格
                            j--;
                            if(j == 0)
                                break;
                        }
                        if(j == 0){
                            result = Double.parseDouble(suffixExpression.substring(j,i-1));         //当输入不完整时   ??? +
                            suffixExpression = String.valueOf(result);
                            break;
                        }else
                            num1 = Double.parseDouble(suffixExpression.substring(j + 1, i - 1));    //获取第一个数

                        int n = j;  j--;                                                            //标记第一个空格的位置

                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第二个空格
                            if(j == 0)
                                break;
                            else
                                j--;
                        }
                        if(j == 0) {                                                                //运算结束
                            result = Double.parseDouble(suffixExpression.substring(j,n));
                            result -= num1;
                            if(i == suffixExpression.length()-1) {
                                suffixExpression = suffixExpression.replace(suffixExpression.substring(j), String.valueOf(result));
                                break;
                            }
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j,i+1), String.valueOf(result));
                        }else{
                            result = Double.parseDouble(suffixExpression.substring(j+1,n));         //寻找第二个数
                            result -= num1;
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j+1,i+1), String.valueOf(result));
                        }
                        i = 0;
                    }
                    if(suffixExpression.charAt(i) == '*') {
                        int j = i-2;
                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第一个空格
                            j--;
                            if(j == 0)
                                break;
                        }
                        if(j == 0){
                            result = Double.parseDouble(suffixExpression.substring(j,i-1));         //当输入不完整时   ??? +
                            suffixExpression = String.valueOf(result);
                            break;
                        }else
                            num1 = Double.parseDouble(suffixExpression.substring(j + 1, i - 1));    //获取第一个数
                        System.out.println(num1);
                        int n = j;  j--;                                                            //标记第一个空格的位置

                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第二个空格
                            if(j == 0)
                                break;
                            else
                                j--;
                        }
                        if(j == 0) {                                                                //运算结束
                            result = Double.parseDouble(suffixExpression.substring(j,n));
                            result *= num1;
                            if(i == suffixExpression.length()-1) {
                                suffixExpression = suffixExpression.replace(suffixExpression.substring(j), String.valueOf(result));
                                break;
                            }
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j,i+1), String.valueOf(result));
                        }else{
                            result = Double.parseDouble(suffixExpression.substring(j+1,n));         //寻找第二个数
                            result *= num1;
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j+1,i+1), String.valueOf(result));
                        }
                        System.out.println(result);
                        System.out.println(suffixExpression);
                        System.out.println(suffixExpression);
                        i = 0;
                    }
                    if(suffixExpression.charAt(i) == '/') {
                        int j = i-2;
                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第一个空格
                            j--;
                            if(j == 0)
                                break;
                        }
                        if(j == 0){
                            result = Double.parseDouble(suffixExpression.substring(j,i-1));         //当输入不完整时   ??? +
                            suffixExpression = String.valueOf(result);
                            break;
                        }else{
                            num1 = Double.parseDouble(suffixExpression.substring(j + 1, i - 1));    //获取第一个数
                            if(num1 == 0){
                                resultExpression.setText("Error");
                                return ;
                            }
                        }

                        int n = j;  j--;                                                            //标记第一个空格的位置

                        while(suffixExpression.charAt(j) != ' '){                                   //寻找第二个空格
                            if(j == 0)
                                break;
                            else
                                j--;
                        }
                        if(j == 0) {                                                                //运算结束
                            result = Double.parseDouble(suffixExpression.substring(j,n));
                            result /= num1;
                            if(i == suffixExpression.length()-1) {
                                suffixExpression = suffixExpression.replace(suffixExpression.substring(j), String.valueOf(result));
                                break;
                            }
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j,i+1), String.valueOf(result));
                        }else{
                            result = Double.parseDouble(suffixExpression.substring(j+1,n));         //寻找第二个数
                            result /= num1;
                            suffixExpression = suffixExpression.replace(suffixExpression.substring(j+1,i+1), String.valueOf(result));
                        }
                        i = 0;
                    }
                }
                resultExpression.setText(suffixExpression);
                suffixExpression = "";
                i = 0;
                a = 0;
            }
        }
    }
}