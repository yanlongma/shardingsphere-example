package com.mayanlong.shardingsphere.service;

import com.mayanlong.shardingsphere.dto.CodeDto;
import com.mayanlong.shardingsphere.mapper.CodeMapper;
import com.mayanlong.shardingsphere.entity.Code;
import org.apache.shardingsphere.infra.hint.HintManager;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CodeService {

    @Autowired
    CodeMapper codeMapper;

    @Autowired
    ModelMapper modelMapper;

    public List<CodeDto> list(int userId) {
        List<CodeDto> all = codeMapper.findAllByUserId(userId).stream()
                .map(code -> modelMapper.map(code, CodeDto.class))
                .collect(Collectors.toList());
        return all;
    }

    public List<CodeDto> listFromMaster(int userId) {

        // 强制读主库 开
        HintManager hintManager1 = HintManager.getInstance();
        hintManager1.setPrimaryRouteOnly();
        List<CodeDto> all = codeMapper.findAllByUserId(userId).stream().map(code -> modelMapper.map(code, CodeDto.class)).collect(Collectors.toList());
        hintManager1.close();  // 强制读主库 关

        // 强制读主库 开
        HintManager hintManager2 = HintManager.getInstance();
        hintManager2.setPrimaryRouteOnly();
        codeMapper.findAllByUserId(userId).stream().map(code -> modelMapper.map(code, CodeDto.class)).collect(Collectors.toList());
        hintManager2.close();   // 强制读主库 关

        // 默认读从库
        codeMapper.findAllByUserId(userId).stream().map(code -> modelMapper.map(code, CodeDto.class)).collect(Collectors.toList());

        return all;
    }

    public boolean create() {
        Code code = Code.builder()
                .id(222)
                .user_id(1)
                .code("ceshi")
                .door_clock("")
                .created_at(1111111)
                .created_at(1111111)
                .build();
        codeMapper.insert(code);
        return true;
    }

}
