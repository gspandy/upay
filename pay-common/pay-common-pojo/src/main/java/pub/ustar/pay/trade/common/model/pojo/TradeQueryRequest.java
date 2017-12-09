package pub.ustar.pay.trade.common.model.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/**
 * 订单查询业务请求参数
 *
 * @author xy
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TradeQueryRequest {
    // 商户订单号
    private String outTradeNo;
    // 平台订单号
    private String tradeNo;
    // 渠道参数
    private String channelContent;
}
