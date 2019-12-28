package cn.itcast.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description
 * @Author  Hunter
 * @Date 2019-12-28
 */

@Setter
@Getter
@ToString
@Entity
@Table ( name ="user" )
public class User implements Serializable {

	private static final long serialVersionUID =  7418645482379035198L;

	/**
	 * 序号
	 */
	@Column(name = "id" )
	private Long id;

	/**
	 * 名字
	 */
	@Column(name = "name" )
	private String name;

	/**
	 * 年龄
	 */
	@Column(name = "age" )
	private Long age;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return this.age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

}
