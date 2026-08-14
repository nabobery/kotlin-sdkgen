package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.Long
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
 * A codespace.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codespace
 */
@Serializable(with = Codespace.Serializer::class)
public class Codespace internal constructor(
  public val billableOwner: SimpleUser,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * UUID identifying this codespace's environment.
   */
  public val environmentId: String?,
  /**
   * Details about the codespace's git repository.
   */
  public val gitStatus: InlineCodespaceGitStatusXee24c4c8,
  public val id: Long,
  /**
   * The number of minutes of inactivity after which this codespace will be automatically stopped.
   */
  public val idleTimeoutMinutes: Int?,
  /**
   * Last known time this codespace was started.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val lastUsedAt: String,
  /**
   * The initally assigned location of a new codespace.
   */
  public val location: InlineCodespaceLocationXfbc83597,
  public val machine: NullableCodespaceMachine?,
  /**
   * API URL to access available alternate machine types for this codespace.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val machinesUrl: String,
  /**
   * Automatically generated name of this codespace.
   */
  public val name: String,
  public val owner: SimpleUser,
  /**
   * Whether the codespace was created from a prebuild.
   */
  public val prebuild: Boolean?,
  /**
   * API URL for the Pull Request associated with this codespace, if any.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pullsUrl: String?,
  recentFolders: List<String>,
  public val repository: MinimalRepository,
  /**
   * API URL to start this codespace.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val startUrl: String,
  /**
   * State of this codespace.
   */
  public val state: InlineCodespaceStateX055cfe91,
  /**
   * API URL to stop this codespace.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val stopUrl: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * API URL for this codespace.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  /**
   * URL to access this codespace on the web.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val webUrl: String,
  private val devcontainerPathState: FieldState<String?>,
  private val displayNameState: FieldState<String?>,
  private val idleTimeoutNoticeState: FieldState<String?>,
  private val lastKnownStopNoticeState: FieldState<String?>,
  private val pendingOperationState: FieldState<Boolean?>,
  private val pendingOperationDisabledReasonState: FieldState<String?>,
  private val publishUrlState: FieldState<String?>,
  private val retentionExpiresAtState: FieldState<String?>,
  private val retentionPeriodMinutesState: FieldState<Int?>,
  private val runtimeConstraintsState: FieldState<InlineCodespaceRuntimeConstraintsXef2c8d86>,
) {
  public val recentFolders: List<String> = recentFolders.toList()

  /**
   * Path to devcontainer.json from repo root used to create Codespace.
   */
  public val devcontainerPath: String?
    get() = devcontainerPathState.valueOrNull()

  /**
   * Display name for this codespace.
   */
  public val displayName: String?
    get() = displayNameState.valueOrNull()

  /**
   * Text to show user when codespace idle timeout minutes has been overriden by an organization policy
   */
  public val idleTimeoutNotice: String?
    get() = idleTimeoutNoticeState.valueOrNull()

  /**
   * The text to display to a user when a codespace has been stopped for a potentially actionable reason.
   */
  public val lastKnownStopNotice: String?
    get() = lastKnownStopNoticeState.valueOrNull()

  /**
   * Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily
   * unavailable. The only thing that you can do with a codespace in this state is delete it.
   */
  public val pendingOperation: Boolean?
    get() = pendingOperationState.valueOrNull()

  /**
   * Text to show user when codespace is disabled by a pending operation
   */
  public val pendingOperationDisabledReason: String?
    get() = pendingOperationDisabledReasonState.valueOrNull()

  /**
   * API URL to publish this codespace to a new repository.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val publishUrl: String?
    get() = publishUrlState.valueOrNull()

  /**
   * When a codespace will be auto-deleted based on the "retention_period_minutes" and "last_used_at"
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val retentionExpiresAt: String?
    get() = retentionExpiresAtState.valueOrNull()

  /**
   * Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0
   * and 43200 (30 days).
   */
  public val retentionPeriodMinutes: Int?
    get() = retentionPeriodMinutesState.valueOrNull()

  public val runtimeConstraints: InlineCodespaceRuntimeConstraintsXef2c8d86?
    get() = runtimeConstraintsState.valueOrNull()

  public constructor(
    billableOwner: SimpleUser,
    createdAt: String,
    environmentId: String?,
    gitStatus: InlineCodespaceGitStatusXee24c4c8,
    id: Long,
    idleTimeoutMinutes: Int?,
    lastUsedAt: String,
    location: InlineCodespaceLocationXfbc83597,
    machine: NullableCodespaceMachine?,
    machinesUrl: String,
    name: String,
    owner: SimpleUser,
    prebuild: Boolean?,
    pullsUrl: String?,
    recentFolders: List<String>,
    repository: MinimalRepository,
    startUrl: String,
    state: InlineCodespaceStateX055cfe91,
    stopUrl: String,
    updatedAt: String,
    url: String,
    webUrl: String,
  ) : this(billableOwner = billableOwner,
  createdAt = createdAt,
  environmentId = environmentId,
  gitStatus = gitStatus,
  id = id,
  idleTimeoutMinutes = idleTimeoutMinutes,
  lastUsedAt = lastUsedAt,
  location = location,
  machine = machine,
  machinesUrl = machinesUrl,
  name = name,
  owner = owner,
  prebuild = prebuild,
  pullsUrl = pullsUrl,
  recentFolders = recentFolders,
  repository = repository,
  startUrl = startUrl,
  state = state,
  stopUrl = stopUrl,
  updatedAt = updatedAt,
  url = url,
  webUrl = webUrl,
  devcontainerPathState = FieldState.Absent,
  displayNameState = FieldState.Absent,
  idleTimeoutNoticeState = FieldState.Absent,
  lastKnownStopNoticeState = FieldState.Absent,
  pendingOperationState = FieldState.Absent,
  pendingOperationDisabledReasonState = FieldState.Absent,
  publishUrlState = FieldState.Absent,
  retentionExpiresAtState = FieldState.Absent,
  retentionPeriodMinutesState = FieldState.Absent,
  runtimeConstraintsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `devcontainer_path`.
   */
  public fun devcontainerPathPresence(): FieldPresence = devcontainerPathState.presence

  /**
   * Returns the wire presence of `display_name`.
   */
  public fun displayNamePresence(): FieldPresence = displayNameState.presence

  /**
   * Returns the wire presence of `idle_timeout_notice`.
   */
  public fun idleTimeoutNoticePresence(): FieldPresence = idleTimeoutNoticeState.presence

  /**
   * Returns the wire presence of `last_known_stop_notice`.
   */
  public fun lastKnownStopNoticePresence(): FieldPresence = lastKnownStopNoticeState.presence

  /**
   * Returns the wire presence of `pending_operation`.
   */
  public fun pendingOperationPresence(): FieldPresence = pendingOperationState.presence

  /**
   * Returns the wire presence of `pending_operation_disabled_reason`.
   */
  public fun pendingOperationDisabledReasonPresence(): FieldPresence = pendingOperationDisabledReasonState.presence

  /**
   * Returns the wire presence of `publish_url`.
   */
  public fun publishUrlPresence(): FieldPresence = publishUrlState.presence

  /**
   * Returns the wire presence of `retention_expires_at`.
   */
  public fun retentionExpiresAtPresence(): FieldPresence = retentionExpiresAtState.presence

  /**
   * Returns the wire presence of `retention_period_minutes`.
   */
  public fun retentionPeriodMinutesPresence(): FieldPresence = retentionPeriodMinutesState.presence

  /**
   * Returns the wire presence of `runtime_constraints`.
   */
  public fun runtimeConstraintsPresence(): FieldPresence = runtimeConstraintsState.presence

  public class Builder {
    private var billableOwnerValue: SimpleUser? = null

    public var billableOwner: SimpleUser
      get() = requireNotNull(billableOwnerValue) { "billableOwner is required" }
      set(`value`) {
        billableOwnerValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var gitStatusValue: InlineCodespaceGitStatusXee24c4c8? = null

    public var gitStatus: InlineCodespaceGitStatusXee24c4c8
      get() = requireNotNull(gitStatusValue) { "gitStatus is required" }
      set(`value`) {
        gitStatusValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var lastUsedAtValue: String? = null

    public var lastUsedAt: String
      get() = requireNotNull(lastUsedAtValue) { "lastUsedAt is required" }
      set(`value`) {
        lastUsedAtValue = value
      }

    private var locationValue: InlineCodespaceLocationXfbc83597? = null

    public var location: InlineCodespaceLocationXfbc83597
      get() = requireNotNull(locationValue) { "location is required" }
      set(`value`) {
        locationValue = value
      }

    private var machinesUrlValue: String? = null

    public var machinesUrl: String
      get() = requireNotNull(machinesUrlValue) { "machinesUrl is required" }
      set(`value`) {
        machinesUrlValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var ownerValue: SimpleUser? = null

    public var owner: SimpleUser
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    private var recentFoldersValue: List<String>? = null

    public var recentFolders: List<String>
      get() = requireNotNull(recentFoldersValue) { "recentFolders is required" }.toList()
      set(`value`) {
        recentFoldersValue = value.toList()
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    private var startUrlValue: String? = null

    public var startUrl: String
      get() = requireNotNull(startUrlValue) { "startUrl is required" }
      set(`value`) {
        startUrlValue = value
      }

    private var stateValue: InlineCodespaceStateX055cfe91? = null

    public var state: InlineCodespaceStateX055cfe91
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var stopUrlValue: String? = null

    public var stopUrl: String
      get() = requireNotNull(stopUrlValue) { "stopUrl is required" }
      set(`value`) {
        stopUrlValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var webUrlValue: String? = null

    public var webUrl: String
      get() = requireNotNull(webUrlValue) { "webUrl is required" }
      set(`value`) {
        webUrlValue = value
      }

    private var environmentIdState: FieldState<String?> = FieldState.Absent

    /**
     * UUID identifying this codespace's environment.
     * Required nullable field; assigning `null` records present-null.
     */
    public var environmentId: String?
      get() = environmentIdState.valueOrNull()
      set(`value`) {
        environmentIdState = value.toNullableFieldState()
      }

    private var idleTimeoutMinutesState: FieldState<Int?> = FieldState.Absent

    /**
     * The number of minutes of inactivity after which this codespace will be automatically stopped.
     * Required nullable field; assigning `null` records present-null.
     */
    public var idleTimeoutMinutes: Int?
      get() = idleTimeoutMinutesState.valueOrNull()
      set(`value`) {
        idleTimeoutMinutesState = value.toNullableFieldState()
      }

    private var machineState: FieldState<NullableCodespaceMachine?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var machine: NullableCodespaceMachine?
      get() = machineState.valueOrNull()
      set(`value`) {
        machineState = value.toNullableFieldState()
      }

    private var prebuildState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether the codespace was created from a prebuild.
     * Required nullable field; assigning `null` records present-null.
     */
    public var prebuild: Boolean?
      get() = prebuildState.valueOrNull()
      set(`value`) {
        prebuildState = value.toNullableFieldState()
      }

    private var pullsUrlState: FieldState<String?> = FieldState.Absent

    /**
     * API URL for the Pull Request associated with this codespace, if any.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Required nullable field; assigning `null` records present-null.
     */
    public var pullsUrl: String?
      get() = pullsUrlState.valueOrNull()
      set(`value`) {
        pullsUrlState = value.toNullableFieldState()
      }

    private var devcontainerPathState: FieldState<String?> = FieldState.Absent

    /**
     * Path to devcontainer.json from repo root used to create Codespace.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var devcontainerPath: String?
      get() = devcontainerPathState.valueOrNull()
      set(`value`) {
        devcontainerPathState = value.toNullableFieldState()
      }

    private var displayNameState: FieldState<String?> = FieldState.Absent

    /**
     * Display name for this codespace.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var displayName: String?
      get() = displayNameState.valueOrNull()
      set(`value`) {
        displayNameState = value.toNullableFieldState()
      }

    private var idleTimeoutNoticeState: FieldState<String?> = FieldState.Absent

    /**
     * Text to show user when codespace idle timeout minutes has been overriden by an organization policy
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var idleTimeoutNotice: String?
      get() = idleTimeoutNoticeState.valueOrNull()
      set(`value`) {
        idleTimeoutNoticeState = value.toNullableFieldState()
      }

    private var lastKnownStopNoticeState: FieldState<String?> = FieldState.Absent

    /**
     * The text to display to a user when a codespace has been stopped for a potentially actionable reason.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var lastKnownStopNotice: String?
      get() = lastKnownStopNoticeState.valueOrNull()
      set(`value`) {
        lastKnownStopNoticeState = value.toNullableFieldState()
      }

    private var pendingOperationState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily
     * unavailable. The only thing that you can do with a codespace in this state is delete it.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pendingOperation: Boolean?
      get() = pendingOperationState.valueOrNull()
      set(`value`) {
        pendingOperationState = value.toNullableFieldState()
      }

    private var pendingOperationDisabledReasonState: FieldState<String?> = FieldState.Absent

    /**
     * Text to show user when codespace is disabled by a pending operation
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var pendingOperationDisabledReason: String?
      get() = pendingOperationDisabledReasonState.valueOrNull()
      set(`value`) {
        pendingOperationDisabledReasonState = value.toNullableFieldState()
      }

    private var publishUrlState: FieldState<String?> = FieldState.Absent

    /**
     * API URL to publish this codespace to a new repository.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var publishUrl: String?
      get() = publishUrlState.valueOrNull()
      set(`value`) {
        publishUrlState = value.toNullableFieldState()
      }

    private var retentionExpiresAtState: FieldState<String?> = FieldState.Absent

    /**
     * When a codespace will be auto-deleted based on the "retention_period_minutes" and "last_used_at"
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var retentionExpiresAt: String?
      get() = retentionExpiresAtState.valueOrNull()
      set(`value`) {
        retentionExpiresAtState = value.toNullableFieldState()
      }

    private var retentionPeriodMinutesState: FieldState<Int?> = FieldState.Absent

    /**
     * Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0
     * and 43200 (30 days).
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var retentionPeriodMinutes: Int?
      get() = retentionPeriodMinutesState.valueOrNull()
      set(`value`) {
        retentionPeriodMinutesState = value.toNullableFieldState()
      }

    private var runtimeConstraintsState: FieldState<InlineCodespaceRuntimeConstraintsXef2c8d86> =
        FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var runtimeConstraints: InlineCodespaceRuntimeConstraintsXef2c8d86?
      get() = runtimeConstraintsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "runtimeConstraints is not nullable; call unsetRuntimeConstraints() to omit it" }
        runtimeConstraintsState = FieldState.Value(present)
      }

    /**
     * Omits `devcontainer_path` from serialized output.
     */
    public fun unsetDevcontainerPath() {
      devcontainerPathState = FieldState.Absent
    }

    /**
     * Omits `display_name` from serialized output.
     */
    public fun unsetDisplayName() {
      displayNameState = FieldState.Absent
    }

    /**
     * Omits `idle_timeout_notice` from serialized output.
     */
    public fun unsetIdleTimeoutNotice() {
      idleTimeoutNoticeState = FieldState.Absent
    }

    /**
     * Omits `last_known_stop_notice` from serialized output.
     */
    public fun unsetLastKnownStopNotice() {
      lastKnownStopNoticeState = FieldState.Absent
    }

    /**
     * Omits `pending_operation` from serialized output.
     */
    public fun unsetPendingOperation() {
      pendingOperationState = FieldState.Absent
    }

    /**
     * Omits `pending_operation_disabled_reason` from serialized output.
     */
    public fun unsetPendingOperationDisabledReason() {
      pendingOperationDisabledReasonState = FieldState.Absent
    }

    /**
     * Omits `publish_url` from serialized output.
     */
    public fun unsetPublishUrl() {
      publishUrlState = FieldState.Absent
    }

    /**
     * Omits `retention_expires_at` from serialized output.
     */
    public fun unsetRetentionExpiresAt() {
      retentionExpiresAtState = FieldState.Absent
    }

    /**
     * Omits `retention_period_minutes` from serialized output.
     */
    public fun unsetRetentionPeriodMinutes() {
      retentionPeriodMinutesState = FieldState.Absent
    }

    /**
     * Omits `runtime_constraints` from serialized output.
     */
    public fun unsetRuntimeConstraints() {
      runtimeConstraintsState = FieldState.Absent
    }

    public fun build(): Codespace {
      check(billableOwnerValue != null) { "billableOwner is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(gitStatusValue != null) { "gitStatus is required" }
      check(idValue != null) { "id is required" }
      check(lastUsedAtValue != null) { "lastUsedAt is required" }
      check(locationValue != null) { "location is required" }
      check(machinesUrlValue != null) { "machinesUrl is required" }
      check(nameValue != null) { "name is required" }
      check(ownerValue != null) { "owner is required" }
      check(recentFoldersValue != null) { "recentFolders is required" }
      check(repositoryValue != null) { "repository is required" }
      check(startUrlValue != null) { "startUrl is required" }
      check(stateValue != null) { "state is required" }
      check(stopUrlValue != null) { "stopUrl is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(webUrlValue != null) { "webUrl is required" }
      check(environmentIdState !== FieldState.Absent) { "environmentId is required, even when null" }
      check(idleTimeoutMinutesState !== FieldState.Absent) { "idleTimeoutMinutes is required, even when null" }
      check(machineState !== FieldState.Absent) { "machine is required, even when null" }
      check(prebuildState !== FieldState.Absent) { "prebuild is required, even when null" }
      check(pullsUrlState !== FieldState.Absent) { "pullsUrl is required, even when null" }
      return Codespace(
        billableOwner = billableOwner,
        createdAt = createdAt,
        environmentId = environmentIdState.valueOrNull(),
        gitStatus = gitStatus,
        id = id,
        idleTimeoutMinutes = idleTimeoutMinutesState.valueOrNull(),
        lastUsedAt = lastUsedAt,
        location = location,
        machine = machineState.valueOrNull(),
        machinesUrl = machinesUrl,
        name = name,
        owner = owner,
        prebuild = prebuildState.valueOrNull(),
        pullsUrl = pullsUrlState.valueOrNull(),
        recentFolders = recentFolders,
        repository = repository,
        startUrl = startUrl,
        state = state,
        stopUrl = stopUrl,
        updatedAt = updatedAt,
        url = url,
        webUrl = webUrl,
        devcontainerPathState = devcontainerPathState,
        displayNameState = displayNameState,
        idleTimeoutNoticeState = idleTimeoutNoticeState,
        lastKnownStopNoticeState = lastKnownStopNoticeState,
        pendingOperationState = pendingOperationState,
        pendingOperationDisabledReasonState = pendingOperationDisabledReasonState,
        publishUrlState = publishUrlState,
        retentionExpiresAtState = retentionExpiresAtState,
        retentionPeriodMinutesState = retentionPeriodMinutesState,
        runtimeConstraintsState = runtimeConstraintsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Codespace = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<Codespace> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Codespace {
      val jsonDecoder = decoder.requireJsonDecoder("Codespace")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Codespace must be a JSON object")
      val billableOwner = json.decodeRequired<SimpleUser>(rawObject, "billable_owner")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val gitStatus = json.decodeRequired<InlineCodespaceGitStatusXee24c4c8>(rawObject, "git_status")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val lastUsedAt = json.decodeRequired<String>(rawObject, "last_used_at")
      val location = json.decodeRequired<InlineCodespaceLocationXfbc83597>(rawObject, "location")
      val machinesUrl = json.decodeRequired<String>(rawObject, "machines_url")
      val name = json.decodeRequired<String>(rawObject, "name")
      val owner = json.decodeRequired<SimpleUser>(rawObject, "owner")
      val recentFolders = json.decodeRequired<List<String>>(rawObject, "recent_folders")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      val startUrl = json.decodeRequired<String>(rawObject, "start_url")
      val state = json.decodeRequired<InlineCodespaceStateX055cfe91>(rawObject, "state")
      val stopUrl = json.decodeRequired<String>(rawObject, "stop_url")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      val webUrl = json.decodeRequired<String>(rawObject, "web_url")
      if (!rawObject.containsKey("environment_id")) {
        throw SerializationException("Codespace is missing required property 'environment_id'")
      }
      val environmentId = rawObject["environment_id"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("idle_timeout_minutes")) {
        throw SerializationException("Codespace is missing required property 'idle_timeout_minutes'")
      }
      val idleTimeoutMinutes = rawObject["idle_timeout_minutes"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("machine")) {
        throw SerializationException("Codespace is missing required property 'machine'")
      }
      val machine = rawObject["machine"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableCodespaceMachine?>(requireNotNull(element)) }
      if (!rawObject.containsKey("prebuild")) {
        throw SerializationException("Codespace is missing required property 'prebuild'")
      }
      val prebuild = rawObject["prebuild"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(requireNotNull(element)) }
      if (!rawObject.containsKey("pulls_url")) {
        throw SerializationException("Codespace is missing required property 'pulls_url'")
      }
      val pullsUrl = rawObject["pulls_url"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return Codespace(
        billableOwner = billableOwner,
        createdAt = createdAt,
        environmentId = environmentId,
        gitStatus = gitStatus,
        id = id,
        idleTimeoutMinutes = idleTimeoutMinutes,
        lastUsedAt = lastUsedAt,
        location = location,
        machine = machine,
        machinesUrl = machinesUrl,
        name = name,
        owner = owner,
        prebuild = prebuild,
        pullsUrl = pullsUrl,
        recentFolders = recentFolders,
        repository = repository,
        startUrl = startUrl,
        state = state,
        stopUrl = stopUrl,
        updatedAt = updatedAt,
        url = url,
        webUrl = webUrl,
        devcontainerPathState = json.decodeOptional(rawObject, "devcontainer_path", nullable = true),
        displayNameState = json.decodeOptional(rawObject, "display_name", nullable = true),
        idleTimeoutNoticeState = json.decodeOptional(rawObject, "idle_timeout_notice", nullable = true),
        lastKnownStopNoticeState = json.decodeOptional(rawObject, "last_known_stop_notice", nullable = true),
        pendingOperationState = json.decodeOptional(rawObject, "pending_operation", nullable = true),
        pendingOperationDisabledReasonState = json.decodeOptional(rawObject, "pending_operation_disabled_reason", nullable = true),
        publishUrlState = json.decodeOptional(rawObject, "publish_url", nullable = true),
        retentionExpiresAtState = json.decodeOptional(rawObject, "retention_expires_at", nullable = true),
        retentionPeriodMinutesState = json.decodeOptional(rawObject, "retention_period_minutes", nullable = true),
        runtimeConstraintsState = json.decodeOptional(rawObject, "runtime_constraints", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Codespace) {
      val jsonEncoder = encoder.requireJsonEncoder("Codespace")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("billable_owner", json.encodeToJsonElement(value.billableOwner))
        put("created_at", value.createdAt)
        put("environment_id", value.environmentId?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("git_status", json.encodeToJsonElement(value.gitStatus))
        put("id", json.encodeToJsonElement(value.id))
        put("idle_timeout_minutes", value.idleTimeoutMinutes?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("last_used_at", value.lastUsedAt)
        put("location", json.encodeToJsonElement(value.location))
        put("machine", value.machine?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("machines_url", value.machinesUrl)
        put("name", value.name)
        put("owner", json.encodeToJsonElement(value.owner))
        put("prebuild", value.prebuild?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("pulls_url", value.pullsUrl?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("recent_folders", json.encodeToJsonElement(value.recentFolders))
        put("repository", json.encodeToJsonElement(value.repository))
        put("start_url", value.startUrl)
        put("state", json.encodeToJsonElement(value.state))
        put("stop_url", value.stopUrl)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        put("web_url", value.webUrl)
        putState("devcontainer_path", value.devcontainerPathState, json::encodeToJsonElement)
        putState("display_name", value.displayNameState, json::encodeToJsonElement)
        putState("idle_timeout_notice", value.idleTimeoutNoticeState, json::encodeToJsonElement)
        putState("last_known_stop_notice", value.lastKnownStopNoticeState, json::encodeToJsonElement)
        putState("pending_operation", value.pendingOperationState, json::encodeToJsonElement)
        putState("pending_operation_disabled_reason", value.pendingOperationDisabledReasonState, json::encodeToJsonElement)
        putState("publish_url", value.publishUrlState, json::encodeToJsonElement)
        putState("retention_expires_at", value.retentionExpiresAtState, json::encodeToJsonElement)
        putState("retention_period_minutes", value.retentionPeriodMinutesState, json::encodeToJsonElement)
        putState("runtime_constraints", value.runtimeConstraintsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codespace(block: Codespace.Builder.() -> Unit): Codespace = Codespace.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Codespace is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Codespace property '" + name + "' is not nullable")
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
