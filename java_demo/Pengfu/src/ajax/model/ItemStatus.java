package ajax.model;

public enum ItemStatus {
	NORMAL(0, "正常"),
	DELETE(1, "删除"),
	SPIDER(2, "刚刚获取");
	
	private int id;
	private String info;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	ItemStatus(int id, String info) {
		this.id = id;
		this.info = info;
	}

	public static ItemStatus getStatusById(int id) {
		ItemStatus[] items = ItemStatus.values();
		ItemStatus itemStatus = null;
		
		for (ItemStatus is : items) {
			if (is.getId() == id) {
				itemStatus = is;
				break;
			}
		}
		return itemStatus;
	}
}
