package com.calosi.funcTime;

import javax.baja.collection.BITable;
import javax.baja.collection.Column;
import javax.baja.collection.TableCursor;
import javax.baja.history.*;
import javax.baja.history.db.BHistoryDatabase;
import javax.baja.naming.BOrd;
import javax.baja.naming.SlotPath;
import javax.baja.nre.annotations.NiagaraAction;
import javax.baja.nre.annotations.NiagaraProperty;
import javax.baja.nre.annotations.NiagaraType;
import javax.baja.sys.BComponent;
import javax.baja.sys.Flags;
import javax.baja.sys.*;
import javax.baja.timezone.BTimeZone;
import javax.baja.util.BTypeSpec;
import java.util.ArrayList;
import java.util.List;

@NiagaraType

@NiagaraProperty(name = "startTime", type = "BAbsTime", defaultValue = "BAbsTime.now()", flags = Flags.SUMMARY)
@NiagaraProperty(name = "endTime", type = "BAbsTime", defaultValue = "BAbsTime.now()", flags = Flags.SUMMARY)
@NiagaraProperty(name = "ord", type = "BOrd", defaultValue = "BOrd.make(\"history:/Train00/TrafficLight1\")")
@NiagaraProperty(name = "state", type = "BString", flags = Flags.READONLY | Flags.SUMMARY, defaultValue = "BString.make(\"\")")
@NiagaraAction(name = "calculate")
@NiagaraAction(name="calculateTotFromHistory")
@NiagaraProperty(name = "HistoryDeviceName",type = "String",defaultValue = "Sys.getHostName()")
@NiagaraProperty(name = "HistoryName",type = "String",defaultValue = "HistoryName")
@NiagaraProperty(name = "historyConfig",type = "BHistoryConfig",defaultValue = "new BHistoryConfig()")
@NiagaraProperty(name = "UseTimeRange", type= "BBoolean", defaultValue = "BBoolean.make(false)")
@NiagaraProperty(name = "history", type = "BOrd", defaultValue = "BOrd.make(\"history:/Train00/TrafficLight1\")")
@NiagaraProperty(name = "totalFuncTime", type="BDouble",flags = Flags.READONLY, defaultValue = "BDouble.make(0.0)")


public class BCalculateFuncTime extends BComponent {
  /*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
  /*@ $com.calosi.funcTime.BCalculateFuncTime(2857632572)1.0$ @*/
  /* Generated Fri Dec 03 17:50:29 GMT+01:00 2021 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "startTime"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code startTime} property.
   * @see #getStartTime
   * @see #setStartTime
   */
  public static final Property startTime = newProperty(Flags.SUMMARY, BAbsTime.now(), null);

  /**
   * Get the {@code startTime} property.
   * @see #startTime
   */
  public BAbsTime getStartTime() { return (BAbsTime)get(startTime); }

  /**
   * Set the {@code startTime} property.
   * @see #startTime
   */
  public void setStartTime(BAbsTime v) { set(startTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "endTime"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code endTime} property.
   * @see #getEndTime
   * @see #setEndTime
   */
  public static final Property endTime = newProperty(Flags.SUMMARY, BAbsTime.now(), null);

  /**
   * Get the {@code endTime} property.
   * @see #endTime
   */
  public BAbsTime getEndTime() { return (BAbsTime)get(endTime); }

  /**
   * Set the {@code endTime} property.
   * @see #endTime
   */
  public void setEndTime(BAbsTime v) { set(endTime, v, null); }

////////////////////////////////////////////////////////////////
// Property "ord"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code ord} property.
   * @see #getOrd
   * @see #setOrd
   */
  public static final Property ord = newProperty(0, BOrd.make("history:/Train00/TrafficLight1"), null);

  /**
   * Get the {@code ord} property.
   * @see #ord
   */
  public BOrd getOrd() { return (BOrd)get(ord); }

  /**
   * Set the {@code ord} property.
   * @see #ord
   */
  public void setOrd(BOrd v) { set(ord, v, null); }

////////////////////////////////////////////////////////////////
// Property "state"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code state} property.
   * @see #getState
   * @see #setState
   */
  public static final Property state = newProperty(Flags.READONLY | Flags.SUMMARY, BString.make(""), null);

  /**
   * Get the {@code state} property.
   * @see #state
   */
  public String getState() { return getString(state); }

  /**
   * Set the {@code state} property.
   * @see #state
   */
  public void setState(String v) { setString(state, v, null); }

////////////////////////////////////////////////////////////////
// Property "HistoryDeviceName"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code HistoryDeviceName} property.
   * @see #getHistoryDeviceName
   * @see #setHistoryDeviceName
   */
  public static final Property HistoryDeviceName = newProperty(0, Sys.getHostName(), null);

  /**
   * Get the {@code HistoryDeviceName} property.
   * @see #HistoryDeviceName
   */
  public String getHistoryDeviceName() { return getString(HistoryDeviceName); }

  /**
   * Set the {@code HistoryDeviceName} property.
   * @see #HistoryDeviceName
   */
  public void setHistoryDeviceName(String v) { setString(HistoryDeviceName, v, null); }

////////////////////////////////////////////////////////////////
// Property "HistoryName"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code HistoryName} property.
   * @see #getHistoryName
   * @see #setHistoryName
   */
  public static final Property HistoryName = newProperty(0, "HistoryName", null);

  /**
   * Get the {@code HistoryName} property.
   * @see #HistoryName
   */
  public String getHistoryName() { return getString(HistoryName); }

  /**
   * Set the {@code HistoryName} property.
   * @see #HistoryName
   */
  public void setHistoryName(String v) { setString(HistoryName, v, null); }

////////////////////////////////////////////////////////////////
// Property "historyConfig"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code historyConfig} property.
   * @see #getHistoryConfig
   * @see #setHistoryConfig
   */
  public static final Property historyConfig = newProperty(0, new BHistoryConfig(), null);

  /**
   * Get the {@code historyConfig} property.
   * @see #historyConfig
   */
  public BHistoryConfig getHistoryConfig() { return (BHistoryConfig)get(historyConfig); }

  /**
   * Set the {@code historyConfig} property.
   * @see #historyConfig
   */
  public void setHistoryConfig(BHistoryConfig v) { set(historyConfig, v, null); }

////////////////////////////////////////////////////////////////
// Property "UseTimeRange"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code UseTimeRange} property.
   * @see #getUseTimeRange
   * @see #setUseTimeRange
   */
  public static final Property UseTimeRange = newProperty(0, ((BBoolean)(BBoolean.make(false))).getBoolean(), null);

  /**
   * Get the {@code UseTimeRange} property.
   * @see #UseTimeRange
   */
  public boolean getUseTimeRange() { return getBoolean(UseTimeRange); }

  /**
   * Set the {@code UseTimeRange} property.
   * @see #UseTimeRange
   */
  public void setUseTimeRange(boolean v) { setBoolean(UseTimeRange, v, null); }

////////////////////////////////////////////////////////////////
// Property "history"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code history} property.
   * @see #getHistory
   * @see #setHistory
   */
  public static final Property history = newProperty(0, BOrd.make("history:/Train00/TrafficLight1"), null);

  /**
   * Get the {@code history} property.
   * @see #history
   */
  public BOrd getHistory() { return (BOrd)get(history); }

  /**
   * Set the {@code history} property.
   * @see #history
   */
  public void setHistory(BOrd v) { set(history, v, null); }

////////////////////////////////////////////////////////////////
// Property "totalFuncTime"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code totalFuncTime} property.
   * @see #getTotalFuncTime
   * @see #setTotalFuncTime
   */
  public static final Property totalFuncTime = newProperty(Flags.READONLY, ((BDouble)(BDouble.make(0.0))).getDouble(), null);

  /**
   * Get the {@code totalFuncTime} property.
   * @see #totalFuncTime
   */
  public double getTotalFuncTime() { return getDouble(totalFuncTime); }

  /**
   * Set the {@code totalFuncTime} property.
   * @see #totalFuncTime
   */
  public void setTotalFuncTime(double v) { setDouble(totalFuncTime, v, null); }

////////////////////////////////////////////////////////////////
// Action "calculate"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code calculate} action.
   * @see #calculate()
   */
  public static final Action calculate = newAction(0, null);

  /**
   * Invoke the {@code calculate} action.
   * @see #calculate
   */
  public void calculate() { invoke(calculate, null, null); }

////////////////////////////////////////////////////////////////
// Action "calculateTotFromHistory"
////////////////////////////////////////////////////////////////

  /**
   * Slot for the {@code calculateTotFromHistory} action.
   * @see #calculateTotFromHistory()
   */
  public static final Action calculateTotFromHistory = newAction(0, null);

  /**
   * Invoke the {@code calculateTotFromHistory} action.
   * @see #calculateTotFromHistory
   */
  public void calculateTotFromHistory() { invoke(calculateTotFromHistory, null, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

  @Override
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BCalculateFuncTime.class);

  /*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/



  private List<BAbsTime> time_to_calc_array = null;
  private static BIcon icon = BIcon.make("module://funcTime/rc/TimeFunc.png");
  @Override
  public BIcon getIcon(){
    return icon;
  }

  public void doCalculate() throws Exception {
    time_to_calc_array = new ArrayList<>();
    List<BAbsTime> history_time = new ArrayList<>();
    List<Double> calculated_time_values_array = new ArrayList();
    filter();
    BRelTime breltime;
    BAbsTime time;
    BAbsTime time1;
    double total = 0;
    setState("Ready!!");
    if (time_to_calc_array.size() < 2)
      setState("Filtered list is small !");
    else {
      BAbsTime set_time = BAbsTime.make(time_to_calc_array.get(1), BTime.MIDNIGHT).nextDay().subtract(BRelTime.makeSeconds(1));
      for (int i = 1; i < time_to_calc_array.size(); i = i + 2) {
        time = time_to_calc_array.get(i);
        time1 = time_to_calc_array.get(i - 1);
        if (time.isAfter(set_time)) {
          history_time.add(set_time);
          calculated_time_values_array.add((total/60));
          total = 0;
          set_time = BAbsTime.make(time_to_calc_array.get(i), BTime.MIDNIGHT).nextDay().subtract(BRelTime.makeSeconds(1));
        }
        breltime = time1.delta(time);
        total += breltime.getMinutes();
      }
      history_time.add(set_time);
      calculated_time_values_array.add((total/60));
      createHistory(history_time, calculated_time_values_array);
      setState("Created History !");
    }
  }
  public void doCalculateTotFromHistory() throws Exception{
    query = BOrd.make(getHistory().encodeToString() + "|bql:select SUM(value)");
    BITable table = (BITable) query.get();
    Column[] columns = table.getColumns().list();
    Column col = columns[0];
    TableCursor<BIObject> cursor = table.cursor();
    if(cursor.next()){
      setTotalFuncTime(BDouble.make(cursor.cell(col).toString()).getDouble());
    }

  }

  private void createHistory(List<BAbsTime> times, List<Double> values) throws Exception {
    setState("Working....");
    if(times.size() != values.size())
      throw new Exception("Arrays sizes are not equal" + "Times size : " + times.size() + "Values size : " + values.size());
    BHistoryService historyService = (BHistoryService) Sys.getService(BHistoryService.TYPE);
    BHistoryDatabase historyDb = historyService.getDatabase();
    try (HistorySpaceConnection conn = historyDb.getConnection(null)) {
      BIHistory history;
      BTimeZone tzone;
      String station = SlotPath.escape(SlotPath.unescape(getHistoryDeviceName()));
      BHistoryConfig config = getHistoryConfig();
      tzone = times.get(0).getTimeZone();
      BHistoryId id = BHistoryId.make(station, getHistoryName());
      if(!conn.exists(id)){
        config.setRecordType(BTypeSpec.make("history", "NumericTrendRecord"));
        config.setTimeZone(tzone);
        config.setId(id);
        conn.createHistory(config);
      }else {
        conn.clearAllRecords(id);
      }
      history = conn.getHistory(id);
      BNumericTrendRecord rec = new BNumericTrendRecord();
      for (int i=0; i<times.size(); i++) {
        rec.setTimestamp(times.get(i));
        rec.setValue(values.get(i));
        conn.append(history, rec);
      }
    }
  }

  private void filter() {
    if (!getUseTimeRange()){
      query = BOrd.make(getOrd().encodeToString() + "?period=yesterday;");
    }else{
      start = getStartTime().encodeToString();
      stop = getEndTime().encodeToString();
      query = BOrd.make(getOrd().encodeToString() + "?start=" + start + ";end=" + stop + ";");
    }
    System.out.println(query);
    //BOrd query = BOrd.make(getOrd().encodeToString() + "?start=" + getStartTime().encodeToString() + ";end=" + getEndTime().encodeToString() + ";");
    BITable table = (BITable) query.get();
    Column[] col = table.getColumns().list();
    String compare = "";
    TableCursor<BITable> cursor = table.cursor();
    TableCursor<BITable> cursor1 = table.cursor();
    cursor1.next();
    if(!cursor1.row().cell(col[0]).toString().equals("null")){
      if (cursor1.cell(col[3]).getType().is(BBoolean.TYPE)) {
        while (cursor.cell(col[3]).toString().equals("false")) {
          cursor.next();
        }
        do {
          if (!compare.equals(cursor.cell(col[3]).toString())) {
            compare = cursor.cell(col[3]).toString();
            time_to_calc_array.add((BAbsTime) cursor.cell(col[0]));
          }
        } while (cursor.next());
        setState("Done... The Point Type is " + cursor1.cell(col[3]).getType());
      } else {
        setState("Failed !!! The Point Type is " + cursor1.cell(col[3]).getType());
      }}else {System.out.println("Query NULL");}
  }
  BOrd query;
  String start;
  String stop;
}
