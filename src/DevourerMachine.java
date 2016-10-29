/**
 * Created by liulongfei on 2016/10/29.
 * <p>
 * step 1 read files from input path
 * step 2 foreach files, get and save file info MongoDB.
 * step 3 save file into target output path, makes 1000 files into one folder(create a fixed size list, when it
 * enough Devourer batch save the list into one folder. folder name use a current Timestamp of int type.) Show
 * information by log file.
 * step 4 generate hashset file from MongoDB
 * step 5 push hashset file to vps target folder
 * <p>
 * step 6 manually cut files to HardDisk
 */
public class DevourerMachine {

    private static final String INPUT_PATH = "";
    private static final String OUTPUT_PATH = "";

    public static void main(String[] args) {
        new DevourerMachine().run();
    }

    private void run() {

    }


}
