
package otrasFunciones;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;

public class UndoRedo {
    
    JTextArea textArea;
    UndoManager undoManager = new UndoManager();

    public UndoRedo(JTextArea textArea) {
        this.textArea = textArea;
        manejoTextArea();
    }
    
    private void manejoTextArea() {
        
        textArea.getDocument().addUndoableEditListener(new UndoableEditListener() {
            @Override
            public void undoableEditHappened(UndoableEditEvent e) {
                undoManager.addEdit(e.getEdit());
            }
        });
    }
    
    public void notarEdiciones(Component undo, Component redo) {
        
        if (undoManager.canUndo()) {
            undo.setEnabled(true);
        } else {
            undo.setEnabled(false);
        }
        
        if (undoManager.canRedo()) {
            redo.setEnabled(true);
        } else {
            redo.setEnabled(false);
        }
        
    }
    
    public void undo() {
        undoManager.undo();
    }
    
    public void redo() {
        undoManager.redo();
    }
}
