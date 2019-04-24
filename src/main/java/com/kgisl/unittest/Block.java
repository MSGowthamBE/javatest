package com.kgisl.unittest;

public class Block {
   {
       System.out.println("Normal block");
   }
   static {
       System.out.println("Static block");
   }

   public Block() {
       System.out.println("Constructor");
   }
   public static void main(String[] args) {
       new Block();
   }
}