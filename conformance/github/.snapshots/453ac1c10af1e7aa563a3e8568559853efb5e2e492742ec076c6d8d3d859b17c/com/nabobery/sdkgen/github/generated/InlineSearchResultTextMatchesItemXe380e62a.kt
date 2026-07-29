package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/search-result-text-matches/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/search-result-text-matches/items
 */
@Serializable(with = InlineSearchResultTextMatchesItemXe380e62a.Serializer::class)
public class InlineSearchResultTextMatchesItemXe380e62a(
  public val fragment: String? = null,
  matches: List<InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a>? = null,
  public val objectType: String? = null,
  public val objectUrl: String? = null,
  public val `property`: String? = null,
) {
  public val matches: List<InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a>? =
      matches?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var fragment: String? = null

    private var matchesValue: List<InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a>? = null

    public var matches: List<InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a>?
      get() = matchesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        matchesValue = value?.let { collection0 -> collection0.toList() }
      }

    public var objectType: String? = null

    public var objectUrl: String? = null

    public var `property`: String? = null

    public fun build(): InlineSearchResultTextMatchesItemXe380e62a = InlineSearchResultTextMatchesItemXe380e62a(
      fragment = fragment,
      matches = matches,
      objectType = objectType,
      objectUrl = objectUrl,
      property = property,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSearchResultTextMatchesItemXe380e62a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSearchResultTextMatchesItemXe380e62a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSearchResultTextMatchesItemXe380e62a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSearchResultTextMatchesItemXe380e62a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSearchResultTextMatchesItemXe380e62a must be a JSON object")
      return InlineSearchResultTextMatchesItemXe380e62a(
        fragment = rawObject["fragment"]?.let { json.decodeFromJsonElement<String>(it) },
        matches = rawObject["matches"]?.let { json.decodeFromJsonElement<List<InlineSearchResultTextMatchesItemMatchesItemX75b0ab1a>>(it) },
        objectType = rawObject["object_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        objectUrl = rawObject["object_url"]?.let { json.decodeFromJsonElement<String>(it) },
        property = rawObject["property"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSearchResultTextMatchesItemXe380e62a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSearchResultTextMatchesItemXe380e62a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.fragment?.let { put("fragment", it) }
        value.matches?.let { put("matches", json.encodeToJsonElement(it)) }
        value.objectType?.let { put("object_type", it) }
        value.objectUrl?.let { put("object_url", it) }
        value.property?.let { put("property", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSearchResultTextMatchesItemXe380e62a(block: InlineSearchResultTextMatchesItemXe380e62a.Builder.() -> Unit): InlineSearchResultTextMatchesItemXe380e62a = InlineSearchResultTextMatchesItemXe380e62a.build(block)
