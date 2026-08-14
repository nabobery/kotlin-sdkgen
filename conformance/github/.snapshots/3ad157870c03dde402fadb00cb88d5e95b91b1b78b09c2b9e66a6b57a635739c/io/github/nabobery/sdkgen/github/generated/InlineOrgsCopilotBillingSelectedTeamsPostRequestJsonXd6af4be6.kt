package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_teams/post/requestBody/content/applicat
 * ion~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_teams/post/requestBody/content/applicat
 * ion~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6.Serializer::class)
public class InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6(
  selectedTeams: List<String>,
) {
  /**
   * List of team names within the organization to which to grant access to GitHub Copilot.
   */
  public val selectedTeams: List<String> = selectedTeams.toList()

  public class Builder {
    private var selectedTeamsValue: List<String>? = null

    public var selectedTeams: List<String>
      get() = requireNotNull(selectedTeamsValue) { "selectedTeams is required" }.toList()
      set(`value`) {
        selectedTeamsValue = value.toList()
      }

    public fun build(): InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6 {
      check(selectedTeamsValue != null) { "selectedTeams is required" }
      return InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6(
        selectedTeams = selectedTeams,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6 must be a JSON object")
      val selectedTeams = json.decodeRequired<List<String>>(rawObject, "selected_teams")
      return InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6(
        selectedTeams = selectedTeams,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_teams", json.encodeToJsonElement(value.selectedTeams))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6(block: InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6 = InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsPostRequestJsonXd6af4be6 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
