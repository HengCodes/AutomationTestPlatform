package nh.automation.tools.entity;

public class OutlookMenu {
    private Integer id;

    private String text;

    private String iconCls;

    private Integer pid;

    private String url;

    private String iconPosition;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String geticonCls() {
        return iconCls;
    }

    public void seticonCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String geticonPosition() {
        return iconPosition;
    }

    public void seticonPosition(String iconPosition) {
        this.iconPosition = iconPosition;
    }

	/**
	 * @param id
	 * @param text
	 * @param iconCls
	 * @param pid
	 * @param url
	 * @param iconPosition
	 */
	public OutlookMenu(Integer id, String text, String iconCls, Integer pid, String url, String iconPosition) {
		super();
		this.id = id;
		this.text = text;
		this.iconCls = iconCls;
		this.pid = pid;
		this.url = url;
		this.iconPosition = iconPosition;
	}

	/**
	 * 
	 */
	public OutlookMenu() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OutlookMenu [id=" + id + ", text=" + text + ", iconCls=" + iconCls + ", pid=" + pid + ", url=" + url
				+ ", iconPosition=" + iconPosition + "]";
	}
    
    
}