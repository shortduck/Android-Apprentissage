package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.EsJson;

public final class FormObjectJson extends EsJson<FormObject>
{
  static final FormObjectJson INSTANCE = new FormObjectJson();

  private FormObjectJson()
  {
    super(FormObject.class, new Object[] { "description", "embedUrl", "faviconUrl", "name", "proxiedFaviconUrl", ThumbnailJson.class, "proxiedThumbnail", "thumbnailUrl", "url" });
  }

  public static FormObjectJson getInstance()
  {
    return INSTANCE;
  }
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.FormObjectJson
 * JD-Core Version:    0.6.2
 */