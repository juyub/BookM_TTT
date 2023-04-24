package aaa.bbb.vo;

/*
CREATE TABLE t_user(
      no          number(5)       PRIMARY KEY
    , name        varchar2(100)   not null
    , phone       number(11)      not null
);
 */

public class UserVO {

	private int no;
	private String name;
	private String phone;
	
	public UserVO() {
		super();
	}

	public UserVO(int no, String name, String phone) {
		super();
		this.no = no;
		this.name = name;
		this.phone = phone;
	}

	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserVO [no=" + no + ", name=" + name + ", phone=" + phone + "]";
	}
	
}
