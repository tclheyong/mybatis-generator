package entity;

import javax.persistence.*;

@Table(name = "pub_protocol")
public class PubProtocol {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 协议类型
     */
    @Column(name = "protocol_type")
    private String protocolType;

    /**
     * 协议编码
     */
    @Column(name = "protocol_code")
    private String protocolCode;

    /**
     * 协议标题
     */
    @Column(name = "protocol_title")
    private String protocolTitle;

    /**
     * 协议内容
     */
    @Column(name = "protocol_content")
    private String protocolContent;

    /**
     * 协议状态
     */
    @Column(name = "protocol_state")
    private String protocolState;

    /**
     * 创建时间yyyy-MM-dd HH:mm:ss
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取协议类型
     *
     * @return protocol_type - 协议类型
     */
    public String getProtocolType() {
        return protocolType;
    }

    /**
     * 设置协议类型
     *
     * @param protocolType 协议类型
     */
    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * 获取协议编码
     *
     * @return protocol_code - 协议编码
     */
    public String getProtocolCode() {
        return protocolCode;
    }

    /**
     * 设置协议编码
     *
     * @param protocolCode 协议编码
     */
    public void setProtocolCode(String protocolCode) {
        this.protocolCode = protocolCode;
    }

    /**
     * 获取协议标题
     *
     * @return protocol_title - 协议标题
     */
    public String getProtocolTitle() {
        return protocolTitle;
    }

    /**
     * 设置协议标题
     *
     * @param protocolTitle 协议标题
     */
    public void setProtocolTitle(String protocolTitle) {
        this.protocolTitle = protocolTitle;
    }

    /**
     * 获取协议内容
     *
     * @return protocol_content - 协议内容
     */
    public String getProtocolContent() {
        return protocolContent;
    }

    /**
     * 设置协议内容
     *
     * @param protocolContent 协议内容
     */
    public void setProtocolContent(String protocolContent) {
        this.protocolContent = protocolContent;
    }

    /**
     * 获取协议状态
     *
     * @return protocol_state - 协议状态
     */
    public String getProtocolState() {
        return protocolState;
    }

    /**
     * 设置协议状态
     *
     * @param protocolState 协议状态
     */
    public void setProtocolState(String protocolState) {
        this.protocolState = protocolState;
    }

    /**
     * 获取创建时间yyyy-MM-dd HH:mm:ss
     *
     * @return create_time - 创建时间yyyy-MM-dd HH:mm:ss
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间yyyy-MM-dd HH:mm:ss
     *
     * @param createTime 创建时间yyyy-MM-dd HH:mm:ss
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}