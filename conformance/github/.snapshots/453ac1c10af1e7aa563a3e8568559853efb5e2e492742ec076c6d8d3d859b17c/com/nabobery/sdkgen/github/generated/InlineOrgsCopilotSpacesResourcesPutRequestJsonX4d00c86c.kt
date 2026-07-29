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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1resources~1{space_resource_id}/put
 * /requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot-spaces~1{space_number}~1resources~1{space_resource_id}/put
 * /requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c.Serializer::class)
public class InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c(
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

    public fun build(): InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c = InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c(
      metadata = metadata,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c must be a JSON object")
      return InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c(
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<JsonObject>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c(block: InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c.Builder.() -> Unit): InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c = InlineOrgsCopilotSpacesResourcesPutRequestJsonX4d00c86c.build(block)
