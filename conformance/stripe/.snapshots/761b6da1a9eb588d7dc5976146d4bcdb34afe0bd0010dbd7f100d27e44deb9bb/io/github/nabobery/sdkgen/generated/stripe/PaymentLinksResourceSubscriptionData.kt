package io.github.nabobery.sdkgen.generated.stripe

import kotlin.ConsistentCopyVisibility
import kotlin.Int
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
public data class PaymentLinksResourceSubscriptionDataView internal constructor(
  public val description: String? = null,
  @SerialName("invoice_settings")
  public val invoiceSettings: PaymentLinksResourceSubscriptionDataInvoiceSettings,
  public val metadata: Map<String, String>,
  @SerialName("trial_period_days")
  public val trialPeriodDays: Int? = null,
  @SerialName("trial_settings")
  public val trialSettings:
      InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_subscription_data
 */
@Serializable(with = PaymentLinksResourceSubscriptionData.Serializer::class)
public class PaymentLinksResourceSubscriptionData(
  public val invoiceSettings: PaymentLinksResourceSubscriptionDataInvoiceSettings,
  metadata: Map<String, String>,
  /**
   * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
   * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
   */
  public val description: String? = null,
  /**
   * Integer representing the number of trial period days before the customer is charged for the first time.
   */
  public val trialPeriodDays: Int? = null,
  /**
   * Settings related to subscription trials.
   */
  public val trialSettings:
      InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30? = null,
) {
  /**
   * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that will set metadata on
   * [Subscriptions](https://docs.stripe.com/api/subscriptions) generated from this payment link.
   */
  public val metadata: Map<String, String> = metadata.toMap()

  public class Builder {
    private var invoiceSettingsValue: PaymentLinksResourceSubscriptionDataInvoiceSettings? = null

    public var invoiceSettings: PaymentLinksResourceSubscriptionDataInvoiceSettings
      get() = requireNotNull(invoiceSettingsValue) { "invoiceSettings is required" }
      set(`value`) {
        invoiceSettingsValue = value
      }

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>
      get() = requireNotNull(metadataValue) { "metadata is required" }.toMap()
      set(`value`) {
        metadataValue = value.toMap()
      }

    /**
     * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
     * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
     */
    public var description: String? = null

    /**
     * Integer representing the number of trial period days before the customer is charged for the first time.
     */
    public var trialPeriodDays: Int? = null

    /**
     * Settings related to subscription trials.
     */
    public var trialSettings: InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30? =
        null

    public fun build(): PaymentLinksResourceSubscriptionData {
      check(invoiceSettingsValue != null) { "invoiceSettings is required" }
      check(metadataValue != null) { "metadata is required" }
      return PaymentLinksResourceSubscriptionData(
        invoiceSettings = invoiceSettings,
        metadata = metadata,
        description = description,
        trialPeriodDays = trialPeriodDays,
        trialSettings = trialSettings,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceSubscriptionData = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceSubscriptionData> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceSubscriptionData {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceSubscriptionData")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceSubscriptionData must be a JSON object")
      val invoiceSettings = json.decodeRequired<PaymentLinksResourceSubscriptionDataInvoiceSettings>(rawObject, "invoice_settings")
      val metadata = json.decodeRequired<Map<String, String>>(rawObject, "metadata")
      return PaymentLinksResourceSubscriptionData(
        invoiceSettings = invoiceSettings,
        metadata = metadata,
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(element) },
        trialSettings = rawObject["trial_settings"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePaymentLinksResourceSubscriptionDataTrialSettingsX443c7f30?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceSubscriptionData) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceSubscriptionData")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("invoice_settings", json.encodeToJsonElement(value.invoiceSettings))
        put("metadata", json.encodeToJsonElement(value.metadata))
        value.description?.let { put("description", it) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
        value.trialSettings?.let { put("trial_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceSubscriptionData(block: PaymentLinksResourceSubscriptionData.Builder.() -> Unit): PaymentLinksResourceSubscriptionData = PaymentLinksResourceSubscriptionData.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceSubscriptionData is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
