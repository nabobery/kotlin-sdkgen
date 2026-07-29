package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1confirm_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1confirm_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c.Serializer::class)
public class InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c(
  /**
   * The ID of the PaymentIntent to confirm.
   */
  public val paymentIntent: String,
  /**
   * Configuration overrides for this confirmation, such as surcharge settings and return URL.
   */
  public val confirmConfig:
      InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac? = null,
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
     * Configuration overrides for this confirmation, such as surcharge settings and return URL.
     */
    public var confirmConfig:
        InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c(
        paymentIntent = paymentIntent,
        confirmConfig = confirmConfig,
        expand = expand,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c must be a JSON object")
      val paymentIntent = json.decodeRequired<String>(rawObject, "payment_intent")
      return InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c(
        paymentIntent = paymentIntent,
        confirmConfig = rawObject["confirm_config"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormConfirmConfigXead464ac>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", value.paymentIntent)
        value.confirmConfig?.let { put("confirm_config", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c(block: InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c.Builder.() -> Unit): InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c = InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersConfirmPaymentIntentPostRequestFormXa6b6713c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
