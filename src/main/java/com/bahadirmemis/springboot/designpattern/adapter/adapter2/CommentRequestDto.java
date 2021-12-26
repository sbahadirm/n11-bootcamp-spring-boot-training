package com.bahadirmemis.springboot.designpattern.adapter.adapter2;

public class CommentRequestDto {

    private String comment;
    private Long userId;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
