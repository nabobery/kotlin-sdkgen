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
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}~1process_payment_intent/post/requestBody/conten
 * t/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402.Serializer::class)
public class InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402(
  /**
   * The ID of the PaymentIntent to process on the reader.
   */
  public val paymentIntent: String,
  expand: List<String>? = null,
  /**
   * Configuration overrides for this transaction, such as tipping and customer cancellation settings.
   */
  public val processConfig:
      InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f? = null,
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

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Configuration overrides for this transaction, such as tipping and customer cancellation settings.
     */
    public var processConfig:
        InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f? = null

    public fun build(): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402 {
      check(paymentIntentValue != null) { "paymentIntent is required" }
      return InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402(
        paymentIntent = paymentIntent,
        expand = expand,
        processConfig = processConfig,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402 must be a JSON object")
      val paymentIntent = json.decodeRequired<String>(rawObject, "payment_intent")
      return InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402(
        paymentIntent = paymentIntent,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        processConfig = rawObject["process_config"]?.let { json.decodeFromJsonElement<InlineV1TerminalReadersProcessPaymentIntentPostRequestFormProcessConfigXc6c12c4f>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("payment_intent", value.paymentIntent)
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.processConfig?.let { put("process_config", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402(block: InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402.Builder.() -> Unit): InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402 = InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TerminalReadersProcessPaymentIntentPostRequestFormX05966402 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
