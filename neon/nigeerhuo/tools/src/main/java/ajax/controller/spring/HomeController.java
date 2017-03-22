package ajax.controller.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ajax.model.pagesSeparate.RealTimePagination;
import ajax.model.taobao.Coupon;
import ajax.model.taobao.model.GoodsType;
import ajax.model.taobao.model.Platform;
import ajax.model.taobao.model.TbkItem;

@Controller
public class HomeController {

	@RequestMapping(value={"", "/"})
	public ModelAndView home() {
		List<? extends TbkItem> tbkItemsRoll = GoodsType.getTBKItemsOfRoll(Platform.PC);
		
		List<GoodsType> goodsTypes = GoodsType.getShowGoodsType();
		
		RealTimePagination<Coupon> pagination = new RealTimePagination<>();
		List<Coupon> coupons = pagination.get(Coupon.COUPON_PAGINATION_GROUPID, 1, new Coupon());
		
		
		Map<String, Object> map = new HashMap<>();
		map.put("itemsRoll", tbkItemsRoll);
		map.put("goodsTypes", goodsTypes);
		map.put("coupons", coupons);
		
		return new ModelAndView("/views/tbk/list", map);
	}
	
	
//	public String begore() {
//List<Item> items = new ArrayList<Item>();
//		
//		QueryParams qp = new QueryParams(request);
//		
//		items = Page.getPage(qp.getPage());
//		
//		List<Item> hotItems = Item.getHotItems();
//		
//		request.setAttribute("hotItems", hotItems);
//		request.setAttribute("items", items);
//		request.setAttribute("page", Tools.parseInt(qp.getVal("page"), 1));
//		request.setAttribute("queryParams", qp);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("Index.jsp");
//		
//		rd.forward(request, response);
//	}
}
