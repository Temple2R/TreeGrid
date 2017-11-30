package temple.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import temple.dao.PeopleDao;
@Service
public class PeopleServiceImpl implements PeopleService{
	@Resource
	private PeopleDao dao;
	public List<Map<String, Object>> findTreeGridNodes() {
		return dao.findTreeGridNodes();
	}

}
