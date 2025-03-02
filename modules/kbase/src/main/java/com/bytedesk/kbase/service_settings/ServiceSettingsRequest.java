/*
 * @Author: jackning 270580156@qq.com
 * @Date: 2024-06-14 10:45:08
 * @LastEditors: jackning 270580156@qq.com
 * @LastEditTime: 2025-01-13 12:53:39
 * @Description: bytedesk.com https://github.com/Bytedesk/bytedesk
 *   Please be aware of the BSL license restrictions before installing Bytedesk IM – 
 *  selling, reselling, or hosting Bytedesk IM as a service is a breach of the terms and automatically terminates your rights under the license.
 *  Business Source License 1.1: https://github.com/Bytedesk/bytedesk/blob/main/LICENSE 
 *  contact: 270580156@qq.com 
 *  联系：270580156@qq.com
 * Copyright (c) 2024 by bytedesk.com, All Rights Reserved. 
 */
package com.bytedesk.kbase.service_settings;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bytedesk.core.constant.BytedeskConsts;
import com.bytedesk.core.constant.I18Consts;
import com.bytedesk.core.enums.LanguageEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceSettingsRequest  implements Serializable {

    private static final long serialVersionUID = 1L;

    @Builder.Default
    private LanguageEnum language = LanguageEnum.ZH_CN;

    @Builder.Default
    private Boolean autoPopup = false;

    @Builder.Default
    private Boolean showTopTip = false;

    @Builder.Default    
    private String topTip = I18Consts.I18N_TOP_TIP;

    private LocalDateTime topTipStart;

    private LocalDateTime topTipEnd;

    // show rate btn on chat toolbar
    @Builder.Default
    private Boolean showRateBtn = false;

    @Builder.Default
    private Integer rateMsgCount = 3;

    @Builder.Default
    private Boolean showPreForm = false;

    @Builder.Default
    private String preForm = BytedeskConsts.EMPTY_JSON_STRING;

    @Builder.Default
    private Boolean showHistory = false;

    // 输入联想开关
    @Builder.Default
    private Boolean showInputAssociation = false;

    @Builder.Default
    private boolean showCaptcha = false;

    @Builder.Default
    private String welcomeTip = I18Consts.I18N_WELCOME_TIP;

    @Builder.Default
    private String queueTip = I18Consts.I18N_QUEUE_TIP;

    @Builder.Default
    private String leavemsgTip = I18Consts.I18N_LEAVEMSG_TIP;

    /** auto close time in min - 默认自动关闭时间，单位分钟 */
    @Builder.Default
    private Double autoCloseMin = Double.valueOf(25);

    // 桌面版聊天窗口右侧iframe
    @Builder.Default
    private Boolean showRightIframe = false;

    // 桌面版聊天窗口右侧iframe地址
    private String rightIframeUrl;

    // 是否显示预搜索
    @Builder.Default
    private Boolean showPreSearch = true;

    @Builder.Default
    private Boolean showFaqs = true;
    @Builder.Default
    private List<String> faqUids = new ArrayList<>();

    @Builder.Default
    private Boolean showQuickFaqs = true;
    @Builder.Default
    private List<String> quickFaqUids = new ArrayList<>();

    @Builder.Default
    private Boolean showGuessFaqs = true;
    @Builder.Default
    private List<String> guessFaqUids = new ArrayList<>();
    
    @Builder.Default
    private Boolean showHotFaqs = true;
    @Builder.Default
    private List<String> hotFaqUids = new ArrayList<>();

    @Builder.Default
    private Boolean showShortcutFaqs = true;
    @Builder.Default
    private List<String> shortcutFaqUids = new ArrayList<>();

    // 访客对话底部页面显示logo
    @Builder.Default
    private Boolean showLogo = true;

    // 有效日期
    private Date validateUntil;
}
