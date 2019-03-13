package com.ljs.factory.factory1;

import java.io.*;
import java.nio.Buffer;

//创建Reader对象的工厂
public class ReaderFactory {
    public static Reader getReader() throws FileNotFoundException{
        BufferedReader reader = new BufferedReader(new FileReader(new File("aa.txt")));
        return reader;
    }

}
