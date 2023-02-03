package com.studio.system.service;

import java.util.List;
import com.studio.system.domain.Achievement;

/**
 * 成果Service接口
 * 
 * @author 理想三旬
 * @date 2022-10-07
 */
public interface IAchievementService 
{
    /**
     * 查询成果
     * 
     * @param id 成果主键
     * @return 成果
     */
    public Achievement selectAchievementById(Long id);

    /**
     * 查询成果列表
     * 
     * @param achievement 成果
     * @return 成果集合
     */
    public List<Achievement> selectAchievementList(Achievement achievement);

    /**
     * 新增成果
     * 
     * @param achievement 成果
     * @return 结果
     */
    public int insertAchievement(Achievement achievement);

    /**
     * 修改成果
     * 
     * @param achievement 成果
     * @return 结果
     */
    public int updateAchievement(Achievement achievement);

    /**
     * 批量删除成果
     * 
     * @param ids 需要删除的成果主键集合
     * @return 结果
     */
    public int deleteAchievementByIds(Long[] ids);

    /**
     * 删除成果信息
     * 
     * @param id 成果主键
     * @return 结果
     */
    public int deleteAchievementById(Long id);
}
