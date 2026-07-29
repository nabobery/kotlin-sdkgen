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
 * The Report Run object represents an instance of a report type generated with
 * specific run parameters. Once the object is created, Stripe begins processing the report.
 * When the report has finished running, it will give you a reference to a file
 * where you can retrieve your results. For an overview, see
 * [API Access to Reports](https://docs.stripe.com/reporting/statements/api).
 *
 * Note that certain report types can only be run based on your live-mode data (not test-mode
 * data), and will error when queried without a [live-mode API key](https://docs.stripe.com/keys#test-live-modes).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/reporting.report_run
 */
@Serializable(with = ReportingReportRun.Serializer::class)
public class ReportingReportRun(
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  public val created: Int,
  /**
   * Unique identifier for the object.
   */
  public val id: String,
  /**
   * `true` if the report is run on live mode data and `false` if it is run on test mode data.
   */
  public val livemode: Boolean,
  /**
   * String representing the object's type. Objects of the same type share the same value.
   */
  public val objectValue: InlineReportingReportRunObjectValueXddefdfc1,
  public val parameters: FinancialReportingFinanceReportRunRunParameters,
  /**
   * The ID of the [report type](https://docs.stripe.com/reports/report-types) to run, such as `"balance.summary.1"`.
   */
  public val reportType: String,
  /**
   * Status of this report run. This will be `pending` when the run is initially created.
   * When the run finishes, this will be set to `succeeded` and the `result` field will be populated.
   * Rarely, we may encounter an error, at which point this will be set to `failed` and the `error` field will be
   * populated.
   */
  public val status: String,
  /**
   * If something should go wrong during the run, a message about the failure (populated when
   * `status=failed`).
   */
  public val error: String? = null,
  /**
   * The file object representing the result of the report run (populated when
   * `status=succeeded`).
   */
  public val result: InlineReportingReportRunResultXb663d9c3? = null,
  /**
   * Timestamp at which this run successfully finished (populated when
   * `status=succeeded`). Measured in seconds since the Unix epoch.
   */
  public val succeededAt: Int? = null,
) {
  public class Builder {
    private var createdValue: Int? = null

    public var created: Int
      get() = requireNotNull(createdValue) { "created is required" }
      set(`value`) {
        createdValue = value
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

    private var objectValueValue: InlineReportingReportRunObjectValueXddefdfc1? = null

    public var objectValue: InlineReportingReportRunObjectValueXddefdfc1
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var parametersValue: FinancialReportingFinanceReportRunRunParameters? = null

    public var parameters: FinancialReportingFinanceReportRunRunParameters
      get() = requireNotNull(parametersValue) { "parameters is required" }
      set(`value`) {
        parametersValue = value
      }

    private var reportTypeValue: String? = null

    public var reportType: String
      get() = requireNotNull(reportTypeValue) { "reportType is required" }
      set(`value`) {
        reportTypeValue = value
      }

    private var statusValue: String? = null

    public var status: String
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    /**
     * If something should go wrong during the run, a message about the failure (populated when
     * `status=failed`).
     */
    public var error: String? = null

    /**
     * The file object representing the result of the report run (populated when
     * `status=succeeded`).
     */
    public var result: InlineReportingReportRunResultXb663d9c3? = null

    /**
     * Timestamp at which this run successfully finished (populated when
     * `status=succeeded`). Measured in seconds since the Unix epoch.
     */
    public var succeededAt: Int? = null

    public fun build(): ReportingReportRun {
      check(createdValue != null) { "created is required" }
      check(idValue != null) { "id is required" }
      check(livemodeValue != null) { "livemode is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(parametersValue != null) { "parameters is required" }
      check(reportTypeValue != null) { "reportType is required" }
      check(statusValue != null) { "status is required" }
      return ReportingReportRun(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        parameters = parameters,
        reportType = reportType,
        status = status,
        error = error,
        result = result,
        succeededAt = succeededAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ReportingReportRun = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ReportingReportRun> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ReportingReportRun {
      val jsonDecoder = decoder.requireJsonDecoder("ReportingReportRun")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ReportingReportRun must be a JSON object")
      val created = json.decodeRequired<Int>(rawObject, "created")
      val id = json.decodeRequired<String>(rawObject, "id")
      val livemode = json.decodeRequired<Boolean>(rawObject, "livemode")
      val objectValue = json.decodeRequired<InlineReportingReportRunObjectValueXddefdfc1>(rawObject, "object")
      val parameters = json.decodeRequired<FinancialReportingFinanceReportRunRunParameters>(rawObject, "parameters")
      val reportType = json.decodeRequired<String>(rawObject, "report_type")
      val status = json.decodeRequired<String>(rawObject, "status")
      return ReportingReportRun(
        created = created,
        id = id,
        livemode = livemode,
        objectValue = objectValue,
        parameters = parameters,
        reportType = reportType,
        status = status,
        error = rawObject["error"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        result = rawObject["result"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineReportingReportRunResultXb663d9c3?>(element) },
        succeededAt = rawObject["succeeded_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ReportingReportRun) {
      val jsonEncoder = encoder.requireJsonEncoder("ReportingReportRun")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created", json.encodeToJsonElement(value.created))
        put("id", value.id)
        put("livemode", json.encodeToJsonElement(value.livemode))
        put("object", json.encodeToJsonElement(value.objectValue))
        put("parameters", json.encodeToJsonElement(value.parameters))
        put("report_type", value.reportType)
        put("status", value.status)
        value.error?.let { put("error", it) }
        value.result?.let { put("result", json.encodeToJsonElement(it)) }
        value.succeededAt?.let { put("succeeded_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun reportingReportRun(block: ReportingReportRun.Builder.() -> Unit): ReportingReportRun = ReportingReportRun.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ReportingReportRun is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
