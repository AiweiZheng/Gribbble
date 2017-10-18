package com.zheng.project.android.dribbble.bucket_list;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.zheng.project.android.dribbble.R;
import com.zheng.project.android.dribbble.base.BaseViewHolder;

import butterknife.BindView;

public class BucketViewHolder extends BaseViewHolder{

    @BindView(R.id.bucket_layout) View bucketLayout;
    @BindView(R.id.bucket_name) TextView bucketName;
    @BindView(R.id.bucket_shot_count) TextView bucketShotCount;
    @BindView(R.id.bucket_shot_chosen) ImageView bucketChosen;

    public BucketViewHolder(View itemView) {
        super(itemView);
    }
}
