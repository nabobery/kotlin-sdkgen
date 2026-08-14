package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Hash used to generate the PaymentMethod to be used for this OutboundPayment. Exclusive with
 * `destination_payment_method`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1treasury~1outbound_payments/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/destination_payment_method_data
 */
@Serializable(with = InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474.Serializer::class)
public class InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474(
  public val type: InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e,
  public val billingDetails:
      InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31? = null,
  public val financialAccount: String? = null,
  metadata: Map<String, String>? = null,
  public val usBankAccount:
      InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa4a7bfc5? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    private var typeValue: InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e? = null

    public var type: InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public var billingDetails: InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31?
        = null

    public var financialAccount: String? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var usBankAccount: InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa4a7bfc5? =
        null

    public fun build(): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474 {
      check(typeValue != null) { "type is required" }
      return InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474(
        type = type,
        billingDetails = billingDetails,
        financialAccount = financialAccount,
        metadata = metadata,
        usBankAccount = usBankAccount,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474 must be a JSON object")
      val type = json.decodeRequired<InlineV1TreasuryOutboundPab148PostRequestFormTypeX6b8f616e>(rawObject, "type")
      return InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474(
        type = type,
        billingDetails = rawObject["billing_details"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormBillingDetailsX30f81f31>(it) },
        financialAccount = rawObject["financial_account"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        usBankAccount = rawObject["us_bank_account"]?.let { json.decodeFromJsonElement<InlineV1TreasuryOutboundPab148PostRequestFormUsBankAccountXa4a7bfc5>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", json.encodeToJsonElement(value.type))
        value.billingDetails?.let { put("billing_details", json.encodeToJsonElement(it)) }
        value.financialAccount?.let { put("financial_account", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.usBankAccount?.let { put("us_bank_account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474(block: InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474.Builder.() -> Unit): InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474 = InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TreasuryOutboundPab148PostRequestFormDestinationPaymentMec421X96743474 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
