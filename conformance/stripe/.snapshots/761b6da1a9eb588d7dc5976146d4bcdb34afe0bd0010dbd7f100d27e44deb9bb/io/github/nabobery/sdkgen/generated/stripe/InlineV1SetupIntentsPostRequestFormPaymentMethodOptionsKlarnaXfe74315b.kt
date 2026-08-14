package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/klarna
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b(
  /**
   * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val currency: String? = null,
  public val onDemand:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff? = null,
  public val preferredLocale:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPreferredLocaleX6f6d9eef? = null,
  public val subscriptions:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7? = null,
) {
  public class Builder {
    /**
     * Wire format: `currency`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var currency: String? = null

    public var onDemand:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff? = null

    public var preferredLocale:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPreferredLocaleX6f6d9eef? = null

    public var subscriptions:
        InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7? = null

    public fun build(): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b(
      currency = currency,
      onDemand = onDemand,
      preferredLocale = preferredLocale,
      subscriptions = subscriptions,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b must be a JSON object")
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b(
        currency = rawObject["currency"]?.let { json.decodeFromJsonElement<String>(it) },
        onDemand = rawObject["on_demand"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaOnDemandXb0c542ff>(it) },
        preferredLocale = rawObject["preferred_locale"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPreferredLocaleX6f6d9eef>(it) },
        subscriptions = rawObject["subscriptions"]?.let { json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsSubscriptionsX0d1f3ac7>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b")
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

public fun inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b(block: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b.Builder.() -> Unit): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsKlarnaXfe74315b.build(block)
