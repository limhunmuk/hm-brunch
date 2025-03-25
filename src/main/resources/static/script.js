// 모바일 메뉴 토글
const menuOpenBtn = document.getElementById("menuOpenBtn")
const menuCloseBtn = document.getElementById("menuCloseBtn")
const mobileMenu = document.getElementById("mobileMenu")

menuOpenBtn.addEventListener("click", () => {
    mobileMenu.classList.add("active")
})

menuCloseBtn.addEventListener("click", () => {
    mobileMenu.classList.remove("active")
})

// 모바일 메뉴 링크 클릭 시 메뉴 닫기
const mobileNavLinks = document.querySelectorAll(".mobile-nav-link")
mobileNavLinks.forEach((link) => {
    link.addEventListener("click", () => {
        mobileMenu.classList.remove("active")
    })
})

