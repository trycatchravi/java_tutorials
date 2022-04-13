package com.basics;

public class UniqueCharactersInString {

    public static boolean findIfStringHasUniqueCharacters(String s) {
        // write the logic here
        return true;
    }

    public static void main(String[] args) {
       boolean unique = findIfStringHasUniqueCharacters("absbabd");
       System.out.println(unique); // false

        unique = findIfStringHasUniqueCharacters("abcdef");
        System.out.println(unique); // true
    }

}
