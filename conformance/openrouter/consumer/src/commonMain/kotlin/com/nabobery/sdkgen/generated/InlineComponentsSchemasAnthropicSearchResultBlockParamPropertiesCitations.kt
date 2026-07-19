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
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam/properties/citations.
 */
@Serializable(with = InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations.Serializer::class)
public class InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations =
      InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() ->
      Unit): InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations {
      val jsonDecoder = decoder
        .requireJsonDecoder("InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations")
      val json = jsonDecoder.json
      val raw = jsonDecoder.decodeJsonElement() as? JsonObject ?:
        throw SerializationException("InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations must " +
          "be a JSON object")
      return InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations(
        enabled = raw["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder,
      `value`: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations) {
      val jsonEncoder = encoder
        .requireJsonEncoder("InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations(block: InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations.Builder.() -> Unit): InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations = InlineComponentsSchemasAnthropicSearchResultBlockParamPropertiesCitations.build(block)
