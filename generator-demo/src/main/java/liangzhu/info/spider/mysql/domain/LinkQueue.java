package liangzhu.info.spider.mysql.domain;

import java.io.Serializable;
import java.util.Date;

 /** create by system from table link_queue(URL队列)  */
public class LinkQueue implements Serializable {
    //ID(id)
    private Long id;

    //任务id(task_id)
    private String taskId;

    //url id(link_id)
    private String linkId;

    //task内序号(sequence)
    private Long sequence;

    //休眠时间(sleep_second)
    private Integer sleepSecond;

    //是否重新下载页面(refresh)
    private Boolean refresh;

    //页面解析处理器(page_extractor)
    private String pageExtractor;

    //url(url)
    private String url;

    //GET,POST(method)
    private String method;

    //请求头(headers)
    private String headers;

    //cookie(cookies)
    private String cookies;

    //请求参数编码(encoding)
    private String encoding;

    //请求类型(content_type)
    private String contentType;

    //body内容(body)
    private String body;

    //超时时间单位:秒(timeout)
    private Integer timeout;

    //优先级(priority)
    private Integer priority;

    // 状态(0:待下载,1:下载中,-1:下载失败)(status)
    private Integer status;

    //重试次数(retry_count)
    private Boolean retryCount;

    //最大重试次数(max_retry)
    private Boolean maxRetry;

    //创建时间(create_time)
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId == null ? null : linkId.trim();
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public Integer getSleepSecond() {
        return sleepSecond;
    }

    public void setSleepSecond(Integer sleepSecond) {
        this.sleepSecond = sleepSecond;
    }

    public Boolean getRefresh() {
        return refresh;
    }

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
    }

    public String getPageExtractor() {
        return pageExtractor;
    }

    public void setPageExtractor(String pageExtractor) {
        this.pageExtractor = pageExtractor == null ? null : pageExtractor.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getHeaders() {
        return headers;
    }

    public void setHeaders(String headers) {
        this.headers = headers == null ? null : headers.trim();
    }

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies == null ? null : cookies.trim();
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding == null ? null : encoding.trim();
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getRetryCount() {
        return retryCount;
    }

    public void setRetryCount(Boolean retryCount) {
        this.retryCount = retryCount;
    }

    public Boolean getMaxRetry() {
        return maxRetry;
    }

    public void setMaxRetry(Boolean maxRetry) {
        this.maxRetry = maxRetry;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}