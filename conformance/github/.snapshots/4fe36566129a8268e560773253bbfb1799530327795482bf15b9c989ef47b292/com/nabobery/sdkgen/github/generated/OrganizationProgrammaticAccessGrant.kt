package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
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
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Minimal representation of an organization programmatic access grant for enumerations
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-programmatic-access-grant
 */
@Serializable(with = OrganizationProgrammaticAccessGrant.Serializer::class)
public class OrganizationProgrammaticAccessGrant(
  /**
   * Date and time when the fine-grained personal access token was approved to access the organization.
   */
  public val accessGrantedAt: String,
  /**
   * Unique identifier of the fine-grained personal access token grant. The `pat_id` used to get details about an
   * approved fine-grained personal access token.
   */
  public val id: Int,
  public val owner: SimpleUser,
  /**
   * Permissions requested, categorized by type of permission.
   */
  public val permissions: InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5,
  /**
   * URL to the list of repositories the fine-grained personal access token can access. Only follow when
   * `repository_selection` is `subset`.
   */
  public val repositoriesUrl: String,
  /**
   * Type of repository selection requested.
   */
  public val repositorySelection:
      InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941,
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
  public class Builder {
    private var accessGrantedAtValue: String? = null

    public var accessGrantedAt: String
      get() = requireNotNull(accessGrantedAtValue) { "accessGrantedAt is required" }
      set(`value`) {
        accessGrantedAtValue = value
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

    private var permissionsValue: InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5? =
        null

    public var permissions: InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5
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

    private var repositorySelectionValue:
        InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941? = null

    public var repositorySelection:
        InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941
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

    public fun build(): OrganizationProgrammaticAccessGrant {
      check(accessGrantedAtValue != null) { "accessGrantedAt is required" }
      check(idValue != null) { "id is required" }
      check(ownerValue != null) { "owner is required" }
      check(permissionsValue != null) { "permissions is required" }
      check(repositoriesUrlValue != null) { "repositoriesUrl is required" }
      check(repositorySelectionValue != null) { "repositorySelection is required" }
      check(tokenExpiredValue != null) { "tokenExpired is required" }
      check(tokenIdValue != null) { "tokenId is required" }
      check(tokenNameValue != null) { "tokenName is required" }
      check(tokenExpiresAtState !== FieldState.Absent) { "tokenExpiresAt is required, even when null" }
      check(tokenLastUsedAtState !== FieldState.Absent) { "tokenLastUsedAt is required, even when null" }
      return OrganizationProgrammaticAccessGrant(
        accessGrantedAt = accessGrantedAt,
        id = id,
        owner = owner,
        permissions = permissions,
        repositoriesUrl = repositoriesUrl,
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
    public fun build(block: Builder.() -> Unit): OrganizationProgrammaticAccessGrant = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrganizationProgrammaticAccessGrant> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationProgrammaticAccessGrant {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationProgrammaticAccessGrant")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationProgrammaticAccessGrant must be a JSON object")
      val accessGrantedAt = json.decodeRequired<String>(rawObject, "access_granted_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val owner = json.decodeRequired<SimpleUser>(rawObject, "owner")
      val permissions = json.decodeRequired<InlineOrganizationProgrammaticAccessGrantPermissionsXc35d01f5>(rawObject, "permissions")
      val repositoriesUrl = json.decodeRequired<String>(rawObject, "repositories_url")
      val repositorySelection = json.decodeRequired<InlineOrganizationProgrammaticAccessGrantRepositorySelectionX83acc941>(rawObject, "repository_selection")
      val tokenExpired = json.decodeRequired<Boolean>(rawObject, "token_expired")
      val tokenId = json.decodeRequired<Int>(rawObject, "token_id")
      val tokenName = json.decodeRequired<String>(rawObject, "token_name")
      if (!rawObject.containsKey("token_expires_at")) {
        throw SerializationException("OrganizationProgrammaticAccessGrant is missing required property 'token_expires_at'")
      }
      val tokenExpiresAt = rawObject["token_expires_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("token_last_used_at")) {
        throw SerializationException("OrganizationProgrammaticAccessGrant is missing required property 'token_last_used_at'")
      }
      val tokenLastUsedAt = rawObject["token_last_used_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return OrganizationProgrammaticAccessGrant(
        accessGrantedAt = accessGrantedAt,
        id = id,
        owner = owner,
        permissions = permissions,
        repositoriesUrl = repositoriesUrl,
        repositorySelection = repositorySelection,
        tokenExpired = tokenExpired,
        tokenExpiresAt = tokenExpiresAt,
        tokenId = tokenId,
        tokenLastUsedAt = tokenLastUsedAt,
        tokenName = tokenName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationProgrammaticAccessGrant) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationProgrammaticAccessGrant")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("access_granted_at", value.accessGrantedAt)
        put("id", json.encodeToJsonElement(value.id))
        put("owner", json.encodeToJsonElement(value.owner))
        put("permissions", json.encodeToJsonElement(value.permissions))
        put("repositories_url", value.repositoriesUrl)
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

public fun organizationProgrammaticAccessGrant(block: OrganizationProgrammaticAccessGrant.Builder.() -> Unit): OrganizationProgrammaticAccessGrant = OrganizationProgrammaticAccessGrant.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationProgrammaticAccessGrant is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("OrganizationProgrammaticAccessGrant property '" + name + "' is not nullable")
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
