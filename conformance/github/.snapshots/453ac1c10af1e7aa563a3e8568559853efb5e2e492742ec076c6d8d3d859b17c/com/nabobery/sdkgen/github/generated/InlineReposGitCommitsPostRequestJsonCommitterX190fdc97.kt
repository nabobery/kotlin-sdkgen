package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Information about the person who is making the commit. By default, `committer` will use the information set in
 * `author`. See the `author` and `committer` object below for details.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1commits/post/requestBody/content/application~1json
 * /schema/properties/committer
 */
@Serializable(with = InlineReposGitCommitsPostRequestJsonCommitterX190fdc97.Serializer::class)
public class InlineReposGitCommitsPostRequestJsonCommitterX190fdc97(
  /**
   * Indicates when this commit was authored (or committed). This is a timestamp in [ISO
   * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val date: String? = null,
  /**
   * The email of the author (or committer) of the commit
   */
  public val email: String? = null,
  /**
   * The name of the author (or committer) of the commit
   */
  public val name: String? = null,
) {
  public class Builder {
    /**
     * Indicates when this commit was authored (or committed). This is a timestamp in [ISO
     * 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var date: String? = null

    /**
     * The email of the author (or committer) of the commit
     */
    public var email: String? = null

    /**
     * The name of the author (or committer) of the commit
     */
    public var name: String? = null

    public fun build(): InlineReposGitCommitsPostRequestJsonCommitterX190fdc97 = InlineReposGitCommitsPostRequestJsonCommitterX190fdc97(
      date = date,
      email = email,
      name = name,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitCommitsPostRequestJsonCommitterX190fdc97 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposGitCommitsPostRequestJsonCommitterX190fdc97> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitCommitsPostRequestJsonCommitterX190fdc97 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitCommitsPostRequestJsonCommitterX190fdc97")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitCommitsPostRequestJsonCommitterX190fdc97 must be a JSON object")
      return InlineReposGitCommitsPostRequestJsonCommitterX190fdc97(
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
        email = rawObject["email"]?.let { json.decodeFromJsonElement<String>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitCommitsPostRequestJsonCommitterX190fdc97) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitCommitsPostRequestJsonCommitterX190fdc97")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.date?.let { put("date", it) }
        value.email?.let { put("email", it) }
        value.name?.let { put("name", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposGitCommitsPostRequestJsonCommitterX190fdc97(block: InlineReposGitCommitsPostRequestJsonCommitterX190fdc97.Builder.() -> Unit): InlineReposGitCommitsPostRequestJsonCommitterX190fdc97 = InlineReposGitCommitsPostRequestJsonCommitterX190fdc97.build(block)
