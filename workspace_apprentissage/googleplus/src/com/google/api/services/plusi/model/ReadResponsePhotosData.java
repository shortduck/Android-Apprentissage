package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.GenericJson;
import java.util.List;

public final class ReadResponsePhotosData extends GenericJson
{
  public EmbedsPerson person;
  public List<DataPhoto> photos;
  public String sortType;
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.ReadResponsePhotosData
 * JD-Core Version:    0.6.2
 */