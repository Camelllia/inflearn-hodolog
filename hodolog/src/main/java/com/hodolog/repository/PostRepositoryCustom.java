package com.hodolog.repository;

import com.hodolog.domain.Post;
import com.hodolog.request.PostSearch;

import java.util.List;

public interface PostRepositoryCustom {

    List<Post> getList(PostSearch postSearch);
}
