package com.vencent.services;

import com.vencent.pojo.Whisper;

import java.util.List;

public interface WhisperService {

    List<Whisper> findById(int id);
}
