package com.studio.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studio.common.annotation.Log;
import com.studio.common.core.controller.BaseController;
import com.studio.common.core.domain.AjaxResult;
import com.studio.common.enums.BusinessType;
import com.studio.system.domain.Achievement;
import com.studio.system.service.IAchievementService;
import com.studio.common.utils.poi.ExcelUtil;
import com.studio.common.core.page.TableDataInfo;

/**
 * 成果Controller
 *
 * @author 理想三旬
 * @date 2022-10-07
 */
@RestController
@RequestMapping("/project/achievement")
public class AchievementController extends BaseController {
    @Autowired
    private IAchievementService achievementService;

    /**
     * 查询成果列表
     */
    @PreAuthorize("@ss.hasPermi('project:achievement:list')")
    @GetMapping("/list")
    public TableDataInfo list(Achievement achievement) {
        startPage();
        List<Achievement> list = achievementService.selectAchievementList(achievement);
        return getDataTable(list);
    }

    /**
     * 导出成果列表
     */
    @PreAuthorize("@ss.hasPermi('project:achievement:export')")
    @Log(title = "成果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Achievement achievement) {
        List<Achievement> list = achievementService.selectAchievementList(achievement);
        ExcelUtil<Achievement> util = new ExcelUtil<Achievement>(Achievement.class);
        util.exportExcel(response, list, "成果数据");
    }

    /**
     * 获取成果详细信息
     */
    @PreAuthorize("@ss.hasPermi('project:achievement:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id) {
        return AjaxResult.success(achievementService.selectAchievementById(id));
    }

    /**
     * 新增成果
     */
    @PreAuthorize("@ss.hasPermi('project:achievement:add')")
    @Log(title = "成果", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Achievement achievement) {
        return toAjax(achievementService.insertAchievement(achievement));
    }

    /**
     * 修改成果
     */
    @PreAuthorize("@ss.hasPermi('project:achievement:edit')")
    @Log(title = "成果", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Achievement achievement) {
        return toAjax(achievementService.updateAchievement(achievement));
    }

    /**
     * 删除成果
     */
    @PreAuthorize("@ss.hasPermi('project:achievement:remove')")
    @Log(title = "成果", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids) {
        return toAjax(achievementService.deleteAchievementByIds(ids));
    }
}
