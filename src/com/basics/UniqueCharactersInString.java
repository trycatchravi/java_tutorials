package com.basics;

public class UniqueCharactersInString {

    public static boolean findIfStringHasUniqueCharacters(String string) {

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (string.indexOf(ch) != string.lastIndexOf(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean unique= findIfStringHasUniqueCharacters("narender");
        System.out.println("narender has all unique character : "+ unique);

        unique=findIfStringHasUniqueCharacters("index");
        System.out.println("index has all unique character : "+ unique);

        unique=findIfStringHasUniqueCharacters("apple");
        System.out.println("apple has all unique character : "+ unique);

        unique=findIfStringHasUniqueCharacters("world");
        System.out.println("world has all unique character : "+ unique);
    }

}
