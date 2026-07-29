package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * A migration.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/migration
 */
@Serializable(with = Migration.Serializer::class)
public class Migration internal constructor(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  public val excludeAttachments: Boolean,
  public val excludeGitData: Boolean,
  public val excludeMetadata: Boolean,
  public val excludeOwnerProjects: Boolean,
  public val excludeReleases: Boolean,
  public val guid: String,
  public val id: Long,
  public val lockRepositories: Boolean,
  public val nodeId: String,
  public val orgMetadataOnly: Boolean,
  public val owner: NullableSimpleUser?,
  repositories: List<Repository>,
  public val state: String,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String,
  private val archiveUrlState: FieldState<String>,
  excludeState: FieldState<List<String>>,
) {
  /**
   * The repositories included in the migration. Only returned for export migrations.
   */
  public val repositories: List<Repository> = repositories.toList()

  private val excludeState: FieldState<List<String>> =
      excludeState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val archiveUrl: String?
    get() = archiveUrlState.valueOrNull()

  /**
   * Exclude related items from being returned in the response in order to improve performance of the request. The array
   * can include any of: `"repositories"`.
   */
  public val exclude: List<String>?
    get() = excludeState.valueOrNull()

  public constructor(
    createdAt: String,
    excludeAttachments: Boolean,
    excludeGitData: Boolean,
    excludeMetadata: Boolean,
    excludeOwnerProjects: Boolean,
    excludeReleases: Boolean,
    guid: String,
    id: Long,
    lockRepositories: Boolean,
    nodeId: String,
    orgMetadataOnly: Boolean,
    owner: NullableSimpleUser?,
    repositories: List<Repository>,
    state: String,
    updatedAt: String,
    url: String,
  ) : this(createdAt = createdAt,
  excludeAttachments = excludeAttachments,
  excludeGitData = excludeGitData,
  excludeMetadata = excludeMetadata,
  excludeOwnerProjects = excludeOwnerProjects,
  excludeReleases = excludeReleases,
  guid = guid,
  id = id,
  lockRepositories = lockRepositories,
  nodeId = nodeId,
  orgMetadataOnly = orgMetadataOnly,
  owner = owner,
  repositories = repositories,
  state = state,
  updatedAt = updatedAt,
  url = url,
  archiveUrlState = FieldState.Absent,
  excludeState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `archive_url`.
   */
  public fun archiveUrlPresence(): FieldPresence = archiveUrlState.presence

  /**
   * Returns the wire presence of `exclude`.
   */
  public fun excludePresence(): FieldPresence = excludeState.presence

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var excludeAttachmentsValue: Boolean? = null

    public var excludeAttachments: Boolean
      get() = requireNotNull(excludeAttachmentsValue) { "excludeAttachments is required" }
      set(`value`) {
        excludeAttachmentsValue = value
      }

    private var excludeGitDataValue: Boolean? = null

    public var excludeGitData: Boolean
      get() = requireNotNull(excludeGitDataValue) { "excludeGitData is required" }
      set(`value`) {
        excludeGitDataValue = value
      }

    private var excludeMetadataValue: Boolean? = null

    public var excludeMetadata: Boolean
      get() = requireNotNull(excludeMetadataValue) { "excludeMetadata is required" }
      set(`value`) {
        excludeMetadataValue = value
      }

    private var excludeOwnerProjectsValue: Boolean? = null

    public var excludeOwnerProjects: Boolean
      get() = requireNotNull(excludeOwnerProjectsValue) { "excludeOwnerProjects is required" }
      set(`value`) {
        excludeOwnerProjectsValue = value
      }

    private var excludeReleasesValue: Boolean? = null

    public var excludeReleases: Boolean
      get() = requireNotNull(excludeReleasesValue) { "excludeReleases is required" }
      set(`value`) {
        excludeReleasesValue = value
      }

    private var guidValue: String? = null

    public var guid: String
      get() = requireNotNull(guidValue) { "guid is required" }
      set(`value`) {
        guidValue = value
      }

    private var idValue: Long? = null

    public var id: Long
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var lockRepositoriesValue: Boolean? = null

    public var lockRepositories: Boolean
      get() = requireNotNull(lockRepositoriesValue) { "lockRepositories is required" }
      set(`value`) {
        lockRepositoriesValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var orgMetadataOnlyValue: Boolean? = null

    public var orgMetadataOnly: Boolean
      get() = requireNotNull(orgMetadataOnlyValue) { "orgMetadataOnly is required" }
      set(`value`) {
        orgMetadataOnlyValue = value
      }

    private var repositoriesValue: List<Repository>? = null

    public var repositories: List<Repository>
      get() = requireNotNull(repositoriesValue) { "repositories is required" }.toList()
      set(`value`) {
        repositoriesValue = value.toList()
      }

    private var stateValue: String? = null

    public var state: String
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

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var ownerState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var owner: NullableSimpleUser?
      get() = ownerState.valueOrNull()
      set(`value`) {
        ownerState = value.toNullableFieldState()
      }

    private var archiveUrlState: FieldState<String> = FieldState.Absent

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var archiveUrl: String?
      get() = archiveUrlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "archiveUrl is not nullable; call unsetArchiveUrl() to omit it" }
        archiveUrlState = FieldState.Value(present)
      }

    private var excludeState: FieldState<List<String>> = FieldState.Absent

    /**
     * Exclude related items from being returned in the response in order to improve performance of the request. The
     * array can include any of: `"repositories"`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var exclude: List<String>?
      get() = excludeState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "exclude is not nullable; call unsetExclude() to omit it" }
        excludeState = FieldState.Value(present.toList())
      }

    /**
     * Omits `archive_url` from serialized output.
     */
    public fun unsetArchiveUrl() {
      archiveUrlState = FieldState.Absent
    }

    /**
     * Omits `exclude` from serialized output.
     */
    public fun unsetExclude() {
      excludeState = FieldState.Absent
    }

    public fun build(): Migration {
      check(createdAtValue != null) { "createdAt is required" }
      check(excludeAttachmentsValue != null) { "excludeAttachments is required" }
      check(excludeGitDataValue != null) { "excludeGitData is required" }
      check(excludeMetadataValue != null) { "excludeMetadata is required" }
      check(excludeOwnerProjectsValue != null) { "excludeOwnerProjects is required" }
      check(excludeReleasesValue != null) { "excludeReleases is required" }
      check(guidValue != null) { "guid is required" }
      check(idValue != null) { "id is required" }
      check(lockRepositoriesValue != null) { "lockRepositories is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(orgMetadataOnlyValue != null) { "orgMetadataOnly is required" }
      check(repositoriesValue != null) { "repositories is required" }
      check(stateValue != null) { "state is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(ownerState !== FieldState.Absent) { "owner is required, even when null" }
      return Migration(
        createdAt = createdAt,
        excludeAttachments = excludeAttachments,
        excludeGitData = excludeGitData,
        excludeMetadata = excludeMetadata,
        excludeOwnerProjects = excludeOwnerProjects,
        excludeReleases = excludeReleases,
        guid = guid,
        id = id,
        lockRepositories = lockRepositories,
        nodeId = nodeId,
        orgMetadataOnly = orgMetadataOnly,
        owner = ownerState.valueOrNull(),
        repositories = repositories,
        state = state,
        updatedAt = updatedAt,
        url = url,
        archiveUrlState = archiveUrlState,
        excludeState = excludeState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Migration = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Migration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Migration {
      val jsonDecoder = decoder.requireJsonDecoder("Migration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Migration must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val excludeAttachments = json.decodeRequired<Boolean>(rawObject, "exclude_attachments")
      val excludeGitData = json.decodeRequired<Boolean>(rawObject, "exclude_git_data")
      val excludeMetadata = json.decodeRequired<Boolean>(rawObject, "exclude_metadata")
      val excludeOwnerProjects = json.decodeRequired<Boolean>(rawObject, "exclude_owner_projects")
      val excludeReleases = json.decodeRequired<Boolean>(rawObject, "exclude_releases")
      val guid = json.decodeRequired<String>(rawObject, "guid")
      val id = json.decodeRequired<Long>(rawObject, "id")
      val lockRepositories = json.decodeRequired<Boolean>(rawObject, "lock_repositories")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val orgMetadataOnly = json.decodeRequired<Boolean>(rawObject, "org_metadata_only")
      val repositories = json.decodeRequired<List<Repository>>(rawObject, "repositories")
      val state = json.decodeRequired<String>(rawObject, "state")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("owner")) {
        throw SerializationException("Migration is missing required property 'owner'")
      }
      val owner = rawObject["owner"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return Migration(
        createdAt = createdAt,
        excludeAttachments = excludeAttachments,
        excludeGitData = excludeGitData,
        excludeMetadata = excludeMetadata,
        excludeOwnerProjects = excludeOwnerProjects,
        excludeReleases = excludeReleases,
        guid = guid,
        id = id,
        lockRepositories = lockRepositories,
        nodeId = nodeId,
        orgMetadataOnly = orgMetadataOnly,
        owner = owner,
        repositories = repositories,
        state = state,
        updatedAt = updatedAt,
        url = url,
        archiveUrlState = json.decodeOptional(rawObject, "archive_url", nullable = false),
        excludeState = json.decodeOptional(rawObject, "exclude", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Migration) {
      val jsonEncoder = encoder.requireJsonEncoder("Migration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("exclude_attachments", json.encodeToJsonElement(value.excludeAttachments))
        put("exclude_git_data", json.encodeToJsonElement(value.excludeGitData))
        put("exclude_metadata", json.encodeToJsonElement(value.excludeMetadata))
        put("exclude_owner_projects", json.encodeToJsonElement(value.excludeOwnerProjects))
        put("exclude_releases", json.encodeToJsonElement(value.excludeReleases))
        put("guid", value.guid)
        put("id", json.encodeToJsonElement(value.id))
        put("lock_repositories", json.encodeToJsonElement(value.lockRepositories))
        put("node_id", value.nodeId)
        put("org_metadata_only", json.encodeToJsonElement(value.orgMetadataOnly))
        put("owner", value.owner?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repositories", json.encodeToJsonElement(value.repositories))
        put("state", value.state)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("archive_url", value.archiveUrlState, json::encodeToJsonElement)
        putState("exclude", value.excludeState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun migration(block: Migration.Builder.() -> Unit): Migration = Migration.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Migration is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("Migration property '" + name + "' is not nullable")
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
