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
 * Information about the Git committer
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/simple-commit/properties/committer
 */
@Serializable(with = InlineSimpleCommitCommitterXe9568d0a.Serializer::class)
public class InlineSimpleCommitCommitterXe9568d0a(
  /**
   * Git email address of the commit's committer
   *
   * Wire format: `email`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val email: String,
  /**
   * Name of the commit's committer
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

    public fun build(): InlineSimpleCommitCommitterXe9568d0a {
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineSimpleCommitCommitterXe9568d0a(
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineSimpleCommitCommitterXe9568d0a = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineSimpleCommitCommitterXe9568d0a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSimpleCommitCommitterXe9568d0a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSimpleCommitCommitterXe9568d0a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineSimpleCommitCommitterXe9568d0a must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineSimpleCommitCommitterXe9568d0a(
        email = email,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineSimpleCommitCommitterXe9568d0a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineSimpleCommitCommitterXe9568d0a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineSimpleCommitCommitterXe9568d0a(block: InlineSimpleCommitCommitterXe9568d0a.Builder.() -> Unit): InlineSimpleCommitCommitterXe9568d0a = InlineSimpleCommitCommitterXe9568d0a.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineSimpleCommitCommitterXe9568d0a is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
