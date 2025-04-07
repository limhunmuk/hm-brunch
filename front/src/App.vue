<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
import HeaderView from "@/components/HeaderView.vue";
</script>

<template>
  <!-- 상단 알림 배너 -->
  <div class="top-banner">
    <span>새롭게 선보이는 브런치 작가 맴버십을 구독해 보세요.</span>
  </div>
  <!-- 헤더 영역 -->
  <HeaderView />
  <RouterView />
</template>

<style scoped>

</style>
