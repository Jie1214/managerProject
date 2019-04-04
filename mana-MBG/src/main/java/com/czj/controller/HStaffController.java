package com.czj.controller;

import com.czj.base.BaseController;
import com.czj.bean.HStaff;
import com.czj.common.ResultInfo;
import com.czj.services.HStaffServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Jie on 2019/4/4.
 *
 * @AUTHOR JIE
 * @date 2019/4/4
 */
@RequestMapping("staff")
@RestController
public class HStaffController extends BaseController {

    @Autowired
    private HStaffServices hStaffServices;

    @RequestMapping(value = "/select_staff_all.json", method = RequestMethod.GET)
    public ResultInfo selectStaffAll(){
        List<HStaff> result = hStaffServices.selectAll();
        return success(result);
    }

}
