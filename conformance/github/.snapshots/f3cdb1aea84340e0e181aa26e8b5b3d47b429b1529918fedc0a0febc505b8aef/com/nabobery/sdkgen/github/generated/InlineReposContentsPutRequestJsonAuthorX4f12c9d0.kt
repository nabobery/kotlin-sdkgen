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
 * The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1contents~1{path}/put/requestBody/content/application~1j
 * son/schema/properties/author
 */
@Serializable(with = InlineReposContentsPutRequestJsonAuthorX4f12c9d0.Serializer::class)
public class InlineReposContentsPutRequestJsonAuthorX4f12c9d0(
  /**
   * The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted.
   */
  public val email: String,
  /**
   * The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted.
   */
  public val name: String,
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

    public var date: String? = null

    public fun build(): InlineReposContentsPutRequestJsonAuthorX4f12c9d0 {
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineReposContentsPutRequestJsonAuthorX4f12c9d0(
        email = email,
        name = name,
        date = date,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposContentsPutRequestJsonAuthorX4f12c9d0 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposContentsPutRequestJsonAuthorX4f12c9d0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposContentsPutRequestJsonAuthorX4f12c9d0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposContentsPutRequestJsonAuthorX4f12c9d0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposContentsPutRequestJsonAuthorX4f12c9d0 must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineReposContentsPutRequestJsonAuthorX4f12c9d0(
        email = email,
        name = name,
        date = rawObject["date"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposContentsPutRequestJsonAuthorX4f12c9d0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposContentsPutRequestJsonAuthorX4f12c9d0")
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

public fun inlineReposContentsPutRequestJsonAuthorX4f12c9d0(block: InlineReposContentsPutRequestJsonAuthorX4f12c9d0.Builder.() -> Unit): InlineReposContentsPutRequestJsonAuthorX4f12c9d0 = InlineReposContentsPutRequestJsonAuthorX4f12c9d0.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineReposContentsPutRequestJsonAuthorX4f12c9d0 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
