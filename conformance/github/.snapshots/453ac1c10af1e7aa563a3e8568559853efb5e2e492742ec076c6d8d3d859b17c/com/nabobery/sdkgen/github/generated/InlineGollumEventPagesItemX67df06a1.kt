package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/gollum-event/properties/pages/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/gollum-event/properties/pages/items
 */
@Serializable(with = InlineGollumEventPagesItemX67df06a1.Serializer::class)
public class InlineGollumEventPagesItemX67df06a1(
  public val action: String? = null,
  public val htmlUrl: String? = null,
  public val pageName: String? = null,
  public val sha: String? = null,
  public val summary: String? = null,
  public val title: String? = null,
) {
  public class Builder {
    public var action: String? = null

    public var htmlUrl: String? = null

    public var pageName: String? = null

    public var sha: String? = null

    public var summary: String? = null

    public var title: String? = null

    public fun build(): InlineGollumEventPagesItemX67df06a1 = InlineGollumEventPagesItemX67df06a1(
      action = action,
      htmlUrl = htmlUrl,
      pageName = pageName,
      sha = sha,
      summary = summary,
      title = title,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGollumEventPagesItemX67df06a1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGollumEventPagesItemX67df06a1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGollumEventPagesItemX67df06a1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGollumEventPagesItemX67df06a1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGollumEventPagesItemX67df06a1 must be a JSON object")
      return InlineGollumEventPagesItemX67df06a1(
        action = rawObject["action"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        pageName = rawObject["page_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
        summary = rawObject["summary"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        title = rawObject["title"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGollumEventPagesItemX67df06a1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGollumEventPagesItemX67df06a1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.action?.let { put("action", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.pageName?.let { put("page_name", it) }
        value.sha?.let { put("sha", it) }
        value.summary?.let { put("summary", it) }
        value.title?.let { put("title", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGollumEventPagesItemX67df06a1(block: InlineGollumEventPagesItemX67df06a1.Builder.() -> Unit): InlineGollumEventPagesItemX67df06a1 = InlineGollumEventPagesItemX67df06a1.build(block)
