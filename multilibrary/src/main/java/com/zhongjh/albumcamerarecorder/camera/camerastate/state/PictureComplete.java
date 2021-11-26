package com.zhongjh.albumcamerarecorder.camera.camerastate.state;

import android.view.View;

import com.zhongjh.albumcamerarecorder.camera.CameraLayout;
import com.zhongjh.albumcamerarecorder.camera.camerastate.CameraStateManagement;
import com.zhongjh.albumcamerarecorder.camera.camerastate.StateMode;
import com.zhongjh.albumcamerarecorder.camera.util.FileUtil;

import static android.view.View.INVISIBLE;

/**
 * 单图完成状态的相关处理
 *
 * @author zhongjh
 * @date 2021/11/26
 */
public class PictureComplete extends StateMode {

    /**
     * @param cameraLayout          主要是多个状态围绕着cameraLayout进行相关处理
     * @param cameraStateManagement 可以让状态更改别的状态
     */
    public PictureComplete(CameraLayout cameraLayout, CameraStateManagement cameraStateManagement) {
        super(cameraLayout, cameraStateManagement);
    }

    @Override
    public void resetState() {
        // 重新启用cameraView
        if (!getCameraLayout().mViewHolder.cameraView.isOpened()) {
            getCameraLayout().mViewHolder.cameraView.open();
        }

        // 隐藏图片view
        getCameraLayout().mViewHolder.imgPhoto.setVisibility(INVISIBLE);
        getCameraLayout().mViewHolder.flShow.setVisibility(INVISIBLE);

        // 删除图片
        if (getCameraLayout().mPhotoFile != null) {
            FileUtil.deleteFile(getCameraLayout().mPhotoFile);
        }

        getCameraLayout().mViewHolder.pvLayout.getViewHolder().btnClickOrLong.setVisibility(View.VISIBLE);

        // 恢复预览状态
        getCameraStateManagement().setState(getCameraStateManagement().getPreview());
    }
}
