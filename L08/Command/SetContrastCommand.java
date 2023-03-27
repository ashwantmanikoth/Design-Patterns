package L08.Command;

public class SetContrastCommand implements Command {

  private final VideoEditor videoEditor;
  private float previousContrast;
  private final float newContrast;

  public SetContrastCommand(VideoEditor videoEditor, float contrast) {
    this.videoEditor = videoEditor;
    this.newContrast = contrast;
  }

  @Override
  public void execute() {
    this.previousContrast = this.videoEditor.getContrast();
    this.videoEditor.setContrast(this.newContrast);
  }

  @Override
  public void undo() {
    this.videoEditor.setContrast(this.previousContrast);
  }
}
