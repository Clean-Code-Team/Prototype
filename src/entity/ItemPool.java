package entity;

import engine.DrawManager;

import java.util.HashSet;
import java.util.Set;

public class ItemPool {
    /** Set of already created items opearate like itempool*/
    private static Set<Item> pool = new HashSet<Item>();

    /** not used constructor */
    private ItemPool() {

    }
    /**
     * Return an instance of item that can use ( or reuse ).
     *
     * @param positionX
     *              PositionX of where item is first located.
     * @param positionY
     *              PositionY of where item is first located.s
     *
     * @return Item
     * */
    public static Item getItem(final int positionX,
                               final int positionY) {
        Item item;
        if (!pool.isEmpty()) {
            item = pool.iterator().next();
           /* System.out.println("In getItem, print ItemPool : ");
            for(Item i : pool)
                System.out.println(i.spriteType.toString());
            System.out.println("In getItem, print " + item.getSpriteType().toString()+ " in ItemPool(iterator.next)");*/
            pool.remove(item);
            /*System.out.println("In getItem, print removed ItemPool : ");
            for(Item i : pool)
                System.out.println(i.spriteType.toString()); */
            item.setPositionX(positionX - item.getWidth() / 2);
            item.setPositionY(positionY);
            item.setSprite();
            //System.out.println("After setSpritem, item is " + item.spriteType.toString());
            item.CoolReset();
            item.setDestroy(false);
        } else {
//            System.out.println("pool is empty");
            item = new Item(positionX, positionY);
            item.setPositionX(positionX - item.getWidth() / 2);
        }
        if(item.spriteType == DrawManager.SpriteType.ItemDestroyed) item.setSprite();
        //System.out.println("return Item " + item.spriteType.toString());
        return item;
    }


    /**
     * Adds one or more bullets to the list of available ones.
     * @param item
     *              Items to recycle.
     */
    public static void recycle(final Set<Item> item) { pool.addAll(item); }
}
