package com.studio.system.service.impl;

import com.studio.system.domain.Teacher;
import com.studio.system.mapper.TeacherMapper;
import com.studio.system.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 老师Service业务层处理
 *
 * @author ranxi
 * @date 2022-10-07
 */
@Service
public class TeacherServiceImpl implements ITeacherService
{
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 查询老师
     *
     * @param id 老师主键
     * @return 老师
     */
    @Override
    public Teacher selectTeacherById(Long id)
    {
        return teacherMapper.selectTeacherById(id);
    }

    /**
     * 查询老师列表
     *
     * @param teacher 老师
     * @return 老师
     */
    @Override
    public List<Teacher> selectTeacherList(Teacher teacher)
    {
        return teacherMapper.selectTeacherList(teacher);
    }

    /**
     * 新增老师
     *
     * @param teacher 老师
     * @return 结果
     */
    @Override
    public int insertTeacher(Teacher teacher)
    {
        return teacherMapper.insertTeacher(teacher);
    }

    /**
     * 修改老师
     *
     * @param teacher 老师
     * @return 结果
     */
    @Override
    public int updateTeacher(Teacher teacher)
    {
        return teacherMapper.updateTeacher(teacher);
    }

    /**
     * 批量删除老师
     *
     * @param ids 需要删除的老师主键
     * @return 结果
     */
    @Override
    public int deleteTeacherByIds(Long[] ids)
    {
        return teacherMapper.deleteTeacherByIds(ids);
    }

    /**
     * 删除老师信息
     *
     * @param id 老师主键
     * @return 结果
     */
    @Override
    public int deleteTeacherById(Long id)
    {
        return teacherMapper.deleteTeacherById(id);
    }
}
