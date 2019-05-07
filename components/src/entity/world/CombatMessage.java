package entity.world;

import com.artemis.Component;
import com.artemis.annotations.DelayedComponentRemoval;

import java.io.Serializable;

@DelayedComponentRemoval
public class CombatMessage extends Component implements Serializable {

    public static float DEFAULT_TIME = 2f;
    public static float DEFAULT_ALPHA = 1f;
    public static float DEFAULT_OFFSET = 20;
    public Kind kind;

    public String text;
    public float time = DEFAULT_TIME;
    public float alpha = DEFAULT_ALPHA;
    public float offset = DEFAULT_OFFSET;

    public CombatMessage() {
    }

    public CombatMessage(String text, Kind kind) {
        this.text = text;
        this.kind = kind;
    }

    public static CombatMessage magic(String text) {
        return new CombatMessage(text, Kind.MAGIC);
    }

    public static CombatMessage stab(String text) {
        return new CombatMessage(text, Kind.STAB);
    }

    public static CombatMessage physic(String text) {
        return new CombatMessage(text, Kind.PHYSICAL);
    }

    public enum Kind {
        MAGIC,
        PHYSICAL,
        STAB
    }
}
