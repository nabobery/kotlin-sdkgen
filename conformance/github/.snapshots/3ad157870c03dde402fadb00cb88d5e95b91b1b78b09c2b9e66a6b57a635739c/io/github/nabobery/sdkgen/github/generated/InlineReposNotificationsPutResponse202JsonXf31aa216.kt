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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1notifications/put/responses/202/content/application~1js
 * on/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1notifications/put/responses/202/content/application~1js
 * on/schema
 */
@Serializable(with = InlineReposNotificationsPutResponse202JsonXf31aa216.Serializer::class)
public class InlineReposNotificationsPutResponse202JsonXf31aa216(
  public val message: String? = null,
  public val url: String? = null,
) {
  public class Builder {
    public var message: String? = null

    public var url: String? = null

    public fun build(): InlineReposNotificationsPutResponse202JsonXf31aa216 = InlineReposNotificationsPutResponse202JsonXf31aa216(
      message = message,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposNotificationsPutResponse202JsonXf31aa216 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposNotificationsPutResponse202JsonXf31aa216> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposNotificationsPutResponse202JsonXf31aa216 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposNotificationsPutResponse202JsonXf31aa216")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposNotificationsPutResponse202JsonXf31aa216 must be a JSON object")
      return InlineReposNotificationsPutResponse202JsonXf31aa216(
        message = rawObject["message"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposNotificationsPutResponse202JsonXf31aa216) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposNotificationsPutResponse202JsonXf31aa216")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.message?.let { put("message", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposNotificationsPutResponse202JsonXf31aa216(block: InlineReposNotificationsPutResponse202JsonXf31aa216.Builder.() -> Unit): InlineReposNotificationsPutResponse202JsonXf31aa216 = InlineReposNotificationsPutResponse202JsonXf31aa216.build(block)
