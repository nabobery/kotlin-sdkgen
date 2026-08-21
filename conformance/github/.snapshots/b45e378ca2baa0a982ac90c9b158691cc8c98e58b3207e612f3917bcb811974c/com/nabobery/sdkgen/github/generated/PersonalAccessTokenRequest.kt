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
 * Details of a Personal Access Token Request.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/personal-access-token-request
 */
@Serializable(with = PersonalAccessTokenRequest.Serializer::class)
public class PersonalAccessTokenRequest(
  /**
   * Date and time when the request for access was created.
   */
  public val createdAt: String,
  /**
   * Unique identifier of the request for access via fine-grained personal access token. Used as the `pat_request_id`
   * parameter in the list and review API calls.
   */
  public val id: Int,
  public val owner: SimpleUser,
  /**
   * New requested permissions, categorized by type of permission.
   */
  public val permissionsAdded: InlinePersonalAccessTokenRequestPermissionsAddedX7e60eecd,
  /**
   * Permissions requested, categorized by type of permission. This field incorporates `permissions_added` and
   * `permissions_upgraded`.
   */
  public val permissionsResult: InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc,
  /**
   * Requested permissions that elevate access for a previously approved request for access, categorized by type of
   * permission.
   */
  public val permissionsUpgraded: InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1,
  repositories: List<InlinePersonalAccessTokenRequestRepositoriesItemXcaa93328>?,
  /**
   * The number of repositories the token is requesting access to. This field is only populated when
   * `repository_selection` is `subset`.
   */
  public val repositoryCount: Int?,
  /**
   * Type of repository selection requested.
   */
  public val repositorySelection: InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb,
  /**
   * Whether the associated fine-grained personal access token has expired.
   */
  public val tokenExpired: Boolean,
  /**
   * Date and time when the associated fine-grained personal access token expires.
   */
  public val tokenExpiresAt: String?,
  /**
   * Unique identifier of the user's token. This field can also be found in audit log events and the organization's
   * settings for their PAT grants.
   */
  public val tokenId: Int,
  /**
   * Date and time when the associated fine-grained personal access token was last used for authentication.
   */
  public val tokenLastUsedAt: String?,
  /**
   * The name given to the user's token. This field can also be found in an organization's settings page for Active
   * Tokens.
   */
  public val tokenName: String,
) {
  /**
   * An array of repository objects the token is requesting access to. This field is only populated when
   * `repository_selection` is `subset`.
   */
  public val repositories: List<InlinePersonalAccessTokenRequestRepositoriesItemXcaa93328>? =
      repositories?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var ownerValue: SimpleUser? = null

    public var owner: SimpleUser
      get() = requireNotNull(ownerValue) { "owner is required" }
      set(`value`) {
        ownerValue = value
      }

    private var permissionsAddedValue: InlinePersonalAccessTokenRequestPermissionsAddedX7e60eecd? =
        null

    public var permissionsAdded: InlinePersonalAccessTokenRequestPermissionsAddedX7e60eecd
      get() = requireNotNull(permissionsAddedValue) { "permissionsAdded is required" }
      set(`value`) {
        permissionsAddedValue = value
      }

    private var permissionsResultValue: InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc?
        = null

    public var permissionsResult: InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc
      get() = requireNotNull(permissionsResultValue) { "permissionsResult is required" }
      set(`value`) {
        permissionsResultValue = value
      }

    private var permissionsUpgradedValue:
        InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1? = null

    public var permissionsUpgraded: InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1
      get() = requireNotNull(permissionsUpgradedValue) { "permissionsUpgraded is required" }
      set(`value`) {
        permissionsUpgradedValue = value
      }

    private var repositorySelectionValue:
        InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb? = null

    public var repositorySelection: InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb
      get() = requireNotNull(repositorySelectionValue) { "repositorySelection is required" }
      set(`value`) {
        repositorySelectionValue = value
      }

    private var tokenExpiredValue: Boolean? = null

    public var tokenExpired: Boolean
      get() = requireNotNull(tokenExpiredValue) { "tokenExpired is required" }
      set(`value`) {
        tokenExpiredValue = value
      }

    private var tokenIdValue: Int? = null

    public var tokenId: Int
      get() = requireNotNull(tokenIdValue) { "tokenId is required" }
      set(`value`) {
        tokenIdValue = value
      }

    private var tokenNameValue: String? = null

    public var tokenName: String
      get() = requireNotNull(tokenNameValue) { "tokenName is required" }
      set(`value`) {
        tokenNameValue = value
      }

    private var repositoriesState:
        FieldState<List<InlinePersonalAccessTokenRequestRepositoriesItemXcaa93328>?> =
        FieldState.Absent

    /**
     * An array of repository objects the token is requesting access to. This field is only populated when
     * `repository_selection` is `subset`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var repositories: List<InlinePersonalAccessTokenRequestRepositoriesItemXcaa93328>?
      get() = repositoriesState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        repositoriesState = value?.let { collection0 -> collection0.toList() }.toNullableFieldState()
      }

    private var repositoryCountState: FieldState<Int?> = FieldState.Absent

    /**
     * The number of repositories the token is requesting access to. This field is only populated when
     * `repository_selection` is `subset`.
     * Required nullable field; assigning `null` records present-null.
     */
    public var repositoryCount: Int?
      get() = repositoryCountState.valueOrNull()
      set(`value`) {
        repositoryCountState = value.toNullableFieldState()
      }

    private var tokenExpiresAtState: FieldState<String?> = FieldState.Absent

    /**
     * Date and time when the associated fine-grained personal access token expires.
     * Required nullable field; assigning `null` records present-null.
     */
    public var tokenExpiresAt: String?
      get() = tokenExpiresAtState.valueOrNull()
      set(`value`) {
        tokenExpiresAtState = value.toNullableFieldState()
      }

    private var tokenLastUsedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Date and time when the associated fine-grained personal access token was last used for authentication.
     * Required nullable field; assigning `null` records present-null.
     */
    public var tokenLastUsedAt: String?
      get() = tokenLastUsedAtState.valueOrNull()
      set(`value`) {
        tokenLastUsedAtState = value.toNullableFieldState()
      }

    public fun build(): PersonalAccessTokenRequest {
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(ownerValue != null) { "owner is required" }
      check(permissionsAddedValue != null) { "permissionsAdded is required" }
      check(permissionsResultValue != null) { "permissionsResult is required" }
      check(permissionsUpgradedValue != null) { "permissionsUpgraded is required" }
      check(repositorySelectionValue != null) { "repositorySelection is required" }
      check(tokenExpiredValue != null) { "tokenExpired is required" }
      check(tokenIdValue != null) { "tokenId is required" }
      check(tokenNameValue != null) { "tokenName is required" }
      check(repositoriesState !== FieldState.Absent) { "repositories is required, even when null" }
      check(repositoryCountState !== FieldState.Absent) { "repositoryCount is required, even when null" }
      check(tokenExpiresAtState !== FieldState.Absent) { "tokenExpiresAt is required, even when null" }
      check(tokenLastUsedAtState !== FieldState.Absent) { "tokenLastUsedAt is required, even when null" }
      return PersonalAccessTokenRequest(
        createdAt = createdAt,
        id = id,
        owner = owner,
        permissionsAdded = permissionsAdded,
        permissionsResult = permissionsResult,
        permissionsUpgraded = permissionsUpgraded,
        repositories = repositoriesState.valueOrNull(),
        repositoryCount = repositoryCountState.valueOrNull(),
        repositorySelection = repositorySelection,
        tokenExpired = tokenExpired,
        tokenExpiresAt = tokenExpiresAtState.valueOrNull(),
        tokenId = tokenId,
        tokenLastUsedAt = tokenLastUsedAtState.valueOrNull(),
        tokenName = tokenName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PersonalAccessTokenRequest = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PersonalAccessTokenRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PersonalAccessTokenRequest {
      val jsonDecoder = decoder.requireJsonDecoder("PersonalAccessTokenRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PersonalAccessTokenRequest must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val owner = json.decodeRequired<SimpleUser>(rawObject, "owner")
      val permissionsAdded = json.decodeRequired<InlinePersonalAccessTokenRequestPermissionsAddedX7e60eecd>(rawObject, "permissions_added")
      val permissionsResult = json.decodeRequired<InlinePersonalAccessTokenRequestPermissionsResultX4b7274bc>(rawObject, "permissions_result")
      val permissionsUpgraded = json.decodeRequired<InlinePersonalAccessTokenRequestPermissionsUpgradedX5f7d9fc1>(rawObject, "permissions_upgraded")
      val repositorySelection = json.decodeRequired<InlinePersonalAccessTokenRequestRepositorySelectionX6411b4fb>(rawObject, "repository_selection")
      val tokenExpired = json.decodeRequired<Boolean>(rawObject, "token_expired")
      val tokenId = json.decodeRequired<Int>(rawObject, "token_id")
      val tokenName = json.decodeRequired<String>(rawObject, "token_name")
      if (!rawObject.containsKey("repositories")) {
        throw SerializationException("PersonalAccessTokenRequest is missing required property 'repositories'")
      }
      val repositories = rawObject["repositories"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<InlinePersonalAccessTokenRequestRepositoriesItemXcaa93328>?>(requireNotNull(element)) }
      if (!rawObject.containsKey("repository_count")) {
        throw SerializationException("PersonalAccessTokenRequest is missing required property 'repository_count'")
      }
      val repositoryCount = rawObject["repository_count"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Int?>(requireNotNull(element)) }
      if (!rawObject.containsKey("token_expires_at")) {
        throw SerializationException("PersonalAccessTokenRequest is missing required property 'token_expires_at'")
      }
      val tokenExpiresAt = rawObject["token_expires_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("token_last_used_at")) {
        throw SerializationException("PersonalAccessTokenRequest is missing required property 'token_last_used_at'")
      }
      val tokenLastUsedAt = rawObject["token_last_used_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return PersonalAccessTokenRequest(
        createdAt = createdAt,
        id = id,
        owner = owner,
        permissionsAdded = permissionsAdded,
        permissionsResult = permissionsResult,
        permissionsUpgraded = permissionsUpgraded,
        repositories = repositories,
        repositoryCount = repositoryCount,
        repositorySelection = repositorySelection,
        tokenExpired = tokenExpired,
        tokenExpiresAt = tokenExpiresAt,
        tokenId = tokenId,
        tokenLastUsedAt = tokenLastUsedAt,
        tokenName = tokenName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: PersonalAccessTokenRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("PersonalAccessTokenRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("owner", json.encodeToJsonElement(value.owner))
        put("permissions_added", json.encodeToJsonElement(value.permissionsAdded))
        put("permissions_result", json.encodeToJsonElement(value.permissionsResult))
        put("permissions_upgraded", json.encodeToJsonElement(value.permissionsUpgraded))
        put("repositories", value.repositories?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository_count", value.repositoryCount?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("repository_selection", json.encodeToJsonElement(value.repositorySelection))
        put("token_expired", json.encodeToJsonElement(value.tokenExpired))
        put("token_expires_at", value.tokenExpiresAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("token_id", json.encodeToJsonElement(value.tokenId))
        put("token_last_used_at", value.tokenLastUsedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("token_name", value.tokenName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun personalAccessTokenRequest(block: PersonalAccessTokenRequest.Builder.() -> Unit): PersonalAccessTokenRequest = PersonalAccessTokenRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("PersonalAccessTokenRequest is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("PersonalAccessTokenRequest property '" + name + "' is not nullable")
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
