package com.kev.chance;

import com.kev.chance.dto.InvoiceWithChancesDto;
import com.kev.chance.util.helper.ObjectHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

/**
 *
 * @author Kevin
 */
/*@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WsTest {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testWebService() {
        //TestFindAllLotteries();
        //testCreateInvoiceAndChances();
    }

    public void TestFindAllLotteries() {
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:" + port + "/chance-app/api/chance/v1/lotteries", String.class);
        System.out.println("" + response.getStatusCode());
        System.out.println(""+ response.getBody());
        System.out.println("http://localhost:" + port + "/chance-app/api/chance/v1/lotteries");
        Assert.isTrue(HttpStatus.CREATED == response.getStatusCode(), "its work");
        //Assert.isInstanceOf(List.class, response.getBody());
        //Assert.isNull(response.getBody(), "Don't have body");
    }

    public void testCreateInvoiceAndChances() {
        InvoiceWithChancesDto dto = ObjectHelper.fillInvoiceDto();

        String url = "http://localhost:" + port + "/chance-app/api/chance/v1/invoice";
        String requestBody = ObjectHelper.objToString(dto);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);

        Assert.isTrue(HttpStatus.CREATED == response.getStatusCode(), "its work");
        Assert.isNull(response.getBody(), "Don't have body");
    }
}
*/