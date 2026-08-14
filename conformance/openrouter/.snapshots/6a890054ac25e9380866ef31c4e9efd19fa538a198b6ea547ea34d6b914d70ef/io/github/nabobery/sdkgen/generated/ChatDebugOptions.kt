package io.github.nabobery.sdkgen.generated

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
 * Debug options for inspecting request transformations (streaming only)
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatDebugOptions
 */
@Serializable(with = ChatDebugOptions.Serializer::class)
public class ChatDebugOptions(
  /**
   * If true, includes the transformed upstream request body in a debug chunk at the start of the stream. Only works
   * with streaming mode.
   */
  public val echoUpstreamBody: Boolean? = null,
) {
  public class Builder {
    /**
     * If true, includes the transformed upstream request body in a debug chunk at the start of the stream. Only works
     * with streaming mode.
     */
    public var echoUpstreamBody: Boolean? = null

    public fun build(): ChatDebugOptions = ChatDebugOptions(
      echoUpstreamBody = echoUpstreamBody,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ChatDebugOptions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ChatDebugOptions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ChatDebugOptions {
      val jsonDecoder = decoder.requireJsonDecoder("ChatDebugOptions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ChatDebugOptions must be a JSON object")
      return ChatDebugOptions(
        echoUpstreamBody = rawObject["echo_upstream_body"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ChatDebugOptions) {
      val jsonEncoder = encoder.requireJsonEncoder("ChatDebugOptions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.echoUpstreamBody?.let { put("echo_upstream_body", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun chatDebugOptions(block: ChatDebugOptions.Builder.() -> Unit): ChatDebugOptions = ChatDebugOptions.build(block)
