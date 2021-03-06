package org.jdownloader.settings.staticreferences;

import org.appwork.storage.config.ConfigUtils;
import org.appwork.storage.config.JsonConfig;
import org.appwork.storage.config.handler.BooleanKeyHandler;
import org.appwork.storage.config.handler.StorageHandler;
import org.appwork.storage.config.handler.StringKeyHandler;
import org.jdownloader.captcha.v2.solver.captchabrotherhood.CaptchaBrotherHoodSettings;

public class CFG_CAPTCHABROTHERHOOD {
    public static void main(String[] args) {
        ConfigUtils.printStaticMappings(CaptchaBrotherHoodSettings.class);
    }

    // Static Mappings for interface org.jdownloader.captcha.v2.solver.CaptchaBrotherHoodSettings
    public static final CaptchaBrotherHoodSettings                 CFG        = JsonConfig.create(CaptchaBrotherHoodSettings.class);
    public static final StorageHandler<CaptchaBrotherHoodSettings> SH         = (StorageHandler<CaptchaBrotherHoodSettings>) CFG._getStorageHandler();
    // let's do this mapping here. If we map all methods to static handlers, access is faster, and we get an error on init if mappings are
    // wrong.
    // null
    public static final StringKeyHandler                           PASS       = SH.getKeyHandler("Pass", StringKeyHandler.class);
    // false
    public static final BooleanKeyHandler                          ENABLED    = SH.getKeyHandler("Enabled", BooleanKeyHandler.class);
    // null
    public static final StringKeyHandler                           USER       = SH.getKeyHandler("User", StringKeyHandler.class);

    public static final StringKeyHandler                           BLACK_LIST = SH.getKeyHandler("BlackList", StringKeyHandler.class);

    public static final StringKeyHandler                           WHITE_LIST = SH.getKeyHandler("WhiteList", StringKeyHandler.class);
}