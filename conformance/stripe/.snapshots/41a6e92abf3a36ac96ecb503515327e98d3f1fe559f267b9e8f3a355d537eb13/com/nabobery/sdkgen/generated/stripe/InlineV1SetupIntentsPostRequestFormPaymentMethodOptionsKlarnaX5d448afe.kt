package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/payment_method_options/properties/klarna
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val onDemand:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b? = null,
  public val preferredLocale:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPreferredLocaleX1b7606fc? = null,
  public val subscriptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87? = null,
) {
  public class Builder {
    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var onDemand:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b? = null

    public var preferredLocale:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPreferredLocaleX1b7606fc? = null

    public var subscriptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe(
      currency = currency,
      onDemand = onDemand,
      preferredLocale = preferredLocale,
      subscriptions = subscriptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe(
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        onDemand = rawObject["on_demand"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb42c287b>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPreferredLocaleX1b7606fc>(it) },
        subscriptions = rawObject["subscriptions"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX954b5e87>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.currency?.let { put("currency", it) }
        value.onDemand?.let { put("on_demand", json.encodeToJsonElement(it)) }
        value.preferredLocale?.let { put("preferred_locale", json.encodeToJsonElement(it)) }
        value.subscriptions?.let { put("subscriptions", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaX5d448afe.build(block)
