package com.zhihaoliang.demo.service

import com.zhihaoliang.demo.model.AyMood

/**
 *
 * @author zhihaoliang
 * @date 2019/10/1011:20 AM
 * @version：1.0.0
 */
interface AyMoodService {
    fun save(ayMood: AyMood):Int

    fun read():List<AyMood>

    fun asynSave(ayMood: AyMood):String
}