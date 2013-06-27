package cn.freeteam.cms.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Guestbook implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.id
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String id;
    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat sdffull=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private Date starttime;
    private Date endtime;
    private String starttimeStr;
    private String endtimeStr;
    private int countnum;
    private String datename;
    private String sitename;
    private String guestbookstate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.siteid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String siteid;
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.memberid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.membername
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String membername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.name
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.sex
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String sex;
    private String sexStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.email
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.qq
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String qq;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.tel
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String tel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.title
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.content
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.addtime
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private Date addtime;
    private String addtimeStr;
    private String retimeStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.state
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String state;
    private String stateStr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.recontent
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String recontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.retime
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private Date retime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.reuserid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String reuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_guestbook.reusername
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    private String reusername;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.id
     *
     * @return the value of freecms_guestbook.id
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.id
     *
     * @param id the value for freecms_guestbook.id
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.siteid
     *
     * @return the value of freecms_guestbook.siteid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.siteid
     *
     * @param siteid the value for freecms_guestbook.siteid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setSiteid(String siteid) {
        this.siteid = siteid == null ? null : siteid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.memberid
     *
     * @return the value of freecms_guestbook.memberid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.memberid
     *
     * @param memberid the value for freecms_guestbook.memberid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.membername
     *
     * @return the value of freecms_guestbook.membername
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getMembername() {
        return membername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.membername
     *
     * @param membername the value for freecms_guestbook.membername
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.name
     *
     * @return the value of freecms_guestbook.name
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.name
     *
     * @param name the value for freecms_guestbook.name
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.sex
     *
     * @return the value of freecms_guestbook.sex
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.sex
     *
     * @param sex the value for freecms_guestbook.sex
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.email
     *
     * @return the value of freecms_guestbook.email
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.email
     *
     * @param email the value for freecms_guestbook.email
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.qq
     *
     * @return the value of freecms_guestbook.qq
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.qq
     *
     * @param qq the value for freecms_guestbook.qq
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.tel
     *
     * @return the value of freecms_guestbook.tel
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.tel
     *
     * @param tel the value for freecms_guestbook.tel
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.title
     *
     * @return the value of freecms_guestbook.title
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.title
     *
     * @param title the value for freecms_guestbook.title
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.content
     *
     * @return the value of freecms_guestbook.content
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.content
     *
     * @param content the value for freecms_guestbook.content
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.addtime
     *
     * @return the value of freecms_guestbook.addtime
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.addtime
     *
     * @param addtime the value for freecms_guestbook.addtime
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.state
     *
     * @return the value of freecms_guestbook.state
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.state
     *
     * @param state the value for freecms_guestbook.state
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.recontent
     *
     * @return the value of freecms_guestbook.recontent
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getRecontent() {
        return recontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.recontent
     *
     * @param recontent the value for freecms_guestbook.recontent
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setRecontent(String recontent) {
        this.recontent = recontent == null ? null : recontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.retime
     *
     * @return the value of freecms_guestbook.retime
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public Date getRetime() {
        return retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.retime
     *
     * @param retime the value for freecms_guestbook.retime
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setRetime(Date retime) {
        this.retime = retime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.reuserid
     *
     * @return the value of freecms_guestbook.reuserid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getReuserid() {
        return reuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.reuserid
     *
     * @param reuserid the value for freecms_guestbook.reuserid
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setReuserid(String reuserid) {
        this.reuserid = reuserid == null ? null : reuserid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_guestbook.reusername
     *
     * @return the value of freecms_guestbook.reusername
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public String getReusername() {
        return reusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_guestbook.reusername
     *
     * @param reusername the value for freecms_guestbook.reusername
     *
     * @mbggenerated Wed Jun 26 15:08:45 CST 2013
     */
    public void setReusername(String reusername) {
        this.reusername = reusername == null ? null : reusername.trim();
    }

	public String getStateStr() {
		if ("1".equals(state)) {
			stateStr="已审核";
		}
		else if ("2".equals(state)) {
			stateStr="审核不通过";
		}
		else{
			stateStr="未审核";
		}
		return stateStr;
	}

	public void setStateStr(String stateStr) {
		this.stateStr = stateStr;
	}

	public String getSexStr() {
		sexStr="女";
		if ("1".equals(sex)) {
			sexStr="男";
		}
		return sexStr;
	}

	public void setSexStr(String sexStr) {
		this.sexStr = sexStr;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getAddtimeStr() {
		if (addtime!=null) {
			addtimeStr=sdf.format(addtime);
		}
		return addtimeStr;
	}

	public void setAddtimeStr(String addtimeStr) {
		this.addtimeStr = addtimeStr;
	}

	public String getRetimeStr() {
		if (retime!=null) {
			retimeStr=sdf.format(retime);
		}
		return retimeStr;
	}

	public void setRetimeStr(String retimeStr) {
		this.retimeStr = retimeStr;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getStarttimeStr() {
		if (starttime!=null) {
			starttimeStr=sdffull.format(starttime);
		}
		return starttimeStr;
	}

	public void setStarttimeStr(String starttimeStr) {
		this.starttimeStr = starttimeStr;
	}

	public String getEndtimeStr() {
		if (endtime!=null) {
			endtimeStr=sdffull.format(endtime);
		}
		return endtimeStr;
	}

	public void setEndtimeStr(String endtimeStr) {
		this.endtimeStr = endtimeStr;
	}

	public int getCountnum() {
		return countnum;
	}

	public void setCountnum(int countnum) {
		this.countnum = countnum;
	}

	public String getDatename() {
		return datename;
	}

	public void setDatename(String datename) {
		this.datename = datename;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getGuestbookstate() {
		return guestbookstate;
	}

	public void setGuestbookstate(String guestbookstate) {
		this.guestbookstate = guestbookstate;
	}
}