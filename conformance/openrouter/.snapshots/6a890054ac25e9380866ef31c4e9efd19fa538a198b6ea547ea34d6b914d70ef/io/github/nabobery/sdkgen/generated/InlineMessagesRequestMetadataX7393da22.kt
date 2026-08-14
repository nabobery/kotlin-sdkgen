package io.github.nabobery.sdkgen.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/metadata.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesRequest/properties/metadata
 */
@Serializable(with = InlineMessagesRequestMetadataX7393da22.Serializer::class)
public class InlineMessagesRequestMetadataX7393da22(
  public val userId: String? = null,
) {
  public class Builder {
    public var userId: String? = null

    public fun build(): InlineMessagesRequestMetadataX7393da22 = InlineMessagesRequestMetadataX7393da22(
      userId = userId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMessagesRequestMetadataX7393da22 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMessagesRequestMetadataX7393da22> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesRequestMetadataX7393da22 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesRequestMetadataX7393da22")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMessagesRequestMetadataX7393da22 must be a JSON object")
      return InlineMessagesRequestMetadataX7393da22(
        userId = rawObject["user_id"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesRequestMetadataX7393da22) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMessagesRequestMetadataX7393da22")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.userId?.let { put("user_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMessagesRequestMetadataX7393da22(block: InlineMessagesRequestMetadataX7393da22.Builder.() -> Unit): InlineMessagesRequestMetadataX7393da22 = InlineMessagesRequestMetadataX7393da22.build(block)
