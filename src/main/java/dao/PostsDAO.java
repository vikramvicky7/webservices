package dao;

	import java.util.List;

	import model.Posts;
import model.Status;


public interface PostsDAO {

	List<Posts> getPosts();

	Posts addPost(Posts post);

	Status updatePost(Posts post);

	Status deletePost(Posts post);
	
	List<Posts> searchPost(Posts post);

}
