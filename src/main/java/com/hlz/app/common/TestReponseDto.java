package com.hlz.app.common;


import java.util.List;

public class TestReponseDto extends ReponseDto {

    private List<?> title;

    public List<?> getTitle2() {
        return title2;
    }

    public void setTitle2(List<?> title2) {
        this.title2 = title2;
    }

    private List<?> title2;
    public List<?> getTitle() {
        return title;
    }

    public void setTitle(List<?> title) {
        this.title = title;
    }
}
