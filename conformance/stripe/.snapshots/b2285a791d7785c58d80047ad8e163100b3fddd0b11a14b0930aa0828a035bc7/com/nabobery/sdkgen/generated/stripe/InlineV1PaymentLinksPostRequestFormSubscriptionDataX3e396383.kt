package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/subscription_data
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383(
  public val description: String? = null,
  public val invoiceSettings:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f? = null,
  metadata: Map<String, String>? = null,
  public val trialPeriodDays: Int? = null,
  public val trialSettings:
      InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941? = null,
) {
  public val metadata: Map<String, String>? = metadata?.let { collection0 -> collection0.toMap() }

  public class Builder {
    public var description: String? = null

    public var invoiceSettings:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f? = null

    private var metadataValue: Map<String, String>? = null

    public var metadata: Map<String, String>?
      get() = metadataValue?.let { collection0 -> collection0.toMap() }
      set(`value`) {
        metadataValue = value?.let { collection0 -> collection0.toMap() }
      }

    public var trialPeriodDays: Int? = null

    public var trialSettings:
        InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941? = null

    public fun build(): InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383 = InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383(
      description = description,
      invoiceSettings = invoiceSettings,
      metadata = metadata,
      trialPeriodDays = trialPeriodDays,
      trialSettings = trialSettings,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383 must be a JSON object")
      return InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383(
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        invoiceSettings = rawObject["invoice_settings"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataInvoiceSettingsX227f812f>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<Map<String, String>>(it) },
        trialPeriodDays = rawObject["trial_period_days"]?.let { json.decodeFromJsonElement<Int>(it) },
        trialSettings = rawObject["trial_settings"]?.let { json.decodeFromJsonElement<InlineV1PaymentLinksPostRequestFormSubscriptionDataTrialSettingsXd2edc941>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.description?.let { put("description", it) }
        value.invoiceSettings?.let { put("invoice_settings", json.encodeToJsonElement(it)) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
        value.trialPeriodDays?.let { put("trial_period_days", json.encodeToJsonElement(it)) }
        value.trialSettings?.let { put("trial_settings", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383(block: InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383 = InlineV1PaymentLinksPostRequestFormSubscriptionDataX3e396383.build(block)
