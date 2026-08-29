package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/release-event/properties/release/allOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/release-event/properties/release/allOf/1
 */
@Serializable(with = InlineReleaseEventReleaseAllOf2X4fe923cf.Serializer::class)
public class InlineReleaseEventReleaseAllOf2X4fe923cf(
  public val isShortDescriptionHtmlTruncated: Boolean? = null,
  public val shortDescriptionHtml: String? = null,
) {
  public class Builder {
    public var isShortDescriptionHtmlTruncated: Boolean? = null

    public var shortDescriptionHtml: String? = null

    public fun build(): InlineReleaseEventReleaseAllOf2X4fe923cf = InlineReleaseEventReleaseAllOf2X4fe923cf(
      isShortDescriptionHtmlTruncated = isShortDescriptionHtmlTruncated,
      shortDescriptionHtml = shortDescriptionHtml,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReleaseEventReleaseAllOf2X4fe923cf = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReleaseEventReleaseAllOf2X4fe923cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReleaseEventReleaseAllOf2X4fe923cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReleaseEventReleaseAllOf2X4fe923cf")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReleaseEventReleaseAllOf2X4fe923cf must be a JSON object")
      return InlineReleaseEventReleaseAllOf2X4fe923cf(
        isShortDescriptionHtmlTruncated = rawObject["is_short_description_html_truncated"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        shortDescriptionHtml = rawObject["short_description_html"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReleaseEventReleaseAllOf2X4fe923cf) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReleaseEventReleaseAllOf2X4fe923cf")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.isShortDescriptionHtmlTruncated?.let { put("is_short_description_html_truncated", json.encodeToJsonElement(it)) }
        value.shortDescriptionHtml?.let { put("short_description_html", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReleaseEventReleaseAllOf2X4fe923cf(block: InlineReleaseEventReleaseAllOf2X4fe923cf.Builder.() -> Unit): InlineReleaseEventReleaseAllOf2X4fe923cf = InlineReleaseEventReleaseAllOf2X4fe923cf.build(block)
