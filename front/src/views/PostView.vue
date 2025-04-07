<script setup lang="ts">

</script>

<template>

  <main>
    <div class="container">
      <h1 class="page-title">일반 게시글</h1>

      <div class="table-wrapper">
        <table class="posts-table">
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
            <td>10</td>
            <td><a href="post_detail.html?id=10" class="post-link">내향적인 게 죄는 아니잖아!</a></td>
            <td>작가이름</td>
            <td>2024-03-24</td>
          </tr>
          <tr>
            <td>9</td>
            <td><a href="post_detail.html?id=9" class="post-link">주목받고 있는 유일한 이야기들</a></td>
            <td>에디터</td>
            <td>2024-03-22</td>
          </tr>
          <tr>
            <td>8</td>
            <td><a href="post_detail.html?id=8" class="post-link">안녕? 산티아고 - 여행</a></td>
            <td>여행자</td>
            <td>2024-03-20</td>
          </tr>
          <tr>
            <td>7</td>
            <td><a href="post_detail.html?id=7" class="post-link">일상의 소소한 행복 찾기</a></td>
            <td>행복이</td>
            <td>2024-03-18</td>
          </tr>
          <tr>
            <td>6</td>
            <td><a href="post_detail.html?id=6" class="post-link">책 읽는 습관 만들기</a></td>
            <td>독서광</td>
            <td>2024-03-15</td>
          </tr>
          <tr>
            <td>5</td>
            <td><a href="post_detail.html?id=5" class="post-link">커피 한 잔의 여유</a></td>
            <td>카페인</td>
            <td>2024-03-12</td>
          </tr>
          <tr>
            <td>4</td>
            <td><a href="post_detail.html?id=4" class="post-link">영화 속 명대사 모음</a></td>
            <td>영화광</td>
            <td>2024-03-10</td>
          </tr>
          <tr>
            <td>3</td>
            <td><a href="post_detail.html?id=3" class="post-link">음악과 함께하는 아침</a></td>
            <td>음악인</td>
            <td>2024-03-08</td>
          </tr>
          <tr>
            <td>2</td>
            <td><a href="post_detail.html?id=2" class="post-link">요리의 즐거움</a></td>
            <td>요리사</td>
            <td>2024-03-05</td>
          </tr>
          <tr>
            <td>1</td>
            <td><a href="post_detail.html?id=1" class="post-link">첫 번째 이야기</a></td>
            <td>초보자</td>
            <td>2024-03-01</td>
          </tr>
          </tbody>
        </table>
      </div>

      <!-- 페이지네이션 -->
      <div class="pagination">
        <a href="posts.html?page=1" class="page-link active">1</a>
        <a href="posts.html?page=2" class="page-link">2</a>
        <a href="posts.html?page=3" class="page-link">3</a>
        <a href="posts.html?page=4" class="page-link">4</a>
        <a href="posts.html?page=5" class="page-link">5</a>
      </div>
    </div>
  </main>

</template>

<style scoped>
/* 일반 게시글 페이지 스타일 */
.page-title {
  font-size: 1.5rem;
  font-weight: 700;
  margin-bottom: 1.5rem;
  margin-top: 2rem;
}

.posts-table {
  width: 100%;
  border-collapse: collapse;
}

.posts-table th {
  background-color: var(--secondary);
  padding: 0.75rem 1rem;
  text-align: left;
  font-weight: 500;
}

.posts-table td {
  padding: 0.75rem 1rem;
  border-bottom: 1px solid var(--border-color);
}

.posts-table tr:hover {
  background-color: #f9f9f9;
}

.post-link:hover {
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