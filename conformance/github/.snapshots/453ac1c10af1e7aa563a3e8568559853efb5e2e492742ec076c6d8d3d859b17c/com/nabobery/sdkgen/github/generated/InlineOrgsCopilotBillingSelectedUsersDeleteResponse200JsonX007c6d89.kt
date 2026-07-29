package com.nabobery.sdkgen.github.generated

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
 * The total number of seats set to "pending cancellation" for the specified users.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_users/delete/responses/200/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89.Serializer::class)
public class InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89(
  public val seatsCancelled: Int,
) {
  public class Builder {
    private var seatsCancelledValue: Int? = null

    public var seatsCancelled: Int
      get() = requireNotNull(seatsCancelledValue) { "seatsCancelled is required" }
      set(`value`) {
        seatsCancelledValue = value
      }

    public fun build(): InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89 {
      check(seatsCancelledValue != null) { "seatsCancelled is required" }
      return InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89(
        seatsCancelled = seatsCancelled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89 must be a JSON object")
      val seatsCancelled = json.decodeRequired<Int>(rawObject, "seats_cancelled")
      return InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89(
        seatsCancelled = seatsCancelled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("seats_cancelled", json.encodeToJsonElement(value.seatsCancelled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89(block: InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89 = InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersDeleteResponse200JsonX007c6d89 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
