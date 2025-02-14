<script setup>
import { ref, onMounted } from 'vue';
import { useRoute } from 'vue-router';

const route = useRoute(); // 获取当前路由
const courseId = ref(route.params.id); // 获取课程ID
const course = ref(null); // 用来存储课程数据

// 模拟一个课程数据的请求
onMounted(() => {
  // 这里你可以通过 API 请求课程的详细数据，暂时模拟一个数据
  course.value = {
    id: courseId.value,
    title: 'Java 编程',
    description: '学习 Java 的基础知识和应用，适合初学者。',
    details: '这门课程将涵盖 Java 基础语法、面向对象编程、数据结构、算法等内容。'
  };
});
</script>

<template>
  <div class="course-detail">
    <h1>{{ course?.title }}</h1>
    <p>{{ course?.description }}</p>
    <div v-if="course?.details">
      <h3>课程详情</h3>
      <p>{{ course?.details }}</p>
    </div>
  </div>
</template>

<style scoped>
.course-detail {
  padding: 20px;
}
</style>
