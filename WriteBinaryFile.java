import java.io.*;

public class WriteBinaryFile 
{
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fstream = new FileOutputStream("myfile002.dat");
        DataOutputStream outputfile = new DataOutputStream(fstream);

        int[] a = {1, 2, 3, 4};

        for (int i = 0; i < a.length; i++) 
        {
            outputfile.writeInt(a[i]);
        }

        outputfile.writeInt(0);
        outputfile.close();
    }
}
