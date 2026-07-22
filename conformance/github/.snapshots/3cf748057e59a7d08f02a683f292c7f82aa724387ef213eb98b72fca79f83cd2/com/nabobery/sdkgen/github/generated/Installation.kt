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
 * Installation
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/installation
 */
@Serializable(with = Installation.Serializer::class)
public class Installation internal constructor(
  public val accessTokensUrl: String,
  public val account: InlineInstallationAccountX48aee47f?,
  public val appId: Int,
  public val appSlug: String,
  public val createdAt: String,
  events: List<String>,
  public val htmlUrl: String,
  /**
   * The ID of the installation.
   */
  public val id: Int,
  public val permissions: AppPermissions,
  public val repositoriesUrl: String,
  /**
   * Describe whether all repositories have been selected or there's a selection involved
   */
  public val repositorySelection: InlineInstallationRepositorySelectionXd86c6986,
  public val singleFileName: String?,
  public val suspendedAt: String?,
  public val suspendedBy: NullableSimpleUser?,
  /**
   * The ID of the user or organization this token is being scoped to.
   */
  public val targetId: Int,
  public val targetType: String,
  public val updatedAt: String,
  private val clientIdState: FieldState<String>,
  private val contactEmailState: FieldState<String?>,
  private val hasMultipleSingleFilesState: FieldState<Boolean>,
  private val singleFilePathsState: FieldState<List<String>>,
) {
  public val events: List<String> = events.toList()

  public val clientId: String?
    get() = clientIdState.valueOrNull()

  public val contactEmail: String?
    get() = contactEmailState.valueOrNull()

  public val hasMultipleSingleFiles: Boolean?
    get() = hasMultipleSingleFilesState.valueOrNull()

  public val singleFilePaths: List<String>?
    get() = singleFilePathsState.valueOrNull()

  public constructor(
    accessTokensUrl: String,
    account: InlineInstallationAccountX48aee47f?,
    appId: Int,
    appSlug: String,
    createdAt: String,
    events: List<String>,
    htmlUrl: String,
    id: Int,
    permissions: AppPermissions,
    repositoriesUrl: String,
    repositorySelection: InlineInstallationRepositorySelectionXd86c6986,
    singleFileName: String?,
    suspendedAt: String?,
    suspendedBy: NullableSimpleUser?,
    targetId: Int,
    targetType: String,
    updatedAt: String,
  ) : this(accessTokensUrl = accessTokensUrl,
  account = account,
  appId = appId,
  appSlug = appSlug,
  createdAt = createdAt,
  events = events,
  htmlUrl = htmlUrl,
  id = id,
  permissions = permissions,
  repositoriesUrl = repositoriesUrl,
  repositorySelection = repositorySelection,
  singleFileName = singleFileName,
  suspendedAt = suspendedAt,
  suspendedBy = suspendedBy,
  targetId = targetId,
  targetType = targetType,
  updatedAt = updatedAt,
  clientIdState = FieldState.Absent,
  contactEmailState = FieldState.Absent,
  hasMultipleSingleFilesState = FieldState.Absent,
  singleFilePathsState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `client_id`.
   */
  public fun clientIdPresence(): FieldPresence = clientIdState.presence

  /**
   * Returns the wire presence of `contact_email`.
   */
  public fun contactEmailPresence(): FieldPresence = contactEmailState.presence

  /**
   * Returns the wire presence of `has_multiple_single_files`.
   */
  public fun hasMultipleSingleFilesPresence(): FieldPresence = hasMultipleSingleFilesState.presence

  /**
   * Returns the wire presence of `single_file_paths`.
   */
  public fun singleFilePathsPresence(): FieldPresence = singleFilePathsState.presence

  public class Builder {
    private var accessTokensUrlValue: String? = null

    public var accessTokensUrl: String
      get() = requireNotNull(accessTokensUrlValue) { "accessTokensUrl is required" }
      set(`value`) {
        accessTokensUrlValue = value
      }

    private var appIdValue: Int? = null

    public var appId: Int
      get() = requireNotNull(appIdValue) { "appId is required" }
      set(`value`) {
        appIdValue = value
      }

    private var appSlugValue: String? = null

    public var appSlug: String
      get() = requireNotNull(appSlugValue) { "appSlug is required" }
      set(`value`) {
        appSlugValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventsValue: List<String>? = null

    public var events: List<String>
      get() = requireNotNull(eventsValue) { "events is required" }
      set(`value`) {
        eventsValue = value
      }

    private var htmlUrlValue: String? = null

    public var htmlUrl: String
      get() = requireNotNull(htmlUrlValue) { "htmlUrl is required" }
      set(`value`) {
        htmlUrlValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var permissionsValue: AppPermissions? = null

    public var permissions: AppPermissions
      get() = requireNotNull(permissionsValue) { "permissions is required" }
      set(`value`) {
        permissionsValue = value
      }

    private var repositoriesUrlValue: String? = null

    public var repositoriesUrl: String
      get() = requireNotNull(repositoriesUrlValue) { "repositoriesUrl is required" }
      set(`value`) {
        repositoriesUrlValue = value
      }

    private var repositorySelectionValue: InlineInstallationRepositorySelectionXd86c6986? = null

    public var repositorySelection: InlineInstallationRepositorySelectionXd86c6986
      get() = requireNotNull(repositorySelectionValue) { "repositorySelection is required" }
      set(`value`) {
        repositorySelectionValue = value
      }

    private var targetIdValue: Int? = null

    public var targetId: Int
      get() = requireNotNull(targetIdValue) { "targetId is required" }
      set(`value`) {
        targetIdValue = value
      }

    private var targetTypeValue: String? = null

    public var targetType: String
      get() = requireNotNull(targetTypeValue) { "targetType is required" }
      set(`value`) {
        targetTypeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var accountState: FieldState<InlineInstallationAccountX48aee47f?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var account: InlineInstallationAccountX48aee47f?
      get() = accountState.valueOrNull()
      set(`value`) {
        accountState = value.toNullableFieldState()
      }

    private var singleFileNameState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var singleFileName: String?
      get() = singleFileNameState.valueOrNull()
      set(`value`) {
        singleFileNameState = value.toNullableFieldState()
      }

    private var suspendedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var suspendedAt: String?
      get() = suspendedAtState.valueOrNull()
      set(`value`) {
        suspendedAtState = value.toNullableFieldState()
      }

    private var suspendedByState: FieldState<NullableSimpleUser?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var suspendedBy: NullableSimpleUser?
      get() = suspendedByState.valueOrNull()
      set(`value`) {
        suspendedByState = value.toNullableFieldState()
      }

    private var clientIdState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var clientId: String?
      get() = clientIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "clientId is not nullable; call unsetClientId() to omit it" }
        clientIdState = FieldState.Value(present)
      }

    private var contactEmailState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var contactEmail: String?
      get() = contactEmailState.valueOrNull()
      set(`value`) {
        contactEmailState = value.toNullableFieldState()
      }

    private var hasMultipleSingleFilesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasMultipleSingleFiles: Boolean?
      get() = hasMultipleSingleFilesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasMultipleSingleFiles is not nullable; call unsetHasMultipleSingleFiles() to omit it" }
        hasMultipleSingleFilesState = FieldState.Value(present)
      }

    private var singleFilePathsState: FieldState<List<String>> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var singleFilePaths: List<String>?
      get() = singleFilePathsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "singleFilePaths is not nullable; call unsetSingleFilePaths() to omit it" }
        singleFilePathsState = FieldState.Value(present)
      }

    /**
     * Omits `client_id` from serialized output.
     */
    public fun unsetClientId() {
      clientIdState = FieldState.Absent
    }

    /**
     * Omits `contact_email` from serialized output.
     */
    public fun unsetContactEmail() {
      contactEmailState = FieldState.Absent
    }

    /**
     * Omits `has_multiple_single_files` from serialized output.
     */
    public fun unsetHasMultipleSingleFiles() {
      hasMultipleSingleFilesState = FieldState.Absent
    }

    /**
     * Omits `single_file_paths` from serialized output.
     */
    public fun unsetSingleFilePaths() {
      singleFilePathsState = FieldState.Absent
    }

    public fun build(): Installation {
      check(accessTokensUrlValue != null) { "accessTokensUrl is required" }
      check(appIdValue != null) { "appId is required" }
      check(appSlugValue != null) { "appSlug is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsValue != null) { "events is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(permissionsValue != null) { "permissions is required" }
      check(repositoriesUrlValue != null) { "repositoriesUrl is required" }
      check(repositorySelectionValue != null) { "repositorySelection is required" }
      check(targetIdValue != null) { "targetId is required" }
      check(targetTypeValue != null) { "targetType is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(accountState !== FieldState.Absent) { "account is required, even when null" }
      check(singleFileNameState !== FieldState.Absent) { "singleFileName is required, even when null" }
      check(suspendedAtState !== FieldState.Absent) { "suspendedAt is required, even when null" }
      check(suspendedByState !== FieldState.Absent) { "suspendedBy is required, even when null" }
      return Installation(
        accessTokensUrl = accessTokensUrl,
        account = accountState.valueOrNull(),
        appId = appId,
        appSlug = appSlug,
        createdAt = createdAt,
        events = events,
        htmlUrl = htmlUrl,
        id = id,
        permissions = permissions,
        repositoriesUrl = repositoriesUrl,
        repositorySelection = repositorySelection,
        singleFileName = singleFileNameState.valueOrNull(),
        suspendedAt = suspendedAtState.valueOrNull(),
        suspendedBy = suspendedByState.valueOrNull(),
        targetId = targetId,
        targetType = targetType,
        updatedAt = updatedAt,
        clientIdState = clientIdState,
        contactEmailState = contactEmailState,
        hasMultipleSingleFilesState = hasMultipleSingleFilesState,
        singleFilePathsState = singleFilePathsState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): Installation = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<Installation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): Installation {
      val jsonDecoder = decoder.requireJsonDecoder("Installation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("Installation must be a JSON object")
      val accessTokensUrl = json.decodeRequired<String>(rawObject, "access_tokens_url")
      val appId = json.decodeRequired<Int>(rawObject, "app_id")
      val appSlug = json.decodeRequired<String>(rawObject, "app_slug")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val events = json.decodeRequired<List<String>>(rawObject, "events")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val permissions = json.decodeRequired<AppPermissions>(rawObject, "permissions")
      val repositoriesUrl = json.decodeRequired<String>(rawObject, "repositories_url")
      val repositorySelection = json.decodeRequired<InlineInstallationRepositorySelectionXd86c6986>(rawObject, "repository_selection")
      val targetId = json.decodeRequired<Int>(rawObject, "target_id")
      val targetType = json.decodeRequired<String>(rawObject, "target_type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      if (!rawObject.containsKey("account")) {
        throw SerializationException("Installation is missing required property 'account'")
      }
      val account = rawObject["account"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineInstallationAccountX48aee47f?>(requireNotNull(element)) }
      if (!rawObject.containsKey("single_file_name")) {
        throw SerializationException("Installation is missing required property 'single_file_name'")
      }
      val singleFileName = rawObject["single_file_name"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("suspended_at")) {
        throw SerializationException("Installation is missing required property 'suspended_at'")
      }
      val suspendedAt = rawObject["suspended_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("suspended_by")) {
        throw SerializationException("Installation is missing required property 'suspended_by'")
      }
      val suspendedBy = rawObject["suspended_by"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(requireNotNull(element)) }
      return Installation(
        accessTokensUrl = accessTokensUrl,
        account = account,
        appId = appId,
        appSlug = appSlug,
        createdAt = createdAt,
        events = events,
        htmlUrl = htmlUrl,
        id = id,
        permissions = permissions,
        repositoriesUrl = repositoriesUrl,
        repositorySelection = repositorySelection,
        singleFileName = singleFileName,
        suspendedAt = suspendedAt,
        suspendedBy = suspendedBy,
        targetId = targetId,
        targetType = targetType,
        updatedAt = updatedAt,
        clientIdState = json.decodeOptional(rawObject, "client_id", nullable = false),
        contactEmailState = json.decodeOptional(rawObject, "contact_email", nullable = true),
        hasMultipleSingleFilesState = json.decodeOptional(rawObject, "has_multiple_single_files", nullable = false),
        singleFilePathsState = json.decodeOptional(rawObject, "single_file_paths", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: Installation) {
      val jsonEncoder = encoder.requireJsonEncoder("Installation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_tokens_url", value.accessTokensUrl)
        put("account", value.account?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("app_id", json.encodeToJsonElement(value.appId))
        put("app_slug", value.appSlug)
        put("created_at", value.createdAt)
        put("events", json.encodeToJsonElement(value.events))
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("permissions", json.encodeToJsonElement(value.permissions))
        put("repositories_url", value.repositoriesUrl)
        put("repository_selection", json.encodeToJsonElement(value.repositorySelection))
        put("single_file_name", value.singleFileName?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("suspended_at", value.suspendedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("suspended_by", value.suspendedBy?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("target_id", json.encodeToJsonElement(value.targetId))
        put("target_type", value.targetType)
        put("updated_at", value.updatedAt)
        putState("client_id", value.clientIdState, json::encodeToJsonElement)
        putState("contact_email", value.contactEmailState, json::encodeToJsonElement)
        putState("has_multiple_single_files", value.hasMultipleSingleFilesState, json::encodeToJsonElement)
        putState("single_file_paths", value.singleFilePathsState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun installation(block: Installation.Builder.() -> Unit): Installation = Installation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("Installation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("Installation property '" + name + "' is not nullable")
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
