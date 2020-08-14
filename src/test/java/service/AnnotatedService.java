package service;

import lombok.Data;
import org.springframework.stereotype.Service;

/**
 * @ClassName AnnotatedService
 * @Description AnnotatedService
 * @Author fengwei
 * @Date 2019/7/14 16:36
 * @Version 3.0.0
 * @Copyright: Copyright 2018 Thunisoft, Inc. All rights reserved.
 * THUNISOFT PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 **/
@Service
@Data
public class AnnotatedService {
    private String name = "annotatedService demo";
}
