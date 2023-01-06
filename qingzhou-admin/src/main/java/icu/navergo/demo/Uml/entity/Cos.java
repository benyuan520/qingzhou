package icu.navergo.demo.Uml.entity;

import lombok.Data;

@Data
public class Cos {
    private String tmpSecretId;
    private String tmpSecretKey;
    private String sessionToken;
    private Long startTime;
    private Long expiredTime;

}
