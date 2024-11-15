import javax.swing.JFrame

class Frame {

    private val frame = JFrame()
    private val title = "David Calculator"
    private val width = 350
    private val height = 400

    init {

        frame.title = title
        frame.setSize(width, height)
        frame.setLocationRelativeTo(null)
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    }

    fun makeVisible() {

        frame.isVisible = true
    }
}