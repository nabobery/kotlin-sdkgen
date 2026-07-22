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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/git-ref/properties/object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-ref/properties/object
 */
@Serializable(with = InlineGitRefObjectValueX5ffdd808.Serializer::class)
public class InlineGitRefObjectValueX5ffdd808(
  /**
   * SHA for the reference
   */
  public val sha: String,
  public val type: String,
  public val url: String,
) {
  public class Builder {
    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var typeValue: String? = null

    public var type: String
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

    public fun build(): InlineGitRefObjectValueX5ffdd808 {
      check(shaValue != null) { "sha is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineGitRefObjectValueX5ffdd808(
        sha = sha,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGitRefObjectValueX5ffdd808 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineGitRefObjectValueX5ffdd808> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGitRefObjectValueX5ffdd808 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGitRefObjectValueX5ffdd808")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGitRefObjectValueX5ffdd808 must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineGitRefObjectValueX5ffdd808(
        sha = sha,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGitRefObjectValueX5ffdd808) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGitRefObjectValueX5ffdd808")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("type", value.type)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineGitRefObjectValueX5ffdd808(block: InlineGitRefObjectValueX5ffdd808.Builder.() -> Unit): InlineGitRefObjectValueX5ffdd808 = InlineGitRefObjectValueX5ffdd808.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGitRefObjectValueX5ffdd808 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
