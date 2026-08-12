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
 * Represents a 'discussion_body' secret scanning location type. This location type shows that a secret was detected in
 * the body of a discussion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-discussion-body
 */
@Serializable(with = SecretScanningLocationDiscussionBody.Serializer::class)
public class SecretScanningLocationDiscussionBody(
  /**
   * The URL to the discussion where the secret was detected.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val discussionBodyUrl: String,
) {
  public class Builder {
    private var discussionBodyUrlValue: String? = null

    public var discussionBodyUrl: String
      get() = requireNotNull(discussionBodyUrlValue) { "discussionBodyUrl is required" }
      set(`value`) {
        discussionBodyUrlValue = value
      }

    public fun build(): SecretScanningLocationDiscussionBody {
      check(discussionBodyUrlValue != null) { "discussionBodyUrl is required" }
      return SecretScanningLocationDiscussionBody(
        discussionBodyUrl = discussionBodyUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationDiscussionBody = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningLocationDiscussionBody> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationDiscussionBody {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationDiscussionBody")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationDiscussionBody must be a JSON object")
      val discussionBodyUrl = json.decodeRequired<String>(rawObject, "discussion_body_url")
      return SecretScanningLocationDiscussionBody(
        discussionBodyUrl = discussionBodyUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationDiscussionBody) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationDiscussionBody")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("discussion_body_url", value.discussionBodyUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationDiscussionBody(block: SecretScanningLocationDiscussionBody.Builder.() -> Unit): SecretScanningLocationDiscussionBody = SecretScanningLocationDiscussionBody.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationDiscussionBody is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
