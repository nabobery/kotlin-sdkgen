package com.nabobery.sdkgen.github.generated

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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1resources~1{space_resource_i
 * d}/put/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1users~1{username}~1copilot-spaces~1{space_number}~1resources~1{space_resource_i
 * d}/put/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df.Serializer::class)
public class InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df(
  /**
   * Updated resource-specific metadata.
   */
  public val metadata: JsonObject? = null,
) {
  public class Builder {
    /**
     * Updated resource-specific metadata.
     */
    public var metadata: JsonObject? = null

    public fun build(): InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df = InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df(
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df must be a JSON object")
      return InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df(
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df(block: InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df.Builder.() -> Unit): InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df = InlineUsersCopilotSpacesResourcesPutRequestJsonX4dcec9df.build(block)
