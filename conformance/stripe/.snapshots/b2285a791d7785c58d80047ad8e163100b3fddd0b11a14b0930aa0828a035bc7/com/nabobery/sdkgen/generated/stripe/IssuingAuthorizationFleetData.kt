package com.nabobery.sdkgen.generated.stripe

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
public data class IssuingAuthorizationFleetDataView(
  @SerialName("cardholder_prompt_data")
  public val cardholderPromptData:
      InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35? = null,
  @SerialName("purchase_type")
  public val purchaseType: InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329? = null,
  @SerialName("reported_breakdown")
  public val reportedBreakdown:
      InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7? = null,
  @SerialName("service_type")
  public val serviceType: InlineIssuingAuthorizationFleetDataServiceTypeX8234a514? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing_authorization_fleet_data
 */
@Serializable(with = IssuingAuthorizationFleetData.Serializer::class)
public class IssuingAuthorizationFleetData(
  /**
   * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary depending on the
   * configuration of your physical fleet cards. Typical points of sale support only numeric entry.
   */
  public val cardholderPromptData:
      InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35? = null,
  /**
   * The type of purchase.
   */
  public val purchaseType: InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329? = null,
  /**
   * More information about the total amount. Typically this information is received from the merchant after the
   * authorization has been approved and the fuel dispensed. This information is not guaranteed to be accurate as some
   * merchants may provide unreliable data.
   */
  public val reportedBreakdown:
      InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7? = null,
  /**
   * The type of fuel service.
   */
  public val serviceType: InlineIssuingAuthorizationFleetDataServiceTypeX8234a514? = null,
) {
  public class Builder {
    /**
     * Answers to prompts presented to the cardholder at the point of sale. Prompted fields vary depending on the
     * configuration of your physical fleet cards. Typical points of sale support only numeric entry.
     */
    public var cardholderPromptData:
        InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35? = null

    /**
     * The type of purchase.
     */
    public var purchaseType: InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329? = null

    /**
     * More information about the total amount. Typically this information is received from the merchant after the
     * authorization has been approved and the fuel dispensed. This information is not guaranteed to be accurate as some
     * merchants may provide unreliable data.
     */
    public var reportedBreakdown: InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7? =
        null

    /**
     * The type of fuel service.
     */
    public var serviceType: InlineIssuingAuthorizationFleetDataServiceTypeX8234a514? = null

    public fun build(): IssuingAuthorizationFleetData = IssuingAuthorizationFleetData(
      cardholderPromptData = cardholderPromptData,
      purchaseType = purchaseType,
      reportedBreakdown = reportedBreakdown,
      serviceType = serviceType,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IssuingAuthorizationFleetData = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IssuingAuthorizationFleetData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IssuingAuthorizationFleetData {
      val jsonDecoder = decoder.requireJsonDecoder("IssuingAuthorizationFleetData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IssuingAuthorizationFleetData must be a JSON object")
      return IssuingAuthorizationFleetData(
        cardholderPromptData = rawObject["cardholder_prompt_data"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFleetDataCardholderPromptDataXa71fed35?>(element) },
        purchaseType = rawObject["purchase_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFleetDataPurchaseTypeX0a1b0329?>(element) },
        reportedBreakdown = rawObject["reported_breakdown"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFleetDataReportedBreakdownX67cf04e7?>(element) },
        serviceType = rawObject["service_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineIssuingAuthorizationFleetDataServiceTypeX8234a514?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IssuingAuthorizationFleetData) {
      val jsonEncoder = encoder.requireJsonEncoder("IssuingAuthorizationFleetData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardholderPromptData?.let { put("cardholder_prompt_data", json.encodeToJsonElement(it)) }
        value.purchaseType?.let { put("purchase_type", json.encodeToJsonElement(it)) }
        value.reportedBreakdown?.let { put("reported_breakdown", json.encodeToJsonElement(it)) }
        value.serviceType?.let { put("service_type", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun issuingAuthorizationFleetData(block: IssuingAuthorizationFleetData.Builder.() -> Unit): IssuingAuthorizationFleetData = IssuingAuthorizationFleetData.build(block)
