package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Deletes one or more email addresses from your GitHub account. Must contain at least one email address. **Note:**
 * Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that
 * you pass an object using the `emails` key.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1user~1emails/delete/requestBody/content/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90.Serializer::class)
public class InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90(
  emails: List<String>,
) {
  /**
   * Email addresses associated with the GitHub user account.
   */
  public val emails: List<String> = emails.toList()

  public class Builder {
    private var emailsValue: List<String>? = null

    public var emails: List<String>
      get() = requireNotNull(emailsValue) { "emails is required" }
      set(`value`) {
        emailsValue = value
      }

    public fun build(): InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90 {
      check(emailsValue != null) { "emails is required" }
      return InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90(
        emails = emails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90 must be a JSON object")
      val emails = json.decodeRequired<List<String>>(rawObject, "emails")
      return InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90(
        emails = emails,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("emails", json.encodeToJsonElement(value.emails))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90(block: InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90.Builder.() -> Unit): InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90 = InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserEmailsDeleteRequestJsonOneOf1X3cef1f90 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
