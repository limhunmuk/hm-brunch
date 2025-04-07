<script setup lang="ts">
import { ref } from 'vue';
import axios from "axios";
import {useRouter} from "vue-router";
import {c} from "vite/dist/node/moduleRunnerTransport.d-CXw_Ws6P";
const route = useRouter();

const login = ref({
  loginId: "admin",
  password: "1234"
});

const loginProc = () => {

  if(login.value.loginId == null || login.value.loginId == "" || login.value.loginId == undefined){
    alert("아이디를 입력해주세요");
    return;
  }

  if(login.value.password == null || login.value.password == "" || login.value.password == undefined){
    alert("비밀번호를 입력해주세요");
    return;
  }

  console.log("==================================");
  console.log("id : " + login.value.loginId);
  console.log("pw : " + login.value.password);

  axios.post('/api/login', {
    loginId: login.value.loginId,
    password: login.value.password
  }).then((response) => {

    console.log(response);
    console.log("==================================");

    localStorage.setItem("accessToken", response.data.accessToken);
    localStorage.setItem("refreshToken", response.data.refreshToken);
    localStorage.setItem("member", response.data.member);
    console.log(response.data);
    console.log("==================================");

    route.push("/");

  }).catch((error) => {
    console.log(error);
  });
}

</script>

<template>

  <main>
    <div class="container">
      <div class="login-container">
        <h1 class="login-title">로그인</h1>

        <form id="loginForm">
          <div class="form-group">
            <label for="email" class="form-label">이메일</label>
            <input type="email" id="email" class="form-input" placeholder="이메일을 입력하세요" required v-model="login.loginId">
          </div>

          <div class="form-group">
            <label for="password" class="form-label">비밀번호</label>
            <input type="password" id="password" class="form-input" placeholder="비밀번호를 입력하세요" required v-model="login.password">
          </div>

          <div class="remember-me">
            <input type="checkbox" id="rememberMe">
            <label for="rememberMe">로그인 상태 유지</label>
          </div>

          <button type="button" class="login-button" @click="loginProc">로그인</button>

          <div class="login-options">
            <a href="#" class="login-option">아이디 찾기</a>
            <a href="#" class="login-option">비밀번호 찾기</a>
            <a href="#" class="login-option">회원가입</a>
          </div>
        </form>

        <div class="login-divider">또는</div>

        <div class="social-login">
          <button class="social-button" title="네이버 로그인">
            <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
              <path d="M18.1667 0H1.83333C0.825 0 0 0.825 0 1.83333V18.1667C0 19.175 0.825 20 1.83333 20H18.1667C19.175 20 20 19.175 20 18.1667V1.83333C20 0.825 19.175 0 18.1667 0Z" fill="#03C75A"/>
              <path d="M11.3583 10.625L8.54167 6.45833H6.45833V13.5417H8.64167V9.375L11.4583 13.5417H13.5417V6.45833H11.3583V10.625Z" fill="white"/>
            </svg>
          </button>
          <button class="social-button" title="카카오 로그인">
            <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
              <path d="M10 0C4.48 0 0 3.58 0 8C0 10.84 1.72 13.35 4.4 14.73C4.2 15.5 3.64 17.29 3.54 17.67C3.42 18.13 3.72 18.12 3.92 18.01C4.07 17.93 6.42 16.44 7.4 15.82C8.23 15.97 9.11 16.05 10 16.05C15.52 16.05 20 12.47 20 8.05C20 3.63 15.52 0 10 0Z" fill="#FFE812"/>
              <path d="M4.5 8.95C4.5 8.42 4.95 8 5.5 8C6.05 8 6.5 8.42 6.5 8.95C6.5 9.48 6.05 9.9 5.5 9.9C4.95 9.9 4.5 9.48 4.5 8.95ZM8.5 8.95C8.5 8.42 8.95 8 9.5 8C10.05 8 10.5 8.42 10.5 8.95C10.5 9.48 10.05 9.9 9.5 9.9C8.95 9.9 8.5 9.48 8.5 8.95ZM12.5 8.95C12.5 8.42 12.95 8 13.5 8C14.05 8 14.5 8.42 14.5 8.95C14.5 9.48 14.05 9.9 13.5 9.9C12.95 9.9 12.5 9.48 12.5 8.95Z" fill="#381F1F"/>
            </svg>
          </button>
          <button class="social-button" title="구글 로그인">
            <svg width="20" height="20" viewBox="0 0 20 20" fill="none" xmlns="http://www.w3.org/2000/svg">
              <path d="M19.8055 10.2275C19.8055 9.51169 19.7516 8.79587 19.6347 8.10107H10.2002V11.8883H15.6016C15.3768 13.1913 14.6569 14.3138 13.5794 15.0656V17.5757H16.8108C18.6999 15.8457 19.8055 13.2732 19.8055 10.2275Z" fill="#4285F4"/>
              <path d="M10.2002 20.0001C12.897 20.0001 15.1714 19.1051 16.8108 17.5757L13.5794 15.0656C12.6847 15.6676 11.5343 16.0426 10.2002 16.0426C7.54261 16.0426 5.28523 14.2757 4.51336 11.8701H1.16699V14.4626C2.80523 17.7576 6.2186 20.0001 10.2002 20.0001Z" fill="#34A853"/>
              <path d="M4.51337 11.8701C4.13837 10.6751 4.13837 9.3801 4.51337 8.1851V5.59259H1.16699C-0.388008 8.4426 -0.388008 11.6126 1.16699 14.4626L4.51337 11.8701Z" fill="#FBBC04"/>
              <path d="M10.2002 3.95753C11.6532 3.93653 13.0603 4.47653 14.1378 5.45653L17.0266 2.60653C15.1894 0.904034 12.7347 -0.0234664 10.2002 0.000533581C6.2186 0.000533581 2.80523 2.24303 1.16699 5.59253L4.51336 8.18503C5.28523 5.77953 7.54261 4.01253 10.2002 3.95753Z" fill="#EA4335"/>
            </svg>
          </button>
        </div>
      </div>
    </div>
  </main>
</template>

<style scoped>
/* 로그인 페이지 스타일 */
.login-container {
  max-width: 400px;
  margin: 3rem auto;
  padding: 2rem;
  background-color: white;
  border-radius: 0.5rem;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
}

.login-title {
  font-size: 1.5rem;
  font-weight: 700;
  margin-bottom: 1.5rem;
  text-align: center;
}

.form-group {
  margin-bottom: 1.5rem;
}

.form-label {
  display: block;
  font-size: 0.875rem;
  font-weight: 500;
  color: #555;
  margin-bottom: 0.5rem;
}

.form-input {
  width: 100%;
  padding: 0.75rem;
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

.login-button {
  width: 100%;
  padding: 0.75rem;
  background-color: var(--primary);
  color: white;
  border: none;
  border-radius: 0.25rem;
  font-size: 1rem;
  font-weight: 500;
  cursor: pointer;
  transition: background-color 0.2s;
}

.login-button:hover {
  background-color: rgba(26, 88, 74, 0.9);
}

.login-options {
  display: flex;
  justify-content: space-between;
  margin-top: 1rem;
  font-size: 0.875rem;
}

.login-option {
  color: #666;
  text-decoration: none;
}

.login-option:hover {
  color: var(--primary);
  text-decoration: underline;
}

.login-divider {
  display: flex;
  align-items: center;
  margin: 2rem 0;
  color: #999;
  font-size: 0.875rem;
}

.login-divider::before,
.login-divider::after {
  content: "";
  flex: 1;
  height: 1px;
  background-color: var(--border-color);
}

.login-divider::before {
  margin-right: 1rem;
}

.login-divider::after {
  margin-left: 1rem;
}

.social-login {
  display: flex;
  justify-content: center;
  gap: 1rem;
}

.social-button {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 3rem;
  height: 3rem;
  border-radius: 50%;
  background-color: #f5f5f5;
  border: 1px solid var(--border-color);
  cursor: pointer;
  transition: background-color 0.2s;
}

.social-button:hover {
  background-color: #eaeaea;
}

.remember-me {
  display: flex;
  align-items: center;
  margin-bottom: 1.5rem;
}

.remember-me input {
  margin-right: 0.5rem;
}
</style>