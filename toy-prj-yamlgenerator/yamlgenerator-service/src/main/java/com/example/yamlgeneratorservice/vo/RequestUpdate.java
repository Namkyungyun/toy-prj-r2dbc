package com.example.yamlgeneratorservice.vo;

import lombok.Data;


@Data
public class RequestUpdate {
    private String prefilter_name;
    private String name;
    private String args;
    private String baseMessage;
    private String preLogger;
    private String postLogger;
}