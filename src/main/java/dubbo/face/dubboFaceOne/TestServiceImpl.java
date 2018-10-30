package dubbo.face.dubboFaceOne;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class TestServiceImpl implements TestService
{

    @Override
    public void sayHellol(String msg)
    {
        System.out.println(msg+"想说点什么呢！");
        Map<String,String> map = new HashMap<String,String>();
        ConcurrentHashMap current = new ConcurrentHashMap();
    }

}
