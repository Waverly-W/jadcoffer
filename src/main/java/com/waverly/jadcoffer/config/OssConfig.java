package com.waverly.jadcoffer.config;


import com.waverly.jadcoffer.properties.AliOssProperties;
import com.waverly.jadcoffer.utils.AliOssUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Waverly
 * @version 1.0
 * @className OssConfig
 * @date 2023/7/25 9:55
 * @description OOS配置
 */
@Configuration
@Slf4j
public class OssConfig {

    @Bean
    @ConditionalOnMissingBean
    public AliOssUtil aliOssUtil(AliOssProperties aliOssProperties){
        log.info("开始创建阿里云文件上传工具类: {}",aliOssProperties);

        return new AliOssUtil(
                aliOssProperties.getEndpoint(),
                aliOssProperties.getAccessKeyId(),
                aliOssProperties.getAccessKeySecret(),
                aliOssProperties.getBucketName());

    }
}
