import java.io.*; 
 class CopyDataFiletoFile  
 { 
              public static void main(String args[])throws IOException 
         { 
               FileInputStream Fread =new FileInputStream("Hello.txt"); 
               FileOutputStream Fwrite=new FileOutputStream("Hello1.txt") ; 
               System.out.println("File is Copied"); 
               int c; 
               while((c=Fread.read())!=-1) 
               Fwrite.write((char)c); 
               Fread.close(); 
               Fwrite.close(); 
          } 
 } 
  