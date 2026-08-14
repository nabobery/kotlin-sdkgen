package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * When creating a subscription, the specified configuration data will be used. There must be at least one line item
 * with a recurring price to use `subscription_data`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/subscription_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0(
  public val invoiceSettings:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e? = null,
  public val metadata: InlineV1PaymentLinksPostRequestFormSubscriptionDataMetadataXee471759? = null,
  public val trialPeriodDays:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a? = null,
  public val trialSettings:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c? = null,
) {
  public class Builder {
    public var invoiceSettings:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e? = null

    public var metadata: InlineV1PaymentLinksPostRequestFormSubscriptionDataMetadataXee471759? =
        null

    public var trialPeriodDays:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a? = null

    public var trialSettings:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0 = InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0(
      invoiceSettings = invoiceSettings,
      metadata = metadata,
      trialPeriodDays = trialPeriodDays,
      trialSettings = trialSettings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0(
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX0f24373e>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataMetadataXee471759>(it) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialPeriodDaysX6b24bc2a>(it) },
        trialSettings = rawObject["trial_settings"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXabb4339c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
        value.trialSettings?.let { put("trial_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0(block: InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0 = InlineV1PaymentLinksPostRequestFormSubscriptionDataX7c983df0.build(block)
