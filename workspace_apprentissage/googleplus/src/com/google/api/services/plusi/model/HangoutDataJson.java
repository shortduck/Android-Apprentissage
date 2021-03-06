package com.google.api.services.plusi.model;

import com.google.android.apps.plus.json.EsJson;

public final class HangoutDataJson extends EsJson<HangoutData>
{
  static final HangoutDataJson INSTANCE = new HangoutDataJson();

  private HangoutDataJson()
  {
    super(HangoutData.class, new Object[] { HangoutDataBroadcastDetailsJson.class, "broadcastDetails", "broadcastId", "broadcastTitle", "eventId", HangoutConsumerHangoutMediaDetailsJson.class, "hangoutMediaDetails", "hashedRoomId", "idIsAutogenerated", "isActive", "isNoMinors", "isSelfPost", "isViewOnly", "joinType", "maxAttendees", "notificationId", HangoutOccupantJson.class, "occupant", HangoutOccupantJson.class, "occupantEver", "preferredLanguage", "region", "roomDomain", "roomId", "subject", "topic", "topicMaybeNsfw", "topicUrl", "type", "url" });
  }

  public static HangoutDataJson getInstance()
  {
    return INSTANCE;
  }
}

/* Location:           C:\Dev\Java\android\adt-bundle-windows\workspace\googleplus\classes_dex2jar.jar
 * Qualified Name:     com.google.api.services.plusi.model.HangoutDataJson
 * JD-Core Version:    0.6.2
 */