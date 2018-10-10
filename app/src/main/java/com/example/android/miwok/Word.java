package com.example.android.miwok;

/**
 * Created by yashwant on 6/10/18.
 */

class Word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mMiwok_translation;
    private String mDefault_translation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    Word(String miwokTranslation, String defaultTranslation) {
        mMiwok_translation = miwokTranslation;
        mDefault_translation = defaultTranslation;
    }

    Word(String miwokTranslation, String defaultTranslation, int imageResourceId) {
        mMiwok_translation = miwokTranslation;
        mDefault_translation = defaultTranslation;
        mImageResourceId = imageResourceId;
    }

    String getDefaultTranslation() {
        return mDefault_translation;
    }

    String getmiwokTranslation() {
        return mMiwok_translation;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }

    boolean hasImage() {
        return (mImageResourceId != NO_IMAGE_PROVIDED);
    }
}
