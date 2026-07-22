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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-simple-commit/properties/committer
 */
@Serializable(with = InlineNullableSimpleCommitCommitterXdd79f8dc.Serializer::class)
public class InlineNullableSimpleCommitCommitterXdd79f8dc(
  /**
   * Git email address of the commit's committer
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

    public fun build(): InlineNullableSimpleCommitCommitterXdd79f8dc {
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineNullableSimpleCommitCommitterXdd79f8dc(
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNullableSimpleCommitCommitterXdd79f8dc = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineNullableSimpleCommitCommitterXdd79f8dc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableSimpleCommitCommitterXdd79f8dc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableSimpleCommitCommitterXdd79f8dc")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNullableSimpleCommitCommitterXdd79f8dc must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineNullableSimpleCommitCommitterXdd79f8dc(
        email = email,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableSimpleCommitCommitterXdd79f8dc) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNullableSimpleCommitCommitterXdd79f8dc")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNullableSimpleCommitCommitterXdd79f8dc(block: InlineNullableSimpleCommitCommitterXdd79f8dc.Builder.() -> Unit): InlineNullableSimpleCommitCommitterXdd79f8dc = InlineNullableSimpleCommitCommitterXdd79f8dc.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineNullableSimpleCommitCommitterXdd79f8dc is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
