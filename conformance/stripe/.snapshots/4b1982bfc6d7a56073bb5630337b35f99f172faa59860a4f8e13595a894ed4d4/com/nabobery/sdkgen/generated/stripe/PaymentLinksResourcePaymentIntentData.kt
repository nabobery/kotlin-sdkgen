package com.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@ConsistentCopyVisibility
@Serializable
public data class PaymentLinksResourcePaymentIntentDataView internal constructor(
  @SerialName("capture_method")
  public val captureMethod:
      InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d? = null,
  public val description: String? = null,
  public val metadata: Map<String, String>,
  @SerialName("setup_future_usage")
  public val setupFutureUsage:
      InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f? = null,
  @SerialName("statement_descriptor")
  public val statementDescriptor: String? = null,
  @SerialName("statement_descriptor_suffix")
  public val statementDescriptorSuffix: String? = null,
  @SerialName("transfer_group")
  public val transferGroup: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_payment_intent_data
 */
@Serializable(with = PaymentLinksResourcePaymentIntentData.Serializer::class)
public class PaymentLinksResourcePaymentIntentData(
  metadata: Map<String, String>,
  /**
   * Indicates when the funds will be captured from the customer's account.
   */
  public val captureMethod:
      InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d? = null,
  /**
   * An arbitrary string attached to the object. Often useful for displaying to users.
   */
  public val description: String? = null,
  /**
   * Indicates that you intend to make future payments with the payment method collected during checkout.
   */
  public val setupFutureUsage:
      InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f? = null,
  /**
   * For a non-card payment, information about the charge that appears on the customer's statement when this payment
   * succeeds in creating a charge.
   */
  public val statementDescriptor: String? = null,
  /**
   * For a card payment, information about the charge that appears on the customer's statement when this payment
   * succeeds in creating a charge. Concatenated with the account's statement descriptor prefix to form the complete
   * statement descriptor.
   */
  public val statementDescriptorSuffix: String? = null,
  /**
   * A string that identifies the resulting payment as part of a group. See the PaymentIntents [use case for connected
   * accounts](https://docs.stripe.com/connect/separate-charges-and-transfers) for details.
   */
  public val transferGroup: String? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that will set metadata on [Payment
   * Intents](https://docs.stripe.com/api/payment_intents) generated from this payment link.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    /**
     * Indicates when the funds will be captured from the customer's account.
     */
    public var captureMethod: InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d? =
        null

    /**
     * An arbitrary string attached to the object. Often useful for displaying to users.
     */
    public var description: String? = null

    /**
     * Indicates that you intend to make future payments with the payment method collected during checkout.
     */
    public var setupFutureUsage:
        InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f? = null

    /**
     * For a non-card payment, information about the charge that appears on the customer's statement when this payment
     * succeeds in creating a charge.
     */
    public var statementDescriptor: String? = null

    /**
     * For a card payment, information about the charge that appears on the customer's statement when this payment
     * succeeds in creating a charge. Concatenated with the account's statement descriptor prefix to form the complete
     * statement descriptor.
     */
    public var statementDescriptorSuffix: String? = null

    /**
     * A string that identifies the resulting payment as part of a group. See the PaymentIntents [use case for connected
     * accounts](https://docs.stripe.com/connect/separate-charges-and-transfers) for details.
     */
    public var transferGroup: String? = null

    public fun build(): PaymentLinksResourcePaymentIntentData {
      check(metadataValue != null) { "metadata is required" }
      return PaymentLinksResourcePaymentIntentData(
        metadata = metadata,
        captureMethod = captureMethod,
        description = description,
        setupFutureUsage = setupFutureUsage,
        statementDescriptor = statementDescriptor,
        statementDescriptorSuffix = statementDescriptorSuffix,
        transferGroup = transferGroup,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourcePaymentIntentData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourcePaymentIntentData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourcePaymentIntentData {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourcePaymentIntentData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourcePaymentIntentData must be a JSON object")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      return PaymentLinksResourcePaymentIntentData(
        metadata = metadata,
        captureMethod = rawObject["capture_method"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourcePaymentIntentDataCaptureMethodXf179e15d?>(element) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        setupFutureUsage = rawObject["setup_future_usage"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourcePaymentIntentDataSetupFutureUsageXf07e6e5f?>(element) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        statementDescriptorSuffix = rawObject["statement_descriptor_suffix"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        transferGroup = rawObject["transfer_group"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourcePaymentIntentData) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourcePaymentIntentData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("metadata", json.encodeToJsonElement(value.metadata))
        value.captureMethod?.let { put("capture_method", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.setupFutureUsage?.let { put("setup_future_usage", json.encodeToJsonElement(it)) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourcePaymentIntentData(block: PaymentLinksResourcePaymentIntentData.Builder.() -> Unit): PaymentLinksResourcePaymentIntentData = PaymentLinksResourcePaymentIntentData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourcePaymentIntentData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
