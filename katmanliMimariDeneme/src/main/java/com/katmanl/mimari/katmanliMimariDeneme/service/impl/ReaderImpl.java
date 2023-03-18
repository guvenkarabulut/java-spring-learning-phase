package com.katmanl.mimari.katmanliMimariDeneme.service.impl;

import com.katmanl.mimari.katmanliMimariDeneme.service.Reader;
import org.springframework.stereotype.Component;

@Component
public class ReaderImpl implements Reader {

    @Override
    public String readFile() {
        return "EXCEL File";
    }
}
