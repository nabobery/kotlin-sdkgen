package io.github.nabobery.sdkgen.github.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-update
 */
@Serializable(with = RepositoryAdvisoryUpdate.Serializer::class)
public class RepositoryAdvisoryUpdate internal constructor(
  collaboratingTeamsState: FieldState<List<String>?>,
  collaboratingUsersState: FieldState<List<String>?>,
  creditsState: FieldState<List<InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100>?>,
  private val cveIdState: FieldState<String?>,
  private val cvssVectorStringState: FieldState<String?>,
  cweIdsState: FieldState<List<String>?>,
  private val descriptionState: FieldState<String>,
  private val severityState: FieldState<InlineRepositoryAdvisoryUpdateSeverityX55381364?>,
  private val stateState: FieldState<InlineRepositoryAdvisoryUpdateStateXd365a7d6>,
  private val summaryState: FieldState<String>,
  vulnerabilitiesState: FieldState<List<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba>>,
) {
  private val collaboratingTeamsState: FieldState<List<String>?> =
      collaboratingTeamsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val collaboratingUsersState: FieldState<List<String>?> =
      collaboratingUsersState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val creditsState: FieldState<List<InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100>?> =
      creditsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val cweIdsState: FieldState<List<String>?> =
      cweIdsState.copyValue { fieldValue -> fieldValue?.let { collection0 -> collection0.toList() } }

  private val vulnerabilitiesState:
      FieldState<List<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba>> =
      vulnerabilitiesState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * A list of team slugs which have been granted write access to the advisory.
   */
  public val collaboratingTeams: List<String>?
    get() = collaboratingTeamsState.valueOrNull()

  /**
   * A list of usernames who have been granted write access to the advisory.
   */
  public val collaboratingUsers: List<String>?
    get() = collaboratingUsersState.valueOrNull()

  /**
   * A list of users receiving credit for their participation in the security advisory.
   */
  public val credits: List<InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100>?
    get() = creditsState.valueOrNull()

  /**
   * The Common Vulnerabilities and Exposures (CVE) ID.
   */
  public val cveId: String?
    get() = cveIdState.valueOrNull()

  /**
   * The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or
   * `severity`.
   */
  public val cvssVectorString: String?
    get() = cvssVectorStringState.valueOrNull()

  /**
   * A list of Common Weakness Enumeration (CWE) IDs.
   */
  public val cweIds: List<String>?
    get() = cweIdsState.valueOrNull()

  /**
   * A detailed description of what the advisory impacts.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
   */
  public val severity: InlineRepositoryAdvisoryUpdateSeverityX55381364?
    get() = severityState.valueOrNull()

  /**
   * The state of the advisory.
   */
  public val state: InlineRepositoryAdvisoryUpdateStateXd365a7d6?
    get() = stateState.valueOrNull()

  /**
   * A short summary of the advisory.
   */
  public val summary: String?
    get() = summaryState.valueOrNull()

  /**
   * A product affected by the vulnerability detailed in a repository security advisory.
   */
  public val vulnerabilities: List<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba>?
    get() = vulnerabilitiesState.valueOrNull()

  public constructor() : this(collaboratingTeamsState = FieldState.Absent,
  collaboratingUsersState = FieldState.Absent,
  creditsState = FieldState.Absent,
  cveIdState = FieldState.Absent,
  cvssVectorStringState = FieldState.Absent,
  cweIdsState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  severityState = FieldState.Absent,
  stateState = FieldState.Absent,
  summaryState = FieldState.Absent,
  vulnerabilitiesState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `collaborating_teams`.
   */
  public fun collaboratingTeamsPresence(): FieldPresence = collaboratingTeamsState.presence

  /**
   * Returns the wire presence of `collaborating_users`.
   */
  public fun collaboratingUsersPresence(): FieldPresence = collaboratingUsersState.presence

  /**
   * Returns the wire presence of `credits`.
   */
  public fun creditsPresence(): FieldPresence = creditsState.presence

  /**
   * Returns the wire presence of `cve_id`.
   */
  public fun cveIdPresence(): FieldPresence = cveIdState.presence

  /**
   * Returns the wire presence of `cvss_vector_string`.
   */
  public fun cvssVectorStringPresence(): FieldPresence = cvssVectorStringState.presence

  /**
   * Returns the wire presence of `cwe_ids`.
   */
  public fun cweIdsPresence(): FieldPresence = cweIdsState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `severity`.
   */
  public fun severityPresence(): FieldPresence = severityState.presence

  /**
   * Returns the wire presence of `state`.
   */
  public fun statePresence(): FieldPresence = stateState.presence

  /**
   * Returns the wire presence of `summary`.
   */
  public fun summaryPresence(): FieldPresence = summaryState.presence

  /**
   * Returns the wire presence of `vulnerabilities`.
   */
  public fun vulnerabilitiesPresence(): FieldPresence = vulnerabilitiesState.presence

  public class Builder {
    private var collaboratingTeamsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * A list of team slugs which have been granted write access to the advisory.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var collaboratingTeams: List<String>?
      get() = collaboratingTeamsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        collaboratingTeamsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var collaboratingUsersState: FieldState<List<String>?> = FieldState.Absent

    /**
     * A list of usernames who have been granted write access to the advisory.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var collaboratingUsers: List<String>?
      get() = collaboratingUsersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        collaboratingUsersState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var creditsState: FieldState<List<InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100>?>
        = FieldState.Absent

    /**
     * A list of users receiving credit for their participation in the security advisory.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var credits: List<InlineRepositoryAdvisoryUpdateCreditsItemXc1b70100>?
      get() = creditsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        creditsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var cveIdState: FieldState<String?> = FieldState.Absent

    /**
     * The Common Vulnerabilities and Exposures (CVE) ID.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var cveId: String?
      get() = cveIdState.valueOrNull()
      set(`value`) {
        cveIdState = value.toNullableFieldState()
      }

    private var cvssVectorStringState: FieldState<String?> = FieldState.Absent

    /**
     * The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or
     * `severity`.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var cvssVectorString: String?
      get() = cvssVectorStringState.valueOrNull()
      set(`value`) {
        cvssVectorStringState = value.toNullableFieldState()
      }

    private var cweIdsState: FieldState<List<String>?> = FieldState.Absent

    /**
     * A list of Common Weakness Enumeration (CWE) IDs.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var cweIds: List<String>?
      get() = cweIdsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        cweIdsState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * A detailed description of what the advisory impacts.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var severityState: FieldState<InlineRepositoryAdvisoryUpdateSeverityX55381364?> =
        FieldState.Absent

    /**
     * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var severity: InlineRepositoryAdvisoryUpdateSeverityX55381364?
      get() = severityState.valueOrNull()
      set(`value`) {
        severityState = value.toNullableFieldState()
      }

    private var stateState: FieldState<InlineRepositoryAdvisoryUpdateStateXd365a7d6> =
        FieldState.Absent

    /**
     * The state of the advisory.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var state: InlineRepositoryAdvisoryUpdateStateXd365a7d6?
      get() = stateState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "state is not nullable; call unsetState() to omit it" }
        stateState = FieldState.Value(present)
      }

    private var summaryState: FieldState<String> = FieldState.Absent

    /**
     * A short summary of the advisory.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var summary: String?
      get() = summaryState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "summary is not nullable; call unsetSummary() to omit it" }
        summaryState = FieldState.Value(present)
      }

    private var vulnerabilitiesState:
        FieldState<List<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba>> =
        FieldState.Absent

    /**
     * A product affected by the vulnerability detailed in a repository security advisory.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var vulnerabilities: List<InlineRepositoryAdvisoryUpdateVulnerabilitiesItemX540dfaba>?
      get() = vulnerabilitiesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "vulnerabilities is not nullable; call unsetVulnerabilities() to omit it" }
        vulnerabilitiesState = FieldState.Value(present.toList())
      }

    /**
     * Omits `collaborating_teams` from serialized output.
     */
    public fun unsetCollaboratingTeams() {
      collaboratingTeamsState = FieldState.Absent
    }

    /**
     * Omits `collaborating_users` from serialized output.
     */
    public fun unsetCollaboratingUsers() {
      collaboratingUsersState = FieldState.Absent
    }

    /**
     * Omits `credits` from serialized output.
     */
    public fun unsetCredits() {
      creditsState = FieldState.Absent
    }

    /**
     * Omits `cve_id` from serialized output.
     */
    public fun unsetCveId() {
      cveIdState = FieldState.Absent
    }

    /**
     * Omits `cvss_vector_string` from serialized output.
     */
    public fun unsetCvssVectorString() {
      cvssVectorStringState = FieldState.Absent
    }

    /**
     * Omits `cwe_ids` from serialized output.
     */
    public fun unsetCweIds() {
      cweIdsState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `severity` from serialized output.
     */
    public fun unsetSeverity() {
      severityState = FieldState.Absent
    }

    /**
     * Omits `state` from serialized output.
     */
    public fun unsetState() {
      stateState = FieldState.Absent
    }

    /**
     * Omits `summary` from serialized output.
     */
    public fun unsetSummary() {
      summaryState = FieldState.Absent
    }

    /**
     * Omits `vulnerabilities` from serialized output.
     */
    public fun unsetVulnerabilities() {
      vulnerabilitiesState = FieldState.Absent
    }

    public fun build(): RepositoryAdvisoryUpdate = RepositoryAdvisoryUpdate(
      collaboratingTeamsState = collaboratingTeamsState,
      collaboratingUsersState = collaboratingUsersState,
      creditsState = creditsState,
      cveIdState = cveIdState,
      cvssVectorStringState = cvssVectorStringState,
      cweIdsState = cweIdsState,
      descriptionState = descriptionState,
      severityState = severityState,
      stateState = stateState,
      summaryState = summaryState,
      vulnerabilitiesState = vulnerabilitiesState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryAdvisoryUpdate = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryAdvisoryUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryAdvisoryUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryAdvisoryUpdate")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryAdvisoryUpdate must be a JSON object")
      return RepositoryAdvisoryUpdate(
        collaboratingTeamsState = json.decodeOptional(rawObject, "collaborating_teams", nullable = true),
        collaboratingUsersState = json.decodeOptional(rawObject, "collaborating_users", nullable = true),
        creditsState = json.decodeOptional(rawObject, "credits", nullable = true),
        cveIdState = json.decodeOptional(rawObject, "cve_id", nullable = true),
        cvssVectorStringState = json.decodeOptional(rawObject, "cvss_vector_string", nullable = true),
        cweIdsState = json.decodeOptional(rawObject, "cwe_ids", nullable = true),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        severityState = json.decodeOptional(rawObject, "severity", nullable = true),
        stateState = json.decodeOptional(rawObject, "state", nullable = false),
        summaryState = json.decodeOptional(rawObject, "summary", nullable = false),
        vulnerabilitiesState = json.decodeOptional(rawObject, "vulnerabilities", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryAdvisoryUpdate) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryAdvisoryUpdate")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("collaborating_teams", value.collaboratingTeamsState, json::encodeToJsonElement)
        putState("collaborating_users", value.collaboratingUsersState, json::encodeToJsonElement)
        putState("credits", value.creditsState, json::encodeToJsonElement)
        putState("cve_id", value.cveIdState, json::encodeToJsonElement)
        putState("cvss_vector_string", value.cvssVectorStringState, json::encodeToJsonElement)
        putState("cwe_ids", value.cweIdsState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("severity", value.severityState, json::encodeToJsonElement)
        putState("state", value.stateState, json::encodeToJsonElement)
        putState("summary", value.summaryState, json::encodeToJsonElement)
        putState("vulnerabilities", value.vulnerabilitiesState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryAdvisoryUpdate(block: RepositoryAdvisoryUpdate.Builder.() -> Unit): RepositoryAdvisoryUpdate = RepositoryAdvisoryUpdate.build(block)

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
    if (!nullable) throw SerializationException("RepositoryAdvisoryUpdate property '" + name + "' is not nullable")
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
