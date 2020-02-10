/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_practicals;

/**
 *
 * @author user1
 */
import java.util.Scanner;
class complex_number{
    int real;
    int imag;
    complex_number(int real,int imag){
         this.real = real;
         this.imag = imag;
    }
    complex_number(){
        this.real = 0;
        this.imag = 0;
    }
    complex_number add(complex_number obj){
        complex_number temp = new complex_number();
        temp.real = this.real + obj.real;
        temp.imag = this.imag + obj.imag;
        return temp;
    }
    complex_number multiply(complex_number obj){
        complex_number temp = new complex_number();
        temp.real = this.real*obj.real - this.imag*obj.imag;
        temp.imag = this.real*obj.imag + this.imag*obj.real;
        return temp;
    }
    public String toString(){
        String s;
        if(this.imag < 0){
            s = real +""+ imag + "i";
        }else{
            s = real + "+" + imag + "i" ;
        }
        return  s;
    }
}
public class complex {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int real1,imag1,real2,imag2;
           
           System.out.println("enter the real and imaginary values of c1");
           System.out.print("Real : ");
           real1 = sc.nextInt();
           System.out.print("Imaginary : ");
           imag1 = sc.nextInt();
           complex_number c1 = new complex_number(real1,imag1);
           System.out.println("enter the real and imaginary values of c2");
           System.out.print("Real : ");
           real2 = sc.nextInt();
           System.out.print("Imaginary : ");
           imag2 = sc.nextInt();
           complex_number c2 = new complex_number(real2,imag2);
           complex_number sum = new complex_number();
           complex_number mul = new complex_number();
           sum = c1.add(c2);
           mul = c1.multiply(c2);
           
           System.out.println("\nc1 : " + c1);
           System.out.println("c2 : " + c2);
           System.out.println("c1 + c2  : " + sum);
           System.out.println("c1 * c2  : " + mul );
           
    }
}
