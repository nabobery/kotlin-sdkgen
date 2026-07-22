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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Metadata for a Git tag
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/git-tag
 */
@Serializable(with = GitTag.Serializer::class)
public class GitTag(
  /**
   * Message describing the purpose of the tag
   */
  public val message: String,
  public val nodeId: String,
  public val objectValue: InlineGitTagObjectValueX8f081f71,
  public val sha: String,
  /**
   * Name of the tag
   */
  public val tag: String,
  public val tagger: InlineGitTagTaggerXcf4d6fed,
  /**
   * URL for the tag
   */
  public val url: String,
  public val verification: Verification? = null,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var objectValueValue: InlineGitTagObjectValueX8f081f71? = null

    public var objectValue: InlineGitTagObjectValueX8f081f71
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    private var tagValue: String? = null

    public var tag: String
      get() = requireNotNull(tagValue) { "tag is required" }
      set(`value`) {
        tagValue = value
      }

    private var taggerValue: InlineGitTagTaggerXcf4d6fed? = null

    public var tagger: InlineGitTagTaggerXcf4d6fed
      get() = requireNotNull(taggerValue) { "tagger is required" }
      set(`value`) {
        taggerValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    public var verification: Verification? = null

    public fun build(): GitTag {
      check(messageValue != null) { "message is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(shaValue != null) { "sha is required" }
      check(tagValue != null) { "tag is required" }
      check(taggerValue != null) { "tagger is required" }
      check(urlValue != null) { "url is required" }
      return GitTag(
        message = message,
        nodeId = nodeId,
        objectValue = objectValue,
        sha = sha,
        tag = tag,
        tagger = tagger,
        url = url,
        verification = verification,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GitTag = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<GitTag> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GitTag {
      val jsonDecoder = decoder.requireJsonDecoder("GitTag")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GitTag must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val objectValue = json.decodeRequired<InlineGitTagObjectValueX8f081f71>(rawObject, "object")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      val tag = json.decodeRequired<String>(rawObject, "tag")
      val tagger = json.decodeRequired<InlineGitTagTaggerXcf4d6fed>(rawObject, "tagger")
      val url = json.decodeRequired<String>(rawObject, "url")
      return GitTag(
        message = message,
        nodeId = nodeId,
        objectValue = objectValue,
        sha = sha,
        tag = tag,
        tagger = tagger,
        url = url,
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<Verification>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GitTag) {
      val jsonEncoder = encoder.requireJsonEncoder("GitTag")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        put("node_id", value.nodeId)
        put("object", json.encodeToJsonElement(value.objectValue))
        put("sha", value.sha)
        put("tag", value.tag)
        put("tagger", json.encodeToJsonElement(value.tagger))
        put("url", value.url)
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gitTag(block: GitTag.Builder.() -> Unit): GitTag = GitTag.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("GitTag is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
