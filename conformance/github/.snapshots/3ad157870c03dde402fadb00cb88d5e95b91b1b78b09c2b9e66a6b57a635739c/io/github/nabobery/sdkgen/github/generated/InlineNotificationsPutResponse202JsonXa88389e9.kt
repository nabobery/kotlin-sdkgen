package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1notifications/put/responses/202/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1notifications/put/responses/202/content/application~1json/schema
 */
@Serializable(with = InlineNotificationsPutResponse202JsonXa88389e9.Serializer::class)
public class InlineNotificationsPutResponse202JsonXa88389e9(
  public val message: String? = null,
) {
  public class Builder {
    public var message: String? = null

    public fun build(): InlineNotificationsPutResponse202JsonXa88389e9 = InlineNotificationsPutResponse202JsonXa88389e9(
      message = message,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNotificationsPutResponse202JsonXa88389e9 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineNotificationsPutResponse202JsonXa88389e9> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNotificationsPutResponse202JsonXa88389e9 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNotificationsPutResponse202JsonXa88389e9")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNotificationsPutResponse202JsonXa88389e9 must be a JSON object")
      return InlineNotificationsPutResponse202JsonXa88389e9(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNotificationsPutResponse202JsonXa88389e9) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNotificationsPutResponse202JsonXa88389e9")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNotificationsPutResponse202JsonXa88389e9(block: InlineNotificationsPutResponse202JsonXa88389e9.Builder.() -> Unit): InlineNotificationsPutResponse202JsonXa88389e9 = InlineNotificationsPutResponse202JsonXa88389e9.build(block)
