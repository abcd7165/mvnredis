package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;
import model.UserParam;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private volatile RedisTemplate<String, String> redisTemplate;
	@Autowired
	private UserDao userDao;
	
	@Cacheable(value="user",key="#Id.toString()")
	public UserParam queryUser(Integer Id) {
		
		UserParam param = userDao.queryUserDao(Id);
		
		return param;
	}

	
	@Transactional
    @Cacheable(value="user",key="#userparam.getId().toString()")//添加缓存
	public void addUser(UserParam userparam) {
		userDao.addUser(userparam);
		//redisTemplate.delete("key");
		
		/*redisTemplate.opsForValue().set("key", "Hello world");
		System.out.println(redisTemplate.opsForValue().get("key"));*/
	}

}
