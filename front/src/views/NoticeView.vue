<script setup lang="ts">

</script>

<template>

  <main>
    <div class="container">
      <h1 class="page-title">공지사항</h1>

      <div class="table-wrapper">
        <table class="notice-table">
          <thead>
          <tr>
            <th class="col-num">번호</th>
            <th>제목</th>
            <th class="col-author">글쓴이</th>
            <th class="col-date">등록일</th>
          </tr>
          </thead>
          <tbody>
          <tr>
            <td>5</td>
            <td><a href="notice_detail.html?id=5" class="notice-link">사이트 개편 안내</a></td>
            <td>관리자</td>
            <td>2024-03-24</td>
          </tr>
          <tr>
            <td>4</td>
            <td><a href="notice_detail.html?id=4" class="notice-link">신규 작가 모집</a></td>
            <td>에디터</td>
            <td>2024-03-20</td>
          </tr>
          <tr>
            <td>3</td>
            <td><a href="notice_detail.html?id=3" class="notice-link">이용약관 개정 안내</a></td>
            <td>관리자</td>
            <td>2024-03-15</td>
          </tr>
          <tr>
            <td>2</td>
            <td><a href="notice_detail.html?id=2" class="notice-link">2024년 콘텐츠 방향성 안내</a></td>
            <td>에디터</td>
            <td>2024-02-28</td>
          </tr>
          <tr>
            <td>1</td>
            <td><a href="notice_detail.html?id=1" class="notice-link">블로그 오픈 안내</a></td>
            <td>관리자</td>
            <td>2024-02-15</td>
          </tr>
          </tbody>
        </table>
      </div>

      <!-- 페이지네이션 -->
      <div class="pagination">
        <a href="notice.html?page=1" class="page-link active">1</a>
        <a href="notice.html?page=2" class="page-link">2</a>
        <a href="notice.html?page=3" class="page-link">3</a>
        <a href="notice.html?page=4" class="page-link">4</a>
        <a href="notice.html?page=5" class="page-link">5</a>
      </div>
    </div>
  </main>
</template>

<style scoped>
/* 공지사항 페이지 스타일 */
.page-title {
  font-size: 1.5rem;
  font-weight: 700;
  margin-bottom: 1.5rem;
  margin-top: 2rem;
}

.notice-table {
  width: 100%;
  border-collapse: collapse;
}

.notice-table th {
  background-color: var(--secondary);
  padding: 0.75rem 1rem;
  text-align: left;
  font-weight: 500;
}

.notice-table td {
  padding: 0.75rem 1rem;
  border-bottom: 1px solid var(--border-color);
}

.notice-table tr:hover {
  background-color: #f9f9f9;
}

.notice-link:hover {
  color: var(--primary);
}

.pagination {
  display: flex;
  justify-content: center;
  padding: 2rem 0;
}

.page-link {
  width: 2rem;
  height: 2rem;
  display: flex;
  align-items: center;
  justify-content: center;
  border-radius: 50%;
  margin: 0 0.25rem;
}

.page-link.active {
  background-color: var(--primary);
  color: white;
}

.page-link:not(.active):hover {
  background-color: var(--secondary);
}

.table-wrapper {
  overflow-x: auto;
}

.col-num {
  width: 4rem;
}

.col-author, .col-date {
  width: 8rem;
}

@media (max-width: 768px) {
  .col-author, .col-date {
    width: 6rem;
  }
}
</style>