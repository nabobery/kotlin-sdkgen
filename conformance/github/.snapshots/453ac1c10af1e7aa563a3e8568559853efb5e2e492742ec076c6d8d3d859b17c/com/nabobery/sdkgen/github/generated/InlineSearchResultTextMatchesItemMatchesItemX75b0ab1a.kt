package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/components/schemas/search-result-text-matches/items/properties/matches/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/search-result-text-matches/items/properties/matches/items
 */
@Serializable(with = InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a.Serializer::class)
public class InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a(
  indices: List<Int>? = null,
  public val text: String? = null,
) {
  public val indices: List<Int>? = indices?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var indicesValue: List<Int>? = null

    public var indices: List<Int>?
      get() = indicesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        indicesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var text: String? = null

    public fun build(): InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a = InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a(
      indices = indices,
      text = text,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a must be a JSON object")
      return InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a(
        indices = rawObject["indices"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        text = rawObject["text"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.indices?.let { put("indices", json.encodeToJsonElement(it)) }
        value.text?.let { put("text", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSearchResultTextMatchesItemMatchesItemX75b0ab1a(block: InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a.Builder.() -> Unit): InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a = InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a.build(block)
