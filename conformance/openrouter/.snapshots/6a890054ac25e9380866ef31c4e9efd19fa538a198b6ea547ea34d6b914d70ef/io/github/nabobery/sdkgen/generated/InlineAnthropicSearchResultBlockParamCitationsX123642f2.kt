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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam/properties/citations.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/AnthropicSearchResultBlockParam/properties/citations
 */
@Serializable(with = InlineAnthropicSearchResultBlockParamCitationsX123642f2.Serializer::class)
public class InlineAnthropicSearchResultBlockParamCitationsX123642f2(
  public val enabled: Boolean? = null,
) {
  public class Builder {
    public var enabled: Boolean? = null

    public fun build(): InlineAnthropicSearchResultBlockParamCitationsX123642f2 = InlineAnthropicSearchResultBlockParamCitationsX123642f2(
      enabled = enabled,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineAnthropicSearchResultBlockParamCitationsX123642f2 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineAnthropicSearchResultBlockParamCitationsX123642f2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAnthropicSearchResultBlockParamCitationsX123642f2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAnthropicSearchResultBlockParamCitationsX123642f2")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineAnthropicSearchResultBlockParamCitationsX123642f2 must be a JSON object")
      return InlineAnthropicSearchResultBlockParamCitationsX123642f2(
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineAnthropicSearchResultBlockParamCitationsX123642f2) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineAnthropicSearchResultBlockParamCitationsX123642f2")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineAnthropicSearchResultBlockParamCitationsX123642f2(block: InlineAnthropicSearchResultBlockParamCitationsX123642f2.Builder.() -> Unit): InlineAnthropicSearchResultBlockParamCitationsX123642f2 = InlineAnthropicSearchResultBlockParamCitationsX123642f2.build(block)
