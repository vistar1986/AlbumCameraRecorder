package com.zhongjh.albumcamerarecorder.camera.entity;

import android.net.Uri;

import java.io.File;


/**
 * 拍照制造出来的数据源
 *
 * @author zhongjh
 */
public class BitmapData {

    /**
     * 临时id
     */
    private Long temporaryId;
    private String path;
    private Uri uri;
    private int width;
    private int height;

    public BitmapData(Long temporaryId, String path, Uri uri, int width, int height) {
        this.temporaryId = temporaryId;
        this.path = path;
        this.uri = uri;
        this.width = width;
        this.height = height;
    }

    public Long getTemporaryId() {
        return temporaryId;
    }

    public void setTemporaryId(Long temporaryId) {
        this.temporaryId = temporaryId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


}
