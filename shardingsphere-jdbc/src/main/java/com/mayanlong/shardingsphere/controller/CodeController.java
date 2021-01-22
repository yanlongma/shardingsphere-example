package com.mayanlong.shardingsphere.controller;

import com.mayanlong.shardingsphere.dto.CodeDto;
import com.mayanlong.shardingsphere.service.CodeService;
import com.mayanlong.shardingsphere.until.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/taishan/basic")
public class CodeController {

    @Autowired
    CodeService codeService;

    @GetMapping("/code")
    public JsonResult<List<CodeDto>> listCode() {
        return new JsonResult<>(codeService.list(1));
    }

    @GetMapping("/codeFromMaster")
    public JsonResult<List<CodeDto>> listCodeFromMaster() {
        return new JsonResult<>(codeService.listFromMaster(1));
    }

    @GetMapping("/codeCreate")
    public JsonResult codeCreate() {
        return new JsonResult<>(codeService.create());
    }

}
