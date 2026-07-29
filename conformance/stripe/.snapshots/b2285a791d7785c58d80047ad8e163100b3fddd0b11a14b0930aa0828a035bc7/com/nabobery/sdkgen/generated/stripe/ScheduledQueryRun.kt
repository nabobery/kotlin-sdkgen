package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * If you have [scheduled a Sigma query](https://docs.stripe.com/sigma/scheduled-queries), you'll
 * receive a `sigma.scheduled_query_run.created` webhook each time the query
 * runs. The webhook contains a `ScheduledQueryRun` object, which you can use to
 * retrieve the query results.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/scheduled_query_run
 */
@Serializable(with = ScheduledQueryRun.Serializer::class)
public class ScheduledQueryRun(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * When the query was run, Sigma contained a snapshot of your Stripe data at this time.
   */
  public val dataLoadTime: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineScheduledQueryRunObjectValueX0b67839f,
  /**
   * Time at which the result expires and is no longer available for download.
   */
  public val resultAvailableUntil: Int,
  /**
   * SQL for the query.
   */
  public val sql: String,
  /**
   * The query's execution status, which will be `completed` for successful runs, and `canceled`, `failed`, or
   * `timed_out` otherwise.
   */
  public val status: String,
  /**
   * Title of the query.
   */
  public val title: String,
  public val error: SigmaScheduledQueryRunError? = null,
  /**
   * The file object representing the results of the query.
   */
  public val `file`: InlineScheduledQueryRunFileX630c80f5? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
      }

    private var dataLoadTimeValue: Int? = null

    public var dataLoadTime: Int
      get() = requireNotNull(dataLoadTimeValue) { "dataLoadTime is required" }
      set(`value`) {
        dataLoadTimeValue = value
      }

    private var idValue: String? = null

    public var id: String
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var livemodeValue: Boolean? = null

    public var livemode: Boolean
      get() = requireNotNull(livemodeValue) { "livemode is required" }
      set(`value`) {
        livemodeValue = value
      }

    private var objectValueValue: InlineScheduledQueryRunObjectValueX0b67839f? = null

    public var objectValue: InlineScheduledQueryRunObjectValueX0b67839f
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var resultAvailableUntilValue: Int? = null

    public var resultAvailableUntil: Int
      get() = requireNotNull(resultAvailableUntilValue) { "resultAvailableUntil is required" }
      set(`value`) {
        resultAvailableUntilValue = value
      }

    private var sqlValue: String? = null

    public var sql: String
      get() = requireNotNull(sqlValue) { "sql is required" }
      set(`value`) {
        sqlValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    public var error: SigmaScheduledQueryRunError? = null

    /**
     * The file object representing the results of the query.
     */
    public var `file`: InlineScheduledQueryRunFileX630c80f5? = null

    public fun build(): ScheduledQueryRun {
      check(createdValue != null) { "created is required" }
      check(dataLoadTimeValue != null) { "dataLoadTime is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(resultAvailableUntilValue != null) { "resultAvailableUntil is required" }
      check(sqlValue != null) { "sql is required" }
      check(statusValue != null) { "status is required" }
      check(titleValue != null) { "title is required" }
      return ScheduledQueryRun(
        created = created,
        dataLoadTime = dataLoadTime,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        resultAvailableUntil = resultAvailableUntil,
        sql = sql,
        status = status,
        title = title,
        error = error,
        file = file,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ScheduledQueryRun = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ScheduledQueryRun> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ScheduledQueryRun {
      val jsonDecoder = decoder.requireJsonDecoder("ScheduledQueryRun")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ScheduledQueryRun must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val dataLoadTime = json.decodeRequired<Int>(rawObject, "data_load_time")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineScheduledQueryRunObjectValueX0b67839f>(rawObject, "object")
      val resultAvailableUntil = json.decodeRequired<Int>(rawObject, "result_available_until")
      val sql = json.decodeRequired<String>(rawObject, "sql")
      val status = json.decodeRequired<String>(rawObject, "status")
      val title = json.decodeRequired<String>(rawObject, "title")
      return ScheduledQueryRun(
        created = created,
        dataLoadTime = dataLoadTime,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        resultAvailableUntil = resultAvailableUntil,
        sql = sql,
        status = status,
        title = title,
        error = rawObject["error"]?.let { json.decodeFromJsonElement<SigmaScheduledQueryRunError>(it) },
        file = rawObject["file"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineScheduledQueryRunFileX630c80f5?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ScheduledQueryRun) {
      val jsonEncoder = encoder.requireJsonEncoder("ScheduledQueryRun")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("data_load_time", json.encodeToJsonElement(value.dataLoadTime))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("result_available_until", json.encodeToJsonElement(value.resultAvailableUntil))
        put("sql", value.sql)
        put("status", value.status)
        put("title", value.title)
        value.error?.let { put("error", json.encodeToJsonElement(it)) }
        value.file?.let { put("file", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun scheduledQueryRun(block: ScheduledQueryRun.Builder.() -> Unit): ScheduledQueryRun = ScheduledQueryRun.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ScheduledQueryRun is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
