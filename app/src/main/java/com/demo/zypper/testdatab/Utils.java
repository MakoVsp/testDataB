package com.demo.zypper.testdatab;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by shangerdi on 16-8-23.
 */

public class Utils {
    @BindingAdapter({ "imageUrl" })
    public static void loadIamge(ImageView view, String url) {
        if (url == null) {
            view.setImageResource(R.mipmap.ic_launcher);
        } else {
            Glide.with(view.getContext()).load(url).into(view);
        }
    }
}
