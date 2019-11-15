package com.czzt1.blog.mapper;

import com.czzt1.blog.pojo.Article;
import com.czzt1.blog.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author czzt1
 * @Date 2019-06-19- 17:53
 */
public interface ArticleMapper {
    Article select(@Param(value = "id") int id);

    List<Article> getListByLable(int articleType);

    List<String> getArticleLabel(String id);

    List<Comment> getCommentById(int id);

    List<Article> getListByHeat();

    int countArticle();
}
