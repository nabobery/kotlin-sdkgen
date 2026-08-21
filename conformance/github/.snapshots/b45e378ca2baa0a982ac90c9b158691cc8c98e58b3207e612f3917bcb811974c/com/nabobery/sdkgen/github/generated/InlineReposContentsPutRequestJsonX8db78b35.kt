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
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1contents~1{path}/put/requestBody/content/application~1j
 * son/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1contents~1{path}/put/requestBody/content/application~1j
 * son/schema
 */
@Serializable(with = InlineReposContentsPutRequestJsonX8db78b35.Serializer::class)
public class InlineReposContentsPutRequestJsonX8db78b35(
  /**
   * The new file content, using Base64 encoding.
   */
  public val content: String,
  /**
   * The commit message.
   */
  public val message: String,
  /**
   * The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.
   */
  public val author: InlineReposContentsPutRequestJsonAuthorX4f12c9d0? = null,
  /**
   * The branch name. Default: the repository’s default branch.
   */
  public val branch: String? = null,
  /**
   * The person that committed the file. Default: the authenticated user.
   */
  public val committer: InlineReposContentsPutRequestJsonCommitterXc49a749a? = null,
  /**
   * **Required if you are updating a file**. The blob SHA of the file being replaced.
   */
  public val sha: String? = null,
) {
  public class Builder {
    private var contentValue: String? = null

    public var content: String
      get() = requireNotNull(contentValue) { "content is required" }
      set(`value`) {
        contentValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    /**
     * The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.
     */
    public var author: InlineReposContentsPutRequestJsonAuthorX4f12c9d0? = null

    /**
     * The branch name. Default: the repository’s default branch.
     */
    public var branch: String? = null

    /**
     * The person that committed the file. Default: the authenticated user.
     */
    public var committer: InlineReposContentsPutRequestJsonCommitterXc49a749a? = null

    /**
     * **Required if you are updating a file**. The blob SHA of the file being replaced.
     */
    public var sha: String? = null

    public fun build(): InlineReposContentsPutRequestJsonX8db78b35 {
      check(contentValue != null) { "content is required" }
      check(messageValue != null) { "message is required" }
      return InlineReposContentsPutRequestJsonX8db78b35(
        content = content,
        message = message,
        author = author,
        branch = branch,
        committer = committer,
        sha = sha,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposContentsPutRequestJsonX8db78b35 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposContentsPutRequestJsonX8db78b35> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposContentsPutRequestJsonX8db78b35 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposContentsPutRequestJsonX8db78b35")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposContentsPutRequestJsonX8db78b35 must be a JSON object")
      val content = json.decodeRequired<String>(rawObject, "content")
      val message = json.decodeRequired<String>(rawObject, "message")
      return InlineReposContentsPutRequestJsonX8db78b35(
        content = content,
        message = message,
        author = rawObject["author"]?.let { json.decodeFromJsonElement<InlineReposContentsPutRequestJsonAuthorX4f12c9d0>(it) },
        branch = rawObject["branch"]?.let { json.decodeFromJsonElement<String>(it) },
        committer = rawObject["committer"]?.let { json.decodeFromJsonElement<InlineReposContentsPutRequestJsonCommitterXc49a749a>(it) },
        sha = rawObject["sha"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposContentsPutRequestJsonX8db78b35) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposContentsPutRequestJsonX8db78b35")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("content", value.content)
        put("message", value.message)
        value.author?.let { put("author", json.encodeToJsonElement(it)) }
        value.branch?.let { put("branch", it) }
        value.committer?.let { put("committer", json.encodeToJsonElement(it)) }
        value.sha?.let { put("sha", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposContentsPutRequestJsonX8db78b35(block: InlineReposContentsPutRequestJsonX8db78b35.Builder.() -> Unit): InlineReposContentsPutRequestJsonX8db78b35 = InlineReposContentsPutRequestJsonX8db78b35.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposContentsPutRequestJsonX8db78b35 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
