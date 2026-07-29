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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries~1{secret_name}/patch/requestBody/content/applic
 * ation~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1private-registries~1{secret_name}/patch/requestBody/content/applic
 * ation~1json/schema
 */
@Serializable(with = InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027.Serializer::class)
public class InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027 internal constructor(
  private val accountIdState: FieldState<String>,
  private val apiHostState: FieldState<String>,
  private val audienceState: FieldState<String>,
  private val authTypeState:
      FieldState<InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c>,
  private val awsRegionState: FieldState<String>,
  private val clientIdState: FieldState<String>,
  private val domainState: FieldState<String>,
  private val domainOwnerState: FieldState<String>,
  private val encryptedValueState: FieldState<String>,
  private val identityMappingNameState: FieldState<String>,
  private val jfrogOidcProviderNameState: FieldState<String>,
  private val keyIdState: FieldState<String>,
  private val namespaceState: FieldState<String>,
  private val registryTypeState:
      FieldState<InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2>,
  private val replacesBaseState: FieldState<Boolean>,
  private val roleNameState: FieldState<String>,
  selectedRepositoryIdsState: FieldState<List<Int>>,
  private val serviceAccountState: FieldState<String>,
  private val serviceSlugState: FieldState<String>,
  private val tenantIdState: FieldState<String>,
  private val urlState: FieldState<String>,
  private val usernameState: FieldState<String?>,
  private val visibilityState:
      FieldState<InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0>,
  private val workloadIdentityProviderState: FieldState<String>,
) {
  private val selectedRepositoryIdsState: FieldState<List<Int>> =
      selectedRepositoryIdsState.copyValue { fieldValue -> fieldValue.toList() }

  /**
   * The AWS account ID. Required when `auth_type` is `oidc_aws`.
   */
  public val accountId: String?
    get() = accountIdState.valueOrNull()

  /**
   * The Cloudsmith API host. Optional for `oidc_cloudsmith` auth type. If omitted, `api.cloudsmith.io` is used by
   * default.
   */
  public val apiHost: String?
    get() = apiHostState.valueOrNull()

  /**
   * The OIDC audience. Optional for `oidc_aws`, `oidc_jfrog`, and `oidc_gcp`, and required for `oidc_cloudsmith` auth
   * types.
   */
  public val audience: String?
    get() = audienceState.valueOrNull()

  /**
   * The authentication type for the private registry. This field cannot be changed after creation. If provided, it must
   * match the existing `auth_type` of the configuration. To change the authentication type, delete and recreate the
   * configuration.
   */
  public val authType: InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c?
    get() = authTypeState.valueOrNull()

  /**
   * The AWS region. Required when `auth_type` is `oidc_aws`.
   */
  public val awsRegion: String?
    get() = awsRegionState.valueOrNull()

  /**
   * The client ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
   */
  public val clientId: String?
    get() = clientIdState.valueOrNull()

  /**
   * The CodeArtifact domain. Required when `auth_type` is `oidc_aws`.
   */
  public val domain: String?
    get() = domainState.valueOrNull()

  /**
   * The CodeArtifact domain owner (AWS account ID). Required when `auth_type` is `oidc_aws`.
   */
  public val domainOwner: String?
    get() = domainOwnerState.valueOrNull()

  /**
   * The value for your secret, encrypted with
   * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the
   * [Get private registries public key for an
   * organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-pu
   * blic-key-for-an-organization) endpoint.
   */
  public val encryptedValue: String?
    get() = encryptedValueState.valueOrNull()

  /**
   * The JFrog identity mapping name. Optional for `oidc_jfrog` auth type.
   */
  public val identityMappingName: String?
    get() = identityMappingNameState.valueOrNull()

  /**
   * The JFrog OIDC provider name. Required when `auth_type` is `oidc_jfrog`.
   */
  public val jfrogOidcProviderName: String?
    get() = jfrogOidcProviderNameState.valueOrNull()

  /**
   * The ID of the key you used to encrypt the secret.
   */
  public val keyId: String?
    get() = keyIdState.valueOrNull()

  /**
   * The Cloudsmith organization namespace. Required when `auth_type` is `oidc_cloudsmith`.
   */
  public val namespace: String?
    get() = namespaceState.valueOrNull()

  /**
   * The registry type.
   */
  public val registryType: InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2?
    get() = registryTypeState.valueOrNull()

  /**
   * Whether this private registry should replace the base registry (e.g., npmjs.org for npm, rubygems.org for
   * rubygems). When set to `true`, Dependabot will only use this registry and will not fall back to the public
   * registry. When set to `false` (default), Dependabot will use this registry for scoped packages but may fall back to
   * the public registry for other packages.
   */
  public val replacesBase: Boolean?
    get() = replacesBaseState.valueOrNull()

  /**
   * The AWS IAM role name. Required when `auth_type` is `oidc_aws`.
   */
  public val roleName: String?
    get() = roleNameState.valueOrNull()

  /**
   * An array of repository IDs that can access the organization private registry. You can only provide a list of
   * repository IDs when `visibility` is set to `selected`. This field should be omitted if `visibility` is set to `all`
   * or `private`.
   */
  public val selectedRepositoryIds: List<Int>?
    get() = selectedRepositoryIdsState.valueOrNull()

  /**
   * The GCP service account email to impersonate. Optional for `oidc_gcp` auth type. If omitted, the federated token is
   * used directly (direct WIF).
   */
  public val serviceAccount: String?
    get() = serviceAccountState.valueOrNull()

  /**
   * The Cloudsmith service account slug. Required when `auth_type` is `oidc_cloudsmith`.
   */
  public val serviceSlug: String?
    get() = serviceSlugState.valueOrNull()

  /**
   * The tenant ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
   */
  public val tenantId: String?
    get() = tenantIdState.valueOrNull()

  /**
   * The URL of the private registry.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String?
    get() = urlState.valueOrNull()

  /**
   * The username to use when authenticating with the private registry. This field should be omitted if the private
   * registry does not require a username for authentication.
   */
  public val username: String?
    get() = usernameState.valueOrNull()

  /**
   * Which type of organization repositories have access to the private registry. `selected` means only the repositories
   * specified by `selected_repository_ids` can access the private registry.
   */
  public val visibility: InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0?
    get() = visibilityState.valueOrNull()

  /**
   * The full resource name of the GCP Workload Identity Provider (e.g.
   * `projects/<NUM>/locations/global/workloadIdentityPools/<POOL>/providers/<PROVIDER>`). Required when `auth_type` is
   * `oidc_gcp`.
   */
  public val workloadIdentityProvider: String?
    get() = workloadIdentityProviderState.valueOrNull()

  public constructor() : this(accountIdState = FieldState.Absent,
  apiHostState = FieldState.Absent,
  audienceState = FieldState.Absent,
  authTypeState = FieldState.Absent,
  awsRegionState = FieldState.Absent,
  clientIdState = FieldState.Absent,
  domainState = FieldState.Absent,
  domainOwnerState = FieldState.Absent,
  encryptedValueState = FieldState.Absent,
  identityMappingNameState = FieldState.Absent,
  jfrogOidcProviderNameState = FieldState.Absent,
  keyIdState = FieldState.Absent,
  namespaceState = FieldState.Absent,
  registryTypeState = FieldState.Absent,
  replacesBaseState = FieldState.Absent,
  roleNameState = FieldState.Absent,
  selectedRepositoryIdsState = FieldState.Absent,
  serviceAccountState = FieldState.Absent,
  serviceSlugState = FieldState.Absent,
  tenantIdState = FieldState.Absent,
  urlState = FieldState.Absent,
  usernameState = FieldState.Absent,
  visibilityState = FieldState.Absent,
  workloadIdentityProviderState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `account_id`.
   */
  public fun accountIdPresence(): FieldPresence = accountIdState.presence

  /**
   * Returns the wire presence of `api_host`.
   */
  public fun apiHostPresence(): FieldPresence = apiHostState.presence

  /**
   * Returns the wire presence of `audience`.
   */
  public fun audiencePresence(): FieldPresence = audienceState.presence

  /**
   * Returns the wire presence of `auth_type`.
   */
  public fun authTypePresence(): FieldPresence = authTypeState.presence

  /**
   * Returns the wire presence of `aws_region`.
   */
  public fun awsRegionPresence(): FieldPresence = awsRegionState.presence

  /**
   * Returns the wire presence of `client_id`.
   */
  public fun clientIdPresence(): FieldPresence = clientIdState.presence

  /**
   * Returns the wire presence of `domain`.
   */
  public fun domainPresence(): FieldPresence = domainState.presence

  /**
   * Returns the wire presence of `domain_owner`.
   */
  public fun domainOwnerPresence(): FieldPresence = domainOwnerState.presence

  /**
   * Returns the wire presence of `encrypted_value`.
   */
  public fun encryptedValuePresence(): FieldPresence = encryptedValueState.presence

  /**
   * Returns the wire presence of `identity_mapping_name`.
   */
  public fun identityMappingNamePresence(): FieldPresence = identityMappingNameState.presence

  /**
   * Returns the wire presence of `jfrog_oidc_provider_name`.
   */
  public fun jfrogOidcProviderNamePresence(): FieldPresence = jfrogOidcProviderNameState.presence

  /**
   * Returns the wire presence of `key_id`.
   */
  public fun keyIdPresence(): FieldPresence = keyIdState.presence

  /**
   * Returns the wire presence of `namespace`.
   */
  public fun namespacePresence(): FieldPresence = namespaceState.presence

  /**
   * Returns the wire presence of `registry_type`.
   */
  public fun registryTypePresence(): FieldPresence = registryTypeState.presence

  /**
   * Returns the wire presence of `replaces_base`.
   */
  public fun replacesBasePresence(): FieldPresence = replacesBaseState.presence

  /**
   * Returns the wire presence of `role_name`.
   */
  public fun roleNamePresence(): FieldPresence = roleNameState.presence

  /**
   * Returns the wire presence of `selected_repository_ids`.
   */
  public fun selectedRepositoryIdsPresence(): FieldPresence = selectedRepositoryIdsState.presence

  /**
   * Returns the wire presence of `service_account`.
   */
  public fun serviceAccountPresence(): FieldPresence = serviceAccountState.presence

  /**
   * Returns the wire presence of `service_slug`.
   */
  public fun serviceSlugPresence(): FieldPresence = serviceSlugState.presence

  /**
   * Returns the wire presence of `tenant_id`.
   */
  public fun tenantIdPresence(): FieldPresence = tenantIdState.presence

  /**
   * Returns the wire presence of `url`.
   */
  public fun urlPresence(): FieldPresence = urlState.presence

  /**
   * Returns the wire presence of `username`.
   */
  public fun usernamePresence(): FieldPresence = usernameState.presence

  /**
   * Returns the wire presence of `visibility`.
   */
  public fun visibilityPresence(): FieldPresence = visibilityState.presence

  /**
   * Returns the wire presence of `workload_identity_provider`.
   */
  public fun workloadIdentityProviderPresence(): FieldPresence = workloadIdentityProviderState.presence

  public class Builder {
    private var accountIdState: FieldState<String> = FieldState.Absent

    /**
     * The AWS account ID. Required when `auth_type` is `oidc_aws`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var accountId: String?
      get() = accountIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "accountId is not nullable; call unsetAccountId() to omit it" }
        accountIdState = FieldState.Value(present)
      }

    private var apiHostState: FieldState<String> = FieldState.Absent

    /**
     * The Cloudsmith API host. Optional for `oidc_cloudsmith` auth type. If omitted, `api.cloudsmith.io` is used by
     * default.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var apiHost: String?
      get() = apiHostState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "apiHost is not nullable; call unsetApiHost() to omit it" }
        apiHostState = FieldState.Value(present)
      }

    private var audienceState: FieldState<String> = FieldState.Absent

    /**
     * The OIDC audience. Optional for `oidc_aws`, `oidc_jfrog`, and `oidc_gcp`, and required for `oidc_cloudsmith` auth
     * types.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var audience: String?
      get() = audienceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "audience is not nullable; call unsetAudience() to omit it" }
        audienceState = FieldState.Value(present)
      }

    private var authTypeState:
        FieldState<InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c> = FieldState.Absent

    /**
     * The authentication type for the private registry. This field cannot be changed after creation. If provided, it
     * must match the existing `auth_type` of the configuration. To change the authentication type, delete and recreate
     * the configuration.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var authType: InlineOrgsPrivateRegistriesPatchRequestJsonAuthTypeX6a0c874c?
      get() = authTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "authType is not nullable; call unsetAuthType() to omit it" }
        authTypeState = FieldState.Value(present)
      }

    private var awsRegionState: FieldState<String> = FieldState.Absent

    /**
     * The AWS region. Required when `auth_type` is `oidc_aws`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var awsRegion: String?
      get() = awsRegionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "awsRegion is not nullable; call unsetAwsRegion() to omit it" }
        awsRegionState = FieldState.Value(present)
      }

    private var clientIdState: FieldState<String> = FieldState.Absent

    /**
     * The client ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var clientId: String?
      get() = clientIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "clientId is not nullable; call unsetClientId() to omit it" }
        clientIdState = FieldState.Value(present)
      }

    private var domainState: FieldState<String> = FieldState.Absent

    /**
     * The CodeArtifact domain. Required when `auth_type` is `oidc_aws`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var domain: String?
      get() = domainState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "domain is not nullable; call unsetDomain() to omit it" }
        domainState = FieldState.Value(present)
      }

    private var domainOwnerState: FieldState<String> = FieldState.Absent

    /**
     * The CodeArtifact domain owner (AWS account ID). Required when `auth_type` is `oidc_aws`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var domainOwner: String?
      get() = domainOwnerState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "domainOwner is not nullable; call unsetDomainOwner() to omit it" }
        domainOwnerState = FieldState.Value(present)
      }

    private var encryptedValueState: FieldState<String> = FieldState.Absent

    /**
     * The value for your secret, encrypted with
     * [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from
     * the [Get private registries public key for an
     * organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-
     * public-key-for-an-organization) endpoint.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var encryptedValue: String?
      get() = encryptedValueState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "encryptedValue is not nullable; call unsetEncryptedValue() to omit it" }
        encryptedValueState = FieldState.Value(present)
      }

    private var identityMappingNameState: FieldState<String> = FieldState.Absent

    /**
     * The JFrog identity mapping name. Optional for `oidc_jfrog` auth type.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var identityMappingName: String?
      get() = identityMappingNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "identityMappingName is not nullable; call unsetIdentityMappingName() to omit it" }
        identityMappingNameState = FieldState.Value(present)
      }

    private var jfrogOidcProviderNameState: FieldState<String> = FieldState.Absent

    /**
     * The JFrog OIDC provider name. Required when `auth_type` is `oidc_jfrog`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var jfrogOidcProviderName: String?
      get() = jfrogOidcProviderNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "jfrogOidcProviderName is not nullable; call unsetJfrogOidcProviderName() to omit it" }
        jfrogOidcProviderNameState = FieldState.Value(present)
      }

    private var keyIdState: FieldState<String> = FieldState.Absent

    /**
     * The ID of the key you used to encrypt the secret.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var keyId: String?
      get() = keyIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "keyId is not nullable; call unsetKeyId() to omit it" }
        keyIdState = FieldState.Value(present)
      }

    private var namespaceState: FieldState<String> = FieldState.Absent

    /**
     * The Cloudsmith organization namespace. Required when `auth_type` is `oidc_cloudsmith`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var namespace: String?
      get() = namespaceState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "namespace is not nullable; call unsetNamespace() to omit it" }
        namespaceState = FieldState.Value(present)
      }

    private var registryTypeState:
        FieldState<InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2> =
        FieldState.Absent

    /**
     * The registry type.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var registryType: InlineOrgsPrivateRegistriesPatchRequestJsonRegistryTypeX8dbac8b2?
      get() = registryTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "registryType is not nullable; call unsetRegistryType() to omit it" }
        registryTypeState = FieldState.Value(present)
      }

    private var replacesBaseState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether this private registry should replace the base registry (e.g., npmjs.org for npm, rubygems.org for
     * rubygems). When set to `true`, Dependabot will only use this registry and will not fall back to the public
     * registry. When set to `false` (default), Dependabot will use this registry for scoped packages but may fall back
     * to the public registry for other packages.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var replacesBase: Boolean?
      get() = replacesBaseState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "replacesBase is not nullable; call unsetReplacesBase() to omit it" }
        replacesBaseState = FieldState.Value(present)
      }

    private var roleNameState: FieldState<String> = FieldState.Absent

    /**
     * The AWS IAM role name. Required when `auth_type` is `oidc_aws`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var roleName: String?
      get() = roleNameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "roleName is not nullable; call unsetRoleName() to omit it" }
        roleNameState = FieldState.Value(present)
      }

    private var selectedRepositoryIdsState: FieldState<List<Int>> = FieldState.Absent

    /**
     * An array of repository IDs that can access the organization private registry. You can only provide a list of
     * repository IDs when `visibility` is set to `selected`. This field should be omitted if `visibility` is set to
     * `all` or `private`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var selectedRepositoryIds: List<Int>?
      get() = selectedRepositoryIdsState.valueOrNull()?.let { collection0 -> collection0.toList() }
      set(`value`) {
        val present = requireNotNull(value) { "selectedRepositoryIds is not nullable; call unsetSelectedRepositoryIds() to omit it" }
        selectedRepositoryIdsState = FieldState.Value(present.toList())
      }

    private var serviceAccountState: FieldState<String> = FieldState.Absent

    /**
     * The GCP service account email to impersonate. Optional for `oidc_gcp` auth type. If omitted, the federated token
     * is used directly (direct WIF).
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var serviceAccount: String?
      get() = serviceAccountState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "serviceAccount is not nullable; call unsetServiceAccount() to omit it" }
        serviceAccountState = FieldState.Value(present)
      }

    private var serviceSlugState: FieldState<String> = FieldState.Absent

    /**
     * The Cloudsmith service account slug. Required when `auth_type` is `oidc_cloudsmith`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var serviceSlug: String?
      get() = serviceSlugState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "serviceSlug is not nullable; call unsetServiceSlug() to omit it" }
        serviceSlugState = FieldState.Value(present)
      }

    private var tenantIdState: FieldState<String> = FieldState.Absent

    /**
     * The tenant ID of the Azure AD application. Required when `auth_type` is `oidc_azure`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var tenantId: String?
      get() = tenantIdState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "tenantId is not nullable; call unsetTenantId() to omit it" }
        tenantIdState = FieldState.Value(present)
      }

    private var urlState: FieldState<String> = FieldState.Absent

    /**
     * The URL of the private registry.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var url: String?
      get() = urlState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "url is not nullable; call unsetUrl() to omit it" }
        urlState = FieldState.Value(present)
      }

    private var usernameState: FieldState<String?> = FieldState.Absent

    /**
     * The username to use when authenticating with the private registry. This field should be omitted if the private
     * registry does not require a username for authentication.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var username: String?
      get() = usernameState.valueOrNull()
      set(`value`) {
        usernameState = value.toNullableFieldState()
      }

    private var visibilityState:
        FieldState<InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0> =
        FieldState.Absent

    /**
     * Which type of organization repositories have access to the private registry. `selected` means only the
     * repositories specified by `selected_repository_ids` can access the private registry.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var visibility: InlineOrgsPrivateRegistriesPatchRequestJsonVisibilityX03a19aa0?
      get() = visibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "visibility is not nullable; call unsetVisibility() to omit it" }
        visibilityState = FieldState.Value(present)
      }

    private var workloadIdentityProviderState: FieldState<String> = FieldState.Absent

    /**
     * The full resource name of the GCP Workload Identity Provider (e.g.
     * `projects/<NUM>/locations/global/workloadIdentityPools/<POOL>/providers/<PROVIDER>`). Required when `auth_type`
     * is `oidc_gcp`.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var workloadIdentityProvider: String?
      get() = workloadIdentityProviderState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "workloadIdentityProvider is not nullable; call unsetWorkloadIdentityProvider() to omit it" }
        workloadIdentityProviderState = FieldState.Value(present)
      }

    /**
     * Omits `account_id` from serialized output.
     */
    public fun unsetAccountId() {
      accountIdState = FieldState.Absent
    }

    /**
     * Omits `api_host` from serialized output.
     */
    public fun unsetApiHost() {
      apiHostState = FieldState.Absent
    }

    /**
     * Omits `audience` from serialized output.
     */
    public fun unsetAudience() {
      audienceState = FieldState.Absent
    }

    /**
     * Omits `auth_type` from serialized output.
     */
    public fun unsetAuthType() {
      authTypeState = FieldState.Absent
    }

    /**
     * Omits `aws_region` from serialized output.
     */
    public fun unsetAwsRegion() {
      awsRegionState = FieldState.Absent
    }

    /**
     * Omits `client_id` from serialized output.
     */
    public fun unsetClientId() {
      clientIdState = FieldState.Absent
    }

    /**
     * Omits `domain` from serialized output.
     */
    public fun unsetDomain() {
      domainState = FieldState.Absent
    }

    /**
     * Omits `domain_owner` from serialized output.
     */
    public fun unsetDomainOwner() {
      domainOwnerState = FieldState.Absent
    }

    /**
     * Omits `encrypted_value` from serialized output.
     */
    public fun unsetEncryptedValue() {
      encryptedValueState = FieldState.Absent
    }

    /**
     * Omits `identity_mapping_name` from serialized output.
     */
    public fun unsetIdentityMappingName() {
      identityMappingNameState = FieldState.Absent
    }

    /**
     * Omits `jfrog_oidc_provider_name` from serialized output.
     */
    public fun unsetJfrogOidcProviderName() {
      jfrogOidcProviderNameState = FieldState.Absent
    }

    /**
     * Omits `key_id` from serialized output.
     */
    public fun unsetKeyId() {
      keyIdState = FieldState.Absent
    }

    /**
     * Omits `namespace` from serialized output.
     */
    public fun unsetNamespace() {
      namespaceState = FieldState.Absent
    }

    /**
     * Omits `registry_type` from serialized output.
     */
    public fun unsetRegistryType() {
      registryTypeState = FieldState.Absent
    }

    /**
     * Omits `replaces_base` from serialized output.
     */
    public fun unsetReplacesBase() {
      replacesBaseState = FieldState.Absent
    }

    /**
     * Omits `role_name` from serialized output.
     */
    public fun unsetRoleName() {
      roleNameState = FieldState.Absent
    }

    /**
     * Omits `selected_repository_ids` from serialized output.
     */
    public fun unsetSelectedRepositoryIds() {
      selectedRepositoryIdsState = FieldState.Absent
    }

    /**
     * Omits `service_account` from serialized output.
     */
    public fun unsetServiceAccount() {
      serviceAccountState = FieldState.Absent
    }

    /**
     * Omits `service_slug` from serialized output.
     */
    public fun unsetServiceSlug() {
      serviceSlugState = FieldState.Absent
    }

    /**
     * Omits `tenant_id` from serialized output.
     */
    public fun unsetTenantId() {
      tenantIdState = FieldState.Absent
    }

    /**
     * Omits `url` from serialized output.
     */
    public fun unsetUrl() {
      urlState = FieldState.Absent
    }

    /**
     * Omits `username` from serialized output.
     */
    public fun unsetUsername() {
      usernameState = FieldState.Absent
    }

    /**
     * Omits `visibility` from serialized output.
     */
    public fun unsetVisibility() {
      visibilityState = FieldState.Absent
    }

    /**
     * Omits `workload_identity_provider` from serialized output.
     */
    public fun unsetWorkloadIdentityProvider() {
      workloadIdentityProviderState = FieldState.Absent
    }

    public fun build(): InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027 = InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027(
      accountIdState = accountIdState,
      apiHostState = apiHostState,
      audienceState = audienceState,
      authTypeState = authTypeState,
      awsRegionState = awsRegionState,
      clientIdState = clientIdState,
      domainState = domainState,
      domainOwnerState = domainOwnerState,
      encryptedValueState = encryptedValueState,
      identityMappingNameState = identityMappingNameState,
      jfrogOidcProviderNameState = jfrogOidcProviderNameState,
      keyIdState = keyIdState,
      namespaceState = namespaceState,
      registryTypeState = registryTypeState,
      replacesBaseState = replacesBaseState,
      roleNameState = roleNameState,
      selectedRepositoryIdsState = selectedRepositoryIdsState,
      serviceAccountState = serviceAccountState,
      serviceSlugState = serviceSlugState,
      tenantIdState = tenantIdState,
      urlState = urlState,
      usernameState = usernameState,
      visibilityState = visibilityState,
      workloadIdentityProviderState = workloadIdentityProviderState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027 must be a JSON object")
      return InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027(
        accountIdState = json.decodeOptional(rawObject, "account_id", nullable = false),
        apiHostState = json.decodeOptional(rawObject, "api_host", nullable = false),
        audienceState = json.decodeOptional(rawObject, "audience", nullable = false),
        authTypeState = json.decodeOptional(rawObject, "auth_type", nullable = false),
        awsRegionState = json.decodeOptional(rawObject, "aws_region", nullable = false),
        clientIdState = json.decodeOptional(rawObject, "client_id", nullable = false),
        domainState = json.decodeOptional(rawObject, "domain", nullable = false),
        domainOwnerState = json.decodeOptional(rawObject, "domain_owner", nullable = false),
        encryptedValueState = json.decodeOptional(rawObject, "encrypted_value", nullable = false),
        identityMappingNameState = json.decodeOptional(rawObject, "identity_mapping_name", nullable = false),
        jfrogOidcProviderNameState = json.decodeOptional(rawObject, "jfrog_oidc_provider_name", nullable = false),
        keyIdState = json.decodeOptional(rawObject, "key_id", nullable = false),
        namespaceState = json.decodeOptional(rawObject, "namespace", nullable = false),
        registryTypeState = json.decodeOptional(rawObject, "registry_type", nullable = false),
        replacesBaseState = json.decodeOptional(rawObject, "replaces_base", nullable = false),
        roleNameState = json.decodeOptional(rawObject, "role_name", nullable = false),
        selectedRepositoryIdsState = json.decodeOptional(rawObject, "selected_repository_ids", nullable = false),
        serviceAccountState = json.decodeOptional(rawObject, "service_account", nullable = false),
        serviceSlugState = json.decodeOptional(rawObject, "service_slug", nullable = false),
        tenantIdState = json.decodeOptional(rawObject, "tenant_id", nullable = false),
        urlState = json.decodeOptional(rawObject, "url", nullable = false),
        usernameState = json.decodeOptional(rawObject, "username", nullable = true),
        visibilityState = json.decodeOptional(rawObject, "visibility", nullable = false),
        workloadIdentityProviderState = json.decodeOptional(rawObject, "workload_identity_provider", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("account_id", value.accountIdState, json::encodeToJsonElement)
        putState("api_host", value.apiHostState, json::encodeToJsonElement)
        putState("audience", value.audienceState, json::encodeToJsonElement)
        putState("auth_type", value.authTypeState, json::encodeToJsonElement)
        putState("aws_region", value.awsRegionState, json::encodeToJsonElement)
        putState("client_id", value.clientIdState, json::encodeToJsonElement)
        putState("domain", value.domainState, json::encodeToJsonElement)
        putState("domain_owner", value.domainOwnerState, json::encodeToJsonElement)
        putState("encrypted_value", value.encryptedValueState, json::encodeToJsonElement)
        putState("identity_mapping_name", value.identityMappingNameState, json::encodeToJsonElement)
        putState("jfrog_oidc_provider_name", value.jfrogOidcProviderNameState, json::encodeToJsonElement)
        putState("key_id", value.keyIdState, json::encodeToJsonElement)
        putState("namespace", value.namespaceState, json::encodeToJsonElement)
        putState("registry_type", value.registryTypeState, json::encodeToJsonElement)
        putState("replaces_base", value.replacesBaseState, json::encodeToJsonElement)
        putState("role_name", value.roleNameState, json::encodeToJsonElement)
        putState("selected_repository_ids", value.selectedRepositoryIdsState, json::encodeToJsonElement)
        putState("service_account", value.serviceAccountState, json::encodeToJsonElement)
        putState("service_slug", value.serviceSlugState, json::encodeToJsonElement)
        putState("tenant_id", value.tenantIdState, json::encodeToJsonElement)
        putState("url", value.urlState, json::encodeToJsonElement)
        putState("username", value.usernameState, json::encodeToJsonElement)
        putState("visibility", value.visibilityState, json::encodeToJsonElement)
        putState("workload_identity_provider", value.workloadIdentityProviderState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPrivateRegistriesPatchRequestJsonX9e412027(block: InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027.Builder.() -> Unit): InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027 = InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027.build(block)

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
    if (!nullable) throw SerializationException("InlineOrgsPrivateRegistriesPatchRequestJsonX9e412027 property '" + name + "' is not nullable")
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
