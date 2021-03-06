package ajax.model;

public enum ItemStatus {
	NORMAL(0, "正常"),
	DELETE(1, "删除"),
	SPIDER(2, "刚刚获取"),
	IS_SAVE_TO_TYPE_PAGE(3, "是否已经保存到type page"),
	TBKITEM_IN_PAGE(4, ""),
	IS_TBKITEM_CHANGE_TO_NORMAL_ITEM(5, "该商品已经发布成值得买"),
	ITAOBAO_ITEM_IN_PAGE(6, "该爱淘宝商品已经在page了"), 
	HAVE_NOT_CHANGE_SLICK_URL(7, "该商品的链接还不是返利链接"), 
	ZHIDEMAI_ITEM_IN_PAGE(8, "值得买已经加入到页面"),
	ITEM_IS_HOMEROLL_IMAGE_ITEM(9, "首页滚动的item"), 
	IS_GET_COUPON_LINK_SLICK(10, ""), 
	SELECTED(11, "被选中过后的状态");
	
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
	
	/**
	 * 
	 * @return "b" + this.id + "e"
	 */
	public String wrapWithBE() {
		return "b" + this.id + "e";
	}
}
