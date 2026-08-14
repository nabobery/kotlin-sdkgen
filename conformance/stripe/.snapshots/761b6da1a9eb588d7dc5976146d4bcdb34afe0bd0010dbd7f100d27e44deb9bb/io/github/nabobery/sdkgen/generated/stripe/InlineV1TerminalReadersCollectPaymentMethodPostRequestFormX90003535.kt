package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_payment_method/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1collect_payment_method/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535.Serializer::class)
public class InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535(
  /**
   * The ID of the PaymentIntent to collect a payment method for.
   */
  public val paymentIntent: String,
  /**
   * Configuration overrides for this collection, such as tipping, surcharging, and customer cancellation settings.
   */
  public val collectConfig:
      InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2? = null,
  expand: List<String>? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var paymentIntentValue: String? = null

    public var paymentIntent: String
      get() = requireNotNull(paymentIntentValue) { "paymentIntent is required" }
      set(`value`) {
        paymentIntentValue = value
      }

    /**
     * Configuration overrides for this collection, such as tipping, surcharging, and customer cancellation settings.
     */
    public var collectConfig:
        InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535 {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535(
        paymentIntent = paymentIntent,
        collectConfig = collectConfig,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535 must be a JSON object")
      val paymentIntent = json.decodeRequired<String>(rawObject, "payment_intent")
      return InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535(
        paymentIntent = paymentIntent,
        collectConfig = rawObject["collect_config"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersCollectPaymentMethodPostRequestFormCollectConfigXadf48dd2>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", value.paymentIntent)
        value.collectConfig?.let { put("collect_config", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535(block: InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535.Builder.() -> Unit): InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535 = InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersCollectPaymentMethodPostRequestFormX90003535 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
