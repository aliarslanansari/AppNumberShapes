package com.ali.appnumbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String message;
    class Number{
        int number;
        public boolean isSquare(){
            double squareRoot = Math.sqrt(number);
            if(squareRoot==Math.floor(squareRoot)){
                return true;
            }else{
                return false;
            }
        }

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber = triangularNumber + x;
            }
            if(triangularNumber == number){
                return true;
            }
            else{
                return false;
            }
        }

    }

    public void numberShapeCheck(View view){
        EditText inputNumber = findViewById(R.id.inputNumber);
        TextView displayResult = findViewById(R.id.resultTextView);
        Number myNumber = new Number();
        myNumber.number=Integer.parseInt(inputNumber.getText().toString());
        if(myNumber.isSquare()){
            if(myNumber.isTriangular()){
                message="Number both, square and triangular";
            }
            else
            {
                message="Number square but not triangular";
            }
        }
        else{
            if(myNumber.isTriangular()){
                message="Number not a square but is a triangular";
            }
            else
            {
                message="Number neither a square nor a triangular";
            }
        }
        displayResult.setText(message);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}