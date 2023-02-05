package com.geektcp.common.dist;

import com.geektcp.common.core.system.Sys;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BuildTest {

    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        String command = "cd /code/java/thy-core && mvn package";
//        String command = "ech1o 111111";
        Sys.p("command: " + command);

        try {
            Process process = Runtime.getRuntime().exec(command);
            InputStream info = process.getInputStream();
            BufferedReader infoBufferedReader = new BufferedReader(new InputStreamReader(info));
            while (infoBufferedReader.ready()) {
                System.out.println("info: " + infoBufferedReader.readLine());
            }

            InputStream err = process.getErrorStream();
            BufferedReader errBufferedReader = new BufferedReader(new InputStreamReader(err));
            while (errBufferedReader.ready()) {
                System.err.println("err: " + errBufferedReader.readLine());
            }
            process.waitFor();
        } catch (Exception e) {
            Sys.p(e.getMessage());
        }
    }

    public static void execute2() {
        String command = "cd /code/java/thy-core && mvn package";
//        String command = "ech1o 111111";
        Sys.p("command: " + command);

        try {
            ProcessBuilder pb = new ProcessBuilder();
            pb.start();

        } catch (Exception e) {
            Sys.p(e.getMessage());
        }
    }
}
