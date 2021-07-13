package com.example.geekbrainshomework;

import android.os.Parcel;
import android.os.Parcelable;

import java.text.DecimalFormat;

public class Calculator implements Parcelable {
    private String display;
    private String value;
    private String todo;
    private Double firstNumber;
    private Double secondNumber;
    private Double response;

    public Calculator() {
        display = "";
        value = "";
        todo = "";
        firstNumber = 0.0;
        secondNumber = 0.0;
        response = 0.0;
    }

    protected Calculator(Parcel in) {
        value = in.readString();
        todo = in.readString();
        if (in.readByte() == 0) {
            firstNumber = null;
        } else {
            firstNumber = in.readDouble();
        }
        if (in.readByte() == 0) {
            secondNumber = null;
        } else {
            secondNumber = in.readDouble();
        }
        if (in.readByte() == 0) {
            response = null;
        } else {
            response = in.readDouble();
        }
    }

    public static final Creator<Calculator> CREATOR = new Creator<Calculator>() {
        @Override
        public Calculator createFromParcel(Parcel in) {
            return new Calculator(in);
        }

        @Override
        public Calculator[] newArray(int size) {
            return new Calculator[size];
        }
    };

    public void doValue(String a) {
        value += a;
    }

    public void doDisplayValue(String a) {
        display += a;
    }

    public void doFirstNumber() {
        try {
            firstNumber = Double.parseDouble(value);
        } catch (NumberFormatException ex) {
            todo = value;
        }
    }

    public void doSecondNumber() {
        try {
            secondNumber = Double.parseDouble(value);
        } catch (NumberFormatException ex) {
            todo = value;
        }
    }

    public void doCalculate() {
        try {
            switch (todo) {
                case "/":
                    response = firstNumber / secondNumber;
                    break;
                case "*":
                    response = firstNumber * secondNumber;
                    break;
                case "-":
                    response = firstNumber - secondNumber;
                    break;
                case "+":
                    response = firstNumber + secondNumber;
                    break;
            }
        } catch (ArithmeticException ex) {
            firstNumber = 0.0;
            secondNumber = 0.0;
            value = "ERROR";
        }
    }

    public void doPrepareDisplayValue() {
        DecimalFormat format = new DecimalFormat("0.#########");
        display = format.format(response);
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String getValue() {
        return value;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public void setResponse(Double response) {
        this.response = response;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(value);
        dest.writeString(todo);
        if (firstNumber == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(firstNumber);
        }
        if (secondNumber == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(secondNumber);
        }
        if (response == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeDouble(response);
        }
    }
}
