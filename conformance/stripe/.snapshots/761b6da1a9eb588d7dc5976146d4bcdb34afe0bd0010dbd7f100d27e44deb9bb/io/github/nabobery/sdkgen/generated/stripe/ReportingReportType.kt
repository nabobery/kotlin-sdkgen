package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * The Report Type resource corresponds to a particular type of report, such as
 * the "Activity summary" or "Itemized payouts" reports. These objects are
 * identified by an ID belonging to a set of enumerated values. See
 * [API Access to Reports documentation](https://docs.stripe.com/reporting/statements/api)
 * for those Report Type IDs, along with required and optional parameters.
 *
 * Note that certain report types can only be run based on your live-mode data (not test-mode
 * data), and will error when queried without a [live-mode API key](https://docs.stripe.com/keys#test-live-modes).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/reporting.report_type
 */
@Serializable(with = ReportingReportType.Serializer::class)
public class ReportingReportType(
  /**
   * Most recent time for which this Report Type is available. Measured in seconds since the Unix epoch.
   */
  public val dataAvailableEnd: Int,
  /**
   * Earliest time for which this Report Type is available. Measured in seconds since the Unix epoch.
   */
  public val dataAvailableStart: Int,
  /**
   * The [ID of the Report Type](https://docs.stripe.com/reporting/statements/api#available-report-types), such as
   * `balance.summary.1`.
   */
  public val id: String,
  /**
   * If the object exists in live mode, the value is `true`. If the object exists in test mode, the value is `false`.
   */
  public val livemode: Boolean,
  /**
   * Human-readable name of the Report Type
   */
  public val name: String,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineReportingReportTypeObjectValueXaacccca2,
  /**
   * When this Report Type was latest updated. Measured in seconds since the Unix epoch.
   */
  public val updated: Int,
  /**
   * Version of the Report Type. Different versions report with the same ID will have the same purpose, but may take
   * different run parameters or have different result schemas.
   */
  public val version: Int,
  defaultColumns: List<String>? = null,
) {
  /**
   * List of column names that are included by default when this Report Type gets run. (If the Report Type doesn't
   * support the `columns` parameter, this will be null.)
   */
  public val defaultColumns: List<String>? =
      defaultColumns?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var dataAvailableEndValue: Int? = null

    public var dataAvailableEnd: Int
      get() = requireNotNull(dataAvailableEndValue) { "dataAvailableEnd is required" }
      set(`value`) {
        dataAvailableEndValue = value
      }

    private var dataAvailableStartValue: Int? = null

    public var dataAvailableStart: Int
      get() = requireNotNull(dataAvailableStartValue) { "dataAvailableStart is required" }
      set(`value`) {
        dataAvailableStartValue = value
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

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var objectValueValue: InlineReportingReportTypeObjectValueXaacccca2? = null

    public var objectValue: InlineReportingReportTypeObjectValueXaacccca2
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var updatedValue: Int? = null

    public var updated: Int
      get() = requireNotNull(updatedValue) { "updated is required" }
      set(`value`) {
        updatedValue = value
      }

    private var versionValue: Int? = null

    public var version: Int
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    private var defaultColumnsValue: List<String>? = null

    /**
     * List of column names that are included by default when this Report Type gets run. (If the Report Type doesn't
     * support the `columns` parameter, this will be null.)
     */
    public var defaultColumns: List<String>?
      get() = defaultColumnsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        defaultColumnsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): ReportingReportType {
      check(dataAvailableEndValue != null) { "dataAvailableEnd is required" }
      check(dataAvailableStartValue != null) { "dataAvailableStart is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(nameValue != null) { "name is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(updatedValue != null) { "updated is required" }
      check(versionValue != null) { "version is required" }
      return ReportingReportType(
        dataAvailableEnd = dataAvailableEnd,
        dataAvailableStart = dataAvailableStart,
        id = id,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        updated = updated,
        version = version,
        defaultColumns = defaultColumns,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReportingReportType = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ReportingReportType> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReportingReportType {
      val jsonDecoder = decoder.requireJsonDecoder("ReportingReportType")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReportingReportType must be a JSON object")
      val dataAvailableEnd = json.decodeRequired<Int>(rawObject, "data_available_end")
      val dataAvailableStart = json.decodeRequired<Int>(rawObject, "data_available_start")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val name = json.decodeRequired<String>(rawObject, "name")
      val objectValue = json.decodeRequired<InlineReportingReportTypeObjectValueXaacccca2>(rawObject, "object")
      val updated = json.decodeRequired<Int>(rawObject, "updated")
      val version = json.decodeRequired<Int>(rawObject, "version")
      return ReportingReportType(
        dataAvailableEnd = dataAvailableEnd,
        dataAvailableStart = dataAvailableStart,
        id = id,
        livemode = livemode,
        name = name,
        objectValue = objectValue,
        updated = updated,
        version = version,
        defaultColumns = rawObject["default_columns"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReportingReportType) {
      val jsonEncoder = encoder.requireJsonEncoder("ReportingReportType")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("data_available_end", json.encodeToJsonElement(value.dataAvailableEnd))
        put("data_available_start", json.encodeToJsonElement(value.dataAvailableStart))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("name", value.name)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("updated", json.encodeToJsonElement(value.updated))
        put("version", json.encodeToJsonElement(value.version))
        value.defaultColumns?.let { put("default_columns", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reportingReportType(block: ReportingReportType.Builder.() -> Unit): ReportingReportType = ReportingReportType.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReportingReportType is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
