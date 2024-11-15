import com.formdev.flatlaf.FlatDarkLaf
import javax.swing.SwingUtilities

fun main() {

    SwingUtilities.invokeLater {

        FlatDarkLaf.setup()
        val frame = Frame()
        frame.makeVisible()
    }
}