package io.github.nabobery.sdkgen.generated.stripe

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
 * Generated model for sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/get/parameters/3/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/get/parameters/3/schema
 */
@Serializable(with = InlineV1CheckoutSessionsGetParameterXa5b062a4.Serializer::class)
public class InlineV1CheckoutSessionsGetParameterXa5b062a4(
  public val email: String,
) {
  public class Builder {
    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    public fun build(): InlineV1CheckoutSessionsGetParameterXa5b062a4 {
      check(emailValue != null) { "email is required" }
      return InlineV1CheckoutSessionsGetParameterXa5b062a4(
        email = email,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1CheckoutSessionsGetParameterXa5b062a4 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsGetParameterXa5b062a4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsGetParameterXa5b062a4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsGetParameterXa5b062a4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1CheckoutSessionsGetParameterXa5b062a4 must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      return InlineV1CheckoutSessionsGetParameterXa5b062a4(
        email = email,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsGetParameterXa5b062a4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1CheckoutSessionsGetParameterXa5b062a4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1CheckoutSessionsGetParameterXa5b062a4(block: InlineV1CheckoutSessionsGetParameterXa5b062a4.Builder.() -> Unit): InlineV1CheckoutSessionsGetParameterXa5b062a4 = InlineV1CheckoutSessionsGetParameterXa5b062a4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1CheckoutSessionsGetParameterXa5b062a4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
