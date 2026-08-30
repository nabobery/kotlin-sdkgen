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
 * Information about the Git author
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-commit/properties/author
 */
@Serializable(with = InlineSimpleCommitAuthorX5735de6e.Serializer::class)
public class InlineSimpleCommitAuthorX5735de6e(
  /**
   * Git email address of the commit's author
   *
   * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val email: String,
  /**
   * Name of the commit's author
   */
  public val name: String,
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

    public fun build(): InlineSimpleCommitAuthorX5735de6e {
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineSimpleCommitAuthorX5735de6e(
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSimpleCommitAuthorX5735de6e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineSimpleCommitAuthorX5735de6e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSimpleCommitAuthorX5735de6e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSimpleCommitAuthorX5735de6e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSimpleCommitAuthorX5735de6e must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineSimpleCommitAuthorX5735de6e(
        email = email,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSimpleCommitAuthorX5735de6e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSimpleCommitAuthorX5735de6e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSimpleCommitAuthorX5735de6e(block: InlineSimpleCommitAuthorX5735de6e.Builder.() -> Unit): InlineSimpleCommitAuthorX5735de6e = InlineSimpleCommitAuthorX5735de6e.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSimpleCommitAuthorX5735de6e is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
