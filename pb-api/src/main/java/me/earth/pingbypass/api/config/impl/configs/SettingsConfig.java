package me.earth.pingbypass.api.config.impl.configs;

import me.earth.pingbypass.api.config.impl.ConfigTypes;
import me.earth.pingbypass.api.files.FileManager;
import me.earth.pingbypass.api.setting.SettingRegistry;
import me.earth.pingbypass.api.traits.Nameable;

public class SettingsConfig<T extends SettingRegistry & Nameable> extends AbstractSettingConfig<T> {
    public SettingsConfig(FileManager fileManager, Iterable<T> containers) {
        super(fileManager, ConfigTypes.SETTINGS, containers);
    }

}
