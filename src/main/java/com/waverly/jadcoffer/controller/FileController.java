package com.waverly.jadcoffer.controller;

import com.waverly.jadcoffer.constant.MessageConstant;
import com.waverly.jadcoffer.result.Result;
import com.waverly.jadcoffer.utils.AliOssUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * @author Waverly
 * @version 1.0
 * @className FileController
 * @date 2023/8/12 20:38
 * @description 文件操作接口
 */
@RestController
@RequestMapping("/file")
@Api(tags = "文件操作接口")
@Slf4j
public class FileController {

    @Autowired
    private AliOssUtil aliOssUtil;

    @ApiOperation("文件上传接口")
    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file){
        log.info("文件上传:{}",file);

        // 获取文件扩展名
        String originalFilename = file.getOriginalFilename();
        assert originalFilename != null;
        String extension = originalFilename.substring((originalFilename.lastIndexOf(".")));
        String fileName= UUID.randomUUID().toString()+extension;

        try {
            String uploadFilePath = aliOssUtil.upload(file.getBytes(), fileName);
            return Result.success(uploadFilePath);
        } catch (IOException e) {
            log.info(MessageConstant.UPLOAD_FAILED+"{}",e);
        }

        return Result.error(MessageConstant.UPLOAD_FAILED);

    }
}
