<!-- eslint-disable vue/multi-word-component-names -->
// eslint-disable-next-line vue/multi-word-component-names
<script setup>
import {ref} from 'vue';
import { useRouter } from 'vue-router';
const courses = ref([
    {id: 1, title: 'Java 编程', description: '学习 Java 的基础知识和应用'},
    { id: 2, title: 'Python 编程', description: '掌握 Python 数据分析和机器学习技能' },
    { id: 3, title: '数据结构与算法', description: '深入理解数据结构和算法' }
]);//用来存储数据

//获取路由实例
const router = useRouter();

//跳转到课程详情页面
const goToCourseDetail = (courseId) =>{
   router.push(`/courses/${courseId}`);//跳转到动态路由  注意：反引号
};


</script>
<template>
    <div class="courses">
        <h1>课程列表</h1>
        <el-card v-for = "course in courses" :key="course.id" class="course-card">
            <!-- 使用 v-slot 来替代 slot="header" -->
        <template v-slot:header>
            <div>
            <span>{{ course.title }}</span>
            </div>
        </template>
            <div>
                <p>{{ course.description }}</p>
                <el-button type="primary" @click="goToCourseDetail(course.id)">查看详情</el-button>
            </div>
        </el-card>
    </div>
</template>

<style scoped>
.courses{
    padding: 20px;
}
.course-card {
 margin-bottom: 20px;
}
</style>