package rgc;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class FastUtilDeletes implements Deletes {

  private final Long2ObjectMap<String[]> deletes = new Long2ObjectOpenHashMap<>();

  @Override
  public String[] get(long key) {
    return deletes.get(key);
  }

  @Override
  public String[] put(long key, String[] values) {
    return deletes.put(key, values);
  }
}
