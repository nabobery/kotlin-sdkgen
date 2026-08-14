package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/git-tag/properties/object.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-tag/properties/object
 */
@Serializable(with = InlineGitTagObjectValueX8f081f71.Serializer::class)
public class InlineGitTagObjectValueX8f081f71(
  public val sha: String,
  public val type: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
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

    public fun build(): InlineGitTagObjectValueX8f081f71 {
      check(shaValue != null) { "sha is required" }
      check(typeValue != null) { "type is required" }
      check(urlValue != null) { "url is required" }
      return InlineGitTagObjectValueX8f081f71(
        sha = sha,
        type = type,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineGitTagObjectValueX8f081f71 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineGitTagObjectValueX8f081f71> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineGitTagObjectValueX8f081f71 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineGitTagObjectValueX8f081f71")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineGitTagObjectValueX8f081f71 must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val type = json.decodeRequired<String>(rawObject, "type")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineGitTagObjectValueX8f081f71(
        sha = sha,
        type = type,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineGitTagObjectValueX8f081f71) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineGitTagObjectValueX8f081f71")
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

public fun inlineGitTagObjectValueX8f081f71(block: InlineGitTagObjectValueX8f081f71.Builder.() -> Unit): InlineGitTagObjectValueX8f081f71 = InlineGitTagObjectValueX8f081f71.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineGitTagObjectValueX8f081f71 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
