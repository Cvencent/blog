package com.vencent.services;

import com.vencent.pojo.Album;

import java.util.List;

public interface AlbumService {

    List<Album> albums(int id);
}
