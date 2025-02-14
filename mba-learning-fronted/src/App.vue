<template>
  <div id="app">
    <el-header>
      <div class="logo">MBA学习平台</div>
      <el-menu :default-active="activeIndex" class="el-menu-demo" mode="horizontal">
        <el-menu-item index="1" @click="goHome">首页</el-menu-item>
        <el-menu-item index="2" @click="goCourses">课程</el-menu-item>
        <el-menu-item index="3" @click="goProfile">个人中心</el-menu-item>
      </el-menu>
    </el-header>

    <el-main>
      <router-view></router-view>
    </el-main>
  </div>
</template>

<script setup>
import { ElMenu, ElMenuItem, ElHeader, ElMain } from 'element-plus';
import { ref } from 'vue';
import { useRouter } from 'vue-router';

const activeIndex = ref('1');
const router = useRouter();

const goHome = () => {
  router.push('/');
};

const goCourses = () => {
  router.push('/courses');
};

const goProfile = () => {
  router.push('/profile');
};
</script>

<style>
#app {
  text-align: center;
}
.logo {
  font-size: 24px;
  color: blue;
  padding: 10px;
}
</style>
