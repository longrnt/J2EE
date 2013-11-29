package TestCode;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ObjectSerializationExample{
    public static void main(String args[]){
        try{
            Object object = new javax.swing.JButton("Submit");
           
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.dat"));
            out.writeObject(object);
            out.close();
           
            // Serialize to a byte array
            ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
            out = new ObjectOutputStream(bos) ;
            out.writeObject(object);
            out.close();
           
            // Get the bytes of the serialized object
            byte[] buf = bos.toByteArray();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
