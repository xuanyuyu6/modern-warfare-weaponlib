package com.vicmatskiv.weaponlib.mission;

import java.util.HashSet;
import java.util.Set;

import com.vicmatskiv.weaponlib.compatibility.CompatibleMessage;
import com.vicmatskiv.weaponlib.network.TypeRegistry;

import io.netty.buffer.ByteBuf;

public class PlayerMissionSyncMessage implements CompatibleMessage {

    private Set<Mission> missions;

    public PlayerMissionSyncMessage() {
        this.missions = new HashSet<>();
    }
    
    public PlayerMissionSyncMessage(Set<Mission> missions) {
        this.missions = missions;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        int missionCount = buf.readInt();
        for(int i = 0; i < missionCount; i++) {
            missions.add(TypeRegistry.getInstance().fromBytes(buf));
        }
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(missions.size());
        for(Mission mission: missions) {
            TypeRegistry.getInstance().toBytes(mission, buf);
        }
    }
    
    protected Set<Mission> getMissions() {
        return missions;
    }
}
