package com.nabobery.sdkgen.github.generated

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
 * Information about the seat breakdown and policies set for an organization with a Copilot Business or Copilot
 * Enterprise subscription.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-organization-details
 */
@Serializable(with = CopilotOrganizationDetails.Serializer::class)
public class CopilotOrganizationDetails(
  /**
   * The organization policy for allowing or blocking suggestions matching public code (duplication detection filter).
   */
  public val publicCodeSuggestions: InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c,
  public val seatBreakdown: CopilotOrganizationSeatBreakdown,
  /**
   * The mode of assigning new seats.
   */
  public val seatManagementSetting: InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf,
  /**
   * The organization policy for allowing or disallowing Copilot CLI.
   */
  public val cli: InlineCopilotOrganizationDetailsCliX178cd746? = null,
  /**
   * The organization policy for allowing or disallowing Copilot Chat in the IDE.
   */
  public val ideChat: InlineCopilotOrganizationDetailsIdeChatX30b2daa4? = null,
  /**
   * The Copilot plan of the organization, or the parent enterprise, when applicable.
   */
  public val planType: InlineCopilotOrganizationDetailsPlanTypeX334c5093? = null,
  /**
   * The organization policy for allowing or disallowing Copilot features on GitHub.com.
   */
  public val platformChat: InlineCopilotOrganizationDetailsPlatformChatX377c6882? = null,
) {
  public class Builder {
    private var publicCodeSuggestionsValue:
        InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c? = null

    public var publicCodeSuggestions: InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c
      get() = requireNotNull(publicCodeSuggestionsValue) { "publicCodeSuggestions is required" }
      set(`value`) {
        publicCodeSuggestionsValue = value
      }

    private var seatBreakdownValue: CopilotOrganizationSeatBreakdown? = null

    public var seatBreakdown: CopilotOrganizationSeatBreakdown
      get() = requireNotNull(seatBreakdownValue) { "seatBreakdown is required" }
      set(`value`) {
        seatBreakdownValue = value
      }

    private var seatManagementSettingValue:
        InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf? = null

    public var seatManagementSetting: InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf
      get() = requireNotNull(seatManagementSettingValue) { "seatManagementSetting is required" }
      set(`value`) {
        seatManagementSettingValue = value
      }

    /**
     * The organization policy for allowing or disallowing Copilot CLI.
     */
    public var cli: InlineCopilotOrganizationDetailsCliX178cd746? = null

    /**
     * The organization policy for allowing or disallowing Copilot Chat in the IDE.
     */
    public var ideChat: InlineCopilotOrganizationDetailsIdeChatX30b2daa4? = null

    /**
     * The Copilot plan of the organization, or the parent enterprise, when applicable.
     */
    public var planType: InlineCopilotOrganizationDetailsPlanTypeX334c5093? = null

    /**
     * The organization policy for allowing or disallowing Copilot features on GitHub.com.
     */
    public var platformChat: InlineCopilotOrganizationDetailsPlatformChatX377c6882? = null

    public fun build(): CopilotOrganizationDetails {
      check(publicCodeSuggestionsValue != null) { "publicCodeSuggestions is required" }
      check(seatBreakdownValue != null) { "seatBreakdown is required" }
      check(seatManagementSettingValue != null) { "seatManagementSetting is required" }
      return CopilotOrganizationDetails(
        publicCodeSuggestions = publicCodeSuggestions,
        seatBreakdown = seatBreakdown,
        seatManagementSetting = seatManagementSetting,
        cli = cli,
        ideChat = ideChat,
        planType = planType,
        platformChat = platformChat,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CopilotOrganizationDetails = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CopilotOrganizationDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotOrganizationDetails {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotOrganizationDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CopilotOrganizationDetails must be a JSON object")
      val publicCodeSuggestions = json.decodeRequired<InlineCopilotOrganizationDetailsPublicCodeSuggestionsX55c3737c>(rawObject, "public_code_suggestions")
      val seatBreakdown = json.decodeRequired<CopilotOrganizationSeatBreakdown>(rawObject, "seat_breakdown")
      val seatManagementSetting = json.decodeRequired<InlineCopilotOrganizationDetailsSeatManagementSettingXea4f7bdf>(rawObject, "seat_management_setting")
      return CopilotOrganizationDetails(
        publicCodeSuggestions = publicCodeSuggestions,
        seatBreakdown = seatBreakdown,
        seatManagementSetting = seatManagementSetting,
        cli = rawObject["cli"]?.let { json.decodeFromJsonElement<InlineCopilotOrganizationDetailsCliX178cd746>(it) },
        ideChat = rawObject["ide_chat"]?.let { json.decodeFromJsonElement<InlineCopilotOrganizationDetailsIdeChatX30b2daa4>(it) },
        planType = rawObject["plan_type"]?.let { json.decodeFromJsonElement<InlineCopilotOrganizationDetailsPlanTypeX334c5093>(it) },
        platformChat = rawObject["platform_chat"]?.let { json.decodeFromJsonElement<InlineCopilotOrganizationDetailsPlatformChatX377c6882>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CopilotOrganizationDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("CopilotOrganizationDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("public_code_suggestions", json.encodeToJsonElement(value.publicCodeSuggestions))
        put("seat_breakdown", json.encodeToJsonElement(value.seatBreakdown))
        put("seat_management_setting", json.encodeToJsonElement(value.seatManagementSetting))
        value.cli?.let { put("cli", json.encodeToJsonElement(it)) }
        value.ideChat?.let { put("ide_chat", json.encodeToJsonElement(it)) }
        value.planType?.let { put("plan_type", json.encodeToJsonElement(it)) }
        value.platformChat?.let { put("platform_chat", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun copilotOrganizationDetails(block: CopilotOrganizationDetails.Builder.() -> Unit): CopilotOrganizationDetails = CopilotOrganizationDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CopilotOrganizationDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
