package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Streaming configuration options
 */
@Serializable(with = ChatStreamOptions.Serializer::class)
public class ChatStreamOptions(
  /**
   * Deprecated: This field has no effect. Full usage details are always included.
   */
  public val includeUsage: Boolean? = null,
) {
  public class Builder {
    /**
     * Deprecated: This field has no effect. Full usage details are always included.
     */
    public var includeUsage: Boolean? = null

    public fun build(): ChatStreamOptions = ChatStreamOptions(
      includeUsage = includeUsage,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatStreamOptions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ChatStreamOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatStreamOptions {
      val jsonDecoder = decoder.requireJsonDecoder("ChatStreamOptions")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("ChatStreamOptions must be a JSON object")
      return ChatStreamOptions(
        includeUsage = raw["include_usage"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatStreamOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatStreamOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.includeUsage?.let { put("include_usage", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatStreamOptions(block: ChatStreamOptions.Builder.() -> Unit): ChatStreamOptions = ChatStreamOptions
  .build(block)
