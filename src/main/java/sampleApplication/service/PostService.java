package sampleApplication.service;

import org.springframework.stereotype.Service;
import sampleApplication.model.Post;
import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {
    public ArrayList<Post> getAllPosts() {

        ArrayList<Post> aList = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("First Post ");
        post1.setBody("Details of First post ");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Second Post ");
        post2.setBody("Details of Second post ");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Third Post ");
        post3.setBody("Details of Third post ");
        post3.setDate(new Date());

        aList.add(post1);
        aList.add(post2);
        aList.add(post3);

        return aList;
    }
}
