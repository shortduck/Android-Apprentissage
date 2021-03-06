package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.EsJson;

public final class FavaDiagnosticsMemoryStatsJson extends EsJson<FavaDiagnosticsMemoryStats>
{
  static final FavaDiagnosticsMemoryStatsJson INSTANCE = new FavaDiagnosticsMemoryStatsJson();

  private FavaDiagnosticsMemoryStatsJson()
  {
    super(FavaDiagnosticsMemoryStats.class, arrayOfObject);
  }

  public static FavaDiagnosticsMemoryStatsJson getInstance()
  {
    return INSTANCE;
  }
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.FavaDiagnosticsMemoryStatsJson
 * JD-Core Version:    0.6.2
 */