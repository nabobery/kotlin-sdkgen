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
 * The total number of seats set to "pending cancellation" for members of the specified team(s).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_teams/delete/responses/200/content/appl
 * ication~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785.Serializer::class)
public class InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785(
  public val seatsCancelled: Int,
) {
  public class Builder {
    private var seatsCancelledValue: Int? = null

    public var seatsCancelled: Int
      get() = requireNotNull(seatsCancelledValue) { "seatsCancelled is required" }
      set(`value`) {
        seatsCancelledValue = value
      }

    public fun build(): InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785 {
      check(seatsCancelledValue != null) { "seatsCancelled is required" }
      return InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785(
        seatsCancelled = seatsCancelled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785 must be a JSON object")
      val seatsCancelled = json.decodeRequired<Int>(rawObject, "seats_cancelled")
      return InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785(
        seatsCancelled = seatsCancelled,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("seats_cancelled", json.encodeToJsonElement(value.seatsCancelled))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785(block: InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785 = InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsDeleteResponse200JsonXd1322785 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
