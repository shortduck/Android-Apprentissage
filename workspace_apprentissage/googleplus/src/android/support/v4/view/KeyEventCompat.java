package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.KeyEvent;

public final class KeyEventCompat
{
  static final KeyEventVersionImpl IMPL;

  static
  {
    if (Build.VERSION.SDK_INT >= 11);
    for (IMPL = new HoneycombKeyEventVersionImpl(); ; IMPL = new BaseKeyEventVersionImpl())
      return;
  }

  public static boolean hasModifiers(KeyEvent paramKeyEvent, int paramInt)
  {
    return IMPL.metaStateHasModifiers(paramKeyEvent.getMetaState(), 1);
  }

  public static boolean hasNoModifiers(KeyEvent paramKeyEvent)
  {
    return IMPL.metaStateHasNoModifiers(paramKeyEvent.getMetaState());
  }

  static final class BaseKeyEventVersionImpl
    implements KeyEventCompat.KeyEventVersionImpl
  {
    private static int metaStateFilterDirectionalModifiers(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
    {
      int i = 1;
      int j;
      int k;
      if ((paramInt2 & paramInt3) != 0)
      {
        j = i;
        k = paramInt4 | paramInt5;
        if ((paramInt2 & k) == 0)
          break label52;
      }
      while (true)
        if (j != 0)
        {
          if (i != 0)
          {
            throw new IllegalArgumentException("bad arguments");
            j = 0;
            break;
            label52: i = 0;
            continue;
          }
          paramInt1 &= (k ^ 0xFFFFFFFF);
        }
      while (true)
      {
        return paramInt1;
        if (i != 0)
          paramInt1 &= (paramInt3 ^ 0xFFFFFFFF);
      }
    }

    private static int normalizeMetaState(int paramInt)
    {
      if ((paramInt & 0xC0) != 0)
        paramInt |= 1;
      if ((paramInt & 0x30) != 0)
        paramInt |= 2;
      return paramInt & 0xF7;
    }

    public final boolean metaStateHasModifiers(int paramInt1, int paramInt2)
    {
      int i = 1;
      if (metaStateFilterDirectionalModifiers(metaStateFilterDirectionalModifiers(0xF7 & normalizeMetaState(paramInt1), paramInt2, i, 64, 128), paramInt2, 2, 16, 32) == paramInt2);
      while (true)
      {
        return i;
        int j = 0;
      }
    }

    public final boolean metaStateHasNoModifiers(int paramInt)
    {
      if ((0xF7 & normalizeMetaState(paramInt)) == 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }

  static final class HoneycombKeyEventVersionImpl
    implements KeyEventCompat.KeyEventVersionImpl
  {
    public final boolean metaStateHasModifiers(int paramInt1, int paramInt2)
    {
      return KeyEvent.metaStateHasModifiers(paramInt1, paramInt2);
    }

    public final boolean metaStateHasNoModifiers(int paramInt)
    {
      return KeyEvent.metaStateHasNoModifiers(paramInt);
    }
  }

  static abstract interface KeyEventVersionImpl
  {
    public abstract boolean metaStateHasModifiers(int paramInt1, int paramInt2);

    public abstract boolean metaStateHasNoModifiers(int paramInt);
  }
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.KeyEventCompat
 * JD-Core Version:    0.6.2
 */