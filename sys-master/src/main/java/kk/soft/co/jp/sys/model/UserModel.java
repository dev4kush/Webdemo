package kk.soft.co.jp.sys.model;
import java.io.Serializable;

import lombok.Data;

@Data
public class UserModel implements Serializable {
	public int customID;
	private String shimei;
	private String furigana;
	private String birth;
	private String id;
	private String password;
	private String sex;
	private String rls;
	private String hobbies;

public Integer getCustomID() {
    return customID;
}

public void setCustomID(Integer customID) {
    this.customID = customID;
}

public String getShimei() {
    return shimei;
}

public void setShimei(String shimei) {
    this.shimei = shimei;
}

public String getBirth() {
    return birth;
}

public void setBirth(String birth) {
    this.birth = birth;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getSex() {
    return sex;
}

public void setSex(String sex) {
    this.sex = sex;
}

public String getRls() {
    return rls;
}

public void setRls(String rls) {
    this.rls = rls;
}

public String getHobbies() {
    return hobbies;
}

public void setHobbies(String hobbies) {
    this.hobbies = hobbies;
}
}
