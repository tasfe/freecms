package cn.freeteam.cms.model;

import java.util.Date;

public class Creditlog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private String memberid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private String creditruleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.rewardtype
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Integer rewardtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Integer credit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Integer experience;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column freecms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    private Date credittime;
    private Date credittimeToday;//查询条件
    private Date credittimeGreater;//查询条件

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.id
     *
     * @return the value of freecms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.id
     *
     * @param id the value for freecms_creditlog.id
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.memberid
     *
     * @return the value of freecms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.memberid
     *
     * @param memberid the value for freecms_creditlog.memberid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setMemberid(String memberid) {
        this.memberid = memberid == null ? null : memberid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.creditruleid
     *
     * @return the value of freecms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public String getCreditruleid() {
        return creditruleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.creditruleid
     *
     * @param creditruleid the value for freecms_creditlog.creditruleid
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCreditruleid(String creditruleid) {
        this.creditruleid = creditruleid == null ? null : creditruleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.rewardtype
     *
     * @return the value of freecms_creditlog.rewardtype
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Integer getRewardtype() {
        return rewardtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.rewardtype
     *
     * @param rewardtype the value for freecms_creditlog.rewardtype
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setRewardtype(Integer rewardtype) {
        this.rewardtype = rewardtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.credit
     *
     * @return the value of freecms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Integer getCredit() {
        return credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.credit
     *
     * @param credit the value for freecms_creditlog.credit
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.experience
     *
     * @return the value of freecms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Integer getExperience() {
        return experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.experience
     *
     * @param experience the value for freecms_creditlog.experience
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column freecms_creditlog.credittime
     *
     * @return the value of freecms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public Date getCredittime() {
        return credittime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column freecms_creditlog.credittime
     *
     * @param credittime the value for freecms_creditlog.credittime
     *
     * @mbggenerated Mon Feb 04 21:34:40 CST 2013
     */
    public void setCredittime(Date credittime) {
        this.credittime = credittime;
    }

	public Date getCredittimeToday() {
		return credittimeToday;
	}

	public void setCredittimeToday(Date credittimeToday) {
		this.credittimeToday = credittimeToday;
	}

	public Date getCredittimeGreater() {
		return credittimeGreater;
	}

	public void setCredittimeGreater(Date credittimeGreater) {
		this.credittimeGreater = credittimeGreater;
	}

}