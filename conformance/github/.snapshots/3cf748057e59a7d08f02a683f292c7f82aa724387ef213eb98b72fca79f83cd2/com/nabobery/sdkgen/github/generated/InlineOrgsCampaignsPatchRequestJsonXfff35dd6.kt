package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1campaigns~1{campaign_number}/patch/requestBody/content/application
 * ~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1campaigns~1{campaign_number}/patch/requestBody/content/application
 * ~1json/schema
 */
@Serializable(with = InlineOrgsCampaignsPatchRequestJsonXfff35dd6.Serializer::class)
public class InlineOrgsCampaignsPatchRequestJsonXfff35dd6 internal constructor(
  private val contactLinkState: FieldState<String?>,
  private val descriptionState: FieldState<String>,
  private val endsAtState: FieldState<String>,
  private val managersState: FieldState<List<String>>,
  private val nameState: FieldState<String>,
  private val stateState: FieldState<CampaignState>,
  private val teamManagersState: FieldState<List<String>>,
) {
  /**
   * The contact link of the campaign. Must be a URI.
   */
  public val contactLink: String?
    get() = contactLinkState.valueOrNull()

  /**
   * A description for the campaign
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The end date and time of the campaign, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   */
  public val endsAt: String?
    get() = endsAtState.valueOrNull()

  /**
   * The logins of the users to set as the campaign managers. At this time, only a single manager can be supplied.
   */
  public val managers: List<String>?
    get() = managersState.valueOrNull()

  /**
   * The name of the campaign
   */
  public val name: String?
    get() = nameState.valueOrNull()

  public val state: CampaignState?
    get() = stateState.valueOrNull()

  /**
   * The slugs of the teams to set as the campaign managers.
   */
  public val teamManagers: List<String>?
    get() = teamManagersState.valueOrNull()

  public constructor() : this(contactLinkState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  endsAtState = FieldState.Absent,
  managersState = FieldState.Absent,
  nameState = FieldState.Absent,
  stateState = FieldState.Absent,
  teamManagersState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `contact_link`.
   */
  public fun contactLinkPresence(): FieldPresence = contactLinkState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `ends_at`.
   */
  public fun endsAtPresence(): FieldPresence = endsAtState.presence

  /**
   * Returns the wire presence of `managers`.
   */
  public fun managersPresence(): FieldPresence = managersState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  /**
   * Returns the wire presence of `team_managers`.
   */
  public fun teamManagersPresence(): FieldPresence = teamManagersState.presence

  public class Builder {
    private var contactLinkState: FieldState<String?> = FieldState.Absent

    /**
     * The contact link of the campaign. Must be a URI.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var contactLink: String?
      get() = contactLinkState.valueOrNull()
      set(`value`) {
        contactLinkState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * A description for the campaign
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var endsAtState: FieldState<String> = FieldState.Absent

    /**
     * The end date and time of the campaign, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var endsAt: String?
      get() = endsAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "endsAt is not nullable; call unsetEndsAt() to omit it" }
        endsAtState = FieldState.Value(present)
      }

    private var managersState: FieldState<List<String>> = FieldState.Absent

    /**
     * The logins of the users to set as the campaign managers. At this time, only a single manager can be supplied.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var managers: List<String>?
      get() = managersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "managers is not nullable; call unsetManagers() to omit it" }
        managersState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the campaign
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var stateState: FieldState<CampaignState> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: CampaignState?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    private var teamManagersState: FieldState<List<String>> = FieldState.Absent

    /**
     * The slugs of the teams to set as the campaign managers.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var teamManagers: List<String>?
      get() = teamManagersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "teamManagers is not nullable; call unsetTeamManagers() to omit it" }
        teamManagersState = FieldState.Value(present)
      }

    /**
     * Omits `contact_link` from serialized output.
     */
    public fun unsetContactLink() {
      contactLinkState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `ends_at` from serialized output.
     */
    public fun unsetEndsAt() {
      endsAtState = FieldState.Absent
    }

    /**
     * Omits `managers` from serialized output.
     */
    public fun unsetManagers() {
      managersState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    /**
     * Omits `team_managers` from serialized output.
     */
    public fun unsetTeamManagers() {
      teamManagersState = FieldState.Absent
    }

    public fun build(): InlineOrgsCampaignsPatchRequestJsonXfff35dd6 = InlineOrgsCampaignsPatchRequestJsonXfff35dd6(
      contactLinkState = contactLinkState,
      descriptionState = descriptionState,
      endsAtState = endsAtState,
      managersState = managersState,
      nameState = nameState,
      stateState = stateState,
      teamManagersState = teamManagersState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCampaignsPatchRequestJsonXfff35dd6 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCampaignsPatchRequestJsonXfff35dd6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCampaignsPatchRequestJsonXfff35dd6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCampaignsPatchRequestJsonXfff35dd6")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCampaignsPatchRequestJsonXfff35dd6 must be a JSON object")
      return InlineOrgsCampaignsPatchRequestJsonXfff35dd6(
        contactLinkState = json.decodeOptional(rawObject, "contact_link", nullable = true),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        endsAtState = json.decodeOptional(rawObject, "ends_at", nullable = false),
        managersState = json.decodeOptional(rawObject, "managers", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
        teamManagersState = json.decodeOptional(rawObject, "team_managers", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCampaignsPatchRequestJsonXfff35dd6) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCampaignsPatchRequestJsonXfff35dd6")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("contact_link", value.contactLinkState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("ends_at", value.endsAtState, json::encodeToJsonElement)
        putState("managers", value.managersState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
        putState("team_managers", value.teamManagersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCampaignsPatchRequestJsonXfff35dd6(block: InlineOrgsCampaignsPatchRequestJsonXfff35dd6.Builder.() -> Unit): InlineOrgsCampaignsPatchRequestJsonXfff35dd6 = InlineOrgsCampaignsPatchRequestJsonXfff35dd6.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsCampaignsPatchRequestJsonXfff35dd6 property '" + name + "' is not nullable")
    return FieldState.Null
  }
  return FieldState.Value(decodeFromJsonElement<T>(element))
}

private inline fun <T> JsonObjectBuilder.putState(
  name: String,
  state: FieldState<T>,
  encode: (T) -> JsonElement,
) {
  when (state) {
    FieldState.Absent -> Unit
    FieldState.Null -> put(name, JsonNull)
    is FieldState.Value -> put(name, encode(state.value))
  }
}
