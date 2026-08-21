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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1contents~1{path}/delete/requestBody/content/application
 * ~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1contents~1{path}/delete/requestBody/content/application
 * ~1json/schema
 */
@Serializable(with = InlineReposContentsDeleteRequestJsonXbeec1eb1.Serializer::class)
public class InlineReposContentsDeleteRequestJsonXbeec1eb1(
  /**
   * The commit message.
   */
  public val message: String,
  /**
   * The blob SHA of the file being deleted.
   */
  public val sha: String,
  /**
   * object containing information about the author.
   */
  public val author: InlineReposContentsDeleteRequestJsonAuthorX39b94541? = null,
  /**
   * The branch name. Default: the repository’s default branch
   */
  public val branch: String? = null,
  /**
   * object containing information about the committer.
   */
  public val committer: InlineReposContentsDeleteRequestJsonCommitterXbffe557a? = null,
) {
  public class Builder {
    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var shaValue: String? = null

    public var sha: String
      get() = requireNotNull(shaValue) { "sha is required" }
      set(`value`) {
        shaValue = value
      }

    /**
     * object containing information about the author.
     */
    public var author: InlineReposContentsDeleteRequestJsonAuthorX39b94541? = null

    /**
     * The branch name. Default: the repository’s default branch
     */
    public var branch: String? = null

    /**
     * object containing information about the committer.
     */
    public var committer: InlineReposContentsDeleteRequestJsonCommitterXbffe557a? = null

    public fun build(): InlineReposContentsDeleteRequestJsonXbeec1eb1 {
      check(messageValue != null) { "message is required" }
      check(shaValue != null) { "sha is required" }
      return InlineReposContentsDeleteRequestJsonXbeec1eb1(
        message = message,
        sha = sha,
        author = author,
        branch = branch,
        committer = committer,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposContentsDeleteRequestJsonXbeec1eb1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposContentsDeleteRequestJsonXbeec1eb1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposContentsDeleteRequestJsonXbeec1eb1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposContentsDeleteRequestJsonXbeec1eb1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposContentsDeleteRequestJsonXbeec1eb1 must be a JSON object")
      val message = json.decodeRequired<String>(rawObject, "message")
      val sha = json.decodeRequired<String>(rawObject, "sha")
      return InlineReposContentsDeleteRequestJsonXbeec1eb1(
        message = message,
        sha = sha,
        author = rawObject["author"]?.let { json.decodeFromJsonElement<InlineReposContentsDeleteRequestJsonAuthorX39b94541>(it) },
        branch = rawObject["branch"]?.let { json.decodeFromJsonElement<String>(it) },
        committer = rawObject["committer"]?.let { json.decodeFromJsonElement<InlineReposContentsDeleteRequestJsonCommitterXbffe557a>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposContentsDeleteRequestJsonXbeec1eb1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposContentsDeleteRequestJsonXbeec1eb1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("message", value.message)
        put("sha", value.sha)
        value.author?.let { put("author", json.encodeToJsonElement(it)) }
        value.branch?.let { put("branch", it) }
        value.committer?.let { put("committer", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposContentsDeleteRequestJsonXbeec1eb1(block: InlineReposContentsDeleteRequestJsonXbeec1eb1.Builder.() -> Unit): InlineReposContentsDeleteRequestJsonXbeec1eb1 = InlineReposContentsDeleteRequestJsonXbeec1eb1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposContentsDeleteRequestJsonXbeec1eb1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
