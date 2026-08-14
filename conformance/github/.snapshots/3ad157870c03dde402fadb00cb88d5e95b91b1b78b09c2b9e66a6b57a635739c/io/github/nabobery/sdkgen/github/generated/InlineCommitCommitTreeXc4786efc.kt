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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/commit/properties/commit/properties/tree.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/commit/properties/commit/properties/tree
 */
@Serializable(with = InlineCommitCommitTreeXc4786efc.Serializer::class)
public class InlineCommitCommitTreeXc4786efc(
  public val sha: String,
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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public fun build(): InlineCommitCommitTreeXc4786efc {
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return InlineCommitCommitTreeXc4786efc(
        sha = sha,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCommitCommitTreeXc4786efc = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCommitCommitTreeXc4786efc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCommitCommitTreeXc4786efc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCommitCommitTreeXc4786efc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCommitCommitTreeXc4786efc must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineCommitCommitTreeXc4786efc(
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCommitCommitTreeXc4786efc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCommitCommitTreeXc4786efc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCommitCommitTreeXc4786efc(block: InlineCommitCommitTreeXc4786efc.Builder.() -> Unit): InlineCommitCommitTreeXc4786efc = InlineCommitCommitTreeXc4786efc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCommitCommitTreeXc4786efc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
