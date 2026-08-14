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
import kotlinx.serialization.json.put

/**
 * Information about the Git author
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/nullable-simple-commit/properties/author
 */
@Serializable(with = InlineNullableSimpleCommitAuthorX6a223e77.Serializer::class)
public class InlineNullableSimpleCommitAuthorX6a223e77(
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

    public fun build(): InlineNullableSimpleCommitAuthorX6a223e77 {
      check(emailValue != null) { "email is required" }
      check(nameValue != null) { "name is required" }
      return InlineNullableSimpleCommitAuthorX6a223e77(
        email = email,
        name = name,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineNullableSimpleCommitAuthorX6a223e77 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineNullableSimpleCommitAuthorX6a223e77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineNullableSimpleCommitAuthorX6a223e77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineNullableSimpleCommitAuthorX6a223e77")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineNullableSimpleCommitAuthorX6a223e77 must be a JSON object")
      val email = json.decodeRequired<String>(rawObject, "email")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineNullableSimpleCommitAuthorX6a223e77(
        email = email,
        name = name,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineNullableSimpleCommitAuthorX6a223e77) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineNullableSimpleCommitAuthorX6a223e77")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email", value.email)
        put("name", value.name)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineNullableSimpleCommitAuthorX6a223e77(block: InlineNullableSimpleCommitAuthorX6a223e77.Builder.() -> Unit): InlineNullableSimpleCommitAuthorX6a223e77 = InlineNullableSimpleCommitAuthorX6a223e77.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineNullableSimpleCommitAuthorX6a223e77 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
