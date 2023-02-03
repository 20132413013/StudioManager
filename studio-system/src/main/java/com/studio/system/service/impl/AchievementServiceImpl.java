package com.studio.system.service.impl;

import java.util.List;
import com.studio.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studio.system.mapper.AchievementMapper;
import com.studio.system.domain.Achievement;
import com.studio.system.service.IAchievementService;

/**
 * 成果Service业务层处理
 * 
 * @author 理想三旬
 * @date 2022-10-07
 */
@Service
public class AchievementServiceImpl implements IAchievementService 
{
    @Autowired
    private AchievementMapper achievementMapper;

    /**
     * 查询成果
     * 
     * @param id 成果主键
     * @return 成果
     */
    @Override
    public Achievement selectAchievementById(Long id)
    {
        return achievementMapper.selectAchievementById(id);
    }

    /**
     * 查询成果列表
     * 
     * @param achievement 成果
     * @return 成果
     */
    @Override
    public List<Achievement> selectAchievementList(Achievement achievement)
    {
        return achievementMapper.selectAchievementList(achievement);
    }

    /**
     * 新增成果
     * 
     * @param achievement 成果
     * @return 结果
     */
    @Override
    public int insertAchievement(Achievement achievement)
    {
        achievement.setCreateTime(DateUtils.getNowDate());
        return achievementMapper.insertAchievement(achievement);
    }

    /**
     * 修改成果
     * 
     * @param achievement 成果
     * @return 结果
     */
    @Override
    public int updateAchievement(Achievement achievement)
    {
        achievement.setUpdateTime(DateUtils.getNowDate());
        return achievementMapper.updateAchievement(achievement);
    }

    /**
     * 批量删除成果
     * 
     * @param ids 需要删除的成果主键
     * @return 结果
     */
    @Override
    public int deleteAchievementByIds(Long[] ids)
    {
        return achievementMapper.deleteAchievementByIds(ids);
    }

    /**
     * 删除成果信息
     * 
     * @param id 成果主键
     * @return 结果
     */
    @Override
    public int deleteAchievementById(Long id)
    {
        return achievementMapper.deleteAchievementById(id);
    }
}
