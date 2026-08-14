package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Private registry configuration for an organization
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/org-private-registry-configuration-with-selected-repositories
 */
@Serializable(with = OrgPrivateRegistryConfigurationWithSelectedRepositories.Serializer::class)
public class OrgPrivateRegistryConfigurationWithSelectedRepositories(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * The name of the private registry configuration.
   */
  public val name: String,
  /**
   * The registry type.
   */
  public val registryType: InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String,
  /**
   * Which type of organization repositories have access to the private registry. `selected` means only the repositories
   * specified by `selected_repository_ids` can access the private registry.
   */
  public val visibility:
      InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d,
  /**
   * The AWS account ID.
   */
  public val accountId: String? = null,
  /**
   * The Cloudsmith API host.
   */
  public val apiHost: String? = null,
  /**
   * The OIDC audience.
   */
  public val audience: String? = null,
  /**
   * The authentication type for the private registry.
   */
  public val authType:
      InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b? = null,
  /**
   * The AWS region.
   */
  public val awsRegion: String? = null,
  /**
   * The client ID of the Azure AD application.
   */
  public val clientId: String? = null,
  /**
   * The CodeArtifact domain.
   */
  public val domain: String? = null,
  /**
   * The CodeArtifact domain owner.
   */
  public val domainOwner: String? = null,
  /**
   * The JFrog identity mapping name.
   */
  public val identityMappingName: String? = null,
  /**
   * The JFrog OIDC provider name.
   */
  public val jfrogOidcProviderName: String? = null,
  /**
   * The Cloudsmith organization namespace.
   */
  public val namespace: String? = null,
  /**
   * Whether this private registry replaces the base registry (e.g., npmjs.org for npm, rubygems.org for rubygems). When
   * `true`, Dependabot will only use this registry and will not fall back to the public registry. When `false`
   * (default), Dependabot will use this registry for scoped packages but may fall back to the public registry for other
   * packages.
   */
  public val replacesBase: Boolean? = null,
  /**
   * The AWS IAM role name.
   */
  public val roleName: String? = null,
  selectedRepositoryIds: List<Int>? = null,
  /**
   * The GCP service account email to impersonate. If omitted, the federated token is used directly (direct WIF).
   */
  public val serviceAccount: String? = null,
  /**
   * The Cloudsmith service account slug.
   */
  public val serviceSlug: String? = null,
  /**
   * The tenant ID of the Azure AD application.
   */
  public val tenantId: String? = null,
  /**
   * The URL of the private registry.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
  /**
   * The username to use when authenticating with the private registry.
   */
  public val username: String? = null,
  /**
   * The full resource name of the GCP Workload Identity Provider (e.g.
   * `projects/<NUM>/locations/global/workloadIdentityPools/<POOL>/providers/<PROVIDER>`).
   */
  public val workloadIdentityProvider: String? = null,
) {
  /**
   * An array of repository IDs that can access the organization private registry when `visibility` is set to
   * `selected`.
   */
  public val selectedRepositoryIds: List<Int>? =
      selectedRepositoryIds?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    private var registryTypeValue: InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3? = null

    public var registryType: InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3
      get() = requireNotNull(registryTypeValue) { "registryType is required" }
      set(`value`) {
        registryTypeValue = value
      }

    private var updatedAtValue: String? = null

    public var updatedAt: String
      get() = requireNotNull(updatedAtValue) { "updatedAt is required" }
      set(`value`) {
        updatedAtValue = value
      }

    private var visibilityValue:
        InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d? = null

    public var visibility:
        InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d
      get() = requireNotNull(visibilityValue) { "visibility is required" }
      set(`value`) {
        visibilityValue = value
      }

    /**
     * The AWS account ID.
     */
    public var accountId: String? = null

    /**
     * The Cloudsmith API host.
     */
    public var apiHost: String? = null

    /**
     * The OIDC audience.
     */
    public var audience: String? = null

    /**
     * The authentication type for the private registry.
     */
    public var authType:
        InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b? = null

    /**
     * The AWS region.
     */
    public var awsRegion: String? = null

    /**
     * The client ID of the Azure AD application.
     */
    public var clientId: String? = null

    /**
     * The CodeArtifact domain.
     */
    public var domain: String? = null

    /**
     * The CodeArtifact domain owner.
     */
    public var domainOwner: String? = null

    /**
     * The JFrog identity mapping name.
     */
    public var identityMappingName: String? = null

    /**
     * The JFrog OIDC provider name.
     */
    public var jfrogOidcProviderName: String? = null

    /**
     * The Cloudsmith organization namespace.
     */
    public var namespace: String? = null

    /**
     * Whether this private registry replaces the base registry (e.g., npmjs.org for npm, rubygems.org for rubygems).
     * When `true`, Dependabot will only use this registry and will not fall back to the public registry. When `false`
     * (default), Dependabot will use this registry for scoped packages but may fall back to the public registry for
     * other packages.
     */
    public var replacesBase: Boolean? = null

    /**
     * The AWS IAM role name.
     */
    public var roleName: String? = null

    private var selectedRepositoryIdsValue: List<Int>? = null

    /**
     * An array of repository IDs that can access the organization private registry when `visibility` is set to
     * `selected`.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        selectedRepositoryIdsValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The GCP service account email to impersonate. If omitted, the federated token is used directly (direct WIF).
     */
    public var serviceAccount: String? = null

    /**
     * The Cloudsmith service account slug.
     */
    public var serviceSlug: String? = null

    /**
     * The tenant ID of the Azure AD application.
     */
    public var tenantId: String? = null

    /**
     * The URL of the private registry.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    /**
     * The username to use when authenticating with the private registry.
     */
    public var username: String? = null

    /**
     * The full resource name of the GCP Workload Identity Provider (e.g.
     * `projects/<NUM>/locations/global/workloadIdentityPools/<POOL>/providers/<PROVIDER>`).
     */
    public var workloadIdentityProvider: String? = null

    public fun build(): OrgPrivateRegistryConfigurationWithSelectedRepositories {
      check(createdAtValue != null) { "createdAt is required" }
      check(nameValue != null) { "name is required" }
      check(registryTypeValue != null) { "registryType is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(visibilityValue != null) { "visibility is required" }
      return OrgPrivateRegistryConfigurationWithSelectedRepositories(
        createdAt = createdAt,
        name = name,
        registryType = registryType,
        updatedAt = updatedAt,
        visibility = visibility,
        accountId = accountId,
        apiHost = apiHost,
        audience = audience,
        authType = authType,
        awsRegion = awsRegion,
        clientId = clientId,
        domain = domain,
        domainOwner = domainOwner,
        identityMappingName = identityMappingName,
        jfrogOidcProviderName = jfrogOidcProviderName,
        namespace = namespace,
        replacesBase = replacesBase,
        roleName = roleName,
        selectedRepositoryIds = selectedRepositoryIds,
        serviceAccount = serviceAccount,
        serviceSlug = serviceSlug,
        tenantId = tenantId,
        url = url,
        username = username,
        workloadIdentityProvider = workloadIdentityProvider,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrgPrivateRegistryConfigurationWithSelectedRepositories = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<OrgPrivateRegistryConfigurationWithSelectedRepositories> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrgPrivateRegistryConfigurationWithSelectedRepositories {
      val jsonDecoder = decoder.requireJsonDecoder("OrgPrivateRegistryConfigurationWithSelectedRepositories")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrgPrivateRegistryConfigurationWithSelectedRepositories must be a JSON object")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val name = json.decodeRequired<String>(rawObject, "name")
      val registryType = json.decodeRequired<InlineOrgPrivateRegistryCo2c14RegistryTypeX1b9ed4f3>(rawObject, "registry_type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val visibility = json.decodeRequired<InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesVisibilityX00207d4d>(rawObject, "visibility")
      return OrgPrivateRegistryConfigurationWithSelectedRepositories(
        createdAt = createdAt,
        name = name,
        registryType = registryType,
        updatedAt = updatedAt,
        visibility = visibility,
        accountId = rawObject["account_id"]?.let { json.decodeFromJsonElement<String>(it) },
        apiHost = rawObject["api_host"]?.let { json.decodeFromJsonElement<String>(it) },
        audience = rawObject["audience"]?.let { json.decodeFromJsonElement<String>(it) },
        authType = rawObject["auth_type"]?.let { json.decodeFromJsonElement<InlineOrgPrivateRegistryConfigurationWithSelectedRepositoriesAuthTypeX7a2d5c9b>(it) },
        awsRegion = rawObject["aws_region"]?.let { json.decodeFromJsonElement<String>(it) },
        clientId = rawObject["client_id"]?.let { json.decodeFromJsonElement<String>(it) },
        domain = rawObject["domain"]?.let { json.decodeFromJsonElement<String>(it) },
        domainOwner = rawObject["domain_owner"]?.let { json.decodeFromJsonElement<String>(it) },
        identityMappingName = rawObject["identity_mapping_name"]?.let { json.decodeFromJsonElement<String>(it) },
        jfrogOidcProviderName = rawObject["jfrog_oidc_provider_name"]?.let { json.decodeFromJsonElement<String>(it) },
        namespace = rawObject["namespace"]?.let { json.decodeFromJsonElement<String>(it) },
        replacesBase = rawObject["replaces_base"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        roleName = rawObject["role_name"]?.let { json.decodeFromJsonElement<String>(it) },
        selectedRepositoryIds = rawObject["selected_repository_ids"]?.let { json.decodeFromJsonElement<List<Int>>(it) },
        serviceAccount = rawObject["service_account"]?.let { json.decodeFromJsonElement<String>(it) },
        serviceSlug = rawObject["service_slug"]?.let { json.decodeFromJsonElement<String>(it) },
        tenantId = rawObject["tenant_id"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        username = rawObject["username"]?.let { json.decodeFromJsonElement<String>(it) },
        workloadIdentityProvider = rawObject["workload_identity_provider"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrgPrivateRegistryConfigurationWithSelectedRepositories) {
      val jsonEncoder = encoder.requireJsonEncoder("OrgPrivateRegistryConfigurationWithSelectedRepositories")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_at", value.createdAt)
        put("name", value.name)
        put("registry_type", json.encodeToJsonElement(value.registryType))
        put("updated_at", value.updatedAt)
        put("visibility", json.encodeToJsonElement(value.visibility))
        value.accountId?.let { put("account_id", it) }
        value.apiHost?.let { put("api_host", it) }
        value.audience?.let { put("audience", it) }
        value.authType?.let { put("auth_type", json.encodeToJsonElement(it)) }
        value.awsRegion?.let { put("aws_region", it) }
        value.clientId?.let { put("client_id", it) }
        value.domain?.let { put("domain", it) }
        value.domainOwner?.let { put("domain_owner", it) }
        value.identityMappingName?.let { put("identity_mapping_name", it) }
        value.jfrogOidcProviderName?.let { put("jfrog_oidc_provider_name", it) }
        value.namespace?.let { put("namespace", it) }
        value.replacesBase?.let { put("replaces_base", json.encodeToJsonElement(it)) }
        value.roleName?.let { put("role_name", it) }
        value.selectedRepositoryIds?.let { put("selected_repository_ids", json.encodeToJsonElement(it)) }
        value.serviceAccount?.let { put("service_account", it) }
        value.serviceSlug?.let { put("service_slug", it) }
        value.tenantId?.let { put("tenant_id", it) }
        value.url?.let { put("url", it) }
        value.username?.let { put("username", it) }
        value.workloadIdentityProvider?.let { put("workload_identity_provider", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun orgPrivateRegistryConfigurationWithSelectedRepositories(block: OrgPrivateRegistryConfigurationWithSelectedRepositories.Builder.() -> Unit): OrgPrivateRegistryConfigurationWithSelectedRepositories = OrgPrivateRegistryConfigurationWithSelectedRepositories.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrgPrivateRegistryConfigurationWithSelectedRepositories is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
