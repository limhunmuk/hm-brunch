<script setup lang="ts">

</script>

<template>
  <main>
    <div class="container">
      <h1 class="page-title" style="text-align: center">설정</h1>

      <div class="settings-card">
        <h2 class="settings-title">내 정보 관리</h2>

        <!-- 프로필 이미지 -->
        <div class="profile-image-container">
          <div class="profile-image" id="profileImageContainer">
            <div class="camera-icon" id="cameraIcon">
              <svg xmlns="http://www.w3.org/2000/svg" width="32" height="32" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M14.5 4h-5L7 7H4a2 2 0 0 0-2 2v9a2 2 0 0 0 2 2h16a2 2 0 0 0 2-2V9a2 2 0 0 0-2-2h-3l-2.5-3z"/><circle cx="12" cy="13" r="3"/></svg>
            </div>
            <img id="profileImagePreview" style="display: none;" alt="프로필 이미지">
          </div>
          <input type="file" id="profileImageInput" accept="image/*" style="display: none;">
          <button class="profile-image-button" id="profileImageButton">
            프로필 사진 등록
          </button>
        </div>

        <!-- 개인정보 폼 -->
        <form id="profileForm">
          <div class="form-grid">
            <div class="form-group">
              <label for="name" class="form-label">이름</label>
              <input type="text" id="name" class="form-input" placeholder="이름을 입력하세요">
            </div>

            <div class="form-group">
              <label for="nickname" class="form-label">닉네임</label>
              <input type="text" id="nickname" class="form-input" placeholder="닉네임을 입력하세요">
            </div>
          </div>

          <div class="form-group">
            <label for="phone" class="form-label">휴대번호</label>
            <input type="tel" id="phone" class="form-input" placeholder="휴대번호를 입력하세요 (예: 010-1234-5678)">
          </div>

          <div class="form-group">
            <label for="address" class="form-label">주소</label>
            <input type="text" id="address" class="form-input" placeholder="주소를 입력하세요">
          </div>

          <div class="form-group">
            <label for="addressDetail" class="form-label">상세주소</label>
            <input type="text" id="addressDetail" class="form-input" placeholder="상세주소를 입력하세요">
          </div>

          <div class="form-actions">
            <button type="submit" class="save-button">
              저장하기
            </button>
          </div>
        </form>
      </div>
    </div>
  </main>
</template>

<style scoped>
/* 설정 페이지 스타일 */
.page-title {
  font-size: 1.5rem;
  font-weight: 700;
  margin-bottom: 1.5rem;
  margin-top: 2rem;
}

.settings-card {
  max-width: 42rem;
  margin: 0 auto;
  background-color: white;
  border-radius: 0.5rem;
  box-shadow: 0 1px 3px rgba(0, 0, 0, 0.1);
  border: 1px solid var(--border-color);
  padding: 1.5rem;
}

.settings-title {
  font-size: 1.25rem;
  font-weight: 600;
  margin-bottom: 1.5rem;
}

.profile-image-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  margin-bottom: 2rem;
}

.profile-image {
  width: 8rem;
  height: 8rem;
  border-radius: 50%;
  overflow: hidden;
  background-color: var(--secondary);
  margin-bottom: 1rem;
  display: flex;
  align-items: center;
  justify-content: center;
  cursor: pointer;
}

.profile-image img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.profile-image-button {
  color: var(--primary);
  font-size: 0.875rem;
}

.form-grid {
  display: grid;
  grid-template-columns: 1fr;
  gap: 1.5rem;
  margin-bottom: 1.5rem;
}

@media (min-width: 768px) {
  .form-grid {
    grid-template-columns: 1fr 1fr;
  }
}

.form-group {
  margin-bottom: 1.5rem;
}

.form-label {
  display: block;
  font-size: 0.875rem;
  font-weight: 500;
  color: #555;
  margin-bottom: 0.25rem;
}

.form-input {
  width: 100%;
  padding: 0.5rem 0.75rem;
  border: 1px solid var(--border-color);
  border-radius: 0.25rem;
  font-family: inherit;
  font-size: 1rem;
}

.form-input:focus {
  outline: none;
  border-color: var(--primary);
  box-shadow: 0 0 0 2px rgba(26, 88, 74, 0.2);
}

.form-actions {
  display: flex;
  justify-content: flex-end;
}

.save-button {
  background-color: var(--primary);
  color: white;
  padding: 0.5rem 1rem;
  border-radius: 0.25rem;
  font-weight: 500;
  transition: background-color 0.2s;
}

.save-button:hover {
  background-color: rgba(26, 88, 74, 0.9);
}

.camera-icon {
  color: #aaa;
}
</style>