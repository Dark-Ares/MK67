package Question2

import kotlin.jvm.JvmStatic
import java.util.Calendar

object Calendar2 {
    @JvmStatic
    fun main(args: Array<String>) {
        val calendar = Calendar.getInstance()
        println(" Calendar's Year: " + calendar[Calendar.YEAR])
        println(" Calendar's Day: " + calendar[Calendar.DATE])
        println(" MINUTE: " + calendar[Calendar.MINUTE])
        println(" SECOND: " + calendar[Calendar.SECOND])
    }
}