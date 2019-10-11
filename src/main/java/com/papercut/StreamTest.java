package com.papercut;
import org.apache.commons.lang3.StringUtils;
public class StreamTest {
    public static void main(String[] args) {
        String[] flags = {"heloworld","adsfsaf","permanently-redact-user-data","sad"};
        boolean redactUserData = java.util.Arrays.stream(flags).filter(f -> StringUtils.equalsIgnoreCase(f,"permanently-redact-user-data")).toArray(String[]::new).length != 0;
        if (redactUserData) {
            System.out.println("contains redactuserdata");
        } else {
            System.out.println("does not contain redactuserdata");
        }
        System.out.println("heloworld");
    }
}
