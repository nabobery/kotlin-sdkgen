package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class IssuingTransactionFleetDataView(
  @SerialName("cardholder_prompt_data")
  public val cardholderPromptData:
      InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b? = null,
  @SerialName("purchase_type")
  public val purchaseType: String? = null,
  @SerialName("reported_breakdown")
  public val reportedBreakdown: InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd? = null,
  @SerialName("service_type")
  public val serviceType: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_transaction_fleet_data
 */
@Serializable(with = IssuingTransactionFleetData.Serializer::class)
public class IssuingTransactionFleetData(
  /**
   * Answers to prompts presented to cardholder at point of sale.
   */
  public val cardholderPromptData:
      InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b? = null,
  /**
   * The type of purchase. One of `fuel_purchase`, `non_fuel_purchase`, or `fuel_and_non_fuel_purchase`.
   */
  public val purchaseType: String? = null,
  /**
   * More information about the total amount. This information is not guaranteed to be accurate as some merchants may
   * provide unreliable data.
   */
  public val reportedBreakdown: InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd? = null,
  /**
   * The type of fuel service. One of `non_fuel_transaction`, `full_service`, or `self_service`.
   */
  public val serviceType: String? = null,
) {
  public class Builder {
    /**
     * Answers to prompts presented to cardholder at point of sale.
     */
    public var cardholderPromptData: InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b?
        = null

    /**
     * The type of purchase. One of `fuel_purchase`, `non_fuel_purchase`, or `fuel_and_non_fuel_purchase`.
     */
    public var purchaseType: String? = null

    /**
     * More information about the total amount. This information is not guaranteed to be accurate as some merchants may
     * provide unreliable data.
     */
    public var reportedBreakdown: InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd? =
        null

    /**
     * The type of fuel service. One of `non_fuel_transaction`, `full_service`, or `self_service`.
     */
    public var serviceType: String? = null

    public fun build(): IssuingTransactionFleetData = IssuingTransactionFleetData(
      cardholderPromptData = cardholderPromptData,
      purchaseType = purchaseType,
      reportedBreakdown = reportedBreakdown,
      serviceType = serviceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingTransactionFleetData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<IssuingTransactionFleetData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingTransactionFleetData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingTransactionFleetData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingTransactionFleetData must be a JSON object")
      return IssuingTransactionFleetData(
        cardholderPromptData = rawObject["cardholder_prompt_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionFleetDataCardholderPromptDataX2224655b?>(element) },
        purchaseType = rawObject["purchase_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        reportedBreakdown = rawObject["reported_breakdown"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingTransactionFleetDataReportedBreakdownX14d2b9dd?>(element) },
        serviceType = rawObject["service_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingTransactionFleetData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingTransactionFleetData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardholderPromptData?.let { put("cardholder_prompt_data", json.encodeToJsonElement(it)) }
        value.purchaseType?.let { put("purchase_type", it) }
        value.reportedBreakdown?.let { put("reported_breakdown", json.encodeToJsonElement(it)) }
        value.serviceType?.let { put("service_type", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingTransactionFleetData(block: IssuingTransactionFleetData.Builder.() -> Unit): IssuingTransactionFleetData = IssuingTransactionFleetData.build(block)
