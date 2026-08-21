package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
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
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/commit/properties/parents/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit/properties/parents/items
 */
@Serializable(with = InlineCommitParentsItemX10153dfe.Serializer::class)
public class InlineCommitParentsItemX10153dfe(
  public val sha: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
) {
  public class Builder {
    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    public fun build(): InlineCommitParentsItemX10153dfe {
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return InlineCommitParentsItemX10153dfe(
        sha = sha,
        url = url,
        htmlUrl = htmlUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommitParentsItemX10153dfe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCommitParentsItemX10153dfe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommitParentsItemX10153dfe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommitParentsItemX10153dfe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommitParentsItemX10153dfe must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineCommitParentsItemX10153dfe(
        sha = sha,
        url = url,
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommitParentsItemX10153dfe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommitParentsItemX10153dfe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("url", value.url)
        value.htmlUrl?.let { put("html_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommitParentsItemX10153dfe(block: InlineCommitParentsItemX10153dfe.Builder.() -> Unit): InlineCommitParentsItemX10153dfe = InlineCommitParentsItemX10153dfe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCommitParentsItemX10153dfe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
