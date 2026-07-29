package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class PaymentLinksResourceRestrictionsView(
  @SerialName("completed_sessions")
  public val completedSessions: PaymentLinksResourceCompletedSessions,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_restrictions
 */
@Serializable(with = PaymentLinksResourceRestrictions.Serializer::class)
public class PaymentLinksResourceRestrictions(
  public val completedSessions: PaymentLinksResourceCompletedSessions,
) {
  public class Builder {
    private var completedSessionsValue: PaymentLinksResourceCompletedSessions? = null

    public var completedSessions: PaymentLinksResourceCompletedSessions
      get() = requireNotNull(completedSessionsValue) { "completedSessions is required" }
      set(`value`) {
        completedSessionsValue = value
      }

    public fun build(): PaymentLinksResourceRestrictions {
      check(completedSessionsValue != null) { "completedSessions is required" }
      return PaymentLinksResourceRestrictions(
        completedSessions = completedSessions,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceRestrictions = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<PaymentLinksResourceRestrictions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceRestrictions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceRestrictions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceRestrictions must be a JSON object")
      val completedSessions = json.decodeRequired<PaymentLinksResourceCompletedSessions>(rawObject, "completed_sessions")
      return PaymentLinksResourceRestrictions(
        completedSessions = completedSessions,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceRestrictions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceRestrictions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("completed_sessions", json.encodeToJsonElement(value.completedSessions))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceRestrictions(block: PaymentLinksResourceRestrictions.Builder.() -> Unit): PaymentLinksResourceRestrictions = PaymentLinksResourceRestrictions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceRestrictions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
