package utility;

import net.sourceforge.tess4j.*;
import java.io.*;
public class ImageTextExtract {
    public String getImgText(String imageLocation) {
        Tesseract tesseract = new Tesseract();
        try
        {
//            get tessdata from https://github.com/tesseract-ocr/tessdata dowload and extract the folder and rename as tessdata.
            tesseract.setDatapath(new File("drivers/tessdata/").getAbsolutePath());
            String imgText = tesseract.doOCR(new File(imageLocation));
            return imgText;
        }
        catch (TesseractException e)
        {
            e.getMessage();
            return "Error while reading image";
        }
    }
    public static void main ( String[] args)
    {
        ImageTextExtract textExtract = new ImageTextExtract();
        System.out.println(textExtract.getImgText(new File("inputFiles/imageList1.png").getAbsolutePath()));
    }
}
