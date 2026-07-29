package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
 * The campaign metadata and alert stats.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/campaign-summary
 */
@Serializable(with = CampaignSummary.Serializer::class)
public class CampaignSummary internal constructor(
  /**
   * The contact link of the campaign.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val contactLink: String?,
  /**
   * The date and time the campaign was created, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The campaign description
   */
  public val description: String,
  /**
   * The date and time the campaign has ended, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val endsAt: String,
  managers: List<SimpleUser>,
  /**
   * The number of the newly created campaign
   */
  public val number: Int,
  public val state: CampaignState,
  /**
   * The date and time the campaign was last updated, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  private val alertStatsState: FieldState<InlineCampaignSummaryAlertStatsXa8748d5f>,
  private val closedAtState: FieldState<String?>,
  private val nameState: FieldState<String>,
  private val publishedAtState: FieldState<String>,
  teamManagersState: FieldState<List<Team>>,
) {
  /**
   * The campaign managers
   */
  public val managers: List<SimpleUser> = managers.toList()

  private val teamManagersState: FieldState<List<Team>> =
      teamManagersState.copyValue { fieldValue -> fieldValue.toList() }

  public val alertStats: InlineCampaignSummaryAlertStatsXa8748d5f?
    get() = alertStatsState.valueOrNull()

  /**
   * The date and time the campaign was closed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will be null if the campaign
   * is still open.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val closedAt: String?
    get() = closedAtState.valueOrNull()

  /**
   * The campaign name
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The date and time the campaign was published, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val publishedAt: String?
    get() = publishedAtState.valueOrNull()

  /**
   * The campaign team managers
   */
  public val teamManagers: List<Team>?
    get() = teamManagersState.valueOrNull()

  public constructor(
    contactLink: String?,
    createdAt: String,
    description: String,
    endsAt: String,
    managers: List<SimpleUser>,
    number: Int,
    state: CampaignState,
    updatedAt: String,
  ) : this(contactLink = contactLink,
  createdAt = createdAt,
  description = description,
  endsAt = endsAt,
  managers = managers,
  number = number,
  state = state,
  updatedAt = updatedAt,
  alertStatsState = FieldState.Absent,
  closedAtState = FieldState.Absent,
  nameState = FieldState.Absent,
  publishedAtState = FieldState.Absent,
  teamManagersState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `alert_stats`.
   */
  public fun alertStatsPresence(): FieldPresence = alertStatsState.presence

  /**
   * Returns the wire presence of `closed_at`.
   */
  public fun closedAtPresence(): FieldPresence = closedAtState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `published_at`.
   */
  public fun publishedAtPresence(): FieldPresence = publishedAtState.presence

  /**
   * Returns the wire presence of `team_managers`.
   */
  public fun teamManagersPresence(): FieldPresence = teamManagersState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var descriptionValue: String? = null

    public var description: String
      get() = requireNotNull(descriptionValue) { "description is required" }
      set(`value`) {
        descriptionValue = value
      }

    private var endsAtValue: String? = null

    public var endsAt: String
      get() = requireNotNull(endsAtValue) { "endsAt is required" }
      set(`value`) {
        endsAtValue = value
      }

    private var managersValue: List<SimpleUser>? = null

    public var managers: List<SimpleUser>
      get() = requireNotNull(managersValue) { "managers is required" }.toList()
      set(`value`) {
        managersValue = value.toList()
      }

    private var numberValue: Int? = null

    public var number: Int
      get() = requireNotNull(numberValue) { "number is required" }
      set(`value`) {
        numberValue = value
      }

    private var stateValue: CampaignState? = null

    public var state: CampaignState
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var contactLinkState: FieldState<String?> = FieldState.Absent

    /**
     * The contact link of the campaign.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var contactLink: String?
      get() = contactLinkState.valueOrNull()
      set(`value`) {
        contactLinkState = value.toNullableFieldState()
      }

    private var alertStatsState: FieldState<InlineCampaignSummaryAlertStatsXa8748d5f> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var alertStats: InlineCampaignSummaryAlertStatsXa8748d5f?
      get() = alertStatsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "alertStats is not nullable; call unsetAlertStats() to omit it" }
        alertStatsState = FieldState.Value(present)
      }

    private var closedAtState: FieldState<String?> = FieldState.Absent

    /**
     * The date and time the campaign was closed, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ. Will be null if the
     * campaign is still open.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var closedAt: String?
      get() = closedAtState.valueOrNull()
      set(`value`) {
        closedAtState = value.toNullableFieldState()
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The campaign name
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var publishedAtState: FieldState<String> = FieldState.Absent

    /**
     * The date and time the campaign was published, in ISO 8601 format':' YYYY-MM-DDTHH:MM:SSZ.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var publishedAt: String?
      get() = publishedAtState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "publishedAt is not nullable; call unsetPublishedAt() to omit it" }
        publishedAtState = FieldState.Value(present)
      }

    private var teamManagersState: FieldState<List<Team>> = FieldState.Absent

    /**
     * The campaign team managers
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var teamManagers: List<Team>?
      get() = teamManagersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "teamManagers is not nullable; call unsetTeamManagers() to omit it" }
        teamManagersState = FieldState.Value(present.toList())
      }

    /**
     * Omits `alert_stats` from serialized output.
     */
    public fun unsetAlertStats() {
      alertStatsState = FieldState.Absent
    }

    /**
     * Omits `closed_at` from serialized output.
     */
    public fun unsetClosedAt() {
      closedAtState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `published_at` from serialized output.
     */
    public fun unsetPublishedAt() {
      publishedAtState = FieldState.Absent
    }

    /**
     * Omits `team_managers` from serialized output.
     */
    public fun unsetTeamManagers() {
      teamManagersState = FieldState.Absent
    }

    public fun build(): CampaignSummary {
      check(createdAtValue != null) { "createdAt is required" }
      check(descriptionValue != null) { "description is required" }
      check(endsAtValue != null) { "endsAt is required" }
      check(managersValue != null) { "managers is required" }
      check(numberValue != null) { "number is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(contactLinkState !== FieldState.Absent) { "contactLink is required, even when null" }
      return CampaignSummary(
        contactLink = contactLinkState.valueOrNull(),
        createdAt = createdAt,
        description = description,
        endsAt = endsAt,
        managers = managers,
        number = number,
        state = state,
        updatedAt = updatedAt,
        alertStatsState = alertStatsState,
        closedAtState = closedAtState,
        nameState = nameState,
        publishedAtState = publishedAtState,
        teamManagersState = teamManagersState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CampaignSummary = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CampaignSummary> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CampaignSummary {
      val jsonDecoder = decoder.requireJsonDecoder("CampaignSummary")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CampaignSummary must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val description = json.decodeRequired<String>(rawObject, "description")
      val endsAt = json.decodeRequired<String>(rawObject, "ends_at")
      val managers = json.decodeRequired<List<SimpleUser>>(rawObject, "managers")
      val number = json.decodeRequired<Int>(rawObject, "number")
      val state = json.decodeRequired<CampaignState>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("contact_link")) {
        throw SerializationException("CampaignSummary is missing required property 'contact_link'")
      }
      val contactLink = rawObject["contact_link"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return CampaignSummary(
        contactLink = contactLink,
        createdAt = createdAt,
        description = description,
        endsAt = endsAt,
        managers = managers,
        number = number,
        state = state,
        updatedAt = updatedAt,
        alertStatsState = json.decodeOptional(rawObject, "alert_stats", nullable = false),
        closedAtState = json.decodeOptional(rawObject, "closed_at", nullable = true),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        publishedAtState = json.decodeOptional(rawObject, "published_at", nullable = false),
        teamManagersState = json.decodeOptional(rawObject, "team_managers", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: CampaignSummary) {
      val jsonEncoder = encoder.requireJsonEncoder("CampaignSummary")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("contact_link", value.contactLink?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("created_at", value.createdAt)
        put("description", value.description)
        put("ends_at", value.endsAt)
        put("managers", json.encodeToJsonElement(value.managers))
        put("number", json.encodeToJsonElement(value.number))
        put("state", json.encodeToJsonElement(value.state))
        put("updated_at", value.updatedAt)
        putState("alert_stats", value.alertStatsState, json::encodeToJsonElement)
        putState("closed_at", value.closedAtState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("published_at", value.publishedAtState, json::encodeToJsonElement)
        putState("team_managers", value.teamManagersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun campaignSummary(block: CampaignSummary.Builder.() -> Unit): CampaignSummary = CampaignSummary.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CampaignSummary is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <T> FieldState<T>.copyValue(copy: (T) -> T): FieldState<T> = when (this) {
  FieldState.Absent -> this
  FieldState.Null -> this
  is FieldState.Value -> FieldState.Value(copy(value))
}

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("CampaignSummary property '" + name + "' is not nullable")
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
