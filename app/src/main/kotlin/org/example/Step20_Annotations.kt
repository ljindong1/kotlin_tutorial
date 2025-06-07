package org.example

// 사용자 정의 애노테이션
@Target(AnnotationTarget.FUNCTION)
@Retention(AnnotationRetention.RUNTIME)
annotation class OnClick(val value: String)

// 애노테이션 사용 예
class UI {
    @OnClick("submitButton")
    fun handleSubmit() {
        println("Submit button clicked")
    }

    @Deprecated("Use handleSubmit instead", ReplaceWith("handleSubmit()"))
    fun oldSubmit() {
        println("Old submit logic")
    }

    companion object {
        @JvmStatic
        fun staticCall() {
            println("Static function called")
        }
    }
}

fun main() {
    val ui = UI()
    ui.handleSubmit()

    // @Deprecated 사용한 함수 호출 (IDE 경고 확인 가능)
    ui.oldSubmit()

    // @JvmStatic 메서드 호출 (Java에서 정적으로 접근 가능)
    UI.staticCall()
}
