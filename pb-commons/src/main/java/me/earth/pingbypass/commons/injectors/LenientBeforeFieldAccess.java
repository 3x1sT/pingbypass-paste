package me.earth.pingbypass.commons.injectors;

import org.spongepowered.asm.mixin.injection.IInjectionPointContext;
import org.spongepowered.asm.mixin.injection.InjectionPoint;
import org.spongepowered.asm.mixin.injection.points.BeforeFieldAccess;
import org.spongepowered.asm.mixin.injection.struct.InjectionPointData;

/**
 * Allows injecting into constructors anywhere. BE CAREFUL!
 *
 * @see BeforeFieldAccess
 */
@SuppressWarnings("unused")
// I will not make use of this because I have multiple MixinConfigs? Instead, I will just use the fully qualified name.
@InjectionPoint.AtCode(namespace = "PINGBYPASS", value = "LENIENT_FIELD")
public class LenientBeforeFieldAccess extends BeforeFieldAccess {
    public LenientBeforeFieldAccess(InjectionPointData data) {
        super(data);
    }

    @Override
    public RestrictTargetLevel getTargetRestriction(IInjectionPointContext context) {
        return RestrictTargetLevel.ALLOW_ALL;
    }

}
