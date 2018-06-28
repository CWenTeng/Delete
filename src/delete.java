import java.io.File;

/**
 * Created by CWT on 2018/6/28
 */
public class delete {
    /**
     * 文件摧毁者
     * 遍历目录+逐个删除
     *
     * @author s1841
     */

    /*
    * 递归遍历目录并删除
    * */
    public static void dele(File file) {
        if (file.isDirectory()) {
            File files[] = file.listFiles();                    //遍历目录
            for (int i = 0; i < files.length; i++) {
                if (file.isDirectory()) {                       //目录否
                    dele(files[i]);
                }
                System.out.println(files[i]);                   //显示
                files[i].delete();                              //删除子目录
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("G://System Volume Information");
        dele(file);
        file.delete();                                          //删除自身
        if (file.exists()) {
            System.out.println("失败");
        } else {
            System.out.println("成功");
        }
    }

}