package org.owi.htmltopdf;

import java.io.File;

/**
 * @author Nicolae
 */
public class Main {

    public static void main(String[] args) {
        if ( args.length != 2 ) {
            System.err.println("Usage ERROR ! Please provide 2 parameters !");
            System.exit(1);
        }

        File htmlFile = new File(args[0]);
        File pdfFile = new File(args[1]);

        /**
         * Convert to PDF
         */
        PDFCreator pdfCreator = new PDFCreator();
        pdfCreator.create(htmlFile, pdfFile);
    }
}
