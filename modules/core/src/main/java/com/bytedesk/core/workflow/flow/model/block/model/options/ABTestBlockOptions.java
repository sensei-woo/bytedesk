/*
 * @Author: jackning 270580156@qq.com
 * @Date: 2024-12-10 17:06:05
 * @LastEditors: jackning 270580156@qq.com
 * @LastEditTime: 2024-12-10 17:56:46
 * @Description: bytedesk.com https://github.com/Bytedesk/bytedesk
 *   Please be aware of the BSL license restrictions before installing Bytedesk IM – 
 *  selling, reselling, or hosting Bytedesk IM as a service is a breach of the terms and automatically terminates your rights under the license.
 *  Business Source License 1.1: https://github.com/Bytedesk/bytedesk/blob/main/LICENSE 
 *  contact: 270580156@qq.com 
 *  技术/商务联系：270580156@qq.com
 * Copyright (c) 2024 by bytedesk.com, All Rights Reserved. 
 */
package com.bytedesk.core.workflow.flow.model.block.model.options;

import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.List;

import com.bytedesk.core.workflow.flow.model.block.model.BlockOptions;

@Data
@EqualsAndHashCode(callSuper = true)
public class ABTestBlockOptions extends BlockOptions {
    private List<TestVariant> variants;
    private String variableName;  // 存储选中变体的变量名
    private boolean persistentSelection;  // 是否保持选择结果
    private SelectionMode selectionMode;  // 选择模式
}
