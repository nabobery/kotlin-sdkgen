package io.github.nabobery.sdkgen.github.generated

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
 * The total number of seats created for members of the specified team(s).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_teams/post/responses/201/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c.Serializer::class)
public class InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c(
  public val seatsCreated: Int,
) {
  public class Builder {
    private var seatsCreatedValue: Int? = null

    public var seatsCreated: Int
      get() = requireNotNull(seatsCreatedValue) { "seatsCreated is required" }
      set(`value`) {
        seatsCreatedValue = value
      }

    public fun build(): InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c {
      check(seatsCreatedValue != null) { "seatsCreated is required" }
      return InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c(
        seatsCreated = seatsCreated,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c must be a JSON object")
      val seatsCreated = json.decodeRequired<Int>(rawObject, "seats_created")
      return InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c(
        seatsCreated = seatsCreated,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("seats_created", json.encodeToJsonElement(value.seatsCreated))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c(block: InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c = InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsPostResponse201JsonXbda5903c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
