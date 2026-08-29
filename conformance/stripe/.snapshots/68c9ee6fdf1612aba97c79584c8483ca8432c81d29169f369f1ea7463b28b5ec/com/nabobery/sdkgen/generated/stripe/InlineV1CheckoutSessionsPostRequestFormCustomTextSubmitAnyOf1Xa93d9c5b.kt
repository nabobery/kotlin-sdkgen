package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/submit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/submit/anyOf/0
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b(
  public val message: String,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b {
      check(messageValue != null) { "message is required" }
      return InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b(
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b(
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b(block: InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b = InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomTextSubmitAnyOf1Xa93d9c5b is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
