package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1seats/get/responses/200/content/application~1jso
 * n/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1seats/get/responses/200/content/application~1jso
 * n/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a.Serializer::class)
public class InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a(
  seats: List<CopilotSeatDetails>? = null,
  /**
   * Total number of Copilot seats for the organization currently being billed.
   */
  public val totalSeats: Int? = null,
) {
  public val seats: List<CopilotSeatDetails>? = seats?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var seatsValue: List<CopilotSeatDetails>? = null

    public var seats: List<CopilotSeatDetails>?
      get() = seatsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        seatsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * Total number of Copilot seats for the organization currently being billed.
     */
    public var totalSeats: Int? = null

    public fun build(): InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a = InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a(
      seats = seats,
      totalSeats = totalSeats,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a must be a JSON object")
      return InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a(
        seats = rawObject["seats"]?.let { json.decodeFromJsonElement<List<CopilotSeatDetails>>(it) },
        totalSeats = rawObject["total_seats"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.seats?.let { put("seats", json.encodeToJsonElement(it)) }
        value.totalSeats?.let { put("total_seats", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a(block: InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a.Builder.() -> Unit): InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a = InlineOrgsCopilotBillingSeatsGetResponse200JsonX179f0b2a.build(block)
