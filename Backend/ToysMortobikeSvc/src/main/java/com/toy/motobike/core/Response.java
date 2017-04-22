package com.toy.motobike.core;

/**
 *
 * @author LAP11292-local
 */
public class Response {
    private final int code;
    private String data;

    public Response(int code) {
        this.code = code;
    }

    public Response(int code, String data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
                .append("{\"code\":").append(code);
        if (null == data || "".equals(data)) {
            return sb.append("}").toString();
        }
        return sb.append(", \"data\": \"").append(data).append("\"}").toString();
    }
}
