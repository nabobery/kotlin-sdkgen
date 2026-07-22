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
 * Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object
 * to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this
 * parameter for personal repositories.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_pull_request_r
 * eviews/patch/requestBody/content/application~1json/schema/properties/dismissal_restrictions
 */
@Serializable(with = InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05.Serializer::class)
public class InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05 internal constructor(
  private val appsState: FieldState<List<String>>,
  private val teamsState: FieldState<List<String>>,
  private val usersState: FieldState<List<String>>,
) {
  /**
   * The list of app `slug`s with dismissal access
   */
  public val apps: List<String>?
    get() = appsState.valueOrNull()

  /**
   * The list of team `slug`s with dismissal access
   */
  public val teams: List<String>?
    get() = teamsState.valueOrNull()

  /**
   * The list of user `login`s with dismissal access
   */
  public val users: List<String>?
    get() = usersState.valueOrNull()

  public constructor() : this(appsState = FieldState.Absent,
  teamsState = FieldState.Absent,
  usersState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `apps`.
   */
  public fun appsPresence(): FieldPresence = appsState.presence

  /**
   * Returns the wire presence of `teams`.
   */
  public fun teamsPresence(): FieldPresence = teamsState.presence

  /**
   * Returns the wire presence of `users`.
   */
  public fun usersPresence(): FieldPresence = usersState.presence

  public class Builder {
    private var appsState: FieldState<List<String>> = FieldState.Absent

    /**
     * The list of app `slug`s with dismissal access
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var apps: List<String>?
      get() = appsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "apps is not nullable; call unsetApps() to omit it" }
        appsState = FieldState.Value(present)
      }

    private var teamsState: FieldState<List<String>> = FieldState.Absent

    /**
     * The list of team `slug`s with dismissal access
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var teams: List<String>?
      get() = teamsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "teams is not nullable; call unsetTeams() to omit it" }
        teamsState = FieldState.Value(present)
      }

    private var usersState: FieldState<List<String>> = FieldState.Absent

    /**
     * The list of user `login`s with dismissal access
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var users: List<String>?
      get() = usersState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "users is not nullable; call unsetUsers() to omit it" }
        usersState = FieldState.Value(present)
      }

    /**
     * Omits `apps` from serialized output.
     */
    public fun unsetApps() {
      appsState = FieldState.Absent
    }

    /**
     * Omits `teams` from serialized output.
     */
    public fun unsetTeams() {
      teamsState = FieldState.Absent
    }

    /**
     * Omits `users` from serialized output.
     */
    public fun unsetUsers() {
      usersState = FieldState.Absent
    }

    public fun build(): InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05 = InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05(
      appsState = appsState,
      teamsState = teamsState,
      usersState = usersState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05 must be a JSON object")
      return InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05(
        appsState = json.decodeOptional(rawObject, "apps", nullable = false),
        teamsState = json.decodeOptional(rawObject, "teams", nullable = false),
        usersState = json.decodeOptional(rawObject, "users", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("apps", value.appsState, json::encodeToJsonElement)
        putState("teams", value.teamsState, json::encodeToJsonElement)
        putState("users", value.usersState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05(block: InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05.Builder.() -> Unit): InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05 = InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposBranchesProtect26a2PatchRequestJsonDismissalRestrictionsX9c6b5e05 property '" + name + "' is not nullable")
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
