package com.google.android.picasastore;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ImageProxyUtil
{
  private static final Pattern PROXY_HOSTED_IMAGE_URL_RE = Pattern.compile("^(((http(s)?):)?\\/\\/images(\\d)?-.+-opensocial\\.googleusercontent\\.com\\/gadgets\\/proxy\\?)");
  static int sProxyIndex;

  private static int getNextProxyIndex()
  {
    try
    {
      int i = 1 + sProxyIndex;
      sProxyIndex = i;
      sProxyIndex %= 3;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String setImageUrlSize(int paramInt, String paramString)
  {
    String str2;
    if (paramString == null)
    {
      str2 = paramString;
      return str2;
    }
    boolean bool;
    label16: String str1;
    if (paramString == null)
    {
      bool = false;
      if (bool)
        break label90;
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("https://images").append(getNextProxyIndex()).append("-esmobile").append("-opensocial.googleusercontent.com/gadgets/proxy");
      str1 = localStringBuffer.toString();
    }
    while (true)
    {
      str2 = setImageUrlSizeOptions(paramInt, paramInt, Uri.parse(str1), paramString).toString();
      break;
      bool = PROXY_HOSTED_IMAGE_URL_RE.matcher(paramString).find();
      break label16;
      label90: str1 = paramString;
      paramString = null;
    }
  }

  private static Uri setImageUrlSizeOptions(int paramInt1, int paramInt2, Uri paramUri, String paramString)
  {
    Uri.Builder localBuilder1 = Uri.EMPTY.buildUpon();
    localBuilder1.authority(paramUri.getAuthority());
    localBuilder1.scheme(paramUri.getScheme());
    localBuilder1.path(paramUri.getPath());
    localBuilder1.appendQueryParameter("resize_w", Integer.toString(paramInt1));
    localBuilder1.appendQueryParameter("resize_h", Integer.toString(paramInt2));
    localBuilder1.appendQueryParameter("no_expand", "1");
    Uri localUri = localBuilder1.build();
    if (paramUri.isOpaque())
      throw new UnsupportedOperationException("This isn't a hierarchical URI.");
    String str1 = paramUri.getEncodedQuery();
    Set localSet;
    label121: String str2;
    Uri.Builder localBuilder6;
    if (str1 == null)
    {
      localSet = Collections.emptySet();
      Iterator localIterator1 = localSet.iterator();
      do
      {
        if (!localIterator1.hasNext())
          break;
        str2 = (String)localIterator1.next();
      }
      while (localUri.getQueryParameter(str2) != null);
      localBuilder6 = localUri.buildUpon();
      if (!"url".equals(str2))
        break label304;
      localBuilder6.appendQueryParameter("url", paramUri.getQueryParameter("url"));
    }
    while (true)
    {
      localUri = localBuilder6.build();
      break label121;
      LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      int i = 0;
      do
      {
        int j = str1.indexOf('&', i);
        if (j == -1)
          j = str1.length();
        int k = str1.indexOf('=', i);
        if ((k > j) || (k == -1))
          k = j;
        localLinkedHashSet.add(Uri.decode(str1.substring(i, k)));
        i = j + 1;
      }
      while (i < str1.length());
      localSet = Collections.unmodifiableSet(localLinkedHashSet);
      break;
      label304: Iterator localIterator2 = paramUri.getQueryParameters(str2).iterator();
      while (localIterator2.hasNext())
        localBuilder6.appendQueryParameter(str2, (String)localIterator2.next());
    }
    if ((paramString != null) && (localUri.getQueryParameter("url") == null))
    {
      Uri.Builder localBuilder5 = localUri.buildUpon();
      localBuilder5.appendQueryParameter("url", paramString);
      localUri = localBuilder5.build();
    }
    if (localUri.getQueryParameter("container") == null)
    {
      Uri.Builder localBuilder4 = localUri.buildUpon();
      localBuilder4.appendQueryParameter("container", "esmobile");
      localUri = localBuilder4.build();
    }
    if (localUri.getQueryParameter("gadget") == null)
    {
      Uri.Builder localBuilder3 = localUri.buildUpon();
      localBuilder3.appendQueryParameter("gadget", "a");
      localUri = localBuilder3.build();
    }
    if (localUri.getQueryParameter("rewriteMime") == null)
    {
      Uri.Builder localBuilder2 = localUri.buildUpon();
      localBuilder2.appendQueryParameter("rewriteMime", "image/*");
      localUri = localBuilder2.build();
    }
    return localUri;
  }
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.android.picasastore.ImageProxyUtil
 * JD-Core Version:    0.6.2
 */