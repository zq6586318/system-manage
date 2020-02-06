package com.sgcc.eip.gatewayManage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 网关信息表
 * </p>
 *
 * @author zch
 * @since 2020-02-04
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="GatewayInfo对象", description="网关信息表")
public class GatewayInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "网关ID")
    @TableId(value = "gateway_id", type = IdType.AUTO)
    private Integer gatewayId;

    @ApiModelProperty(value = "设备编码")
    private String gatewayNum;

    @ApiModelProperty(value = "网关名称")
    private String gatewayName;

    @ApiModelProperty(value = "客户ID")
    private String clientId;

    @ApiModelProperty(value = "网关状态")
    private String gatewayState;

    @ApiModelProperty(value = "内网IP")
    private String intranetIp;

    @ApiModelProperty(value = "内网带宽")
    private String intranetBandwidth;

    @ApiModelProperty(value = "内网描述")
    private String intranetDesc;

    @ApiModelProperty(value = "外网IP")
    private String internetIp;

    @ApiModelProperty(value = "外网带宽")
    private String internetBandwidth;

    @ApiModelProperty(value = "外网描述")
    private String internetDesc;

    @ApiModelProperty(value = "网关版本")
    private String gatewayVersion;

    @ApiModelProperty(value = "经度")
    private String longitude;

    @ApiModelProperty(value = "纬度")
    private String latitude;

    @ApiModelProperty(value = "高度")
    private String altitude;

    @ApiModelProperty(value = "设备所在省份名称")
    private String provinceName;

    @ApiModelProperty(value = "设备所在国家名称")
    private String countryName;

    @ApiModelProperty(value = "详细地址")
    private String detailLocation;

    @ApiModelProperty(value = "地图坐标系")
    private String mcs;

    @ApiModelProperty(value = "市")
    private String city;

    @ApiModelProperty(value = "区县")
    private String county;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "网关描述信息")
    private String descInfo;

    @ApiModelProperty(value = "授权开始时间")
    private LocalDateTime authorizationStartTime;

    @ApiModelProperty(value = "授权结束时间")
    private LocalDateTime authorizationEndTime;

    @ApiModelProperty(value = "授权类型")
    private String authorizationType;

    @ApiModelProperty(value = "授权码")
    private String authorizationCode;

    @ApiModelProperty(value = "授权描述")
    private String authorizationDesc;

    @ApiModelProperty(value = "授权文件")
    private String authorizationFile;

    @ApiModelProperty(value = "磁盘信息")
    private String diskInfo;

    @ApiModelProperty(value = "CPU信息")
    private String cpuInfo;

    @ApiModelProperty(value = "内存信息")
    private String memoryInfo;

    @ApiModelProperty(value = "系统版本")
    private String systemVersion;

    @ApiModelProperty(value = "容器版本")
    private String containerVersion;

    @ApiModelProperty(value = "网关产品ID")
    private String gatewayProductId;

    @ApiModelProperty(value = "配置描述")
    private String configurationDesc;

    @ApiModelProperty(value = "实施人员")
    private String implementer;

    @ApiModelProperty(value = "维护人员")
    private String maintainer;

    @ApiModelProperty(value = "实施时间")
    private LocalDateTime implementTime;

    @ApiModelProperty(value = "租户名称")
    private String clientName;

    @ApiModelProperty(value = "实施备注")
    private String implementDesc;


}
