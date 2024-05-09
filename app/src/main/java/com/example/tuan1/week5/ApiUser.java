package com.example.tuan1.week5;
import java.util.List;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
public interface ApiUser {
    @GET("all-user")
    Observable<List<User>> getAllUser();
}
