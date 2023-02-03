package com.studio.system.mapper;

import com.studio.system.domain.Teacher;

import java.util.List;

/**
 * 老师Mapper接口
 *
 * @author ranxi
 * @date 2022-10-07
 */
public interface TeacherMapper
{
    /**
     * 查询老师
     *
     * @param id 老师主键
     * @return 老师
     */
    public Teacher selectTeacherById(Long id);

    /**
     * 查询老师列表
     *
     * @param teacher 老师
     * @return 老师集合
     */
    public List<Teacher> selectTeacherList(Teacher teacher);

    /**
     * 新增老师
     *
     * @param teacher 老师
     * @return 结果
     */
    public int insertTeacher(Teacher teacher);

    /**
     * 修改老师
     *
     * @param teacher 老师
     * @return 结果
     */
    public int updateTeacher(Teacher teacher);

    /**
     * 删除老师
     *
     * @param id 老师主键
     * @return 结果
     */
    public int deleteTeacherById(Long id);

    /**
     * 批量删除老师
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTeacherByIds(Long[] ids);
}
