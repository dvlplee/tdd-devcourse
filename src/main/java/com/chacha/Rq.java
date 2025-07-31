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
}
