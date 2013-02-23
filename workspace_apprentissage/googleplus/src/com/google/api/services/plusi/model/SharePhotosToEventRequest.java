package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.GenericJson;
import java.util.List;

public final class SharePhotosToEventRequest extends GenericJson
{
  public ApiaryFields commonFields;
  public Boolean enableTracing;
  public String eventId;
  public List<Long> photoId;
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.SharePhotosToEventRequest
 * JD-Core Version:    0.6.2
 */