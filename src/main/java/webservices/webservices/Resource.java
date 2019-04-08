package webservices.webservices;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Posts;
import model.Status;

import dao.PostsDAOImpl;

@Path("postbook")
public class Resource {

	PostsDAOImpl impl = new PostsDAOImpl();

	@Path("posts/all")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Posts> getPosts() {
		return impl.getPosts();
	}

	@Path("posts/add")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Posts addPost(Posts post) {
		return impl.addPost(post);
	}

	@Path("posts/edit")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Status editPost(Posts post) {
		return impl.updatePost(post);
	}

	@Path("posts/delete/{id}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Status deletePost(@PathParam("id") int id) {
		return impl.deletePost(new Posts(id, "", ""));
	}

	@Path("search/{title}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Posts> searchPost(@PathParam("title") String title) {
		return impl.searchPost(new Posts(0, title, ""));
	}

}
