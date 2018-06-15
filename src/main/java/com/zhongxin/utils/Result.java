package com.zhongxin.utils;

import java.util.Objects;

public class Result<T> {
	private final static Result<?> EMPTY = new Result<>();

    private T data;

    /**
     * ������Ϣ
     */
    private String msg;
    /**
     * ״̬ 1�ɹ� ����ʧ�ܣ�ʧ����Ҫ����msg
     */
    private int state;

    /**
     * �Ƿ���ת
     */
    private boolean is_redirect = false;

    /**
     * ��ת��ַ
     */
    private String redirect_url;

    /**
     * token
     */
    private String token;

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public int getState() {
        return state;
    }

    public boolean isIs_redirect() {
        return is_redirect;
    }

    public String getRedirect_url() {
        return redirect_url;
    }

    public String getToken() {
        return token;
    }

    private Result() {
        this.data = null;
    }

    private Result(String message, int state) {
        this.msg = message;
        this.state = state;
    }

    private Result(T data, int state) {
        this.data = data;
        this.state = state;
    }

    /**
     *
     * ��������: ����һ����Result��
     * @auther: yuantao
     * @date: 2018/4/21
     */
    public static <T> Result<T> empty() {
        @SuppressWarnings("unchecked")
        Result<T> t = (Result<T>) EMPTY;
        return t;
    }

    /**
     *
     * ��������: ����һ���ɹ�״̬Result��
     * @auther: yuantao
     * @param: Data
     * @return: Result<T>
     * @date: 2018/4/21
     */
    public static <T> Result<T> success(T data) {
        return new Result<>(data, 1);
    }

    /**
     *
     * ��������: ����һ���ɹ�״̬Result��
     * @auther: yuantao
     * @param: ���صĴ�����Ϣ
     * @return: Result<T>
     * @date: 2018/4/21
     */
    public static <T> Result<T> fail(String message) {
        return new Result<>(message, 0);
    }

    /**
     *
     * ��������: ������ת��ַ
     * @auther: yuantao
     * @param: ��ת��ַ
     * @return: Result<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> Result<T> redirect(String url) {
        this.is_redirect = true;
        this.redirect_url = url;
        return (Result<T>) this;
    }

    /**
     *
     * ��������: ����ʧ��״̬��ת��ַ
     * @auther: yuantao
     * @param: ��ת��ַ
     * @return: Result<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> Result<T> orFailRedirect(String url) {
        if (state == 1) {
            return (Result<T>) this;
        }
        this.is_redirect = true;
        this.redirect_url = url;
        return (Result<T>) this;
    }

    /**
     *
     * ��������: �ж��Ƿ���ֵ�Ƿ�Ϊ��,�ǿ��򷵻�ֵ��Ϊ���򷵻�ʧ����Ϣ
     * @auther: yuantao
     * @param: ���صĴ�����Ϣ
     * @return: Result<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> Result<T> orFail(String message) {
        if (null != data) {
            return (Result<T>) this;
        } else {
            this.msg = message;
            this.state = 0;
        }
        return (Result<T>) this;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(data);
    }


    @Override
    public String toString() {
        return data != null
                ? String.format("result[%s]", data)
                : "result.empty";
    }
}
