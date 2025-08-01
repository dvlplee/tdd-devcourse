package com.chacha;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Rq {
    private final String cmd;
    private final Map<String, String> params;

    public Rq(String cmd) {
        this.cmd = cmd;
        // 등록?이름=홍길동&고향=남원&성별=남성
        String queryString = cmd.split("\\?", 2)[1];

        params = Arrays.stream(queryString.split("&"))
                .map(e -> e.split("=", 2))
                .collect(Collectors.toMap(e -> e[0], e -> e[1]));
    }

    public String getActionName() {
        // 수정?id=1
        // 삭제?id=1
        String[] cmdBits = cmd.split("\\?");
        return cmdBits[0];
    }

    // 등록?이름=홍길동&고향=남원&고향=남원&고향=남원
    public String getParam(String name, String defaultValue) {
        return params.getOrDefault(name, defaultValue);
    }
}
