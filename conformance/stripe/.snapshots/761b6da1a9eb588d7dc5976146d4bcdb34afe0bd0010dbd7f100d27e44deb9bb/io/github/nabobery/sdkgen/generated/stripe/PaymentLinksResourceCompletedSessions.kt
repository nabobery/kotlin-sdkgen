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
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_completed_sessions
 */
@Serializable(with = PaymentLinksResourceCompletedSessions.Serializer::class)
public class PaymentLinksResourceCompletedSessions(
  /**
   * The current number of checkout sessions that have been completed on the payment link which count towards the
   * `completed_sessions` restriction to be met.
   */
  public val count: Int,
  /**
   * The maximum number of checkout sessions that can be completed for the `completed_sessions` restriction to be met.
   */
  public val limit: Int,
) {
  public class Builder {
    private var countValue: Int? = null

    public var count: Int
      get() = requireNotNull(countValue) { "count is required" }
      set(`value`) {
        countValue = value
      }

    private var limitValue: Int? = null

    public var limit: Int
      get() = requireNotNull(limitValue) { "limit is required" }
      set(`value`) {
        limitValue = value
      }

    public fun build(): PaymentLinksResourceCompletedSessions {
      check(countValue != null) { "count is required" }
      check(limitValue != null) { "limit is required" }
      return PaymentLinksResourceCompletedSessions(
        count = count,
        limit = limit,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PaymentLinksResourceCompletedSessions = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PaymentLinksResourceCompletedSessions> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PaymentLinksResourceCompletedSessions {
      val jsonDecoder = decoder.requireJsonDecoder("PaymentLinksResourceCompletedSessions")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PaymentLinksResourceCompletedSessions must be a JSON object")
      val count = json.decodeRequired<Int>(rawObject, "count")
      val limit = json.decodeRequired<Int>(rawObject, "limit")
      return PaymentLinksResourceCompletedSessions(
        count = count,
        limit = limit,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PaymentLinksResourceCompletedSessions) {
      val jsonEncoder = encoder.requireJsonEncoder("PaymentLinksResourceCompletedSessions")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("count", json.encodeToJsonElement(value.count))
        put("limit", json.encodeToJsonElement(value.limit))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun paymentLinksResourceCompletedSessions(block: PaymentLinksResourceCompletedSessions.Builder.() -> Unit): PaymentLinksResourceCompletedSessions = PaymentLinksResourceCompletedSessions.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PaymentLinksResourceCompletedSessions is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
