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

    public String getParam(String name, String defaultValue) {
        String queryString = cmd.split("\\?", 2)[1];
        String[] paramsBits = queryString.split("=", 2);
        String paramName = paramsBits[0];
        String paramValue = paramsBits[1];

        if(!name.equals(paramName)) return defaultValue;

        return paramValue;
    }
}
