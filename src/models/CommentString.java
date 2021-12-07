package models;

import java.util.ArrayList;
import java.util.List;

public class CommentString {

    List<CommentString> comment= new ArrayList<CommentString>();

    public void attach(CommentString comment){
        this.comment.add(comment);
    }

    public void setCommentString(String commentString, int index) {
        this.comment = commentString;
    }

    public List<CommentString> getCommentString(){
        return comment;
    }

    public void removeCommentString(int index){
    }

    public void respondComment(String respond, int index){
        //this is where the program would add the response to the comment at the given index

    }
}