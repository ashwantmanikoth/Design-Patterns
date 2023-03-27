package L08.Command;

public class SetTextCommand implements Command {

  private final VideoEditor videoEditor;
  private String previousText;
  private final String newText;

  public SetTextCommand(VideoEditor videoEditor, String text) {
    this.videoEditor = videoEditor;
    this.newText = text;
  }

  @Override
  public void execute() {
    this.previousText = this.videoEditor.text;
    this.videoEditor.setText(this.newText);
  }

  @Override
  public void undo() {
    this.videoEditor.setText(this.previousText);
  }
}
