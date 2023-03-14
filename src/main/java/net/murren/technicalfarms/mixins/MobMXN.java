package net.murren.technicalfarms.mixins;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Mob.class)
public class MobMXN {
    @Inject(method = "getTarget", at = @At("HEAD"))
    public void TechnicalFarms$Mob$getTargetMXN(CallbackInfoReturnable<LivingEntity> cir)
    {

    }

}
