package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.EsJson;

public final class DeleteCircleRequestJson extends EsJson<DeleteCircleRequest>
{
  static final DeleteCircleRequestJson INSTANCE = new DeleteCircleRequestJson();

  private DeleteCircleRequestJson()
  {
    super(DeleteCircleRequest.class, new Object[] { DataCircleIdJson.class, "circleId", ApiaryFieldsJson.class, "commonFields", "enableTracing" });
  }

  public static DeleteCircleRequestJson getInstance()
  {
    return INSTANCE;
  }
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.DeleteCircleRequestJson
 * JD-Core Version:    0.6.2
 */