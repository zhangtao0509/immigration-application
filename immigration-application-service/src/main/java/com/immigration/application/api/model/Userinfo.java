package com.immigration.application.api.model;

public class Userinfo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.id
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.name
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column userInfo.age
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    private Integer age;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.id
     *
     * @return the value of userInfo.id
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.id
     *
     * @param id the value for userInfo.id
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.name
     *
     * @return the value of userInfo.name
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.name
     *
     * @param name the value for userInfo.name
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column userInfo.age
     *
     * @return the value of userInfo.age
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column userInfo.age
     *
     * @param age the value for userInfo.age
     *
     * @mbg.generated Sat Sep 07 22:07:27 CST 2019
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}