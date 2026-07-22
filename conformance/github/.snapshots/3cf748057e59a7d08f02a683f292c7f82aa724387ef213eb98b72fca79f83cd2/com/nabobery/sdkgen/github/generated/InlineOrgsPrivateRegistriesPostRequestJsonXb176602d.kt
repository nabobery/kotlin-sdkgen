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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries/post/requestBody/content/application~1json/sche
 * ma.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries/post/requestBody/content/application~1json/sche
 * ma
 */
@Serializable(with = InlineOrgsPrivateRegistriesPostRequestJsonXb176602d.Serializer::class)
public class InlineOrgsPrivateRegistriesPostRequestJsonXb176602d(
  /**
   * The registry type.
   */
  public val registryType: InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df,
  /**
   * The URL of the private registry.
   */
  public val url: String,
  /**
   * Which type of organization repositories have access to the private registry. `selected` means only the repositories
   * specified by `selected_repository_ids` can access the private registry.
   */
  public val visibility: InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47,
  /**
   * The AWS account ID. Required when `auth_type` is `oidc_aws`.
   */
  public val accountId: String? = null,
  /**
   * The Cloudsmith API host. Optional for `oidc_cloudsmith` auth type. If omitted, `api.cloudsmith.io` is used by
   * default.
   */
  public val apiHost: String? = null,
  /**
   * The OIDC audience. Optional for `oidc_aws`, `oidc_jfrog`, and `oidc_gcp`, and required for `oidc_cloudsmith` auth
   * types.
   */
  public val audience: String? = null,
  /**
   * The authentication type for the private registry. Defaults to `token` if not specified. Use `oidc_azure`,
   * `oidc_aws`, `oidc_jfrog`, `oidc_cloudsmith`, or `oidc_gcp` for OIDC authentication.
   */
  public val authType: InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3? = null,
  /**
   * The AWS region. Required when `auth_type` is `oidc_aws`.
   */
  public val awsRegion: String? = null,
  /**
   * The client ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
   */
  public val clientId: String? = null,
  /**
   * The CodeArtifact domain. Required when `auth_type` is `oidc_aws`.
   */
  public val domain: String? = null,
  /**
   * The CodeArtifact domain owner (AWS account ID). Required when `auth_type` is `oidc_aws`.
   */
  public val domainOwner: String? = null,
  /**
   * The value for your secret, encrypted with
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the
   * [Get private registries public key for an
   * organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-pu
   * blic-key-for-an-organization) endpoint. Required when `auth_type` is `token` or `username_password`. Should be
   * omitted for OIDC auth types.
   */
  public val encryptedValue: String? = null,
  /**
   * The JFrog identity mapping name. Optional for `oidc_jfrog` auth type.
   */
  public val identityMappingName: String? = null,
  /**
   * The JFrog OIDC provider name. Required when `auth_type` is `oidc_jfrog`.
   */
  public val jfrogOidcProviderName: String? = null,
  /**
   * The ID of the key you used to encrypt the secret. Required when `auth_type` is `token` or `username_password`.
   * Should be omitted for OIDC auth types.
   */
  public val keyId: String? = null,
  /**
   * The Cloudsmith organization namespace. Required when `auth_type` is `oidc_cloudsmith`.
   */
  public val namespace: String? = null,
  /**
   * Whether this private registry should replace the base registry (e.g., npmjs.org for npm, rubygems.org for
   * rubygems). When set to `true`, Dependabot will only use this registry and will not fall back to the public
   * registry. When set to `false` (default), Dependabot will use this registry for scoped packages but may fall back to
   * the public registry for other packages.
   */
  public val replacesBase: Boolean? = null,
  /**
   * The AWS IAM role name. Required when `auth_type` is `oidc_aws`.
   */
  public val roleName: String? = null,
  /**
   * An array of repository IDs that can access the organization private registry. You can only provide a list of
   * repository IDs when `visibility` is set to `selected`. You can manage the list of selected repositories using the
   * [Update a private registry for an
   * organization](https://docs.github.com/rest/private-registries/organization-configurations#update-a-private-registry
   * -for-an-organization) endpoint. This field should be omitted if `visibility` is set to `all` or `private`.
   */
  public val selectedRepositoryIds: List<Int>? = null,
  /**
   * The GCP service account email to impersonate. Optional for `oidc_gcp` auth type. If omitted, the federated token is
   * used directly (direct WIF).
   */
  public val serviceAccount: String? = null,
  /**
   * The Cloudsmith service account slug. Required when `auth_type` is `oidc_cloudsmith`.
   */
  public val serviceSlug: String? = null,
  /**
   * The tenant ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
   */
  public val tenantId: String? = null,
  /**
   * The username to use when authenticating with the private registry. This field should be omitted if the private
   * registry does not require a username for authentication.
   */
  public val username: String? = null,
  /**
   * The full resource name of the GCP Workload Identity Provider (e.g.
   * `projects/<NUM>/locations/global/workloadIdentityPools/<POOL>/providers/<PROVIDER>`). Required when `auth_type` is
   * `oidc_gcp`.
   */
  public val workloadIdentityProvider: String? = null,
) {
  public class Builder {
    private var registryTypeValue: InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df?
        = null

    public var registryType: InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df
      get() = requireNotNull(registryTypeValue) { "registryType is required" }
      set(`value`) {
        registryTypeValue = value
      }

    private var urlValue: String? = null

    public var url: String
      get() = requireNotNull(urlValue) { "url is required" }
      set(`value`) {
        urlValue = value
      }

    private var visibilityValue: InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47? =
        null

    public var visibility: InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    /**
     * The AWS account ID. Required when `auth_type` is `oidc_aws`.
     */
    public var accountId: String? = null

    /**
     * The Cloudsmith API host. Optional for `oidc_cloudsmith` auth type. If omitted, `api.cloudsmith.io` is used by
     * default.
     */
    public var apiHost: String? = null

    /**
     * The OIDC audience. Optional for `oidc_aws`, `oidc_jfrog`, and `oidc_gcp`, and required for `oidc_cloudsmith` auth
     * types.
     */
    public var audience: String? = null

    /**
     * The authentication type for the private registry. Defaults to `token` if not specified. Use `oidc_azure`,
     * `oidc_aws`, `oidc_jfrog`, `oidc_cloudsmith`, or `oidc_gcp` for OIDC authentication.
     */
    public var authType: InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3? = null

    /**
     * The AWS region. Required when `auth_type` is `oidc_aws`.
     */
    public var awsRegion: String? = null

    /**
     * The client ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
     */
    public var clientId: String? = null

    /**
     * The CodeArtifact domain. Required when `auth_type` is `oidc_aws`.
     */
    public var domain: String? = null

    /**
     * The CodeArtifact domain owner (AWS account ID). Required when `auth_type` is `oidc_aws`.
     */
    public var domainOwner: String? = null

    /**
     * The value for your secret, encrypted with
     * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from
     * the [Get private registries public key for an
     * organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-
     * public-key-for-an-organization) endpoint. Required when `auth_type` is `token` or `username_password`. Should be
     * omitted for OIDC auth types.
     */
    public var encryptedValue: String? = null

    /**
     * The JFrog identity mapping name. Optional for `oidc_jfrog` auth type.
     */
    public var identityMappingName: String? = null

    /**
     * The JFrog OIDC provider name. Required when `auth_type` is `oidc_jfrog`.
     */
    public var jfrogOidcProviderName: String? = null

    /**
     * The ID of the key you used to encrypt the secret. Required when `auth_type` is `token` or `username_password`.
     * Should be omitted for OIDC auth types.
     */
    public var keyId: String? = null

    /**
     * The Cloudsmith organization namespace. Required when `auth_type` is `oidc_cloudsmith`.
     */
    public var namespace: String? = null

    /**
     * Whether this private registry should replace the base registry (e.g., npmjs.org for npm, rubygems.org for
     * rubygems). When set to `true`, Dependabot will only use this registry and will not fall back to the public
     * registry. When set to `false` (default), Dependabot will use this registry for scoped packages but may fall back
     * to the public registry for other packages.
     */
    public var replacesBase: Boolean? = null

    /**
     * The AWS IAM role name. Required when `auth_type` is `oidc_aws`.
     */
    public var roleName: String? = null

    /**
     * An array of repository IDs that can access the organization private registry. You can only provide a list of
     * repository IDs when `visibility` is set to `selected`. You can manage the list of selected repositories using the
     * [Update a private registry for an
     * organization](https://docs.github.com/rest/private-registries/organization-configurations#update-a-private-regist
     * ry-for-an-organization) endpoint. This field should be omitted if `visibility` is set to `all` or `private`.
     */
    public var selectedRepositoryIds: List<Int>? = null

    /**
     * The GCP service account email to impersonate. Optional for `oidc_gcp` auth type. If omitted, the federated token
     * is used directly (direct WIF).
     */
    public var serviceAccount: String? = null

    /**
     * The Cloudsmith service account slug. Required when `auth_type` is `oidc_cloudsmith`.
     */
    public var serviceSlug: String? = null

    /**
     * The tenant ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
     */
    public var tenantId: String? = null

    /**
     * The username to use when authenticating with the private registry. This field should be omitted if the private
     * registry does not require a username for authentication.
     */
    public var username: String? = null

    /**
     * The full resource name of the GCP Workload Identity Provider (e.g.
     * `projects/<NUM>/locations/global/workloadIdentityPools/<POOL>/providers/<PROVIDER>`). Required when `auth_type`
     * is `oidc_gcp`.
     */
    public var workloadIdentityProvider: String? = null

    public fun build(): InlineOrgsPrivateRegistriesPostRequestJsonXb176602d {
      check(registryTypeValue != null) { "registryType is required" }
      check(urlValue != null) { "url is required" }
      check(visibilityValue != null) { "visibility is required" }
      return InlineOrgsPrivateRegistriesPostRequestJsonXb176602d(
        registryType = registryType,
        url = url,
        visibility = visibility,
        accountId = accountId,
        apiHost = apiHost,
        audience = audience,
        authType = authType,
        awsRegion = awsRegion,
        clientId = clientId,
        domain = domain,
        domainOwner = domainOwner,
        encryptedValue = encryptedValue,
        identityMappingName = identityMappingName,
        jfrogOidcProviderName = jfrogOidcProviderName,
        keyId = keyId,
        namespace = namespace,
        replacesBase = replacesBase,
        roleName = roleName,
        selectedRepositoryIds = selectedRepositoryIds,
        serviceAccount = serviceAccount,
        serviceSlug = serviceSlug,
        tenantId = tenantId,
        username = username,
        workloadIdentityProvider = workloadIdentityProvider,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPrivateRegistriesPostRequestJsonXb176602d = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsPrivateRegistriesPostRequestJsonXb176602d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPostRequestJsonXb176602d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPrivateRegistriesPostRequestJsonXb176602d")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPrivateRegistriesPostRequestJsonXb176602d must be a JSON object")
      val registryType = json.decodeRequired<InlineOrgsPrivateRegistriesPostRequestJsonRegistryTypeX0219a3df>(rawObject, "registry_type")
      val url = json.decodeRequired<String>(rawObject, "url")
      val visibility = json.decodeRequired<InlineOrgsPrivateRegistriesPostRequestJsonVisibilityXfeb4ca47>(rawObject, "visibility")
      return InlineOrgsPrivateRegistriesPostRequestJsonXb176602d(
        registryType = registryType,
        url = url,
        visibility = visibility,
        accountId = rawObject["account_id"]?.let { json.decodeFromJsonElement<String>(it) },
        apiHost = rawObject["api_host"]?.let { json.decodeFromJsonElement<String>(it) },
        audience = rawObject["audience"]?.let { json.decodeFromJsonElement<String>(it) },
        authType = rawObject["auth_type"]?.let { json.decodeFromJsonElement<InlineOrgsPrivateRegistriesPostRequestJsonAuthTypeX3b03eea3>(it) },
        awsRegion = rawObject["aws_region"]?.let { json.decodeFromJsonElement<String>(it) },
        clientId = rawObject["client_id"]?.let { json.decodeFromJsonElement<String>(it) },
        domain = rawObject["domain"]?.let { json.decodeFromJsonElement<String>(it) },
        domainOwner = rawObject["domain_owner"]?.let { json.decodeFromJsonElement<String>(it) },
        encryptedValue = rawObject["encrypted_value"]?.let { json.decodeFromJsonElement<String>(it) },
        identityMappingName = rawObject["identity_mapping_name"]?.let { json.decodeFromJsonElement<String>(it) },
        jfrogOidcProviderName = rawObject["jfrog_oidc_provider_name"]?.let { json.decodeFromJsonElement<String>(it) },
        keyId = rawObject["key_id"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = rawObject["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
        replacesBase = rawObject["replaces_base"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        roleName = rawObject["role_name"]?.let { json.decodeFromJsonElement<String>(it) },
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        serviceAccount = rawObject["service_account"]?.let { json.decodeFromJsonElement<String>(it) },
        serviceSlug = rawObject["service_slug"]?.let { json.decodeFromJsonElement<String>(it) },
        tenantId = rawObject["tenant_id"]?.let { json.decodeFromJsonElement<String>(it) },
        username = rawObject["username"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        workloadIdentityProvider = rawObject["workload_identity_provider"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPostRequestJsonXb176602d) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPrivateRegistriesPostRequestJsonXb176602d")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("registry_type", json.encodeToJsonElement(value.registryType))
        put("url", value.url)
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.accountId?.let { put("account_id", it) }
        value.apiHost?.let { put("api_host", it) }
        value.audience?.let { put("audience", it) }
        value.authType?.let { put("auth_type", json.encodeToJsonElement(it)) }
        value.awsRegion?.let { put("aws_region", it) }
        value.clientId?.let { put("client_id", it) }
        value.domain?.let { put("domain", it) }
        value.domainOwner?.let { put("domain_owner", it) }
        value.encryptedValue?.let { put("encrypted_value", it) }
        value.identityMappingName?.let { put("identity_mapping_name", it) }
        value.jfrogOidcProviderName?.let { put("jfrog_oidc_provider_name", it) }
        value.keyId?.let { put("key_id", it) }
        value.namespace?.let { put("namespace", it) }
        value.replacesBase?.let { put("replaces_base", json.encodeToJsonElement(it)) }
        value.roleName?.let { put("role_name", it) }
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
        value.serviceAccount?.let { put("service_account", it) }
        value.serviceSlug?.let { put("service_slug", it) }
        value.tenantId?.let { put("tenant_id", it) }
        value.username?.let { put("username", it) }
        value.workloadIdentityProvider?.let { put("workload_identity_provider", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPrivateRegistriesPostRequestJsonXb176602d(block: InlineOrgsPrivateRegistriesPostRequestJsonXb176602d.Builder.() -> Unit): InlineOrgsPrivateRegistriesPostRequestJsonXb176602d = InlineOrgsPrivateRegistriesPostRequestJsonXb176602d.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsPrivateRegistriesPostRequestJsonXb176602d is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
