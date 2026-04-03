package com.opcommands.mixin;

import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ServerPlayer.class)
public class PlayerPermissionMixin {

    @Inject(method = "hasPermissions", at = @At("HEAD"), cancellable = true)
    private void grantOpInSingleplayer(int level, CallbackInfoReturnable<Boolean> cir) {
        ServerPlayer player = (ServerPlayer) (Object) this;
        MinecraftServer server = player.getServer();
        if (server != null && !server.isDedicatedServer()) {
            cir.setReturnValue(true);
        }
    }
}