package temple.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import temple.service.PeopleService;

@Controller
public class PeopleController {
	@Resource
	private PeopleService service;
	@RequestMapping("/goto.do")
	public String gotoo(){
		return "html/TreeGridDemo";
	}
	@RequestMapping("/findNodes.do")
	@ResponseBody
	public JsonResult findNodes(){
		List<Map<String,Object>>list=service.findTreeGridNodes();
		return new JsonResult(list);
	}
}
