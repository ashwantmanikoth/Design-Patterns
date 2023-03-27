package L08.Command;

public class Demo {

    public static void main(String[] args) {
        VideoEditor editor = new VideoEditor();
        editor.setText("Hello World");
        System.out.println(editor); // prints "VideoEditor{contrast=0.5, text='Hello World'}"

        Command command1 = new SetTextCommand(editor, "New Text1");
        editor.executeCommand(command1);
        System.out.println(editor); // prints "VideoEditor{contrast=0.5, text='New Text'}"

        Command command2 = new SetTextCommand(editor, "New Text2");
        editor.executeCommand(command2);
        System.out.println(editor); // prints "VideoEditor{contrast=0.5, text='New Text'}"
        Command command3 = new SetTextCommand(editor, "New Text 3");
        editor.executeCommand(command3);
        System.out.println(editor); // prints "VideoEditor{contrast=0.5, text='New Text'}"

        System.out.println("Removing previous command");
        editor.undoCommand();
        System.out.println(editor); // prints "VideoEditor{contrast=0.5, text='Hello World'}"

        System.out.println("Removing previous command");
        editor.undoCommand();
        System.out.println(editor);

        System.out.println("Removing previous command");

        editor.undoCommand();
        System.out.println(editor);

    }
}
