package com.itextpdf.basics.image;

import com.itextpdf.basics.PdfException;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class JpegTest {

    static final public String sourceFolder = "./src/test/resources/com/itextpdf/basics/image/";

    @Test
    public void openJpeg1() throws IOException, PdfException {
        Image img = Image.getInstance(sourceFolder + "WP_20140410_001.jpg");
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }

    @Test
    public void openJpeg2() throws IOException, PdfException {
        Image img = Image.getInstance(sourceFolder + "WP_20140410_001_gray.jpg");
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }

    @Test
    public void openJpeg3() throws IOException, PdfException {
        Image img = Image.getInstance(sourceFolder + "WP_20140410_001_monochrome.jpg");
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }

    @Test
    public void openJpeg4() throws IOException, PdfException {
        Image img = Image.getInstance(sourceFolder + "WP_20140410_001_negate.jpg");
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }

    @Test
    public void openJpeg5() throws IOException, PdfException {
        Image img = Image.getInstance(sourceFolder + "WP_20140410_001_year1900.jpg");
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }

    @Test
    public void openJpeg6() throws IOException, PdfException {
        Image img = Image.getInstance(sourceFolder + "WP_20140410_001_year1980.jpg");
        Assert.assertEquals(2592, img.getWidth(), 0);
        Assert.assertEquals(1456, img.getHeight(), 0);
        Assert.assertEquals(8, img.getBpc());
    }





}
