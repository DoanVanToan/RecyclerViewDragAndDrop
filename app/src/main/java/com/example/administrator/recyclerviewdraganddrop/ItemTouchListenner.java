package com.example.administrator.recyclerviewdraganddrop;

public interface ItemTouchListenner {
    void onMove(int oldPosition, int newPosition);

    void swipe(int position, int direction);
}
