package com.bawei.mvp;

/*
 *@Auther:姓名
 *@Date: 时间
 *@Description:契约类
 * */public class IMainContract {

    public interface IMainView {
        void showList(String result);
    }

    public interface IMainModel {

    }

    public interface IMainPresenter {

        void attach(IMainView view);

        void detach();

        void requestList(String url);
    }
}
