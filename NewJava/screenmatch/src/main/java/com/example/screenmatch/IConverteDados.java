package com.example.screenmatch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public interface IConverteDados  {
    <T>T obterDados(String json, Class<T> classe);
}
