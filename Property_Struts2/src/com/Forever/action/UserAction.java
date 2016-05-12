package com.Forever.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.Forever.dao.IUserDao;
import com.Forever.dao.UserDaoImpl;
import com.Forever.vo.AllUser;
import com.Forever.vo.CostUser;
import com.Forever.vo.GuanliUser;
import com.Forever.vo.HouseUser;
import com.Forever.vo.ZhiyuanUser;

public class UserAction {

	HttpServletRequest request = ServletActionContext.getRequest ();

	public String houstLogin(){

		user=dao.houstLogin(huzhu_name, password);
		if(user.getHuzhu_name()!=null){
			request.getSession().setAttribute("House_user", user);
			return "houst_fenping";
		}else{
			return "no";
		}
	}

	public String vipLogin(){

		guser=dao.vipLogin(guanli_name, guanli_password);
		if(guser.getGuanli_name()!=null){
			List<AllUser> list=new ArrayList<AllUser>();
			list= dao.queryall();
			
			request.getSession().setAttribute("guanli_list", list);
			request.getSession().setAttribute("guanli_user", guser);/////////sdfadafaddf
			return "guanli";
		}else{
			return "no";
		}
	}

	public String house_update(){
		
		if(dao.House_update(huzhu_name, password, renkou_count, area, Integer.parseInt(request.getParameter("house_update_id")))){
			user=dao.houstLogin(huzhu_name, password);
			if(user.getHuzhu_name()!=null){
				request.getSession().setAttribute("House_user", user);
				return "houst_fenping";
			}else{
				return "no";
			}
		}else{
			return "no";
		}
	}
	
	public String zhiyuan(){
		
		List<ZhiyuanUser> list=new ArrayList<ZhiyuanUser>();
		list= dao.queryzhiyuan();
		request.getSession().setAttribute("zhiyuan", list);
		return "zhiyuan";
	}

	public String showdian(){
		CostUser cuser=dao.show(Integer.parseInt(request.getParameter("danyuan")));
		request.getSession().setAttribute("cuser", cuser);
		return "house_dian";
	}

	public String showshui(){
		CostUser cuser=dao.show(Integer.parseInt(request.getParameter("danyuan")));
		request.getSession().setAttribute("cuser", cuser);
		return "house_shui";
	}

	public String showre(){
		CostUser cuser=dao.show(Integer.parseInt(request.getParameter("danyuan")));
		request.getSession().setAttribute("cuser", cuser);
		return "house_re";
	}

	public String showwygl(){
		CostUser cuser=dao.show(Integer.parseInt(request.getParameter("danyuan")));
		request.getSession().setAttribute("cuser", cuser);
		return "house_wygl";
	}
	
	public String qingsuan(){
		dao.qingsuan();	
		List<AllUser> list=new ArrayList<AllUser>();
		list= dao.queryall();
		
		request.getSession().setAttribute("guanli_list", list);/////////sdfadafaddf
		return "guanli";
	}
	
	public String zupdate(){
		List<ZhiyuanUser> list=new ArrayList<ZhiyuanUser>();
		dao.zupdate(request.getParameter("zname"), request.getParameter("zzhiwei"),Integer.parseInt(request.getParameter("zyuexin")));
		list=dao.queryzhiyuan();
		request.getSession().setAttribute("zhiyuan", list);
		return "zhiyuan";
	}
	
	public String setMes(){
		dao.setMes(Integer.parseInt(request.getParameter("mdanyuan")), request.getParameter("mes"));
		return "housewelcome";
	}

	private String huzhu_name;
	private String password;
	private int renkou_count;
	private int area;
	private String guanli_name;
	private String guanli_password;
	

	public String getGuanli_name() {
		return guanli_name;
	}

	public void setGuanli_name(String guanli_name) {
		this.guanli_name = guanli_name;
	}

	public String getGuanli_password() {
		return guanli_password;
	}

	public void setGuanli_password(String guanli_password) {
		this.guanli_password = guanli_password;
	}

	public int getRenkou_count() {
		return renkou_count;
	}

	public void setRenkou_count(int renkou_count) {
		this.renkou_count = renkou_count;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	private IUserDao dao=new UserDaoImpl();
	private HouseUser user=new HouseUser();
	private GuanliUser guser=new GuanliUser();
	public String getHuzhu_name() {
		return huzhu_name;
	}

	public void setHuzhu_name(String huzhu_name) {
		this.huzhu_name = huzhu_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/*sasasdasdasdsaasdsadasdadasdadasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasd*/
	
}
