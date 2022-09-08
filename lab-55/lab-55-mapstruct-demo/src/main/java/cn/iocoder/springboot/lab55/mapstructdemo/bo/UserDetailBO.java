package cn.iocoder.springboot.lab55.mapstructdemo.bo;

public class UserDetailBO {

    private Integer userId;

    private String name;

    public Integer getUserId() {
        return userId;
    }

    public String getName(){return name;}

    public UserDetailBO setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

}
