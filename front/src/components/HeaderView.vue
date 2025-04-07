<script setup lang="ts">

</script>

<template>
  <header class="main-header">
  <div class="container header-container">
    <!-- 모바일 메뉴 버튼 -->
    <button class="mobile-menu-button" id="menuOpenBtn" aria-label="메뉴 열기">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><line x1="4" x2="20" y1="12" y2="12"/><line x1="4" x2="20" y1="6" y2="6"/><line x1="4" x2="20" y1="18" y2="18"/></svg>
    </button>

    <!-- 블로그 로고 -->
    <a href="/" class="logo">
      <span class="brunch-title">
        <span class="brunch-highlight">작품이 되는 이야기</span>, 스토리
      </span>
    </a>

    <!-- 데스크탑 네비게이션 -->
    <nav class="desktop-nav">
      <a href="/" class="nav-link">메인 소개</a>
      <a href="/notice" class="nav-link">공지사항</a>
      <a href="/posts" class="nav-link">일반 게시글</a>
      <a href="/config" class="nav-link">설정</a>
    </nav>

    <!-- 사용자 메뉴 -->
    <div class="user-menu">
      <a href="/login" class="login-button" id="loginButton">로그인</a>
      <div class="user-profile" id="userProfile" style="display: none;">
        <img src="" alt="프로필 이미지" class="profile-image">
        <div class="user-dropdown">
          <a href="/config">내 정보</a>
          <a href="/logout" id="logoutButton">로그아웃</a>
        </div>
      </div>
    </div>

    <!-- 검색 버튼 및 검색창 -->
    <div class="search-container">
      <button class="search-button" id="searchToggleBtn" aria-label="검색">
        <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="11" cy="11" r="8"/><path d="m21 21-4.3-4.3"/></svg>
      </button>
      <div class="search-box" id="searchBox">
        <form id="searchForm" action="search_results.html" method="get">
          <input type="text" name="query" id="searchInput" placeholder="검색어를 입력하세요" aria-label="검색어 입력">
          <button type="submit" class="search-submit" aria-label="검색 실행">
            <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><circle cx="11" cy="11" r="8"/><path d="m21 21-4.3-4.3"/></svg>
          </button>
        </form>
      </div>
    </div>
  </div>
  </header>

  <!-- 모바일 메뉴 -->
  <div class="mobile-menu" id="mobileMenu">
    <div class="mobile-menu-header">
      <a href="/" class="logo">
        <span class="brunch-title">브런치스토리</span>
      </a>
      <button id="menuCloseBtn" aria-label="메뉴 닫기">
        <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M18 6 6 18"/><path d="m6 6 12 12"/></svg>
      </button>
    </div>
    <nav class="mobile-nav">
      <a href="/" class="mobile-nav-link">메인 소개</a>
      <a href="/notice" class="mobile-nav-link">공지사항</a>
      <a href="/posts" class="mobile-nav-link">일반 게시글</a>
      <a href="/config" class="mobile-nav-link">설정</a>
      <div class="mobile-user-menu">
        <a href="/login" class="mobile-nav-link" id="mobileLoginButton">로그인</a>
        <a href="/logout" class="mobile-nav-link" id="mobileLogoutButton" style="display: none;">로그아웃</a>
      </div>
    </nav>
  </div>
</template>

<style scoped>

</style>