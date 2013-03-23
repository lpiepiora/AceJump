package com.johnlindquist.acejump.keycommands

import com.intellij.util.EventDispatcher
import java.awt.event.KeyEvent
import javax.swing.event.ChangeListener

abstract class AceKeyCommand {
    open var eventDispatcher:EventDispatcher<ChangeListener>? = JavaInterop.createChangeListener()

    abstract fun execute(keyEvent:KeyEvent)

    fun addListener(changeListener:ChangeListener){
        eventDispatcher?.addListener(changeListener);
    }

}