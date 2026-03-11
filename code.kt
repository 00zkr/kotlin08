class Comment(
    val userId: Int,
    val message: String
)

fun main() {
    val comments = listOf(
        Comment(5241, "Nice code"),
        Comment(6624, "Like it"),
        Comment(5224, "What's going on?"),
        Comment(9001, "check out my website"),
        Comment(8818, "Hello everyone :)")
    )

    val blockedUserIds = setOf(5224, 9001)
    val userIdToRelation = mapOf(
        5241 to "Friend",
        6624 to "work Colleague",
    )

    for (comment in comments) {
        if (comment.userId in blockedUserIds) {
            println("Blocked comment from user ${comment.userId}")
            continue
        }

        val relation = userIdToRelation[comment.userId] ?: "Unknown"
        println("Comment ${comment.message} from ${relation}")
    }
}