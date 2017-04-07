package entity;

import javax.persistence.*;

public class Employee {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话
     */
    private String phone;

    /**
     * 姓别
     */
    private Integer sex;

    /**
     * 所属公司id
     */
    @Column(name = "company_id")
    private Integer companyId;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取姓别
     *
     * @return sex - 姓别
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * 设置姓别
     *
     * @param sex 姓别
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * 获取所属公司id
     *
     * @return company_id - 所属公司id
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * 设置所属公司id
     *
     * @param companyId 所属公司id
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }
}