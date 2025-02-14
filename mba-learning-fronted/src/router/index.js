import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/HomeView.vue'
import Courses from '@/views/Courses.vue'
import CourseDetail from '@/views/CourseDetail.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
    },
    {
      path:'/courses',
      name:'courses',
      component:Courses,
    },
    {
      path:'/courses/:id',
      component:CourseDetail, 
      props: true,
    }
    
  ],
})

export default router
