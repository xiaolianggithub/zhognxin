package com.zhongxin.utils;

import java.util.List;
import java.util.Objects;

public class PageResult<T> {
	private final static PageResult<?> EMPTY = new PageResult<>();

    private Data<T> data;

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

    public Data<T> getData() {
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

    private PageResult() {
        this.data = null;
    }

    private PageResult(String message, int state) {
        this.msg = message;
        this.state = state;
    }

    private PageResult(List<T> list, int state) {
        Data<T> data = new Data<>(list);
        this.data = data;
        this.state = state;
    }

    /**
     * ��������: ����һ����PageResult��
     *
     * @auther: yuantao
     * @date: 2018/4/21
     */
    public static <T> PageResult<T> empty() {
        @SuppressWarnings("unchecked")
        PageResult<T> t = (PageResult<T>) EMPTY;
        return t;
    }

    /**
     * ��������: ����һ���ɹ�״̬PageResult��
     *
     * @auther: yuantao
     * @param: List<T>
     * @return: PageResult<T>
     * @date: 2018/4/21
     */
    public static <T> PageResult<T> success(List<T> data) {
        return new PageResult<>(data, 1);
    }

    /**
     * ��������: ����һ��ʧ��״̬PageResult��
     *
     * @auther: yuantao
     * @param: ������Ϣ
     * @return: PageResult<T>
     * @date: 2018/4/21
     */
    public static <T> PageResult<T> fail(String message) {
        return new PageResult<>(message, 0);
    }

    /**
     * ��������: ����ҳ����Ϣ
     *
     * @auther: yuantao
     * @param: pageNum, pageSize
     * @return: PageResult<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> PageResult<T> pageBar(int pageNum, int pageSize) {
        if (state == 1) {
            data.pageBar(pageNum, pageSize);
        }
        return (PageResult<T>) this;
    }

    /**
     * ��������: ��������
     *
     * @auther: yuantao
     * @param: total
     * @return: PageResult<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> PageResult<T> total(int total) {
        if (data.pagebar != null) {
            data.pagebar.total(total);
        }
        return (PageResult<T>) this;
    }

    /**
     * ��������: ������ת��ַ
     *
     * @auther: yuantao
     * @param: ��ת��ַ
     * @return: PageResult<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> PageResult<T> redirect(String url) {
        this.is_redirect = true;
        this.redirect_url = url;
        return (PageResult<T>) this;
    }

    /**
     * ��������: ����ʧ����ת��ַ
     *
     * @auther: yuantao
     * @param: ��ת��ַ
     * @return: PageResult<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> PageResult<T> orFailRedirect(String url) {
        if (state == 1) {
            return (PageResult<T>) this;
        }
        this.is_redirect = true;
        this.redirect_url = url;
        return (PageResult<T>) this;
    }

    /**
     * ��������: �ж��Ƿ���ֵ�Ƿ�Ϊ��,�ǿ��򷵻�ֵ��Ϊ���򷵻�ʧ����Ϣ
     *
     * @auther: yuantao
     * @param: ���صĴ�����Ϣ
     * @return: PageResult<T>
     * @date: 2018/4/21
     */
    @SuppressWarnings({ "unchecked", "hiding" })
	public <T> PageResult<T> orFail(String message) {
        if (null != data.list) {
            return (PageResult<T>) this;
        } else {
            this.msg = message;
            this.state = 0;
        }
        return (PageResult<T>) this;
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

    public static class Data<T> {
        /**
         * �ӿ�����
         */
        private List<T> list;

        /**
         * ��ҳ��Ϣ
         */
        private PageBar pagebar;

        private Data(List<T> list) {
            this.list = list;
        }

        public List<T> getList() {
            return list;
        }

        public PageBar getPagebar() {
            return pagebar;
        }

        public void pageBar(int pageNum, int pageSize) {
            PageBar pageBar = new PageBar(pageNum, pageSize);
            this.pagebar = pageBar;
        }

        public static class PageBar {
            private int page;
            private int total;
            private int limit;

            private PageBar(int page, int limit) {
                this.page = page;
                this.limit = limit;
            }

            private void total(int total) {
                this.total = total;
            }

            public int getPage() {
                return page;
            }

            public int getTotal() {
                return total;
            }

            public int getLimit() {
                return limit;
            }
        }
    }
}
