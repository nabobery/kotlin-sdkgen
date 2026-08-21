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
 * The total number of seats created for the specified user(s).
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_users/post/responses/201/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246.Serializer::class)
public class InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246(
  public val seatsCreated: Int,
) {
  public class Builder {
    private var seatsCreatedValue: Int? = null

    public var seatsCreated: Int
      get() = requireNotNull(seatsCreatedValue) { "seatsCreated is required" }
      set(`value`) {
        seatsCreatedValue = value
      }

    public fun build(): InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246 {
      check(seatsCreatedValue != null) { "seatsCreated is required" }
      return InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246(
        seatsCreated = seatsCreated,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246 must be a JSON object")
      val seatsCreated = json.decodeRequired<Int>(rawObject, "seats_created")
      return InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246(
        seatsCreated = seatsCreated,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("seats_created", json.encodeToJsonElement(value.seatsCreated))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246(block: InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246 = InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedUsersPostResponse201JsonX9f121246 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
