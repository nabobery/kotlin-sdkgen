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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1tags/post/requestBody/content/application~1json/sc
 * hema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1tags/post/requestBody/content/application~1json/sc
 * hema
 */
@Serializable(with = InlineReposGitTagsPostRequestJsonX572bdfa6.Serializer::class)
public class InlineReposGitTagsPostRequestJsonX572bdfa6(
  /**
   * The tag message.
   */
  public val message: String,
  /**
   * The SHA of the git object this is tagging.
   */
  public val objectValue: String,
  /**
   * The tag's name. This is typically a version (e.g., "v0.0.1").
   */
  public val tag: String,
  /**
   * The type of the object we're tagging. Normally this is a `commit` but it can also be a `tree` or a `blob`.
   */
  public val type: InlineReposGitTagsPostRequestJsonTypeXc183d8c6,
  /**
   * An object with information about the individual creating the tag.
   */
  public val tagger: InlineReposGitTagsPostRequestJsonTaggerX387ebab0? = null,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var objectValueValue: String? = null

    public var objectValue: String
      get() = requireNotNull(objectValueValue) { "objectValue is required" }
      set(`value`) {
        objectValueValue = value
      }

    private var tagValue: String? = null

    public var tag: String
      get() = requireNotNull(tagValue) { "tag is required" }
      set(`value`) {
        tagValue = value
      }

    private var typeValue: InlineReposGitTagsPostRequestJsonTypeXc183d8c6? = null

    public var type: InlineReposGitTagsPostRequestJsonTypeXc183d8c6
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    /**
     * An object with information about the individual creating the tag.
     */
    public var tagger: InlineReposGitTagsPostRequestJsonTaggerX387ebab0? = null

    public fun build(): InlineReposGitTagsPostRequestJsonX572bdfa6 {
      check(messageValue != null) { "message is required" }
      check(objectValueValue != null) { "objectValue is required" }
      check(tagValue != null) { "tag is required" }
      check(typeValue != null) { "type is required" }
      return InlineReposGitTagsPostRequestJsonX572bdfa6(
        message = message,
        objectValue = objectValue,
        tag = tag,
        type = type,
        tagger = tagger,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitTagsPostRequestJsonX572bdfa6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposGitTagsPostRequestJsonX572bdfa6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitTagsPostRequestJsonX572bdfa6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitTagsPostRequestJsonX572bdfa6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitTagsPostRequestJsonX572bdfa6 must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val objectValue = json.decodeRequired<String>(rawObject, "object")
      val tag = json.decodeRequired<String>(rawObject, "tag")
      val type = json.decodeRequired<InlineReposGitTagsPostRequestJsonTypeXc183d8c6>(rawObject, "type")
      return InlineReposGitTagsPostRequestJsonX572bdfa6(
        message = message,
        objectValue = objectValue,
        tag = tag,
        type = type,
        tagger = rawObject["tagger"]?.let { json.decodeFromJsonElement<InlineReposGitTagsPostRequestJsonTaggerX387ebab0>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitTagsPostRequestJsonX572bdfa6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitTagsPostRequestJsonX572bdfa6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        put("object", value.objectValue)
        put("tag", value.tag)
        put("type", json.encodeToJsonElement(value.type))
        value.tagger?.let { put("tagger", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitTagsPostRequestJsonX572bdfa6(block: InlineReposGitTagsPostRequestJsonX572bdfa6.Builder.() -> Unit): InlineReposGitTagsPostRequestJsonX572bdfa6 = InlineReposGitTagsPostRequestJsonX572bdfa6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitTagsPostRequestJsonX572bdfa6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
