package org.owi.htmltopdf;

import com.lowagie.text.DocumentException;
import org.xhtmlrenderer.pdf.ITextRenderer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Nicolae
 */
public class PDFCreator {

    public void create(final File htmlFile, final File pdfFile) {
        try {
            final ITextRenderer iTextRenderer;
            iTextRenderer = new ITextRenderer();

            iTextRenderer.setDocument(htmlFile);
            iTextRenderer.layout();

            final FileOutputStream fileOutputStream =
                    new FileOutputStream( pdfFile );

            iTextRenderer.createPDF(fileOutputStream);
            fileOutputStream.close();

        } catch (final DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
