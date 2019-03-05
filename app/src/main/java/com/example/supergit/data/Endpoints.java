package com.example.supergit.data;

import com.example.supergit.data.models.GithubUser;
import com.example.supergit.data.models.RepsModel;

import java.util.List;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Endpoints {

    @GET("/users/{user}")
    Observable<GithubUser> getUser(
            @Path("user") String user
    );

    @GET("/repositories")
    Flowable<List<RepsModel>> getRepos();
}
