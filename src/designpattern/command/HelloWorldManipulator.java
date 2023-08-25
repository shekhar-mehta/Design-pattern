package designpattern.command;

public class HelloWorldManipulator {

    Invoker invoker;
    public void fixManipulate(final String fileName, final String newPath) {
        int cnt = 0;
        try {
            invoker.execute(new CreateFile(fileName, "hello world"));
            cnt = 1;
            invoker.execute(new UpdateFile(fileName, "new hello world"));
            cnt = 2;
            invoker.execute(new MoveFile(fileName, newPath));
            cnt = 3;
        } catch (Exception e) {
            switch (cnt) {
                case 3:
                    invoker.execute(new MoveFile(newPath, fileName));
                case 2:
                    invoker.execute(new UpdateFile(fileName, "hello world"));
                case 1:
                    invoker.execute(new DeleteFile(fileName));

            }
        }
    }

    public void brokenManipulate(String fileName, String newPath) {
        int cnt = 0;
        try {
            invoker.execute(new CreateFile(fileName, "hello world"));
            cnt = 1;
            invoker.execute(new UpdateFile(fileName, "new hello world"));
            cnt = 2;
            invoker.execute(new MoveFile(fileName, newPath));
            cnt = 3;
            invoker.execute(new CreateFile(fileName, "hello world"));
            cnt = 4;
            invoker.execute(new CreateFile(fileName, "hello world"));
            cnt = 5;
        } catch (Exception e) {
            switch (cnt) {
                case 5:
                    invoker.execute(new DeleteFile(fileName));
                case 4:
                    invoker.execute(new DeleteFile(fileName));
                case 3:
                    invoker.execute(new MoveFile(newPath, fileName));
                case 2:
                    invoker.execute(new UpdateFile(fileName, "hello world"));
                case 1:
                    invoker.execute(new DeleteFile(fileName));

            }
        }
    }
}
