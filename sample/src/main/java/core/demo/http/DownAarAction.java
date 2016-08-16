package core.demo.http;

import org.xutils.sample.R;

import java.io.File;

import core.mate.Core;
import core.mate.common.Clearable;
import core.mate.http.DownloadAction;
import core.mate.util.ResUtil;

public class DownAarAction extends DownloadAction {

    public Clearable start(){
        String url = ResUtil.getString(R.string.test_download_url);
        File dir = Core.getInstance().getAppContext().getFilesDir();
        File aar = new File(dir,"testDown.aar");
        return download(url, aar );
    }

}
