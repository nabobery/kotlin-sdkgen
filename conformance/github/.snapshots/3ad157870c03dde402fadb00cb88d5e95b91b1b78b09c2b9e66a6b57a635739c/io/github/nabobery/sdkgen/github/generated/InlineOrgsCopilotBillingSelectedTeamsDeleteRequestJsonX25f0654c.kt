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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_teams/delete/requestBody/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1copilot~1billing~1selected_teams/delete/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c.Serializer::class)
public class InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c(
  selectedTeams: List<String>,
) {
  /**
   * The names of teams from which to revoke access to GitHub Copilot.
   */
  public val selectedTeams: List<String> = selectedTeams.toList()

  public class Builder {
    private var selectedTeamsValue: List<String>? = null

    public var selectedTeams: List<String>
      get() = requireNotNull(selectedTeamsValue) { "selectedTeams is required" }.toList()
      set(`value`) {
        selectedTeamsValue = value.toList()
      }

    public fun build(): InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c {
      check(selectedTeamsValue != null) { "selectedTeams is required" }
      return InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c(
        selectedTeams = selectedTeams,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c must be a JSON object")
      val selectedTeams = json.decodeRequired<List<String>>(rawObject, "selected_teams")
      return InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c(
        selectedTeams = selectedTeams,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("selected_teams", json.encodeToJsonElement(value.selectedTeams))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c(block: InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c.Builder.() -> Unit): InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c = InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCopilotBillingSelectedTeamsDeleteRequestJsonX25f0654c is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
