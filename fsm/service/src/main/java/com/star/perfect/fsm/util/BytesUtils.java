package com.star.perfect.fsm.util;

import java.io.*;

/**
 * Created by  伍运星  on   2016/1/22.
 */

public class BytesUtils {
    public static void byteToFile(byte[] bytes,String filepath) throws IOException {
        File file = new File(filepath);
        OutputStream outputStream = new FileOutputStream(file);
        outputStream.write(bytes);
        outputStream.flush();
        outputStream.close();
    }
}
