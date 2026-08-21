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
 * Information about the author of the commit. By default, the `author` will be the authenticated user and the current
 * date. See the `author` and `committer` object below for details.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1commits/post/requestBody/content/application~1json
 * /schema/properties/author
 */
@Serializable(with = InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665.Serializer::class)
public class InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665(
  /**
   * The email of the author (or committer) of the commit
   */
  public val email: String,
  /**
   * The name of the author (or committer) of the commit
   */
  public val name: String,
  /**
   * Indicates when this commit was authored (or committed). This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val date: String? = null,
) {
  public class Builder {
    private var emailValue: String? = null

    public var email: String
      get() = requireNotNull(emailValue) { "email is required" }
      set(`value`) {
        emailValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * Indicates when this commit was authored (or committed). This is a timestamp in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var date: String? = null

    public fun build(): InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665 {
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665(
        email = email,
        name = name,
        date = date,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665 must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665(
        email = email,
        name = name,
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("name", value.name)
        value.date?.let { put("date", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitCommitsPostRequestJsonAuthorX8b0fe665(block: InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665.Builder.() -> Unit): InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665 = InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitCommitsPostRequestJsonAuthorX8b0fe665 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
