package jp.ddd.server.usecase.gateway.dynamodb.running;

import jp.ddd.server.usecase.gateway.dynamodb.RoomDynGateway;
import jp.ddd.server.usecase.gateway.dynamodb.RoomUserDynGateway;
import lombok.val;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.fail;

/**
 * Created by noguchi_kohei 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:app-context.xml" })
public class RoomDynGatewayRunTest {
    @Autowired
    private RoomDynGateway roomDynGateway;

    @Test
    public void findTest() {
        try {

            val results = roomDynGateway.getOptByRoomId(1);
            System.out.println(results);
        } catch (Exception e) {
            fail();
        }
    }
}
