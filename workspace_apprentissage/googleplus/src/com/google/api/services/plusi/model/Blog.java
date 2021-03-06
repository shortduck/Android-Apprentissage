package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.GenericJson;
import java.util.List;

public final class Blog extends GenericJson
{
  public List<EmbedsPerson> author;
  public String blogId;
  public String description;
  public String imageUrl;
  public String name;
  public String proxiedFaviconUrl;
  public Thumbnail proxiedImage;
  public String url;
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.Blog
 * JD-Core Version:    0.6.2
 */