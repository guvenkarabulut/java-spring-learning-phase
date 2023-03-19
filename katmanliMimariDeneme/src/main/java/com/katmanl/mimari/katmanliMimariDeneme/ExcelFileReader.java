package com.katmanl.mimari.katmanliMimariDeneme;

import com.katmanl.mimari.katmanliMimariDeneme.service.Reader;
import org.springframework.stereotype.Component;

@Component("EXCEL")
public class ExcelFileReader implements Reader {
    @Override
    public String readFile() {
        return "Excel file";
    }
}
