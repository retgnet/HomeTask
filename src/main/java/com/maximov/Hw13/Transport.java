package com.maximov.Hw13;

public interface Transport {
    String getType();

    void move(int distance, Terrain terrain);
}
