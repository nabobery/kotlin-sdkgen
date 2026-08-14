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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/after_submit/anyOf/0.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_links~1{payment_link}/post/requestBody/content/application~1x-www-f
 * orm-urlencoded/schema/properties/custom_text/properties/after_submit/anyOf/0
 */
@Serializable(with = InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f.Serializer::class)
public class InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f(
  public val message: String,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    public fun build(): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f {
      check(messageValue != null) { "message is required" }
      return InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f(
        message = message,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f(
        message = message,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f(block: InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f.Builder.() -> Unit): InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f = InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1PaymentLinksPostRequestFormCustomTextAfterSubmitAnyOf1X79b5160f is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
