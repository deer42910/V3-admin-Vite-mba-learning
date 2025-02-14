<script setup>

//定义接收的props  使用 defineProps 来定义传入的 course 和 goToCourseDetail 方法。
const props = defineProps({
    course:{
        type:Object,  //course 是一个对象，包含课程的相关信息（如 id、title、description 等）。
        required: true
  },
  goToCourseDetail: {
    type: Function,  //goToCourseDetail 是一个方法，用于跳转到课程详情页面
    required: true
  }
});

</script>

<template>
    <el-card class="course-card">
      <template v-slot:header>
        <div>
          <span>{{ props.course.title }}</span>
        </div>
      </template>
  
      <div>
        <p>{{ props.course.description }}</p>
        <el-button type="primary" @click="props.goToCourseDetail(props.course.id)">查看详情</el-button>
      </div>
    </el-card>
  </template>

  <style scoped>
  .course-card {
    margin-bottom: 20px;
  }
  </style>