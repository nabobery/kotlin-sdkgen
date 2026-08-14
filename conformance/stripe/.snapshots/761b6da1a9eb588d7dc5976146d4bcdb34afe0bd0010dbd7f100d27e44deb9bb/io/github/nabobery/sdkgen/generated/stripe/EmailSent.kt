package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/email_sent
 */
@Serializable(with = EmailSent.Serializer::class)
public class EmailSent(
  /**
   * The timestamp when the email was sent.
   */
  public val emailSentAt: Int,
  /**
   * The recipient's email address.
   */
  public val emailSentTo: String,
) {
  public class Builder {
    private var emailSentAtValue: Int? = null

    public var emailSentAt: Int
      get() = requireNotNull(emailSentAtValue) { "emailSentAt is required" }
      set(`value`) {
        emailSentAtValue = value
      }

    private var emailSentToValue: String? = null

    public var emailSentTo: String
      get() = requireNotNull(emailSentToValue) { "emailSentTo is required" }
      set(`value`) {
        emailSentToValue = value
      }

    public fun build(): EmailSent {
      check(emailSentAtValue != null) { "emailSentAt is required" }
      check(emailSentToValue != null) { "emailSentTo is required" }
      return EmailSent(
        emailSentAt = emailSentAt,
        emailSentTo = emailSentTo,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EmailSent = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EmailSent> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EmailSent {
      val jsonDecoder = decoder.requireJsonDecoder("EmailSent")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EmailSent must be a JSON object")
      val emailSentAt = json.decodeRequired<Int>(rawObject, "email_sent_at")
      val emailSentTo = json.decodeRequired<String>(rawObject, "email_sent_to")
      return EmailSent(
        emailSentAt = emailSentAt,
        emailSentTo = emailSentTo,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EmailSent) {
      val jsonEncoder = encoder.requireJsonEncoder("EmailSent")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("email_sent_at", json.encodeToJsonElement(value.emailSentAt))
        put("email_sent_to", value.emailSentTo)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun emailSent(block: EmailSent.Builder.() -> Unit): EmailSent = EmailSent.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EmailSent is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
