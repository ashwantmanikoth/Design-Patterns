package L08.Command;

import java.util.ArrayList;

public class VideoEditor {

  String text;
  private float contrast = 0.5f;
  private final ArrayList<Command> commandStack = new ArrayList<>();

  public void setText(String text) {
    this.text = text;
  }

  public void removeText() {
    this.text = "";
  }

  public float getContrast() {
    return contrast;
  }

  public void setContrast(float contrast) {
    this.contrast = contrast;
  }

  public void executeCommand(Command command) {
    command.execute();
    this.commandStack.add(command);
  }

  public void undoCommand() {
    if (!this.commandStack.isEmpty()) {
      Command command = commandStack.remove(commandStack.size() - 1);
      command.undo();
    }
  }

  @Override
  public String toString() {
    return "VideoEditor{" +
        "contrast=" + contrast +
        ", text='" + text + '\'' +
        '}';
  }
}
