package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Information about a Copilot Business seat assignment for a user, team, or organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/copilot-seat-details
 */
@Serializable(with = CopilotSeatDetails.Serializer::class)
public class CopilotSeatDetails(
  /**
   * Timestamp of when the assignee was last granted access to GitHub Copilot, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val assignee: NullableSimpleUser? = null,
  /**
   * The team through which the assignee is granted access to GitHub Copilot, if applicable.
   */
  public val assigningTeam: InlineCopilotSeatDetailsAssigningTeamXbc3ef18b? = null,
  /**
   * Timestamp of user's last GitHub Copilot activity, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastActivityAt: String? = null,
  /**
   * Last editor that was used by the user for a GitHub Copilot completion.
   */
  public val lastActivityEditor: String? = null,
  /**
   * Timestamp of the last time the user authenticated with GitHub Copilot, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastAuthenticatedAt: String? = null,
  public val organization: NullableOrganizationSimple? = null,
  /**
   * The pending cancellation date for the seat, in `YYYY-MM-DD` format. This will be null unless the assignee's Copilot
   * access has been canceled during the current billing cycle. If the seat has been cancelled, this corresponds to the
   * start of the organization's next billing cycle.
   *
   * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pendingCancellationDate: String? = null,
  /**
   * The Copilot plan of the organization, or the parent enterprise, when applicable.
   */
  public val planType: InlineCopilotSeatDetailsPlanTypeXd99f380a? = null,
  /**
   * **Closing down notice:** This field is no longer relevant and is closing down. Use the `created_at` field to
   * determine when the assignee was last granted access to GitHub Copilot. Timestamp of when the assignee's GitHub
   * Copilot access was last updated, in ISO 8601 format.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
) {
  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    public var assignee: NullableSimpleUser? = null

    /**
     * The team through which the assignee is granted access to GitHub Copilot, if applicable.
     */
    public var assigningTeam: InlineCopilotSeatDetailsAssigningTeamXbc3ef18b? = null

    /**
     * Timestamp of user's last GitHub Copilot activity, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var lastActivityAt: String? = null

    /**
     * Last editor that was used by the user for a GitHub Copilot completion.
     */
    public var lastActivityEditor: String? = null

    /**
     * Timestamp of the last time the user authenticated with GitHub Copilot, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var lastAuthenticatedAt: String? = null

    public var organization: NullableOrganizationSimple? = null

    /**
     * The pending cancellation date for the seat, in `YYYY-MM-DD` format. This will be null unless the assignee's
     * Copilot access has been canceled during the current billing cycle. If the seat has been cancelled, this
     * corresponds to the start of the organization's next billing cycle.
     *
     * Wire format: `date`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var pendingCancellationDate: String? = null

    /**
     * The Copilot plan of the organization, or the parent enterprise, when applicable.
     */
    public var planType: InlineCopilotSeatDetailsPlanTypeXd99f380a? = null

    /**
     * **Closing down notice:** This field is no longer relevant and is closing down. Use the `created_at` field to
     * determine when the assignee was last granted access to GitHub Copilot. Timestamp of when the assignee's GitHub
     * Copilot access was last updated, in ISO 8601 format.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    public fun build(): CopilotSeatDetails {
      check(createdAtValue != null) { "createdAt is required" }
      return CopilotSeatDetails(
        createdAt = createdAt,
        assignee = assignee,
        assigningTeam = assigningTeam,
        lastActivityAt = lastActivityAt,
        lastActivityEditor = lastActivityEditor,
        lastAuthenticatedAt = lastAuthenticatedAt,
        organization = organization,
        pendingCancellationDate = pendingCancellationDate,
        planType = planType,
        updatedAt = updatedAt,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CopilotSeatDetails = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CopilotSeatDetails> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CopilotSeatDetails {
      val jsonDecoder = decoder.requireJsonDecoder("CopilotSeatDetails")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CopilotSeatDetails must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      return CopilotSeatDetails(
        createdAt = createdAt,
        assignee = rawObject["assignee"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        assigningTeam = rawObject["assigning_team"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCopilotSeatDetailsAssigningTeamXbc3ef18b?>(element) },
        lastActivityAt = rawObject["last_activity_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastActivityEditor = rawObject["last_activity_editor"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        lastAuthenticatedAt = rawObject["last_authenticated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        organization = rawObject["organization"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableOrganizationSimple?>(element) },
        pendingCancellationDate = rawObject["pending_cancellation_date"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        planType = rawObject["plan_type"]?.let { json.decodeFromJsonElement<InlineCopilotSeatDetailsPlanTypeXd99f380a>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CopilotSeatDetails) {
      val jsonEncoder = encoder.requireJsonEncoder("CopilotSeatDetails")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        value.assignee?.let { put("assignee", json.encodeToJsonElement(it)) }
        value.assigningTeam?.let { put("assigning_team", json.encodeToJsonElement(it)) }
        value.lastActivityAt?.let { put("last_activity_at", it) }
        value.lastActivityEditor?.let { put("last_activity_editor", it) }
        value.lastAuthenticatedAt?.let { put("last_authenticated_at", it) }
        value.organization?.let { put("organization", json.encodeToJsonElement(it)) }
        value.pendingCancellationDate?.let { put("pending_cancellation_date", it) }
        value.planType?.let { put("plan_type", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun copilotSeatDetails(block: CopilotSeatDetails.Builder.() -> Unit): CopilotSeatDetails = CopilotSeatDetails.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CopilotSeatDetails is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
