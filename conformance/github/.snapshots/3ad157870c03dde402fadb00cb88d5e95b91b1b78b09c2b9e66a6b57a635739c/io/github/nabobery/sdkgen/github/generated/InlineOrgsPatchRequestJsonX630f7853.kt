package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}/patch/requestBody/content/application~1json/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}/patch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsPatchRequestJsonX630f7853.Serializer::class)
public class InlineOrgsPatchRequestJsonX630f7853 internal constructor(
  private val advancedSecurityEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val billingEmailState: FieldState<String>,
  private val blogState: FieldState<String>,
  private val companyState: FieldState<String>,
  private val defaultRepositoryPermissionState:
      FieldState<InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080>,
  private val dependabotAlertsEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val dependabotSecurityUpdatesEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val dependencyGraphEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val deployKeysEnabledForRepositoriesState: FieldState<Boolean>,
  private val descriptionState: FieldState<String>,
  private val emailState: FieldState<String>,
  private val hasOrganizationProjectsState: FieldState<Boolean>,
  private val hasRepositoryProjectsState: FieldState<Boolean>,
  private val locationState: FieldState<String>,
  private val membersAllowedRepositoryCreationTypeState:
      FieldState<InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8>,
  private val membersCanCreateInternalRepositoriesState: FieldState<Boolean>,
  private val membersCanCreatePagesState: FieldState<Boolean>,
  private val membersCanCreatePrivatePagesState: FieldState<Boolean>,
  private val membersCanCreatePrivateRepositoriesState: FieldState<Boolean>,
  private val membersCanCreatePublicPagesState: FieldState<Boolean>,
  private val membersCanCreatePublicRepositoriesState: FieldState<Boolean>,
  private val membersCanCreateRepositoriesState: FieldState<Boolean>,
  private val membersCanForkPrivateRepositoriesState: FieldState<Boolean>,
  private val nameState: FieldState<String>,
  private val secretScanningEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val secretScanningPushProtectionCustomLinkState: FieldState<String>,
  private val secretScanningPushProtectionCustomLinkEnabledState: FieldState<Boolean>,
  private val secretScanningPushProtectionEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val twitterUsernameState: FieldState<String>,
  private val webCommitSignoffRequiredState: FieldState<Boolean>,
) {
  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether GitHub Advanced Security is automatically enabled for new repositories and repositories transferred to this
   * organization.
   *
   * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
   * the organization that owns the repository. For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
   */
  public val advancedSecurityEnabledForNewRepositories: Boolean?
    get() = advancedSecurityEnabledForNewRepositoriesState.valueOrNull()

  /**
   * Billing email address. This address is not publicized.
   */
  public val billingEmail: String?
    get() = billingEmailState.valueOrNull()

  public val blog: String?
    get() = blogState.valueOrNull()

  /**
   * The company name.
   */
  public val company: String?
    get() = companyState.valueOrNull()

  /**
   * Default permission level members have for organization repositories.
   */
  public val defaultRepositoryPermission:
      InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080?
    get() = defaultRepositoryPermissionState.valueOrNull()

  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether Dependabot alerts are automatically enabled for new repositories and repositories transferred to this
   * organization.
   *
   * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
   * the organization that owns the repository. For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
   */
  public val dependabotAlertsEnabledForNewRepositories: Boolean?
    get() = dependabotAlertsEnabledForNewRepositoriesState.valueOrNull()

  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether Dependabot security updates are automatically enabled for new repositories and repositories transferred to
   * this organization.
   *
   * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
   * the organization that owns the repository. For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
   */
  public val dependabotSecurityUpdatesEnabledForNewRepositories: Boolean?
    get() = dependabotSecurityUpdatesEnabledForNewRepositoriesState.valueOrNull()

  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether dependency graph is automatically enabled for new repositories and repositories transferred to this
   * organization.
   *
   * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
   * the organization that owns the repository. For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
   */
  public val dependencyGraphEnabledForNewRepositories: Boolean?
    get() = dependencyGraphEnabledForNewRepositoriesState.valueOrNull()

  /**
   * Controls whether or not deploy keys may be added and used for repositories in the organization.
   */
  public val deployKeysEnabledForRepositories: Boolean?
    get() = deployKeysEnabledForRepositoriesState.valueOrNull()

  /**
   * The description of the company. The maximum size is 160 characters.
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The publicly visible email address.
   */
  public val email: String?
    get() = emailState.valueOrNull()

  /**
   * Whether an organization can use organization projects.
   */
  public val hasOrganizationProjects: Boolean?
    get() = hasOrganizationProjectsState.valueOrNull()

  /**
   * Whether repositories that belong to the organization can use repository projects.
   */
  public val hasRepositoryProjects: Boolean?
    get() = hasRepositoryProjectsState.valueOrNull()

  /**
   * The location.
   */
  public val location: String?
    get() = locationState.valueOrNull()

  /**
   * Specifies which types of repositories non-admin organization members can create. `private` is only available to
   * repositories that are part of an organization on GitHub Enterprise Cloud.
   * **Note:** This parameter is closing down and will be removed in the future. Its return value ignores internal
   * repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter
   * deprecation notice in the operation description for details.
   */
  public val membersAllowedRepositoryCreationType:
      InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8?
    get() = membersAllowedRepositoryCreationTypeState.valueOrNull()

  /**
   * Whether organization members can create internal repositories, which are visible to all enterprise members. You can
   * only allow members to create internal repositories if your organization is associated with an enterprise account
   * using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see "[Restricting repository
   * creation in your
   * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository
   * -creation-in-your-organization)" in the GitHub Help documentation.
   */
  public val membersCanCreateInternalRepositories: Boolean?
    get() = membersCanCreateInternalRepositoriesState.valueOrNull()

  /**
   * Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted.
   */
  public val membersCanCreatePages: Boolean?
    get() = membersCanCreatePagesState.valueOrNull()

  /**
   * Whether organization members can create private GitHub Pages sites. Existing published sites will not be impacted.
   */
  public val membersCanCreatePrivatePages: Boolean?
    get() = membersCanCreatePrivatePagesState.valueOrNull()

  /**
   * Whether organization members can create private repositories, which are visible to organization members with
   * permission. For more information, see "[Restricting repository creation in your
   * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository
   * -creation-in-your-organization)" in the GitHub Help documentation.
   */
  public val membersCanCreatePrivateRepositories: Boolean?
    get() = membersCanCreatePrivateRepositoriesState.valueOrNull()

  /**
   * Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted.
   */
  public val membersCanCreatePublicPages: Boolean?
    get() = membersCanCreatePublicPagesState.valueOrNull()

  /**
   * Whether organization members can create public repositories, which are visible to anyone. For more information, see
   * "[Restricting repository creation in your
   * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository
   * -creation-in-your-organization)" in the GitHub Help documentation.
   */
  public val membersCanCreatePublicRepositories: Boolean?
    get() = membersCanCreatePublicRepositoriesState.valueOrNull()

  /**
   * Whether of non-admin organization members can create repositories. **Note:** A parameter can override this
   * parameter. See `members_allowed_repository_creation_type` in this table for details.
   */
  public val membersCanCreateRepositories: Boolean?
    get() = membersCanCreateRepositoriesState.valueOrNull()

  /**
   * Whether organization members can fork private organization repositories.
   */
  public val membersCanForkPrivateRepositories: Boolean?
    get() = membersCanForkPrivateRepositoriesState.valueOrNull()

  /**
   * The shorthand name of the company.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether secret scanning is automatically enabled for new repositories and repositories transferred to this
   * organization.
   *
   * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
   * the organization that owns the repository. For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
   */
  public val secretScanningEnabledForNewRepositories: Boolean?
    get() = secretScanningEnabledForNewRepositoriesState.valueOrNull()

  /**
   * If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors
   * who are blocked from pushing a secret.
   */
  public val secretScanningPushProtectionCustomLink: String?
    get() = secretScanningPushProtectionCustomLinkState.valueOrNull()

  /**
   * Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection.
   */
  public val secretScanningPushProtectionCustomLinkEnabled: Boolean?
    get() = secretScanningPushProtectionCustomLinkEnabledState.valueOrNull()

  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether secret scanning push protection is automatically enabled for new repositories and repositories transferred
   * to this organization.
   *
   * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
   * the organization that owns the repository. For more information, see "[Managing security managers in your
   * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managin
   * g-security-managers-in-your-organization)."
   *
   * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
   */
  public val secretScanningPushProtectionEnabledForNewRepositories: Boolean?
    get() = secretScanningPushProtectionEnabledForNewRepositoriesState.valueOrNull()

  /**
   * The Twitter username of the company.
   */
  public val twitterUsername: String?
    get() = twitterUsernameState.valueOrNull()

  /**
   * Whether contributors to organization repositories are required to sign off on commits they make through GitHub's
   * web interface.
   */
  public val webCommitSignoffRequired: Boolean?
    get() = webCommitSignoffRequiredState.valueOrNull()

  public constructor() : this(advancedSecurityEnabledForNewRepositoriesState = FieldState.Absent,
  billingEmailState = FieldState.Absent,
  blogState = FieldState.Absent,
  companyState = FieldState.Absent,
  defaultRepositoryPermissionState = FieldState.Absent,
  dependabotAlertsEnabledForNewRepositoriesState = FieldState.Absent,
  dependabotSecurityUpdatesEnabledForNewRepositoriesState = FieldState.Absent,
  dependencyGraphEnabledForNewRepositoriesState = FieldState.Absent,
  deployKeysEnabledForRepositoriesState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  emailState = FieldState.Absent,
  hasOrganizationProjectsState = FieldState.Absent,
  hasRepositoryProjectsState = FieldState.Absent,
  locationState = FieldState.Absent,
  membersAllowedRepositoryCreationTypeState = FieldState.Absent,
  membersCanCreateInternalRepositoriesState = FieldState.Absent,
  membersCanCreatePagesState = FieldState.Absent,
  membersCanCreatePrivatePagesState = FieldState.Absent,
  membersCanCreatePrivateRepositoriesState = FieldState.Absent,
  membersCanCreatePublicPagesState = FieldState.Absent,
  membersCanCreatePublicRepositoriesState = FieldState.Absent,
  membersCanCreateRepositoriesState = FieldState.Absent,
  membersCanForkPrivateRepositoriesState = FieldState.Absent,
  nameState = FieldState.Absent,
  secretScanningEnabledForNewRepositoriesState = FieldState.Absent,
  secretScanningPushProtectionCustomLinkState = FieldState.Absent,
  secretScanningPushProtectionCustomLinkEnabledState = FieldState.Absent,
  secretScanningPushProtectionEnabledForNewRepositoriesState = FieldState.Absent,
  twitterUsernameState = FieldState.Absent,
  webCommitSignoffRequiredState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `advanced_security_enabled_for_new_repositories`.
   */
  public fun advancedSecurityEnabledForNewRepositoriesPresence(): FieldPresence = advancedSecurityEnabledForNewRepositoriesState.presence

  /**
   * Returns the wire presence of `billing_email`.
   */
  public fun billingEmailPresence(): FieldPresence = billingEmailState.presence

  /**
   * Returns the wire presence of `blog`.
   */
  public fun blogPresence(): FieldPresence = blogState.presence

  /**
   * Returns the wire presence of `company`.
   */
  public fun companyPresence(): FieldPresence = companyState.presence

  /**
   * Returns the wire presence of `default_repository_permission`.
   */
  public fun defaultRepositoryPermissionPresence(): FieldPresence = defaultRepositoryPermissionState.presence

  /**
   * Returns the wire presence of `dependabot_alerts_enabled_for_new_repositories`.
   */
  public fun dependabotAlertsEnabledForNewRepositoriesPresence(): FieldPresence = dependabotAlertsEnabledForNewRepositoriesState.presence

  /**
   * Returns the wire presence of `dependabot_security_updates_enabled_for_new_repositories`.
   */
  public fun dependabotSecurityUpdatesEnabledForNewRepositoriesPresence(): FieldPresence = dependabotSecurityUpdatesEnabledForNewRepositoriesState.presence

  /**
   * Returns the wire presence of `dependency_graph_enabled_for_new_repositories`.
   */
  public fun dependencyGraphEnabledForNewRepositoriesPresence(): FieldPresence = dependencyGraphEnabledForNewRepositoriesState.presence

  /**
   * Returns the wire presence of `deploy_keys_enabled_for_repositories`.
   */
  public fun deployKeysEnabledForRepositoriesPresence(): FieldPresence = deployKeysEnabledForRepositoriesState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `email`.
   */
  public fun emailPresence(): FieldPresence = emailState.presence

  /**
   * Returns the wire presence of `has_organization_projects`.
   */
  public fun hasOrganizationProjectsPresence(): FieldPresence = hasOrganizationProjectsState.presence

  /**
   * Returns the wire presence of `has_repository_projects`.
   */
  public fun hasRepositoryProjectsPresence(): FieldPresence = hasRepositoryProjectsState.presence

  /**
   * Returns the wire presence of `location`.
   */
  public fun locationPresence(): FieldPresence = locationState.presence

  /**
   * Returns the wire presence of `members_allowed_repository_creation_type`.
   */
  public fun membersAllowedRepositoryCreationTypePresence(): FieldPresence = membersAllowedRepositoryCreationTypeState.presence

  /**
   * Returns the wire presence of `members_can_create_internal_repositories`.
   */
  public fun membersCanCreateInternalRepositoriesPresence(): FieldPresence = membersCanCreateInternalRepositoriesState.presence

  /**
   * Returns the wire presence of `members_can_create_pages`.
   */
  public fun membersCanCreatePagesPresence(): FieldPresence = membersCanCreatePagesState.presence

  /**
   * Returns the wire presence of `members_can_create_private_pages`.
   */
  public fun membersCanCreatePrivatePagesPresence(): FieldPresence = membersCanCreatePrivatePagesState.presence

  /**
   * Returns the wire presence of `members_can_create_private_repositories`.
   */
  public fun membersCanCreatePrivateRepositoriesPresence(): FieldPresence = membersCanCreatePrivateRepositoriesState.presence

  /**
   * Returns the wire presence of `members_can_create_public_pages`.
   */
  public fun membersCanCreatePublicPagesPresence(): FieldPresence = membersCanCreatePublicPagesState.presence

  /**
   * Returns the wire presence of `members_can_create_public_repositories`.
   */
  public fun membersCanCreatePublicRepositoriesPresence(): FieldPresence = membersCanCreatePublicRepositoriesState.presence

  /**
   * Returns the wire presence of `members_can_create_repositories`.
   */
  public fun membersCanCreateRepositoriesPresence(): FieldPresence = membersCanCreateRepositoriesState.presence

  /**
   * Returns the wire presence of `members_can_fork_private_repositories`.
   */
  public fun membersCanForkPrivateRepositoriesPresence(): FieldPresence = membersCanForkPrivateRepositoriesState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `secret_scanning_enabled_for_new_repositories`.
   */
  public fun secretScanningEnabledForNewRepositoriesPresence(): FieldPresence = secretScanningEnabledForNewRepositoriesState.presence

  /**
   * Returns the wire presence of `secret_scanning_push_protection_custom_link`.
   */
  public fun secretScanningPushProtectionCustomLinkPresence(): FieldPresence = secretScanningPushProtectionCustomLinkState.presence

  /**
   * Returns the wire presence of `secret_scanning_push_protection_custom_link_enabled`.
   */
  public fun secretScanningPushProtectionCustomLinkEnabledPresence(): FieldPresence = secretScanningPushProtectionCustomLinkEnabledState.presence

  /**
   * Returns the wire presence of `secret_scanning_push_protection_enabled_for_new_repositories`.
   */
  public fun secretScanningPushProtectionEnabledForNewRepositoriesPresence(): FieldPresence = secretScanningPushProtectionEnabledForNewRepositoriesState.presence

  /**
   * Returns the wire presence of `twitter_username`.
   */
  public fun twitterUsernamePresence(): FieldPresence = twitterUsernameState.presence

  /**
   * Returns the wire presence of `web_commit_signoff_required`.
   */
  public fun webCommitSignoffRequiredPresence(): FieldPresence = webCommitSignoffRequiredState.presence

  public class Builder {
    private var advancedSecurityEnabledForNewRepositoriesState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * **Endpoint closing down notice.** Please use [code security
     * configurations](https://docs.github.com/rest/code-security/configurations) instead.
     *
     * Whether GitHub Advanced Security is automatically enabled for new repositories and repositories transferred to
     * this organization.
     *
     * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
     * the organization that owns the repository. For more information, see "[Managing security managers in your
     * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/manag
     * ing-security-managers-in-your-organization)."
     *
     * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var advancedSecurityEnabledForNewRepositories: Boolean?
      get() = advancedSecurityEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "advancedSecurityEnabledForNewRepositories is not nullable; call unsetAdvancedSecurityEnabledForNewRepositories() to omit it" }
        advancedSecurityEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var billingEmailState: FieldState<String> = FieldState.Absent

    /**
     * Billing email address. This address is not publicized.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var billingEmail: String?
      get() = billingEmailState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "billingEmail is not nullable; call unsetBillingEmail() to omit it" }
        billingEmailState = FieldState.Value(present)
      }

    private var blogState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var blog: String?
      get() = blogState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "blog is not nullable; call unsetBlog() to omit it" }
        blogState = FieldState.Value(present)
      }

    private var companyState: FieldState<String> = FieldState.Absent

    /**
     * The company name.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var company: String?
      get() = companyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "company is not nullable; call unsetCompany() to omit it" }
        companyState = FieldState.Value(present)
      }

    private var defaultRepositoryPermissionState:
        FieldState<InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080> =
        FieldState.Absent

    /**
     * Default permission level members have for organization repositories.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var defaultRepositoryPermission:
        InlineOrgsPatchRequestJsonDefaultRepositoryPermissionXe314e080?
      get() = defaultRepositoryPermissionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "defaultRepositoryPermission is not nullable; call unsetDefaultRepositoryPermission() to omit it" }
        defaultRepositoryPermissionState = FieldState.Value(present)
      }

    private var dependabotAlertsEnabledForNewRepositoriesState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * **Endpoint closing down notice.** Please use [code security
     * configurations](https://docs.github.com/rest/code-security/configurations) instead.
     *
     * Whether Dependabot alerts are automatically enabled for new repositories and repositories transferred to this
     * organization.
     *
     * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
     * the organization that owns the repository. For more information, see "[Managing security managers in your
     * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/manag
     * ing-security-managers-in-your-organization)."
     *
     * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependabotAlertsEnabledForNewRepositories: Boolean?
      get() = dependabotAlertsEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependabotAlertsEnabledForNewRepositories is not nullable; call unsetDependabotAlertsEnabledForNewRepositories() to omit it" }
        dependabotAlertsEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var dependabotSecurityUpdatesEnabledForNewRepositoriesState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * **Endpoint closing down notice.** Please use [code security
     * configurations](https://docs.github.com/rest/code-security/configurations) instead.
     *
     * Whether Dependabot security updates are automatically enabled for new repositories and repositories transferred
     * to this organization.
     *
     * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
     * the organization that owns the repository. For more information, see "[Managing security managers in your
     * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/manag
     * ing-security-managers-in-your-organization)."
     *
     * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependabotSecurityUpdatesEnabledForNewRepositories: Boolean?
      get() = dependabotSecurityUpdatesEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependabotSecurityUpdatesEnabledForNewRepositories is not nullable; call unsetDependabotSecurityUpdatesEnabledForNewRepositories() to omit it" }
        dependabotSecurityUpdatesEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var dependencyGraphEnabledForNewRepositoriesState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * **Endpoint closing down notice.** Please use [code security
     * configurations](https://docs.github.com/rest/code-security/configurations) instead.
     *
     * Whether dependency graph is automatically enabled for new repositories and repositories transferred to this
     * organization.
     *
     * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
     * the organization that owns the repository. For more information, see "[Managing security managers in your
     * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/manag
     * ing-security-managers-in-your-organization)."
     *
     * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependencyGraphEnabledForNewRepositories: Boolean?
      get() = dependencyGraphEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependencyGraphEnabledForNewRepositories is not nullable; call unsetDependencyGraphEnabledForNewRepositories() to omit it" }
        dependencyGraphEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var deployKeysEnabledForRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Controls whether or not deploy keys may be added and used for repositories in the organization.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var deployKeysEnabledForRepositories: Boolean?
      get() = deployKeysEnabledForRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "deployKeysEnabledForRepositories is not nullable; call unsetDeployKeysEnabledForRepositories() to omit it" }
        deployKeysEnabledForRepositoriesState = FieldState.Value(present)
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * The description of the company. The maximum size is 160 characters.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var emailState: FieldState<String> = FieldState.Absent

    /**
     * The publicly visible email address.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "email is not nullable; call unsetEmail() to omit it" }
        emailState = FieldState.Value(present)
      }

    private var hasOrganizationProjectsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether an organization can use organization projects.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasOrganizationProjects: Boolean?
      get() = hasOrganizationProjectsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasOrganizationProjects is not nullable; call unsetHasOrganizationProjects() to omit it" }
        hasOrganizationProjectsState = FieldState.Value(present)
      }

    private var hasRepositoryProjectsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether repositories that belong to the organization can use repository projects.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var hasRepositoryProjects: Boolean?
      get() = hasRepositoryProjectsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "hasRepositoryProjects is not nullable; call unsetHasRepositoryProjects() to omit it" }
        hasRepositoryProjectsState = FieldState.Value(present)
      }

    private var locationState: FieldState<String> = FieldState.Absent

    /**
     * The location.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var location: String?
      get() = locationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "location is not nullable; call unsetLocation() to omit it" }
        locationState = FieldState.Value(present)
      }

    private var membersAllowedRepositoryCreationTypeState:
        FieldState<InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8> =
        FieldState.Absent

    /**
     * Specifies which types of repositories non-admin organization members can create. `private` is only available to
     * repositories that are part of an organization on GitHub Enterprise Cloud.
     * **Note:** This parameter is closing down and will be removed in the future. Its return value ignores internal
     * repositories. Using this parameter overrides values set in `members_can_create_repositories`. See the parameter
     * deprecation notice in the operation description for details.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersAllowedRepositoryCreationType:
        InlineOrgsPatchRequestJsonMembersAllowedRepositoryCreationTypeXe78ed6d8?
      get() = membersAllowedRepositoryCreationTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersAllowedRepositoryCreationType is not nullable; call unsetMembersAllowedRepositoryCreationType() to omit it" }
        membersAllowedRepositoryCreationTypeState = FieldState.Value(present)
      }

    private var membersCanCreateInternalRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether organization members can create internal repositories, which are visible to all enterprise members. You
     * can only allow members to create internal repositories if your organization is associated with an enterprise
     * account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. For more information, see "[Restricting
     * repository creation in your
     * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-reposito
     * ry-creation-in-your-organization)" in the GitHub Help documentation.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreateInternalRepositories: Boolean?
      get() = membersCanCreateInternalRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreateInternalRepositories is not nullable; call unsetMembersCanCreateInternalRepositories() to omit it" }
        membersCanCreateInternalRepositoriesState = FieldState.Value(present)
      }

    private var membersCanCreatePagesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether organization members can create GitHub Pages sites. Existing published sites will not be impacted.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreatePages: Boolean?
      get() = membersCanCreatePagesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreatePages is not nullable; call unsetMembersCanCreatePages() to omit it" }
        membersCanCreatePagesState = FieldState.Value(present)
      }

    private var membersCanCreatePrivatePagesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether organization members can create private GitHub Pages sites. Existing published sites will not be
     * impacted.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreatePrivatePages: Boolean?
      get() = membersCanCreatePrivatePagesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreatePrivatePages is not nullable; call unsetMembersCanCreatePrivatePages() to omit it" }
        membersCanCreatePrivatePagesState = FieldState.Value(present)
      }

    private var membersCanCreatePrivateRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether organization members can create private repositories, which are visible to organization members with
     * permission. For more information, see "[Restricting repository creation in your
     * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-reposito
     * ry-creation-in-your-organization)" in the GitHub Help documentation.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreatePrivateRepositories: Boolean?
      get() = membersCanCreatePrivateRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreatePrivateRepositories is not nullable; call unsetMembersCanCreatePrivateRepositories() to omit it" }
        membersCanCreatePrivateRepositoriesState = FieldState.Value(present)
      }

    private var membersCanCreatePublicPagesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether organization members can create public GitHub Pages sites. Existing published sites will not be impacted.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreatePublicPages: Boolean?
      get() = membersCanCreatePublicPagesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreatePublicPages is not nullable; call unsetMembersCanCreatePublicPages() to omit it" }
        membersCanCreatePublicPagesState = FieldState.Value(present)
      }

    private var membersCanCreatePublicRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether organization members can create public repositories, which are visible to anyone. For more information,
     * see "[Restricting repository creation in your
     * organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-reposito
     * ry-creation-in-your-organization)" in the GitHub Help documentation.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreatePublicRepositories: Boolean?
      get() = membersCanCreatePublicRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreatePublicRepositories is not nullable; call unsetMembersCanCreatePublicRepositories() to omit it" }
        membersCanCreatePublicRepositoriesState = FieldState.Value(present)
      }

    private var membersCanCreateRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether of non-admin organization members can create repositories. **Note:** A parameter can override this
     * parameter. See `members_allowed_repository_creation_type` in this table for details.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreateRepositories: Boolean?
      get() = membersCanCreateRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreateRepositories is not nullable; call unsetMembersCanCreateRepositories() to omit it" }
        membersCanCreateRepositoriesState = FieldState.Value(present)
      }

    private var membersCanForkPrivateRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether organization members can fork private organization repositories.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanForkPrivateRepositories: Boolean?
      get() = membersCanForkPrivateRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanForkPrivateRepositories is not nullable; call unsetMembersCanForkPrivateRepositories() to omit it" }
        membersCanForkPrivateRepositoriesState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The shorthand name of the company.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var secretScanningEnabledForNewRepositoriesState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * **Endpoint closing down notice.** Please use [code security
     * configurations](https://docs.github.com/rest/code-security/configurations) instead.
     *
     * Whether secret scanning is automatically enabled for new repositories and repositories transferred to this
     * organization.
     *
     * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
     * the organization that owns the repository. For more information, see "[Managing security managers in your
     * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/manag
     * ing-security-managers-in-your-organization)."
     *
     * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningEnabledForNewRepositories: Boolean?
      get() = secretScanningEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningEnabledForNewRepositories is not nullable; call unsetSecretScanningEnabledForNewRepositories() to omit it" }
        secretScanningEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var secretScanningPushProtectionCustomLinkState: FieldState<String> = FieldState.Absent

    /**
     * If `secret_scanning_push_protection_custom_link_enabled` is true, the URL that will be displayed to contributors
     * who are blocked from pushing a secret.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningPushProtectionCustomLink: String?
      get() = secretScanningPushProtectionCustomLinkState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningPushProtectionCustomLink is not nullable; call unsetSecretScanningPushProtectionCustomLink() to omit it" }
        secretScanningPushProtectionCustomLinkState = FieldState.Value(present)
      }

    private var secretScanningPushProtectionCustomLinkEnabledState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * Whether a custom link is shown to contributors who are blocked from pushing a secret by push protection.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningPushProtectionCustomLinkEnabled: Boolean?
      get() = secretScanningPushProtectionCustomLinkEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningPushProtectionCustomLinkEnabled is not nullable; call unsetSecretScanningPushProtectionCustomLinkEnabled() to omit it" }
        secretScanningPushProtectionCustomLinkEnabledState = FieldState.Value(present)
      }

    private var secretScanningPushProtectionEnabledForNewRepositoriesState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * **Endpoint closing down notice.** Please use [code security
     * configurations](https://docs.github.com/rest/code-security/configurations) instead.
     *
     * Whether secret scanning push protection is automatically enabled for new repositories and repositories
     * transferred to this organization.
     *
     * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for
     * the organization that owns the repository. For more information, see "[Managing security managers in your
     * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/manag
     * ing-security-managers-in-your-organization)."
     *
     * You can check which security and analysis features are currently enabled by using a `GET /orgs/{org}` request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningPushProtectionEnabledForNewRepositories: Boolean?
      get() = secretScanningPushProtectionEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningPushProtectionEnabledForNewRepositories is not nullable; call unsetSecretScanningPushProtectionEnabledForNewRepositories() to omit it" }
        secretScanningPushProtectionEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var twitterUsernameState: FieldState<String> = FieldState.Absent

    /**
     * The Twitter username of the company.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var twitterUsername: String?
      get() = twitterUsernameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "twitterUsername is not nullable; call unsetTwitterUsername() to omit it" }
        twitterUsernameState = FieldState.Value(present)
      }

    private var webCommitSignoffRequiredState: FieldState<Boolean> = FieldState.Absent

    /**
     * Whether contributors to organization repositories are required to sign off on commits they make through GitHub's
     * web interface.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var webCommitSignoffRequired: Boolean?
      get() = webCommitSignoffRequiredState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "webCommitSignoffRequired is not nullable; call unsetWebCommitSignoffRequired() to omit it" }
        webCommitSignoffRequiredState = FieldState.Value(present)
      }

    /**
     * Omits `advanced_security_enabled_for_new_repositories` from serialized output.
     */
    public fun unsetAdvancedSecurityEnabledForNewRepositories() {
      advancedSecurityEnabledForNewRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `billing_email` from serialized output.
     */
    public fun unsetBillingEmail() {
      billingEmailState = FieldState.Absent
    }

    /**
     * Omits `blog` from serialized output.
     */
    public fun unsetBlog() {
      blogState = FieldState.Absent
    }

    /**
     * Omits `company` from serialized output.
     */
    public fun unsetCompany() {
      companyState = FieldState.Absent
    }

    /**
     * Omits `default_repository_permission` from serialized output.
     */
    public fun unsetDefaultRepositoryPermission() {
      defaultRepositoryPermissionState = FieldState.Absent
    }

    /**
     * Omits `dependabot_alerts_enabled_for_new_repositories` from serialized output.
     */
    public fun unsetDependabotAlertsEnabledForNewRepositories() {
      dependabotAlertsEnabledForNewRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `dependabot_security_updates_enabled_for_new_repositories` from serialized output.
     */
    public fun unsetDependabotSecurityUpdatesEnabledForNewRepositories() {
      dependabotSecurityUpdatesEnabledForNewRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `dependency_graph_enabled_for_new_repositories` from serialized output.
     */
    public fun unsetDependencyGraphEnabledForNewRepositories() {
      dependencyGraphEnabledForNewRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `deploy_keys_enabled_for_repositories` from serialized output.
     */
    public fun unsetDeployKeysEnabledForRepositories() {
      deployKeysEnabledForRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `email` from serialized output.
     */
    public fun unsetEmail() {
      emailState = FieldState.Absent
    }

    /**
     * Omits `has_organization_projects` from serialized output.
     */
    public fun unsetHasOrganizationProjects() {
      hasOrganizationProjectsState = FieldState.Absent
    }

    /**
     * Omits `has_repository_projects` from serialized output.
     */
    public fun unsetHasRepositoryProjects() {
      hasRepositoryProjectsState = FieldState.Absent
    }

    /**
     * Omits `location` from serialized output.
     */
    public fun unsetLocation() {
      locationState = FieldState.Absent
    }

    /**
     * Omits `members_allowed_repository_creation_type` from serialized output.
     */
    public fun unsetMembersAllowedRepositoryCreationType() {
      membersAllowedRepositoryCreationTypeState = FieldState.Absent
    }

    /**
     * Omits `members_can_create_internal_repositories` from serialized output.
     */
    public fun unsetMembersCanCreateInternalRepositories() {
      membersCanCreateInternalRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `members_can_create_pages` from serialized output.
     */
    public fun unsetMembersCanCreatePages() {
      membersCanCreatePagesState = FieldState.Absent
    }

    /**
     * Omits `members_can_create_private_pages` from serialized output.
     */
    public fun unsetMembersCanCreatePrivatePages() {
      membersCanCreatePrivatePagesState = FieldState.Absent
    }

    /**
     * Omits `members_can_create_private_repositories` from serialized output.
     */
    public fun unsetMembersCanCreatePrivateRepositories() {
      membersCanCreatePrivateRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `members_can_create_public_pages` from serialized output.
     */
    public fun unsetMembersCanCreatePublicPages() {
      membersCanCreatePublicPagesState = FieldState.Absent
    }

    /**
     * Omits `members_can_create_public_repositories` from serialized output.
     */
    public fun unsetMembersCanCreatePublicRepositories() {
      membersCanCreatePublicRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `members_can_create_repositories` from serialized output.
     */
    public fun unsetMembersCanCreateRepositories() {
      membersCanCreateRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `members_can_fork_private_repositories` from serialized output.
     */
    public fun unsetMembersCanForkPrivateRepositories() {
      membersCanForkPrivateRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_enabled_for_new_repositories` from serialized output.
     */
    public fun unsetSecretScanningEnabledForNewRepositories() {
      secretScanningEnabledForNewRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_push_protection_custom_link` from serialized output.
     */
    public fun unsetSecretScanningPushProtectionCustomLink() {
      secretScanningPushProtectionCustomLinkState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_push_protection_custom_link_enabled` from serialized output.
     */
    public fun unsetSecretScanningPushProtectionCustomLinkEnabled() {
      secretScanningPushProtectionCustomLinkEnabledState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_push_protection_enabled_for_new_repositories` from serialized output.
     */
    public fun unsetSecretScanningPushProtectionEnabledForNewRepositories() {
      secretScanningPushProtectionEnabledForNewRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `twitter_username` from serialized output.
     */
    public fun unsetTwitterUsername() {
      twitterUsernameState = FieldState.Absent
    }

    /**
     * Omits `web_commit_signoff_required` from serialized output.
     */
    public fun unsetWebCommitSignoffRequired() {
      webCommitSignoffRequiredState = FieldState.Absent
    }

    public fun build(): InlineOrgsPatchRequestJsonX630f7853 = InlineOrgsPatchRequestJsonX630f7853(
      advancedSecurityEnabledForNewRepositoriesState = advancedSecurityEnabledForNewRepositoriesState,
      billingEmailState = billingEmailState,
      blogState = blogState,
      companyState = companyState,
      defaultRepositoryPermissionState = defaultRepositoryPermissionState,
      dependabotAlertsEnabledForNewRepositoriesState = dependabotAlertsEnabledForNewRepositoriesState,
      dependabotSecurityUpdatesEnabledForNewRepositoriesState = dependabotSecurityUpdatesEnabledForNewRepositoriesState,
      dependencyGraphEnabledForNewRepositoriesState = dependencyGraphEnabledForNewRepositoriesState,
      deployKeysEnabledForRepositoriesState = deployKeysEnabledForRepositoriesState,
      descriptionState = descriptionState,
      emailState = emailState,
      hasOrganizationProjectsState = hasOrganizationProjectsState,
      hasRepositoryProjectsState = hasRepositoryProjectsState,
      locationState = locationState,
      membersAllowedRepositoryCreationTypeState = membersAllowedRepositoryCreationTypeState,
      membersCanCreateInternalRepositoriesState = membersCanCreateInternalRepositoriesState,
      membersCanCreatePagesState = membersCanCreatePagesState,
      membersCanCreatePrivatePagesState = membersCanCreatePrivatePagesState,
      membersCanCreatePrivateRepositoriesState = membersCanCreatePrivateRepositoriesState,
      membersCanCreatePublicPagesState = membersCanCreatePublicPagesState,
      membersCanCreatePublicRepositoriesState = membersCanCreatePublicRepositoriesState,
      membersCanCreateRepositoriesState = membersCanCreateRepositoriesState,
      membersCanForkPrivateRepositoriesState = membersCanForkPrivateRepositoriesState,
      nameState = nameState,
      secretScanningEnabledForNewRepositoriesState = secretScanningEnabledForNewRepositoriesState,
      secretScanningPushProtectionCustomLinkState = secretScanningPushProtectionCustomLinkState,
      secretScanningPushProtectionCustomLinkEnabledState = secretScanningPushProtectionCustomLinkEnabledState,
      secretScanningPushProtectionEnabledForNewRepositoriesState = secretScanningPushProtectionEnabledForNewRepositoriesState,
      twitterUsernameState = twitterUsernameState,
      webCommitSignoffRequiredState = webCommitSignoffRequiredState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsPatchRequestJsonX630f7853 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsPatchRequestJsonX630f7853> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsPatchRequestJsonX630f7853 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsPatchRequestJsonX630f7853")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsPatchRequestJsonX630f7853 must be a JSON object")
      return InlineOrgsPatchRequestJsonX630f7853(
        advancedSecurityEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "advanced_security_enabled_for_new_repositories", nullable = false),
        billingEmailState = json.decodeOptional(rawObject, "billing_email", nullable = false),
        blogState = json.decodeOptional(rawObject, "blog", nullable = false),
        companyState = json.decodeOptional(rawObject, "company", nullable = false),
        defaultRepositoryPermissionState = json.decodeOptional(rawObject, "default_repository_permission", nullable = false),
        dependabotAlertsEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "dependabot_alerts_enabled_for_new_repositories", nullable = false),
        dependabotSecurityUpdatesEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "dependabot_security_updates_enabled_for_new_repositories", nullable = false),
        dependencyGraphEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "dependency_graph_enabled_for_new_repositories", nullable = false),
        deployKeysEnabledForRepositoriesState = json.decodeOptional(rawObject, "deploy_keys_enabled_for_repositories", nullable = false),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        emailState = json.decodeOptional(rawObject, "email", nullable = false),
        hasOrganizationProjectsState = json.decodeOptional(rawObject, "has_organization_projects", nullable = false),
        hasRepositoryProjectsState = json.decodeOptional(rawObject, "has_repository_projects", nullable = false),
        locationState = json.decodeOptional(rawObject, "location", nullable = false),
        membersAllowedRepositoryCreationTypeState = json.decodeOptional(rawObject, "members_allowed_repository_creation_type", nullable = false),
        membersCanCreateInternalRepositoriesState = json.decodeOptional(rawObject, "members_can_create_internal_repositories", nullable = false),
        membersCanCreatePagesState = json.decodeOptional(rawObject, "members_can_create_pages", nullable = false),
        membersCanCreatePrivatePagesState = json.decodeOptional(rawObject, "members_can_create_private_pages", nullable = false),
        membersCanCreatePrivateRepositoriesState = json.decodeOptional(rawObject, "members_can_create_private_repositories", nullable = false),
        membersCanCreatePublicPagesState = json.decodeOptional(rawObject, "members_can_create_public_pages", nullable = false),
        membersCanCreatePublicRepositoriesState = json.decodeOptional(rawObject, "members_can_create_public_repositories", nullable = false),
        membersCanCreateRepositoriesState = json.decodeOptional(rawObject, "members_can_create_repositories", nullable = false),
        membersCanForkPrivateRepositoriesState = json.decodeOptional(rawObject, "members_can_fork_private_repositories", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        secretScanningEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "secret_scanning_enabled_for_new_repositories", nullable = false),
        secretScanningPushProtectionCustomLinkState = json.decodeOptional(rawObject, "secret_scanning_push_protection_custom_link", nullable = false),
        secretScanningPushProtectionCustomLinkEnabledState = json.decodeOptional(rawObject, "secret_scanning_push_protection_custom_link_enabled", nullable = false),
        secretScanningPushProtectionEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "secret_scanning_push_protection_enabled_for_new_repositories", nullable = false),
        twitterUsernameState = json.decodeOptional(rawObject, "twitter_username", nullable = false),
        webCommitSignoffRequiredState = json.decodeOptional(rawObject, "web_commit_signoff_required", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsPatchRequestJsonX630f7853) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsPatchRequestJsonX630f7853")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("advanced_security_enabled_for_new_repositories", value.advancedSecurityEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("billing_email", value.billingEmailState, json::encodeToJsonElement)
        putState("blog", value.blogState, json::encodeToJsonElement)
        putState("company", value.companyState, json::encodeToJsonElement)
        putState("default_repository_permission", value.defaultRepositoryPermissionState, json::encodeToJsonElement)
        putState("dependabot_alerts_enabled_for_new_repositories", value.dependabotAlertsEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("dependabot_security_updates_enabled_for_new_repositories", value.dependabotSecurityUpdatesEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("dependency_graph_enabled_for_new_repositories", value.dependencyGraphEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("deploy_keys_enabled_for_repositories", value.deployKeysEnabledForRepositoriesState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("email", value.emailState, json::encodeToJsonElement)
        putState("has_organization_projects", value.hasOrganizationProjectsState, json::encodeToJsonElement)
        putState("has_repository_projects", value.hasRepositoryProjectsState, json::encodeToJsonElement)
        putState("location", value.locationState, json::encodeToJsonElement)
        putState("members_allowed_repository_creation_type", value.membersAllowedRepositoryCreationTypeState, json::encodeToJsonElement)
        putState("members_can_create_internal_repositories", value.membersCanCreateInternalRepositoriesState, json::encodeToJsonElement)
        putState("members_can_create_pages", value.membersCanCreatePagesState, json::encodeToJsonElement)
        putState("members_can_create_private_pages", value.membersCanCreatePrivatePagesState, json::encodeToJsonElement)
        putState("members_can_create_private_repositories", value.membersCanCreatePrivateRepositoriesState, json::encodeToJsonElement)
        putState("members_can_create_public_pages", value.membersCanCreatePublicPagesState, json::encodeToJsonElement)
        putState("members_can_create_public_repositories", value.membersCanCreatePublicRepositoriesState, json::encodeToJsonElement)
        putState("members_can_create_repositories", value.membersCanCreateRepositoriesState, json::encodeToJsonElement)
        putState("members_can_fork_private_repositories", value.membersCanForkPrivateRepositoriesState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("secret_scanning_enabled_for_new_repositories", value.secretScanningEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection_custom_link", value.secretScanningPushProtectionCustomLinkState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection_custom_link_enabled", value.secretScanningPushProtectionCustomLinkEnabledState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection_enabled_for_new_repositories", value.secretScanningPushProtectionEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("twitter_username", value.twitterUsernameState, json::encodeToJsonElement)
        putState("web_commit_signoff_required", value.webCommitSignoffRequiredState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsPatchRequestJsonX630f7853(block: InlineOrgsPatchRequestJsonX630f7853.Builder.() -> Unit): InlineOrgsPatchRequestJsonX630f7853 = InlineOrgsPatchRequestJsonX630f7853.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsPatchRequestJsonX630f7853 property '" + name + "' is not nullable")
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
