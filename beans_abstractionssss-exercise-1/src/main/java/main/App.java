package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ProjectConfig;
import models.Comment;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import service.CommentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    	
    	
    	Comment comment = new Comment();
    	comment.setAuthor("patrick");
    	comment.setText("nor de post");
    		
    	CommentRepository repo = context.getBean(DBCommentRepository.class);
    	System.out.println(repo);
//    	CommentService commentService = context.getBean(CommentService.class);
    	
//    	commentService.publishComment(comment);
    	
    }
}
