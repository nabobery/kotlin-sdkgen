package io.github.nabobery.sdkgen.generated.stripe

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/financial_reporting_finance_report_run_run_parameters
 */
@Serializable(with = FinancialReportingFinanceReportRunRunParameters.Serializer::class)
public class FinancialReportingFinanceReportRunRunParameters(
  columns: List<String>? = null,
  /**
   * Connected account ID by which to filter the report run.
   */
  public val connectedAccount: String? = null,
  /**
   * Currency of objects to be included in the report run.
   *
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  /**
   * Ending timestamp of data to be included in the report run. Can be any UTC timestamp between 1 second after the user
   * specified `interval_start` and 1 second before this report's last `data_available_end` value.
   */
  public val intervalEnd: Int? = null,
  /**
   * Starting timestamp of data to be included in the report run. Can be any UTC timestamp between 1 second after this
   * report's `data_available_start` and 1 second before the user specified `interval_end` value.
   */
  public val intervalStart: Int? = null,
  /**
   * Payout ID by which to filter the report run.
   */
  public val payout: String? = null,
  /**
   * Category of balance transactions to be included in the report run.
   */
  public val reportingCategory: String? = null,
  /**
   * Defaults to `Etc/UTC`. The output timezone for all timestamps in the report. A list of possible time zone values is
   * maintained at the [IANA Time Zone Database](http://www.iana.org/time-zones). Has no effect on `interval_start` or
   * `interval_end`.
   */
  public val timezone: String? = null,
) {
  /**
   * The set of output columns requested for inclusion in the report run.
   */
  public val columns: List<String>? = columns?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var columnsValue: List<String>? = null

    /**
     * The set of output columns requested for inclusion in the report run.
     */
    public var columns: List<String>?
      get() = columnsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        columnsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Connected account ID by which to filter the report run.
     */
    public var connectedAccount: String? = null

    /**
     * Currency of objects to be included in the report run.
     *
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    /**
     * Ending timestamp of data to be included in the report run. Can be any UTC timestamp between 1 second after the
     * user specified `interval_start` and 1 second before this report's last `data_available_end` value.
     */
    public var intervalEnd: Int? = null

    /**
     * Starting timestamp of data to be included in the report run. Can be any UTC timestamp between 1 second after this
     * report's `data_available_start` and 1 second before the user specified `interval_end` value.
     */
    public var intervalStart: Int? = null

    /**
     * Payout ID by which to filter the report run.
     */
    public var payout: String? = null

    /**
     * Category of balance transactions to be included in the report run.
     */
    public var reportingCategory: String? = null

    /**
     * Defaults to `Etc/UTC`. The output timezone for all timestamps in the report. A list of possible time zone values
     * is maintained at the [IANA Time Zone Database](http://www.iana.org/time-zones). Has no effect on `interval_start`
     * or `interval_end`.
     */
    public var timezone: String? = null

    public fun build(): FinancialReportingFinanceReportRunRunParameters = FinancialReportingFinanceReportRunRunParameters(
      columns = columns,
      connectedAccount = connectedAccount,
      currency = currency,
      intervalEnd = intervalEnd,
      intervalStart = intervalStart,
      payout = payout,
      reportingCategory = reportingCategory,
      timezone = timezone,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): FinancialReportingFinanceReportRunRunParameters = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<FinancialReportingFinanceReportRunRunParameters> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): FinancialReportingFinanceReportRunRunParameters {
      val jsonDecoder = decoder.requireJsonDecoder("FinancialReportingFinanceReportRunRunParameters")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("FinancialReportingFinanceReportRunRunParameters must be a JSON object")
      return FinancialReportingFinanceReportRunRunParameters(
        columns = rawObject["columns"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        connectedAccount = rawObject["connected_account"]?.let { json.decodeFromJsonElement<String>(it) },
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        intervalEnd = rawObject["interval_end"]?.let { json.decodeFromJsonElement<Int>(it) },
        intervalStart = rawObject["interval_start"]?.let { json.decodeFromJsonElement<Int>(it) },
        payout = rawObject["payout"]?.let { json.decodeFromJsonElement<String>(it) },
        reportingCategory = rawObject["reporting_category"]?.let { json.decodeFromJsonElement<String>(it) },
        timezone = rawObject["timezone"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: FinancialReportingFinanceReportRunRunParameters) {
      val jsonEncoder = encoder.requireJsonEncoder("FinancialReportingFinanceReportRunRunParameters")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.columns?.let { put("columns", json.encodeToJsonElement(it)) }
        value.connectedAccount?.let { put("connected_account", it) }
        value.currency?.let { put("currency", it) }
        value.intervalEnd?.let { put("interval_end", json.encodeToJsonElement(it)) }
        value.intervalStart?.let { put("interval_start", json.encodeToJsonElement(it)) }
        value.payout?.let { put("payout", it) }
        value.reportingCategory?.let { put("reporting_category", it) }
        value.timezone?.let { put("timezone", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun financialReportingFinanceReportRunRunParameters(block: FinancialReportingFinanceReportRunRunParameters.Builder.() -> Unit): FinancialReportingFinanceReportRunRunParameters = FinancialReportingFinanceReportRunRunParameters.build(block)
