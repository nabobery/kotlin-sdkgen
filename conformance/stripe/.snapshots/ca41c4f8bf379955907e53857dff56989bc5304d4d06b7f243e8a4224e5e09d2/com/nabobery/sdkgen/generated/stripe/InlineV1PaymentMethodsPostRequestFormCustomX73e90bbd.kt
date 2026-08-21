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
 * If this is a `custom` PaymentMethod, this hash contains details about the Custom payment method.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_methods/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/custom
 */
@Serializable(with = InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd.Serializer::class)
public class InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd(
  public val type: String,
) {
  public class Builder {
    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    public fun build(): InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd {
      check(typeValue != null) { "type is required" }
      return InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd(
        type = type,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd must be a JSON object")
      val type = json.decodeRequired<String>(rawObject, "type")
      return InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd(
        type = type,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("type", value.type)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentMethodsPostRequestFormCustomX73e90bbd(block: InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd.Builder.() -> Unit): InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd = InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentMethodsPostRequestFormCustomX73e90bbd is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
