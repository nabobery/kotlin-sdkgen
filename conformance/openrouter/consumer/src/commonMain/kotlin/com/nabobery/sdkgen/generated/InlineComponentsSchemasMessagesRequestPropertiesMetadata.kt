package com.nabobery.sdkgen.generated

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
 */
@Serializable(with = InlineComponentsSchemasMessagesRequestPropertiesMetadata.Serializer::class)
public class InlineComponentsSchemasMessagesRequestPropertiesMetadata(
  public val userId: String? = null,
) {
  public class Builder {
    public var userId: String? = null

    public fun build(): InlineComponentsSchemasMessagesRequestPropertiesMetadata =
      InlineComponentsSchemasMessagesRequestPropertiesMetadata(
      userId = userId,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesMetadata = Builder()
      .apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasMessagesRequestPropertiesMetadata> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasMessagesRequestPropertiesMetadata {
      val jsonDecoder = decoder.requireJsonDecoder("InlineComponentsSchemasMessagesRequestPropertiesMetadata")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasMessagesRequestPropertiesMetadata must be a JSON object")
      return InlineComponentsSchemasMessagesRequestPropertiesMetadata(
        userId = raw["user_id"]?.let { element -> if (element == JsonNull) null else json
          .decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineComponentsSchemasMessagesRequestPropertiesMetadata) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineComponentsSchemasMessagesRequestPropertiesMetadata")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.userId?.let { put("user_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasMessagesRequestPropertiesMetadata(block: InlineComponentsSchemasMessagesRequestPropertiesMetadata.Builder.() -> Unit): InlineComponentsSchemasMessagesRequestPropertiesMetadata = InlineComponentsSchemasMessagesRequestPropertiesMetadata.build(block)
