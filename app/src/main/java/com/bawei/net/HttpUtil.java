package com.bawei.net;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

/*
 *@Auther:姓名
 *@Date: 时间
 *@Description:功能
 * */
public class HttpUtil {

    private HttpUtil() {

    }

    private static HttpUtil util;

    public synchronized static HttpUtil getUtil() {
        if (util == null) {
            util = new HttpUtil();
        }
        return util;
    }

    //
    public void httpGet(String url, final CallBack callBack){
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                callBack.onSuccess(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                callBack.onError(error.getMessage());
            }
        });
        MyApplication.getQueue().add(stringRequest);
    }
    //接口
    public interface CallBack {
        void onSuccess(String result);

        void onError(String msg);
    }
}
