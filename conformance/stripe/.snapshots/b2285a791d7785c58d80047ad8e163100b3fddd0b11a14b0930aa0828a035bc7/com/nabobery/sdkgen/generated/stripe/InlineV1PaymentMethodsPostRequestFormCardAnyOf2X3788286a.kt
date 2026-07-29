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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/1.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/card/anyOf/1
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a(
  public val token: String,
) {
  public class Builder {
    private var tokenValue: String? = null

    public var token: String
      get() = requireNotNull(tokenValue) { "token is required" }
      set(`value`) {
        tokenValue = value
      }

    public fun build(): InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a {
      check(tokenValue != null) { "token is required" }
      return InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a(
        token = token,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a must be a JSON object")
      val token = json.decodeRequired<String>(rawObject, "token")
      return InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a(
        token = token,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("token", value.token)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a(block: InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a = InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCardAnyOf2X3788286a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
