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
 * An object with information about the individual creating the tag.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1git~1tags/post/requestBody/content/application~1json/sc
 * hema/properties/tagger
 */
@Serializable(with = InlineReposGitTagsPostRequestJsonTaggerX387ebab0.Serializer::class)
public class InlineReposGitTagsPostRequestJsonTaggerX387ebab0(
  /**
   * The email of the author of the tag
   */
  public val email: String,
  /**
   * The name of the author of the tag
   */
  public val name: String,
  /**
   * When this object was tagged. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
   * `YYYY-MM-DDTHH:MM:SSZ`.
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
     * When this object was tagged. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
     * `YYYY-MM-DDTHH:MM:SSZ`.
     */
    public var date: String? = null

    public fun build(): InlineReposGitTagsPostRequestJsonTaggerX387ebab0 {
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineReposGitTagsPostRequestJsonTaggerX387ebab0(
        email = email,
        name = name,
        date = date,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposGitTagsPostRequestJsonTaggerX387ebab0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposGitTagsPostRequestJsonTaggerX387ebab0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposGitTagsPostRequestJsonTaggerX387ebab0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposGitTagsPostRequestJsonTaggerX387ebab0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposGitTagsPostRequestJsonTaggerX387ebab0 must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineReposGitTagsPostRequestJsonTaggerX387ebab0(
        email = email,
        name = name,
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposGitTagsPostRequestJsonTaggerX387ebab0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposGitTagsPostRequestJsonTaggerX387ebab0")
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

public fun inlineReposGitTagsPostRequestJsonTaggerX387ebab0(block: InlineReposGitTagsPostRequestJsonTaggerX387ebab0.Builder.() -> Unit): InlineReposGitTagsPostRequestJsonTaggerX387ebab0 = InlineReposGitTagsPostRequestJsonTaggerX387ebab0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposGitTagsPostRequestJsonTaggerX387ebab0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
