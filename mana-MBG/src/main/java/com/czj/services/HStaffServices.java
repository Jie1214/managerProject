package com.czj.services;

import com.czj.bean.HStaff;
import com.czj.dao.HStaffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jie on 2019/4/4.
 *
 * @AUTHOR JIE
 * @date 2019/4/4
 */
@Service
public class HStaffServices {

    @Autowired
    private HStaffMapper hStaffMapper;

    public List<HStaff> selectAll(){
        return hStaffMapper.selectAll();
    }

}
