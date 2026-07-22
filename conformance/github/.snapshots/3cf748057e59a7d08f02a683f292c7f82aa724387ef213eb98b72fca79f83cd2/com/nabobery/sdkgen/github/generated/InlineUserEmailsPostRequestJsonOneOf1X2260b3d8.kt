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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1user~1emails/post/requestBody/content/application~1json/schema/oneOf/0.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1user~1emails/post/requestBody/content/application~1json/schema/oneOf/0
 */
@Serializable(with = InlineUserEmailsPostRequestJsonOneOf1X2260b3d8.Serializer::class)
public class InlineUserEmailsPostRequestJsonOneOf1X2260b3d8(
  emails: List<String>,
) {
  /**
   * Adds one or more email addresses to your GitHub account. Must contain at least one email address. **Note:**
   * Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend
   * that you pass an object using the `emails` key.
   */
  public val emails: List<String> = emails.toList()

  public class Builder {
    private var emailsValue: List<String>? = null

    public var emails: List<String>
      get() = requireNotNull(emailsValue) { "emails is required" }
      set(`value`) {
        emailsValue = value
      }

    public fun build(): InlineUserEmailsPostRequestJsonOneOf1X2260b3d8 {
      check(emailsValue != null) { "emails is required" }
      return InlineUserEmailsPostRequestJsonOneOf1X2260b3d8(
        emails = emails,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineUserEmailsPostRequestJsonOneOf1X2260b3d8 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineUserEmailsPostRequestJsonOneOf1X2260b3d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineUserEmailsPostRequestJsonOneOf1X2260b3d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineUserEmailsPostRequestJsonOneOf1X2260b3d8")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineUserEmailsPostRequestJsonOneOf1X2260b3d8 must be a JSON object")
      val emails = json.decodeRequired<List<String>>(rawObject, "emails")
      return InlineUserEmailsPostRequestJsonOneOf1X2260b3d8(
        emails = emails,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineUserEmailsPostRequestJsonOneOf1X2260b3d8) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineUserEmailsPostRequestJsonOneOf1X2260b3d8")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("emails", json.encodeToJsonElement(value.emails))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineUserEmailsPostRequestJsonOneOf1X2260b3d8(block: InlineUserEmailsPostRequestJsonOneOf1X2260b3d8.Builder.() -> Unit): InlineUserEmailsPostRequestJsonOneOf1X2260b3d8 = InlineUserEmailsPostRequestJsonOneOf1X2260b3d8.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineUserEmailsPostRequestJsonOneOf1X2260b3d8 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
