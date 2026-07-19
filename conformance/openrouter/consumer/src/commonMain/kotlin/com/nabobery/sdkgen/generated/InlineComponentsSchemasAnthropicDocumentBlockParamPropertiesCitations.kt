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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicDocumentBlockParam/properties/citations.
 */
@Serializable(with = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations.Serializer::class)
public class InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations =
      InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations must be a " +
          "JSON object")
      return InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations(
        enabled = raw["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations(block: InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations.Builder.() -> Unit): InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations = InlineComponentsSchemasAnthropicDocumentBlockParamPropertiesCitations.build(block)
