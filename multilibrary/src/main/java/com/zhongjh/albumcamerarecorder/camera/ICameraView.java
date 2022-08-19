package com.zhongjh.albumcamerarecorder.camera;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.otaliastudios.cameraview.CameraView;
import com.zhongjh.albumcamerarecorder.camera.widget.PhotoVideoLayout;
import com.zhongjh.albumcamerarecorder.widget.ImageViewTouch;
import com.zhongjh.albumcamerarecorder.widget.childclickable.IChildClickableLayout;

/**
 * 录制界面规定view的设置
 *
 * @author zhongjh
 * @date 2022/8/19
 */
public interface ICameraView {

    /**
     * 设置ChildClickableLayout
     *
     * @return 返回ChildClickableLayout，主要用于控制整个屏幕是否接受触摸事件
     */
    @NonNull
    public abstract IChildClickableLayout getChildClickableLayout();

    /**
     * 设置CameraView
     *
     * @return 返回CameraView，主要用于拍摄、录制，里面包含水印
     */
    @NonNull
    public abstract CameraView getCameraView();

    /**
     * 当想使用自带的多图显示控件，请设置它
     *
     * @return 返回多图的Recycler显示控件
     */
    @Nullable
    public abstract RecyclerView getRecyclerViewPhoto();

    /**
     * 修饰多图控件的View，只有第一次初始化有效
     * 一般用于群体隐藏和显示
     * 你也可以重写[hideViewByMultipleZero]方法自行隐藏显示相关view
     *
     * @return View[]
     */
    @Nullable
    public abstract View[] getMultiplePhotoView();

    /**
     * 当想使用自带的功能按钮（包括拍摄、录制、录音、确认、取消），请设置它
     *
     * @return PhotoVideoLayout
     */
    @NonNull
    public abstract PhotoVideoLayout getPhotoVideoLayout();

    /**
     * 单图控件的View
     *
     * @return ImageViewTouch
     */
    public abstract ImageViewTouch getSinglePhotoView();

    /**
     * 左上角的关闭控件
     *
     * @return View
     */
    @Nullable
    public abstract View getCloseView();

    /**
     * 右上角的闪光灯控件
     *
     * @return View
     */
    @Nullable
    public abstract ImageView getFlashView();

    /**
     * 右上角的切换前置/后置摄像控件
     *
     * @return View
     */
    @Nullable
    public abstract ImageView getSwitchView();

}
