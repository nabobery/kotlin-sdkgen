package com.nabobery.sdkgen.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

@Serializable
public data class UrlCitationView(
  public val content: String? = null,
  @SerialName("end_index")
  public val endIndex: Int,
  @SerialName("start_index")
  public val startIndex: Int,
  public val title: String,
  public val type: InlineUrlCitationTypeXe580106d,
  public val url: String,
)

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/URLCitation.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/URLCitation
 */
@Serializable(with = UrlCitation.Serializer::class)
public class UrlCitation(
  public val endIndex: Int,
  public val startIndex: Int,
  public val title: String,
  public val type: InlineUrlCitationTypeXe580106d,
  public val url: String,
  public val content: String? = null,
) {
  public class Builder {
    private var endIndexValue: Int? = null

    public var endIndex: Int
      get() = requireNotNull(endIndexValue) { "endIndex is required" }
      set(`value`) {
        endIndexValue = value
      }

    private var startIndexValue: Int? = null

    public var startIndex: Int
      get() = requireNotNull(startIndexValue) { "startIndex is required" }
      set(`value`) {
        startIndexValue = value
      }

    private var titleValue: String? = null

    public var title: String
      get() = requireNotNull(titleValue) { "title is required" }
      set(`value`) {
        titleValue = value
      }

    private var typeValue: InlineUrlCitationTypeXe580106d? = null

    public var type: InlineUrlCitationTypeXe580106d
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var content: String? = null

    public fun build(): UrlCitation {
      check(endIndexValue != null) { "endIndex is required" }
      check(startIndexValue != null) { "startIndex is required" }
      check(titleValue != null) { "title is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return UrlCitation(
        endIndex = endIndex,
        startIndex = startIndex,
        title = title,
        type = type,
        url = url,
        content = content,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): UrlCitation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<UrlCitation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): UrlCitation {
      val jsonDecoder = decoder.requireJsonDecoder("UrlCitation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("UrlCitation must be a JSON object")
      val endIndex = json.decodeRequired<Int>(rawObject, "end_index")
      val startIndex = json.decodeRequired<Int>(rawObject, "start_index")
      val title = json.decodeRequired<String>(rawObject, "title")
      val type = json.decodeRequired<InlineUrlCitationTypeXe580106d>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return UrlCitation(
        endIndex = endIndex,
        startIndex = startIndex,
        title = title,
        type = type,
        url = url,
        content = rawObject["content"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: UrlCitation) {
      val jsonEncoder = encoder.requireJsonEncoder("UrlCitation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("end_index", json.encodeToJsonElement(value.endIndex))
        put("start_index", json.encodeToJsonElement(value.startIndex))
        put("title", value.title)
        put("type", json.encodeToJsonElement(value.type))
        put("url", value.url)
        value.content?.let { put("content", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun urlCitation(block: UrlCitation.Builder.() -> Unit): UrlCitation = UrlCitation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("UrlCitation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
