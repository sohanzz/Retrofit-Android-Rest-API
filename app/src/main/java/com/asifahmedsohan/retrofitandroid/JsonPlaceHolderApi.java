package com.asifahmedsohan.retrofitandroid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by sohan on 06,October,2019
 */
public interface JsonPlaceHolderApi {

    @GET("posts")
    Call<List<Post>> getPost(@Query("userId") int userId);

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
