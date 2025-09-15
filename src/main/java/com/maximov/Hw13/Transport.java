package com.maximov.Hw13;

public interface Transport {
    String getType();

    boolean move(int distance, Terrain terrain);
}
