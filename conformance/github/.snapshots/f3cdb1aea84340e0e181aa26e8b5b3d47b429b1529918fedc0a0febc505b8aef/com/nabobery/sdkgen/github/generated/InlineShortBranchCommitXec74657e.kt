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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/short-branch/properties/commit.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/short-branch/properties/commit
 */
@Serializable(with = InlineShortBranchCommitXec74657e.Serializer::class)
public class InlineShortBranchCommitXec74657e(
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

    public fun build(): InlineShortBranchCommitXec74657e {
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return InlineShortBranchCommitXec74657e(
        sha = sha,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineShortBranchCommitXec74657e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineShortBranchCommitXec74657e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineShortBranchCommitXec74657e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineShortBranchCommitXec74657e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineShortBranchCommitXec74657e must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineShortBranchCommitXec74657e(
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineShortBranchCommitXec74657e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineShortBranchCommitXec74657e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineShortBranchCommitXec74657e(block: InlineShortBranchCommitXec74657e.Builder.() -> Unit): InlineShortBranchCommitXec74657e = InlineShortBranchCommitXec74657e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineShortBranchCommitXec74657e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
