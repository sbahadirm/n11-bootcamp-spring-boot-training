package com.bahadirmemis.springboot.designpattern.adapter.adapter2;

public class Controller {

    private CommentEntityService commentEntityService;

    public void save(CommentRequestDto commentRequestDto){

        Comment comment = convertToComment(commentRequestDto);

        commentEntityService.save(comment);
    }

    private Comment convertToComment(CommentRequestDto commentRequestDto) {

        Comment comment = new Comment();
        comment.setComment(commentRequestDto.getComment());
        comment.setUserId(commentRequestDto.getUserId());

        return comment;
    }
}
