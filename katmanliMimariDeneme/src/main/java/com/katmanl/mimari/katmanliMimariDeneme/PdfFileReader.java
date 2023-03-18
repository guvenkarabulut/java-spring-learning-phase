package com.katmanl.mimari.katmanliMimariDeneme;

import com.katmanl.mimari.katmanliMimariDeneme.service.Reader;
import org.springframework.stereotype.Component;

@Component
public class PdfFileReader implements Reader {
    @Override
    public String readFile() {
        return "PDF File";
    }
}
