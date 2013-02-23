package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.EsJson;

public final class GetEventThemesRequestJson extends EsJson<GetEventThemesRequest>
{
  static final GetEventThemesRequestJson INSTANCE = new GetEventThemesRequestJson();

  private GetEventThemesRequestJson()
  {
    super(GetEventThemesRequest.class, new Object[] { ApiaryFieldsJson.class, "commonFields", "enableTracing" });
  }

  public static GetEventThemesRequestJson getInstance()
  {
    return INSTANCE;
  }
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.GetEventThemesRequestJson
 * JD-Core Version:    0.6.2
 */