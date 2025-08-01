package com.chacha;

public class Rq {
    private final String cmd;

    public Rq(String cmd) {
        this.cmd = cmd;
    }
    public String getActionName() {
        // 수정?id=1
        // 삭제?id=1
        String[] cmdBits = cmd.split("\\?");
        return cmdBits[0];
    }
    // 등록?이름=홍길동&고향=남원&고향=남원&고향=남원
    public String getParam(String name, String defaultValue) {
        String queryString = cmd.split("\\?", 2)[1];

        String[] queryStringBits = queryString.split("&");
        for (String paramStr : queryStringBits) {
            String[] paramsBits = paramStr.split("=", 2);
            String paramName = paramsBits[0];
            String paramValue = paramsBits[1];

            if(name.equals(paramName)) return paramValue;
        }
        return defaultValue;
    }
}
