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
 * Allow specific users, teams, or apps to bypass pull request requirements.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1branches~1{branch}~1protection~1required_pull_request_r
 * eviews/patch/requestBody/content/application~1json/schema/properties/bypass_pull_request_allowances
 */
@Serializable(with = InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e.Serializer::class)
public class InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e internal constructor(
  appsState: FieldState<List<String>>,
  teamsState: FieldState<List<String>>,
  usersState: FieldState<List<String>>,
) {
  private val appsState: FieldState<List<String>> =
      appsState.copyValue { fieldValue -> fieldValue.toList() }

  private val teamsState: FieldState<List<String>> =
      teamsState.copyValue { fieldValue -> fieldValue.toList() }

  private val usersState: FieldState<List<String>> =
      usersState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * The list of app `slug`s allowed to bypass pull request requirements.
   */
  public val apps: List<String>?
    get() = appsState.valueOrNull()

  /**
   * The list of team `slug`s allowed to bypass pull request requirements.
   */
  public val teams: List<String>?
    get() = teamsState.valueOrNull()

  /**
   * The list of user `login`s allowed to bypass pull request requirements.
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
     * The list of app `slug`s allowed to bypass pull request requirements.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var apps: List<String>?
      get() = appsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "apps is not nullable; call unsetApps() to omit it" }
        appsState = FieldState.Value(present.toList())
      }

    private var teamsState: FieldState<List<String>> = FieldState.Absent

    /**
     * The list of team `slug`s allowed to bypass pull request requirements.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var teams: List<String>?
      get() = teamsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "teams is not nullable; call unsetTeams() to omit it" }
        teamsState = FieldState.Value(present.toList())
      }

    private var usersState: FieldState<List<String>> = FieldState.Absent

    /**
     * The list of user `login`s allowed to bypass pull request requirements.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var users: List<String>?
      get() = usersState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "users is not nullable; call unsetUsers() to omit it" }
        usersState = FieldState.Value(present.toList())
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

    public fun build(): InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e = InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e(
      appsState = appsState,
      teamsState = teamsState,
      usersState = usersState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e must be a JSON object")
      return InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e(
        appsState = json.decodeOptional(rawObject, "apps", nullable = false),
        teamsState = json.decodeOptional(rawObject, "teams", nullable = false),
        usersState = json.decodeOptional(rawObject, "users", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e")
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

public fun inlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e(block: InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e.Builder.() -> Unit): InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e = InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e.build(block)

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
    if (!nullable) throw SerializationException("InlineReposBranchesProtect26a2PatchRequestJsonBypassPullRequestAllde0eX368ac76e property '" + name + "' is not nullable")
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
