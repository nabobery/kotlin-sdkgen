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
 * Generated model for
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/tree.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/webhook-status/properties/commit/properties/commit/properties/tree
 */
@Serializable(with = InlineWebhookStatusCommitCommitTreeXeda601e4.Serializer::class)
public class InlineWebhookStatusCommitCommitTreeXeda601e4(
  public val sha: String,
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

    public fun build(): InlineWebhookStatusCommitCommitTreeXeda601e4 {
      check(shaValue != null) { "sha is required" }
      check(urlValue != null) { "url is required" }
      return InlineWebhookStatusCommitCommitTreeXeda601e4(
        sha = sha,
        url = url,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineWebhookStatusCommitCommitTreeXeda601e4 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineWebhookStatusCommitCommitTreeXeda601e4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineWebhookStatusCommitCommitTreeXeda601e4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineWebhookStatusCommitCommitTreeXeda601e4")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineWebhookStatusCommitCommitTreeXeda601e4 must be a JSON object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val url = json.decodeRequired<String>(rawObject, "url")
      return InlineWebhookStatusCommitCommitTreeXeda601e4(
        sha = sha,
        url = url,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineWebhookStatusCommitCommitTreeXeda601e4) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineWebhookStatusCommitCommitTreeXeda601e4")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("sha", value.sha)
        put("url", value.url)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineWebhookStatusCommitCommitTreeXeda601e4(block: InlineWebhookStatusCommitCommitTreeXeda601e4.Builder.() -> Unit): InlineWebhookStatusCommitCommitTreeXeda601e4 = InlineWebhookStatusCommitCommitTreeXeda601e4.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineWebhookStatusCommitCommitTreeXeda601e4 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
