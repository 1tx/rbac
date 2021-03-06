/**
 * Copyright &copy; 2015-2020 <a href="http://www.wandun.net/">云南万盾科技有限公司</a> All rights reserved.
 */
package com.wandun.modules.monitor.entity;

import com.wandun.common.persistence.DataEntity;
import com.wandun.common.utils.excel.annotation.ExcelField;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
 * 系统监控Entity
 *
 * @author liugf
 * @version 2016-02-07
 */
@Data
public class Monitor extends DataEntity<Monitor,String> {

    private static final long serialVersionUID = 1L;
    @Length(min = 0, max = 64, message = "cpu使用率长度必须介于 0 和 64 之间")
    @ExcelField(title = "cpu使用率", align = 2, sort = 1)
    private String cpu;        // cpu使用率
    @Length(min = 0, max = 64, message = "jvm使用率长度必须介于 0 和 64 之间")
    @ExcelField(title = "jvm使用率", align = 2, sort = 2)
    private String jvm;        // jvm使用率
    @Length(min = 0, max = 64, message = "内存使用率长度必须介于 0 和 64 之间")
    @ExcelField(title = "内存使用率", align = 2, sort = 3)
    private String ram;        // 内存使用率

    @Length(min = 0, max = 64, message = "警告通知邮箱长度必须介于 0 和 64 之间")
    @ExcelField(title = "警告通知邮箱", align = 2, sort = 4)
    private String toEmail;        // 警告通知邮箱

    public Monitor() {
        super();
    }

    public Monitor(String id) {
        super(id);
    }

}