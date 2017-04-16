package com.grepx.tflnotify;

import java.util.HashMap;

public class Lines {
  public static final String Bakerloo = "bakerloo";
  public static final String Central = "central";
  public static final String Circle = "circle";
  public static final String District = "district";
  public static final String Dlr = "dlr";
  public static final String HammersmithCity = "hammersmith-city";
  public static final String Jubilee = "jubilee";
  public static final String LondonOverground = "london-overground";
  public static final String Metropolitan = "metropolitan";
  public static final String Northern = "northern";
  public static final String Piccadilly = "piccadilly";
  public static final String Victoria = "victoria";
  public static final String WaterlooCity = "waterloo-city";

  private static final HashMap<String, String> lines = new HashMap<>();

  static {
    lines.put(Lines.Bakerloo, "Bakerloo Line");
    lines.put(Lines.Central, "Central Line");
    lines.put(Lines.Circle, "Circle Line");
    lines.put(Lines.District, "District Line");
    lines.put(Lines.Dlr, "DLR");
    lines.put(Lines.HammersmithCity, "Hammersmith & City Line");
    lines.put(Lines.Jubilee, "Jubilee Line");
    lines.put(Lines.LondonOverground, "Overground");
    lines.put(Lines.Metropolitan, "Metropolitan Line");
    lines.put(Lines.Northern, "Northern Line");
    lines.put(Lines.Piccadilly, "Piccadilly Line");
    lines.put(Lines.Victoria, "Victoria Line");
    lines.put(Lines.WaterlooCity, "Waterloo & City Line");
  }

  public static String getName(String lineId) {
    return lines.get(lineId);
  }
}
