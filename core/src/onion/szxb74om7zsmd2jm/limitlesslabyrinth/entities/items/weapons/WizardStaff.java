package onion.szxb74om7zsmd2jm.limitlesslabyrinth.entities.items.weapons;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import onion.szxb74om7zsmd2jm.limitlesslabyrinth.entities.items.Weapon;
import onion.szxb74om7zsmd2jm.limitlesslabyrinth.entities.projectiles.Arrow;
import onion.szxb74om7zsmd2jm.limitlesslabyrinth.entities.projectiles.Projectile;
import onion.szxb74om7zsmd2jm.limitlesslabyrinth.entities.projectiles.WizardOrb;
import onion.szxb74om7zsmd2jm.limitlesslabyrinth.entities.spriteTextures;

/**
 * Created by 226812 on 2/6/2017.
 */
public class WizardStaff extends Weapon{
    public WizardStaff(){
        sprite = new Sprite(spriteTextures.WizardStaffSprite);
        dmg = 50f;
        lvl = 1;
        type = "projectile";
        cooldown = 40;
        XPtoLVL = 10 * lvl;
    }

    @Override
    public Projectile getProjectile(float x1, float y1, float x2, float y2){
        return new WizardOrb(x1, y1, x2, y2, dmg, this);
    }
}
