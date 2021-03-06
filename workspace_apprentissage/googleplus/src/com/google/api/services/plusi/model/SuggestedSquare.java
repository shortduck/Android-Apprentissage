package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.GenericJson;
import java.util.List;

public final class SuggestedSquare extends GenericJson
{
  public Integer numPeopleInCommon;
  public List<SquareMember> peopleInCommon;
  public Double score;
  public ViewerSquare viewerSquare;
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.SuggestedSquare
 * JD-Core Version:    0.6.2
 */