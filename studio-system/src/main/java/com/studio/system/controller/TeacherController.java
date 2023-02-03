package com.studio.system.controller;

import com.studio.common.annotation.Log;
import com.studio.common.core.controller.BaseController;
import com.studio.common.core.domain.AjaxResult;
import com.studio.common.core.page.TableDataInfo;
import com.studio.common.enums.BusinessType;
import com.studio.common.utils.poi.ExcelUtil;
import com.studio.system.domain.Teacher;
import com.studio.system.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 老师Controller
 *
 * @author ranxi
 * @date 2022-10-07
 */
@RestController
@RequestMapping("/system/teacher")
public class TeacherController extends BaseController
{
    @Autowired
    private ITeacherService teacherService;

    /**
     * 查询老师列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:list')")
    @GetMapping("/list")
    public TableDataInfo list(Teacher teacher)
    {
        startPage();
        List<Teacher> list = teacherService.selectTeacherList(teacher);
        return getDataTable(list);
    }

    /**
     * 导出老师列表
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:export')")
    @Log(title = "老师", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Teacher teacher)
    {
        List<Teacher> list = teacherService.selectTeacherList(teacher);
        ExcelUtil<Teacher> util = new ExcelUtil<Teacher>(Teacher.class);
        util.exportExcel(response, list, "老师数据");
    }

    /**
     * 获取老师详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(teacherService.selectTeacherById(id));
    }

    /**
     * 新增老师
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:add')")
    @Log(title = "老师", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Teacher teacher)
    {
        teacher.setCreateBy(getUsername());
        return toAjax(teacherService.insertTeacher(teacher));
    }

    /**
     * 修改老师
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:edit')")
    @Log(title = "老师", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Teacher teacher)
    {
        teacher.setUpdateBy(getUsername());
        return toAjax(teacherService.updateTeacher(teacher));
    }

    /**
     * 删除老师
     */
    @PreAuthorize("@ss.hasPermi('system:teacher:remove')")
    @Log(title = "老师", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(teacherService.deleteTeacherByIds(ids));
    }
}
