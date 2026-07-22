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
 * Represents a 'discussion_title' secret scanning location type. This location type shows that a secret was detected in
 * the title of a discussion.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-location-discussion-title
 */
@Serializable(with = SecretScanningLocationDiscussionTitle.Serializer::class)
public class SecretScanningLocationDiscussionTitle(
  /**
   * The URL to the discussion where the secret was detected.
   */
  public val discussionTitleUrl: String,
) {
  public class Builder {
    private var discussionTitleUrlValue: String? = null

    public var discussionTitleUrl: String
      get() = requireNotNull(discussionTitleUrlValue) { "discussionTitleUrl is required" }
      set(`value`) {
        discussionTitleUrlValue = value
      }

    public fun build(): SecretScanningLocationDiscussionTitle {
      check(discussionTitleUrlValue != null) { "discussionTitleUrl is required" }
      return SecretScanningLocationDiscussionTitle(
        discussionTitleUrl = discussionTitleUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningLocationDiscussionTitle = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningLocationDiscussionTitle> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningLocationDiscussionTitle {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningLocationDiscussionTitle")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningLocationDiscussionTitle must be a JSON object")
      val discussionTitleUrl = json.decodeRequired<String>(rawObject, "discussion_title_url")
      return SecretScanningLocationDiscussionTitle(
        discussionTitleUrl = discussionTitleUrl,
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningLocationDiscussionTitle) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningLocationDiscussionTitle")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("discussion_title_url", value.discussionTitleUrl)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningLocationDiscussionTitle(block: SecretScanningLocationDiscussionTitle.Builder.() -> Unit): SecretScanningLocationDiscussionTitle = SecretScanningLocationDiscussionTitle.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SecretScanningLocationDiscussionTitle is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
