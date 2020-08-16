package com.ma.home;


public class UserInput {

    public static class TextInput {

        protected StringBuilder textInput;

        public TextInput(){
            textInput = new StringBuilder();
        }

        public void add(char ch) {
            textInput.append(ch);
        }

        public String getValue() {
            return  textInput.toString();
        }
    }


    public static class NumericInput extends TextInput{

        public void add(char ch) {
            if(!Character.isAlphabetic(ch)){
                textInput.append(ch);
            }
        }

        public String getValue() {
            return  textInput.toString();
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}
