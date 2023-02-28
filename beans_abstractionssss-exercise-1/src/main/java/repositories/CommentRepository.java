package repositories;

import models.Comment;

public interface CommentRepository {
	
	public void storeComment(Comment comment);
}
