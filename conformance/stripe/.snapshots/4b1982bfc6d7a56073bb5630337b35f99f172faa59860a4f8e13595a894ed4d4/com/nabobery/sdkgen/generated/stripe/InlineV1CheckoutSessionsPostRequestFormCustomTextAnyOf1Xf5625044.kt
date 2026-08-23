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
 * ded/schema/properties/custom_text/properties/terms_of_service_acceptance/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/custom_text/properties/terms_of_service_acceptance/anyOf/0
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044(
  public val message: String,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 {
      check(messageValue != null) { "message is required" }
      return InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044(
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044(
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044(block: InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044.Builder.() -> Unit): InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 = InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsPostRequestFormCustomTextAnyOf1Xf5625044 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
