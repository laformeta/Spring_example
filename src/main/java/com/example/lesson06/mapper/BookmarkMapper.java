package com.example.lesson06.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookmarkMapper {

	public void insertBookmark(String name, String url);
}
