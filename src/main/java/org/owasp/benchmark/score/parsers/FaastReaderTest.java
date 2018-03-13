package org.owasp.benchmark.score.parsers;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class FaastReaderTest {

    @Test
    public void parse() {
        FaastReader fr  = new FaastReader();
        try {
            fr.parse(new File("C:\\Users\\cx02075\\Desktop\\workspace\\result.json"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}