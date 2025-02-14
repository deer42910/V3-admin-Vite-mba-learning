<script setup>
import { useRouter } from 'vue-router';
const router = useRouter();
const goToCourses = ()=>{
    router.push('/courses');//跳转到课程页面
}
</script>

<template>
  <div class="home">
    <h1>欢迎来到 MBA 学习平台</h1>
    <el-button type="primary" @click="goToCourses">查看课程</el-button>
  </div>
</template>

<style scoped>
.home{
    padding: 20px;
    text-align: center;
}
</style>
