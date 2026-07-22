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
 * Organization Full
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/organization-full
 */
@Serializable(with = OrganizationFull.Serializer::class)
public class OrganizationFull internal constructor(
  public val archivedAt: String?,
  public val avatarUrl: String,
  public val createdAt: String,
  public val description: String?,
  public val eventsUrl: String,
  public val followers: Int,
  public val following: Int,
  public val hasOrganizationProjects: Boolean,
  public val hasRepositoryProjects: Boolean,
  public val hooksUrl: String,
  public val htmlUrl: String,
  public val id: Int,
  public val issuesUrl: String,
  public val login: String,
  public val membersUrl: String,
  public val nodeId: String,
  public val publicGists: Int,
  public val publicMembersUrl: String,
  public val publicRepos: Int,
  public val reposUrl: String,
  public val type: String,
  public val updatedAt: String,
  public val url: String,
  private val advancedSecurityEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val billingEmailState: FieldState<String?>,
  private val blogState: FieldState<String>,
  private val collaboratorsState: FieldState<Int?>,
  private val companyState: FieldState<String>,
  private val defaultRepositoryBranchState: FieldState<String?>,
  private val defaultRepositoryPermissionState: FieldState<String?>,
  private val dependabotAlertsEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val dependabotSecurityUpdatesEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val dependencyGraphEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val deployKeysEnabledForRepositoriesState: FieldState<Boolean>,
  private val diskUsageState: FieldState<Int?>,
  private val displayCommenterFullNameSettingEnabledState: FieldState<Boolean>,
  private val emailState: FieldState<String>,
  private val isVerifiedState: FieldState<Boolean>,
  private val locationState: FieldState<String>,
  private val membersAllowedRepositoryCreationTypeState: FieldState<String>,
  private val membersCanChangeRepoVisibilityState: FieldState<Boolean>,
  private val membersCanCreateInternalRepositoriesState: FieldState<Boolean>,
  private val membersCanCreatePagesState: FieldState<Boolean>,
  private val membersCanCreatePrivatePagesState: FieldState<Boolean>,
  private val membersCanCreatePrivateRepositoriesState: FieldState<Boolean>,
  private val membersCanCreatePublicPagesState: FieldState<Boolean>,
  private val membersCanCreatePublicRepositoriesState: FieldState<Boolean>,
  private val membersCanCreateRepositoriesState: FieldState<Boolean?>,
  private val membersCanCreateTeamsState: FieldState<Boolean>,
  private val membersCanDeleteIssuesState: FieldState<Boolean>,
  private val membersCanDeleteRepositoriesState: FieldState<Boolean>,
  private val membersCanForkPrivateRepositoriesState: FieldState<Boolean?>,
  private val membersCanInviteOutsideCollaboratorsState: FieldState<Boolean>,
  private val membersCanViewDependencyInsightsState: FieldState<Boolean>,
  private val nameState: FieldState<String>,
  private val ownedPrivateReposState: FieldState<Int>,
  private val planState: FieldState<InlineOrganizationFullPlanX1aa3d467>,
  private val privateGistsState: FieldState<Int?>,
  private val readersCanCreateDiscussionsState: FieldState<Boolean>,
  private val secretScanningEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val secretScanningPushProtectionCustomLinkState: FieldState<String?>,
  private val secretScanningPushProtectionCustomLinkEnabledState: FieldState<Boolean>,
  private val secretScanningPushProtectionEnabledForNewRepositoriesState: FieldState<Boolean>,
  private val totalPrivateReposState: FieldState<Int>,
  private val twitterUsernameState: FieldState<String?>,
  private val twoFactorRequirementEnabledState: FieldState<Boolean?>,
  private val webCommitSignoffRequiredState: FieldState<Boolean>,
) {
  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether GitHub Advanced Security is enabled for new repositories and repositories transferred to this organization.
   *
   * This field is only visible to organization owners or members of a team with the security manager role.
   */
  public val advancedSecurityEnabledForNewRepositories: Boolean?
    get() = advancedSecurityEnabledForNewRepositoriesState.valueOrNull()

  public val billingEmail: String?
    get() = billingEmailState.valueOrNull()

  public val blog: String?
    get() = blogState.valueOrNull()

  /**
   * The number of collaborators on private repositories.
   *
   * This field may be null if the number of private repositories is over 50,000.
   */
  public val collaborators: Int?
    get() = collaboratorsState.valueOrNull()

  public val company: String?
    get() = companyState.valueOrNull()

  /**
   * The default branch for repositories created in this organization.
   */
  public val defaultRepositoryBranch: String?
    get() = defaultRepositoryBranchState.valueOrNull()

  public val defaultRepositoryPermission: String?
    get() = defaultRepositoryPermissionState.valueOrNull()

  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether Dependabot alerts are automatically enabled for new repositories and repositories transferred to this
   * organization.
   *
   * This field is only visible to organization owners or members of a team with the security manager role.
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
   * This field is only visible to organization owners or members of a team with the security manager role.
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
   * This field is only visible to organization owners or members of a team with the security manager role.
   */
  public val dependencyGraphEnabledForNewRepositories: Boolean?
    get() = dependencyGraphEnabledForNewRepositoriesState.valueOrNull()

  /**
   * Controls whether or not deploy keys may be added and used for repositories in the organization.
   */
  public val deployKeysEnabledForRepositories: Boolean?
    get() = deployKeysEnabledForRepositoriesState.valueOrNull()

  public val diskUsage: Int?
    get() = diskUsageState.valueOrNull()

  public val displayCommenterFullNameSettingEnabled: Boolean?
    get() = displayCommenterFullNameSettingEnabledState.valueOrNull()

  public val email: String?
    get() = emailState.valueOrNull()

  public val isVerified: Boolean?
    get() = isVerifiedState.valueOrNull()

  public val location: String?
    get() = locationState.valueOrNull()

  public val membersAllowedRepositoryCreationType: String?
    get() = membersAllowedRepositoryCreationTypeState.valueOrNull()

  public val membersCanChangeRepoVisibility: Boolean?
    get() = membersCanChangeRepoVisibilityState.valueOrNull()

  public val membersCanCreateInternalRepositories: Boolean?
    get() = membersCanCreateInternalRepositoriesState.valueOrNull()

  public val membersCanCreatePages: Boolean?
    get() = membersCanCreatePagesState.valueOrNull()

  public val membersCanCreatePrivatePages: Boolean?
    get() = membersCanCreatePrivatePagesState.valueOrNull()

  public val membersCanCreatePrivateRepositories: Boolean?
    get() = membersCanCreatePrivateRepositoriesState.valueOrNull()

  public val membersCanCreatePublicPages: Boolean?
    get() = membersCanCreatePublicPagesState.valueOrNull()

  public val membersCanCreatePublicRepositories: Boolean?
    get() = membersCanCreatePublicRepositoriesState.valueOrNull()

  public val membersCanCreateRepositories: Boolean?
    get() = membersCanCreateRepositoriesState.valueOrNull()

  public val membersCanCreateTeams: Boolean?
    get() = membersCanCreateTeamsState.valueOrNull()

  public val membersCanDeleteIssues: Boolean?
    get() = membersCanDeleteIssuesState.valueOrNull()

  public val membersCanDeleteRepositories: Boolean?
    get() = membersCanDeleteRepositoriesState.valueOrNull()

  public val membersCanForkPrivateRepositories: Boolean?
    get() = membersCanForkPrivateRepositoriesState.valueOrNull()

  public val membersCanInviteOutsideCollaborators: Boolean?
    get() = membersCanInviteOutsideCollaboratorsState.valueOrNull()

  public val membersCanViewDependencyInsights: Boolean?
    get() = membersCanViewDependencyInsightsState.valueOrNull()

  public val name: String?
    get() = nameState.valueOrNull()

  public val ownedPrivateRepos: Int?
    get() = ownedPrivateReposState.valueOrNull()

  public val plan: InlineOrganizationFullPlanX1aa3d467?
    get() = planState.valueOrNull()

  public val privateGists: Int?
    get() = privateGistsState.valueOrNull()

  public val readersCanCreateDiscussions: Boolean?
    get() = readersCanCreateDiscussionsState.valueOrNull()

  /**
   * **Endpoint closing down notice.** Please use [code security
   * configurations](https://docs.github.com/rest/code-security/configurations) instead.
   *
   * Whether secret scanning is automatically enabled for new repositories and repositories transferred to this
   * organization.
   *
   * This field is only visible to organization owners or members of a team with the security manager role.
   */
  public val secretScanningEnabledForNewRepositories: Boolean?
    get() = secretScanningEnabledForNewRepositoriesState.valueOrNull()

  /**
   * An optional URL string to display to contributors who are blocked from pushing a secret.
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
   * This field is only visible to organization owners or members of a team with the security manager role.
   */
  public val secretScanningPushProtectionEnabledForNewRepositories: Boolean?
    get() = secretScanningPushProtectionEnabledForNewRepositoriesState.valueOrNull()

  public val totalPrivateRepos: Int?
    get() = totalPrivateReposState.valueOrNull()

  public val twitterUsername: String?
    get() = twitterUsernameState.valueOrNull()

  public val twoFactorRequirementEnabled: Boolean?
    get() = twoFactorRequirementEnabledState.valueOrNull()

  public val webCommitSignoffRequired: Boolean?
    get() = webCommitSignoffRequiredState.valueOrNull()

  public constructor(
    archivedAt: String?,
    avatarUrl: String,
    createdAt: String,
    description: String?,
    eventsUrl: String,
    followers: Int,
    following: Int,
    hasOrganizationProjects: Boolean,
    hasRepositoryProjects: Boolean,
    hooksUrl: String,
    htmlUrl: String,
    id: Int,
    issuesUrl: String,
    login: String,
    membersUrl: String,
    nodeId: String,
    publicGists: Int,
    publicMembersUrl: String,
    publicRepos: Int,
    reposUrl: String,
    type: String,
    updatedAt: String,
    url: String,
  ) : this(archivedAt = archivedAt,
  avatarUrl = avatarUrl,
  createdAt = createdAt,
  description = description,
  eventsUrl = eventsUrl,
  followers = followers,
  following = following,
  hasOrganizationProjects = hasOrganizationProjects,
  hasRepositoryProjects = hasRepositoryProjects,
  hooksUrl = hooksUrl,
  htmlUrl = htmlUrl,
  id = id,
  issuesUrl = issuesUrl,
  login = login,
  membersUrl = membersUrl,
  nodeId = nodeId,
  publicGists = publicGists,
  publicMembersUrl = publicMembersUrl,
  publicRepos = publicRepos,
  reposUrl = reposUrl,
  type = type,
  updatedAt = updatedAt,
  url = url,
  advancedSecurityEnabledForNewRepositoriesState = FieldState.Absent,
  billingEmailState = FieldState.Absent,
  blogState = FieldState.Absent,
  collaboratorsState = FieldState.Absent,
  companyState = FieldState.Absent,
  defaultRepositoryBranchState = FieldState.Absent,
  defaultRepositoryPermissionState = FieldState.Absent,
  dependabotAlertsEnabledForNewRepositoriesState = FieldState.Absent,
  dependabotSecurityUpdatesEnabledForNewRepositoriesState = FieldState.Absent,
  dependencyGraphEnabledForNewRepositoriesState = FieldState.Absent,
  deployKeysEnabledForRepositoriesState = FieldState.Absent,
  diskUsageState = FieldState.Absent,
  displayCommenterFullNameSettingEnabledState = FieldState.Absent,
  emailState = FieldState.Absent,
  isVerifiedState = FieldState.Absent,
  locationState = FieldState.Absent,
  membersAllowedRepositoryCreationTypeState = FieldState.Absent,
  membersCanChangeRepoVisibilityState = FieldState.Absent,
  membersCanCreateInternalRepositoriesState = FieldState.Absent,
  membersCanCreatePagesState = FieldState.Absent,
  membersCanCreatePrivatePagesState = FieldState.Absent,
  membersCanCreatePrivateRepositoriesState = FieldState.Absent,
  membersCanCreatePublicPagesState = FieldState.Absent,
  membersCanCreatePublicRepositoriesState = FieldState.Absent,
  membersCanCreateRepositoriesState = FieldState.Absent,
  membersCanCreateTeamsState = FieldState.Absent,
  membersCanDeleteIssuesState = FieldState.Absent,
  membersCanDeleteRepositoriesState = FieldState.Absent,
  membersCanForkPrivateRepositoriesState = FieldState.Absent,
  membersCanInviteOutsideCollaboratorsState = FieldState.Absent,
  membersCanViewDependencyInsightsState = FieldState.Absent,
  nameState = FieldState.Absent,
  ownedPrivateReposState = FieldState.Absent,
  planState = FieldState.Absent,
  privateGistsState = FieldState.Absent,
  readersCanCreateDiscussionsState = FieldState.Absent,
  secretScanningEnabledForNewRepositoriesState = FieldState.Absent,
  secretScanningPushProtectionCustomLinkState = FieldState.Absent,
  secretScanningPushProtectionCustomLinkEnabledState = FieldState.Absent,
  secretScanningPushProtectionEnabledForNewRepositoriesState = FieldState.Absent,
  totalPrivateReposState = FieldState.Absent,
  twitterUsernameState = FieldState.Absent,
  twoFactorRequirementEnabledState = FieldState.Absent,
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
   * Returns the wire presence of `collaborators`.
   */
  public fun collaboratorsPresence(): FieldPresence = collaboratorsState.presence

  /**
   * Returns the wire presence of `company`.
   */
  public fun companyPresence(): FieldPresence = companyState.presence

  /**
   * Returns the wire presence of `default_repository_branch`.
   */
  public fun defaultRepositoryBranchPresence(): FieldPresence = defaultRepositoryBranchState.presence

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
   * Returns the wire presence of `disk_usage`.
   */
  public fun diskUsagePresence(): FieldPresence = diskUsageState.presence

  /**
   * Returns the wire presence of `display_commenter_full_name_setting_enabled`.
   */
  public fun displayCommenterFullNameSettingEnabledPresence(): FieldPresence = displayCommenterFullNameSettingEnabledState.presence

  /**
   * Returns the wire presence of `email`.
   */
  public fun emailPresence(): FieldPresence = emailState.presence

  /**
   * Returns the wire presence of `is_verified`.
   */
  public fun isVerifiedPresence(): FieldPresence = isVerifiedState.presence

  /**
   * Returns the wire presence of `location`.
   */
  public fun locationPresence(): FieldPresence = locationState.presence

  /**
   * Returns the wire presence of `members_allowed_repository_creation_type`.
   */
  public fun membersAllowedRepositoryCreationTypePresence(): FieldPresence = membersAllowedRepositoryCreationTypeState.presence

  /**
   * Returns the wire presence of `members_can_change_repo_visibility`.
   */
  public fun membersCanChangeRepoVisibilityPresence(): FieldPresence = membersCanChangeRepoVisibilityState.presence

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
   * Returns the wire presence of `members_can_create_teams`.
   */
  public fun membersCanCreateTeamsPresence(): FieldPresence = membersCanCreateTeamsState.presence

  /**
   * Returns the wire presence of `members_can_delete_issues`.
   */
  public fun membersCanDeleteIssuesPresence(): FieldPresence = membersCanDeleteIssuesState.presence

  /**
   * Returns the wire presence of `members_can_delete_repositories`.
   */
  public fun membersCanDeleteRepositoriesPresence(): FieldPresence = membersCanDeleteRepositoriesState.presence

  /**
   * Returns the wire presence of `members_can_fork_private_repositories`.
   */
  public fun membersCanForkPrivateRepositoriesPresence(): FieldPresence = membersCanForkPrivateRepositoriesState.presence

  /**
   * Returns the wire presence of `members_can_invite_outside_collaborators`.
   */
  public fun membersCanInviteOutsideCollaboratorsPresence(): FieldPresence = membersCanInviteOutsideCollaboratorsState.presence

  /**
   * Returns the wire presence of `members_can_view_dependency_insights`.
   */
  public fun membersCanViewDependencyInsightsPresence(): FieldPresence = membersCanViewDependencyInsightsState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `owned_private_repos`.
   */
  public fun ownedPrivateReposPresence(): FieldPresence = ownedPrivateReposState.presence

  /**
   * Returns the wire presence of `plan`.
   */
  public fun planPresence(): FieldPresence = planState.presence

  /**
   * Returns the wire presence of `private_gists`.
   */
  public fun privateGistsPresence(): FieldPresence = privateGistsState.presence

  /**
   * Returns the wire presence of `readers_can_create_discussions`.
   */
  public fun readersCanCreateDiscussionsPresence(): FieldPresence = readersCanCreateDiscussionsState.presence

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
   * Returns the wire presence of `total_private_repos`.
   */
  public fun totalPrivateReposPresence(): FieldPresence = totalPrivateReposState.presence

  /**
   * Returns the wire presence of `twitter_username`.
   */
  public fun twitterUsernamePresence(): FieldPresence = twitterUsernameState.presence

  /**
   * Returns the wire presence of `two_factor_requirement_enabled`.
   */
  public fun twoFactorRequirementEnabledPresence(): FieldPresence = twoFactorRequirementEnabledState.presence

  /**
   * Returns the wire presence of `web_commit_signoff_required`.
   */
  public fun webCommitSignoffRequiredPresence(): FieldPresence = webCommitSignoffRequiredState.presence

  public class Builder {
    private var avatarUrlValue: String? = null

    public var avatarUrl: String
      get() = requireNotNull(avatarUrlValue) { "avatarUrl is required" }
      set(`value`) {
        avatarUrlValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var eventsUrlValue: String? = null

    public var eventsUrl: String
      get() = requireNotNull(eventsUrlValue) { "eventsUrl is required" }
      set(`value`) {
        eventsUrlValue = value
      }

    private var followersValue: Int? = null

    public var followers: Int
      get() = requireNotNull(followersValue) { "followers is required" }
      set(`value`) {
        followersValue = value
      }

    private var followingValue: Int? = null

    public var following: Int
      get() = requireNotNull(followingValue) { "following is required" }
      set(`value`) {
        followingValue = value
      }

    private var hasOrganizationProjectsValue: Boolean? = null

    public var hasOrganizationProjects: Boolean
      get() = requireNotNull(hasOrganizationProjectsValue) { "hasOrganizationProjects is required" }
      set(`value`) {
        hasOrganizationProjectsValue = value
      }

    private var hasRepositoryProjectsValue: Boolean? = null

    public var hasRepositoryProjects: Boolean
      get() = requireNotNull(hasRepositoryProjectsValue) { "hasRepositoryProjects is required" }
      set(`value`) {
        hasRepositoryProjectsValue = value
      }

    private var hooksUrlValue: String? = null

    public var hooksUrl: String
      get() = requireNotNull(hooksUrlValue) { "hooksUrl is required" }
      set(`value`) {
        hooksUrlValue = value
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

    private var issuesUrlValue: String? = null

    public var issuesUrl: String
      get() = requireNotNull(issuesUrlValue) { "issuesUrl is required" }
      set(`value`) {
        issuesUrlValue = value
      }

    private var loginValue: String? = null

    public var login: String
      get() = requireNotNull(loginValue) { "login is required" }
      set(`value`) {
        loginValue = value
      }

    private var membersUrlValue: String? = null

    public var membersUrl: String
      get() = requireNotNull(membersUrlValue) { "membersUrl is required" }
      set(`value`) {
        membersUrlValue = value
      }

    private var nodeIdValue: String? = null

    public var nodeId: String
      get() = requireNotNull(nodeIdValue) { "nodeId is required" }
      set(`value`) {
        nodeIdValue = value
      }

    private var publicGistsValue: Int? = null

    public var publicGists: Int
      get() = requireNotNull(publicGistsValue) { "publicGists is required" }
      set(`value`) {
        publicGistsValue = value
      }

    private var publicMembersUrlValue: String? = null

    public var publicMembersUrl: String
      get() = requireNotNull(publicMembersUrlValue) { "publicMembersUrl is required" }
      set(`value`) {
        publicMembersUrlValue = value
      }

    private var publicReposValue: Int? = null

    public var publicRepos: Int
      get() = requireNotNull(publicReposValue) { "publicRepos is required" }
      set(`value`) {
        publicReposValue = value
      }

    private var reposUrlValue: String? = null

    public var reposUrl: String
      get() = requireNotNull(reposUrlValue) { "reposUrl is required" }
      set(`value`) {
        reposUrlValue = value
      }

    private var typeValue: String? = null

    public var type: String
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
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

    private var archivedAtState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var archivedAt: String?
      get() = archivedAtState.valueOrNull()
      set(`value`) {
        archivedAtState = value.toNullableFieldState()
      }

    private var descriptionState: FieldState<String?> = FieldState.Absent

    /**
     * Required nullable field; assigning `null` records present-null.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        descriptionState = value.toNullableFieldState()
      }

    private var advancedSecurityEnabledForNewRepositoriesState: FieldState<Boolean> =
        FieldState.Absent

    /**
     * **Endpoint closing down notice.** Please use [code security
     * configurations](https://docs.github.com/rest/code-security/configurations) instead.
     *
     * Whether GitHub Advanced Security is enabled for new repositories and repositories transferred to this
     * organization.
     *
     * This field is only visible to organization owners or members of a team with the security manager role.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var advancedSecurityEnabledForNewRepositories: Boolean?
      get() = advancedSecurityEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "advancedSecurityEnabledForNewRepositories is not nullable; call unsetAdvancedSecurityEnabledForNewRepositories() to omit it" }
        advancedSecurityEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var billingEmailState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var billingEmail: String?
      get() = billingEmailState.valueOrNull()
      set(`value`) {
        billingEmailState = value.toNullableFieldState()
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

    private var collaboratorsState: FieldState<Int?> = FieldState.Absent

    /**
     * The number of collaborators on private repositories.
     *
     * This field may be null if the number of private repositories is over 50,000.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var collaborators: Int?
      get() = collaboratorsState.valueOrNull()
      set(`value`) {
        collaboratorsState = value.toNullableFieldState()
      }

    private var companyState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var company: String?
      get() = companyState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "company is not nullable; call unsetCompany() to omit it" }
        companyState = FieldState.Value(present)
      }

    private var defaultRepositoryBranchState: FieldState<String?> = FieldState.Absent

    /**
     * The default branch for repositories created in this organization.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var defaultRepositoryBranch: String?
      get() = defaultRepositoryBranchState.valueOrNull()
      set(`value`) {
        defaultRepositoryBranchState = value.toNullableFieldState()
      }

    private var defaultRepositoryPermissionState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var defaultRepositoryPermission: String?
      get() = defaultRepositoryPermissionState.valueOrNull()
      set(`value`) {
        defaultRepositoryPermissionState = value.toNullableFieldState()
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
     * This field is only visible to organization owners or members of a team with the security manager role.
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
     * This field is only visible to organization owners or members of a team with the security manager role.
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
     * This field is only visible to organization owners or members of a team with the security manager role.
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

    private var diskUsageState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var diskUsage: Int?
      get() = diskUsageState.valueOrNull()
      set(`value`) {
        diskUsageState = value.toNullableFieldState()
      }

    private var displayCommenterFullNameSettingEnabledState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var displayCommenterFullNameSettingEnabled: Boolean?
      get() = displayCommenterFullNameSettingEnabledState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "displayCommenterFullNameSettingEnabled is not nullable; call unsetDisplayCommenterFullNameSettingEnabled() to omit it" }
        displayCommenterFullNameSettingEnabledState = FieldState.Value(present)
      }

    private var emailState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var email: String?
      get() = emailState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "email is not nullable; call unsetEmail() to omit it" }
        emailState = FieldState.Value(present)
      }

    private var isVerifiedState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var isVerified: Boolean?
      get() = isVerifiedState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "isVerified is not nullable; call unsetIsVerified() to omit it" }
        isVerifiedState = FieldState.Value(present)
      }

    private var locationState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var location: String?
      get() = locationState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "location is not nullable; call unsetLocation() to omit it" }
        locationState = FieldState.Value(present)
      }

    private var membersAllowedRepositoryCreationTypeState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersAllowedRepositoryCreationType: String?
      get() = membersAllowedRepositoryCreationTypeState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersAllowedRepositoryCreationType is not nullable; call unsetMembersAllowedRepositoryCreationType() to omit it" }
        membersAllowedRepositoryCreationTypeState = FieldState.Value(present)
      }

    private var membersCanChangeRepoVisibilityState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanChangeRepoVisibility: Boolean?
      get() = membersCanChangeRepoVisibilityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanChangeRepoVisibility is not nullable; call unsetMembersCanChangeRepoVisibility() to omit it" }
        membersCanChangeRepoVisibilityState = FieldState.Value(present)
      }

    private var membersCanCreateInternalRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
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
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreatePublicRepositories: Boolean?
      get() = membersCanCreatePublicRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreatePublicRepositories is not nullable; call unsetMembersCanCreatePublicRepositories() to omit it" }
        membersCanCreatePublicRepositoriesState = FieldState.Value(present)
      }

    private var membersCanCreateRepositoriesState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var membersCanCreateRepositories: Boolean?
      get() = membersCanCreateRepositoriesState.valueOrNull()
      set(`value`) {
        membersCanCreateRepositoriesState = value.toNullableFieldState()
      }

    private var membersCanCreateTeamsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanCreateTeams: Boolean?
      get() = membersCanCreateTeamsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanCreateTeams is not nullable; call unsetMembersCanCreateTeams() to omit it" }
        membersCanCreateTeamsState = FieldState.Value(present)
      }

    private var membersCanDeleteIssuesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanDeleteIssues: Boolean?
      get() = membersCanDeleteIssuesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanDeleteIssues is not nullable; call unsetMembersCanDeleteIssues() to omit it" }
        membersCanDeleteIssuesState = FieldState.Value(present)
      }

    private var membersCanDeleteRepositoriesState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanDeleteRepositories: Boolean?
      get() = membersCanDeleteRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanDeleteRepositories is not nullable; call unsetMembersCanDeleteRepositories() to omit it" }
        membersCanDeleteRepositoriesState = FieldState.Value(present)
      }

    private var membersCanForkPrivateRepositoriesState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var membersCanForkPrivateRepositories: Boolean?
      get() = membersCanForkPrivateRepositoriesState.valueOrNull()
      set(`value`) {
        membersCanForkPrivateRepositoriesState = value.toNullableFieldState()
      }

    private var membersCanInviteOutsideCollaboratorsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanInviteOutsideCollaborators: Boolean?
      get() = membersCanInviteOutsideCollaboratorsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanInviteOutsideCollaborators is not nullable; call unsetMembersCanInviteOutsideCollaborators() to omit it" }
        membersCanInviteOutsideCollaboratorsState = FieldState.Value(present)
      }

    private var membersCanViewDependencyInsightsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var membersCanViewDependencyInsights: Boolean?
      get() = membersCanViewDependencyInsightsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "membersCanViewDependencyInsights is not nullable; call unsetMembersCanViewDependencyInsights() to omit it" }
        membersCanViewDependencyInsightsState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var ownedPrivateReposState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var ownedPrivateRepos: Int?
      get() = ownedPrivateReposState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "ownedPrivateRepos is not nullable; call unsetOwnedPrivateRepos() to omit it" }
        ownedPrivateReposState = FieldState.Value(present)
      }

    private var planState: FieldState<InlineOrganizationFullPlanX1aa3d467> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var plan: InlineOrganizationFullPlanX1aa3d467?
      get() = planState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "plan is not nullable; call unsetPlan() to omit it" }
        planState = FieldState.Value(present)
      }

    private var privateGistsState: FieldState<Int?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var privateGists: Int?
      get() = privateGistsState.valueOrNull()
      set(`value`) {
        privateGistsState = value.toNullableFieldState()
      }

    private var readersCanCreateDiscussionsState: FieldState<Boolean> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var readersCanCreateDiscussions: Boolean?
      get() = readersCanCreateDiscussionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "readersCanCreateDiscussions is not nullable; call unsetReadersCanCreateDiscussions() to omit it" }
        readersCanCreateDiscussionsState = FieldState.Value(present)
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
     * This field is only visible to organization owners or members of a team with the security manager role.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningEnabledForNewRepositories: Boolean?
      get() = secretScanningEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningEnabledForNewRepositories is not nullable; call unsetSecretScanningEnabledForNewRepositories() to omit it" }
        secretScanningEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var secretScanningPushProtectionCustomLinkState: FieldState<String?> = FieldState.Absent

    /**
     * An optional URL string to display to contributors who are blocked from pushing a secret.
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var secretScanningPushProtectionCustomLink: String?
      get() = secretScanningPushProtectionCustomLinkState.valueOrNull()
      set(`value`) {
        secretScanningPushProtectionCustomLinkState = value.toNullableFieldState()
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
     * This field is only visible to organization owners or members of a team with the security manager role.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningPushProtectionEnabledForNewRepositories: Boolean?
      get() = secretScanningPushProtectionEnabledForNewRepositoriesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningPushProtectionEnabledForNewRepositories is not nullable; call unsetSecretScanningPushProtectionEnabledForNewRepositories() to omit it" }
        secretScanningPushProtectionEnabledForNewRepositoriesState = FieldState.Value(present)
      }

    private var totalPrivateReposState: FieldState<Int> = FieldState.Absent

    /**
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var totalPrivateRepos: Int?
      get() = totalPrivateReposState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "totalPrivateRepos is not nullable; call unsetTotalPrivateRepos() to omit it" }
        totalPrivateReposState = FieldState.Value(present)
      }

    private var twitterUsernameState: FieldState<String?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var twitterUsername: String?
      get() = twitterUsernameState.valueOrNull()
      set(`value`) {
        twitterUsernameState = value.toNullableFieldState()
      }

    private var twoFactorRequirementEnabledState: FieldState<Boolean?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var twoFactorRequirementEnabled: Boolean?
      get() = twoFactorRequirementEnabledState.valueOrNull()
      set(`value`) {
        twoFactorRequirementEnabledState = value.toNullableFieldState()
      }

    private var webCommitSignoffRequiredState: FieldState<Boolean> = FieldState.Absent

    /**
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
     * Omits `collaborators` from serialized output.
     */
    public fun unsetCollaborators() {
      collaboratorsState = FieldState.Absent
    }

    /**
     * Omits `company` from serialized output.
     */
    public fun unsetCompany() {
      companyState = FieldState.Absent
    }

    /**
     * Omits `default_repository_branch` from serialized output.
     */
    public fun unsetDefaultRepositoryBranch() {
      defaultRepositoryBranchState = FieldState.Absent
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
     * Omits `disk_usage` from serialized output.
     */
    public fun unsetDiskUsage() {
      diskUsageState = FieldState.Absent
    }

    /**
     * Omits `display_commenter_full_name_setting_enabled` from serialized output.
     */
    public fun unsetDisplayCommenterFullNameSettingEnabled() {
      displayCommenterFullNameSettingEnabledState = FieldState.Absent
    }

    /**
     * Omits `email` from serialized output.
     */
    public fun unsetEmail() {
      emailState = FieldState.Absent
    }

    /**
     * Omits `is_verified` from serialized output.
     */
    public fun unsetIsVerified() {
      isVerifiedState = FieldState.Absent
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
     * Omits `members_can_change_repo_visibility` from serialized output.
     */
    public fun unsetMembersCanChangeRepoVisibility() {
      membersCanChangeRepoVisibilityState = FieldState.Absent
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
     * Omits `members_can_create_teams` from serialized output.
     */
    public fun unsetMembersCanCreateTeams() {
      membersCanCreateTeamsState = FieldState.Absent
    }

    /**
     * Omits `members_can_delete_issues` from serialized output.
     */
    public fun unsetMembersCanDeleteIssues() {
      membersCanDeleteIssuesState = FieldState.Absent
    }

    /**
     * Omits `members_can_delete_repositories` from serialized output.
     */
    public fun unsetMembersCanDeleteRepositories() {
      membersCanDeleteRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `members_can_fork_private_repositories` from serialized output.
     */
    public fun unsetMembersCanForkPrivateRepositories() {
      membersCanForkPrivateRepositoriesState = FieldState.Absent
    }

    /**
     * Omits `members_can_invite_outside_collaborators` from serialized output.
     */
    public fun unsetMembersCanInviteOutsideCollaborators() {
      membersCanInviteOutsideCollaboratorsState = FieldState.Absent
    }

    /**
     * Omits `members_can_view_dependency_insights` from serialized output.
     */
    public fun unsetMembersCanViewDependencyInsights() {
      membersCanViewDependencyInsightsState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `owned_private_repos` from serialized output.
     */
    public fun unsetOwnedPrivateRepos() {
      ownedPrivateReposState = FieldState.Absent
    }

    /**
     * Omits `plan` from serialized output.
     */
    public fun unsetPlan() {
      planState = FieldState.Absent
    }

    /**
     * Omits `private_gists` from serialized output.
     */
    public fun unsetPrivateGists() {
      privateGistsState = FieldState.Absent
    }

    /**
     * Omits `readers_can_create_discussions` from serialized output.
     */
    public fun unsetReadersCanCreateDiscussions() {
      readersCanCreateDiscussionsState = FieldState.Absent
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
     * Omits `total_private_repos` from serialized output.
     */
    public fun unsetTotalPrivateRepos() {
      totalPrivateReposState = FieldState.Absent
    }

    /**
     * Omits `twitter_username` from serialized output.
     */
    public fun unsetTwitterUsername() {
      twitterUsernameState = FieldState.Absent
    }

    /**
     * Omits `two_factor_requirement_enabled` from serialized output.
     */
    public fun unsetTwoFactorRequirementEnabled() {
      twoFactorRequirementEnabledState = FieldState.Absent
    }

    /**
     * Omits `web_commit_signoff_required` from serialized output.
     */
    public fun unsetWebCommitSignoffRequired() {
      webCommitSignoffRequiredState = FieldState.Absent
    }

    public fun build(): OrganizationFull {
      check(avatarUrlValue != null) { "avatarUrl is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(eventsUrlValue != null) { "eventsUrl is required" }
      check(followersValue != null) { "followers is required" }
      check(followingValue != null) { "following is required" }
      check(hasOrganizationProjectsValue != null) { "hasOrganizationProjects is required" }
      check(hasRepositoryProjectsValue != null) { "hasRepositoryProjects is required" }
      check(hooksUrlValue != null) { "hooksUrl is required" }
      check(htmlUrlValue != null) { "htmlUrl is required" }
      check(idValue != null) { "id is required" }
      check(issuesUrlValue != null) { "issuesUrl is required" }
      check(loginValue != null) { "login is required" }
      check(membersUrlValue != null) { "membersUrl is required" }
      check(nodeIdValue != null) { "nodeId is required" }
      check(publicGistsValue != null) { "publicGists is required" }
      check(publicMembersUrlValue != null) { "publicMembersUrl is required" }
      check(publicReposValue != null) { "publicRepos is required" }
      check(reposUrlValue != null) { "reposUrl is required" }
      check(typeValue != null) { "type is required" }
      check(updatedAtValue != null) { "updatedAt is required" }
      check(urlValue != null) { "url is required" }
      check(archivedAtState !== FieldState.Absent) { "archivedAt is required, even when null" }
      check(descriptionState !== FieldState.Absent) { "description is required, even when null" }
      return OrganizationFull(
        archivedAt = archivedAtState.valueOrNull(),
        avatarUrl = avatarUrl,
        createdAt = createdAt,
        description = descriptionState.valueOrNull(),
        eventsUrl = eventsUrl,
        followers = followers,
        following = following,
        hasOrganizationProjects = hasOrganizationProjects,
        hasRepositoryProjects = hasRepositoryProjects,
        hooksUrl = hooksUrl,
        htmlUrl = htmlUrl,
        id = id,
        issuesUrl = issuesUrl,
        login = login,
        membersUrl = membersUrl,
        nodeId = nodeId,
        publicGists = publicGists,
        publicMembersUrl = publicMembersUrl,
        publicRepos = publicRepos,
        reposUrl = reposUrl,
        type = type,
        updatedAt = updatedAt,
        url = url,
        advancedSecurityEnabledForNewRepositoriesState = advancedSecurityEnabledForNewRepositoriesState,
        billingEmailState = billingEmailState,
        blogState = blogState,
        collaboratorsState = collaboratorsState,
        companyState = companyState,
        defaultRepositoryBranchState = defaultRepositoryBranchState,
        defaultRepositoryPermissionState = defaultRepositoryPermissionState,
        dependabotAlertsEnabledForNewRepositoriesState = dependabotAlertsEnabledForNewRepositoriesState,
        dependabotSecurityUpdatesEnabledForNewRepositoriesState = dependabotSecurityUpdatesEnabledForNewRepositoriesState,
        dependencyGraphEnabledForNewRepositoriesState = dependencyGraphEnabledForNewRepositoriesState,
        deployKeysEnabledForRepositoriesState = deployKeysEnabledForRepositoriesState,
        diskUsageState = diskUsageState,
        displayCommenterFullNameSettingEnabledState = displayCommenterFullNameSettingEnabledState,
        emailState = emailState,
        isVerifiedState = isVerifiedState,
        locationState = locationState,
        membersAllowedRepositoryCreationTypeState = membersAllowedRepositoryCreationTypeState,
        membersCanChangeRepoVisibilityState = membersCanChangeRepoVisibilityState,
        membersCanCreateInternalRepositoriesState = membersCanCreateInternalRepositoriesState,
        membersCanCreatePagesState = membersCanCreatePagesState,
        membersCanCreatePrivatePagesState = membersCanCreatePrivatePagesState,
        membersCanCreatePrivateRepositoriesState = membersCanCreatePrivateRepositoriesState,
        membersCanCreatePublicPagesState = membersCanCreatePublicPagesState,
        membersCanCreatePublicRepositoriesState = membersCanCreatePublicRepositoriesState,
        membersCanCreateRepositoriesState = membersCanCreateRepositoriesState,
        membersCanCreateTeamsState = membersCanCreateTeamsState,
        membersCanDeleteIssuesState = membersCanDeleteIssuesState,
        membersCanDeleteRepositoriesState = membersCanDeleteRepositoriesState,
        membersCanForkPrivateRepositoriesState = membersCanForkPrivateRepositoriesState,
        membersCanInviteOutsideCollaboratorsState = membersCanInviteOutsideCollaboratorsState,
        membersCanViewDependencyInsightsState = membersCanViewDependencyInsightsState,
        nameState = nameState,
        ownedPrivateReposState = ownedPrivateReposState,
        planState = planState,
        privateGistsState = privateGistsState,
        readersCanCreateDiscussionsState = readersCanCreateDiscussionsState,
        secretScanningEnabledForNewRepositoriesState = secretScanningEnabledForNewRepositoriesState,
        secretScanningPushProtectionCustomLinkState = secretScanningPushProtectionCustomLinkState,
        secretScanningPushProtectionCustomLinkEnabledState = secretScanningPushProtectionCustomLinkEnabledState,
        secretScanningPushProtectionEnabledForNewRepositoriesState = secretScanningPushProtectionEnabledForNewRepositoriesState,
        totalPrivateReposState = totalPrivateReposState,
        twitterUsernameState = twitterUsernameState,
        twoFactorRequirementEnabledState = twoFactorRequirementEnabledState,
        webCommitSignoffRequiredState = webCommitSignoffRequiredState,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): OrganizationFull = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<OrganizationFull> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): OrganizationFull {
      val jsonDecoder = decoder.requireJsonDecoder("OrganizationFull")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("OrganizationFull must be a JSON object")
      val avatarUrl = json.decodeRequired<String>(rawObject, "avatar_url")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val eventsUrl = json.decodeRequired<String>(rawObject, "events_url")
      val followers = json.decodeRequired<Int>(rawObject, "followers")
      val following = json.decodeRequired<Int>(rawObject, "following")
      val hasOrganizationProjects = json.decodeRequired<Boolean>(rawObject, "has_organization_projects")
      val hasRepositoryProjects = json.decodeRequired<Boolean>(rawObject, "has_repository_projects")
      val hooksUrl = json.decodeRequired<String>(rawObject, "hooks_url")
      val htmlUrl = json.decodeRequired<String>(rawObject, "html_url")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val issuesUrl = json.decodeRequired<String>(rawObject, "issues_url")
      val login = json.decodeRequired<String>(rawObject, "login")
      val membersUrl = json.decodeRequired<String>(rawObject, "members_url")
      val nodeId = json.decodeRequired<String>(rawObject, "node_id")
      val publicGists = json.decodeRequired<Int>(rawObject, "public_gists")
      val publicMembersUrl = json.decodeRequired<String>(rawObject, "public_members_url")
      val publicRepos = json.decodeRequired<Int>(rawObject, "public_repos")
      val reposUrl = json.decodeRequired<String>(rawObject, "repos_url")
      val type = json.decodeRequired<String>(rawObject, "type")
      val updatedAt = json.decodeRequired<String>(rawObject, "updated_at")
      val url = json.decodeRequired<String>(rawObject, "url")
      if (!rawObject.containsKey("archived_at")) {
        throw SerializationException("OrganizationFull is missing required property 'archived_at'")
      }
      val archivedAt = rawObject["archived_at"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      if (!rawObject.containsKey("description")) {
        throw SerializationException("OrganizationFull is missing required property 'description'")
      }
      val description = rawObject["description"].let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(requireNotNull(element)) }
      return OrganizationFull(
        archivedAt = archivedAt,
        avatarUrl = avatarUrl,
        createdAt = createdAt,
        description = description,
        eventsUrl = eventsUrl,
        followers = followers,
        following = following,
        hasOrganizationProjects = hasOrganizationProjects,
        hasRepositoryProjects = hasRepositoryProjects,
        hooksUrl = hooksUrl,
        htmlUrl = htmlUrl,
        id = id,
        issuesUrl = issuesUrl,
        login = login,
        membersUrl = membersUrl,
        nodeId = nodeId,
        publicGists = publicGists,
        publicMembersUrl = publicMembersUrl,
        publicRepos = publicRepos,
        reposUrl = reposUrl,
        type = type,
        updatedAt = updatedAt,
        url = url,
        advancedSecurityEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "advanced_security_enabled_for_new_repositories", nullable = false),
        billingEmailState = json.decodeOptional(rawObject, "billing_email", nullable = true),
        blogState = json.decodeOptional(rawObject, "blog", nullable = false),
        collaboratorsState = json.decodeOptional(rawObject, "collaborators", nullable = true),
        companyState = json.decodeOptional(rawObject, "company", nullable = false),
        defaultRepositoryBranchState = json.decodeOptional(rawObject, "default_repository_branch", nullable = true),
        defaultRepositoryPermissionState = json.decodeOptional(rawObject, "default_repository_permission", nullable = true),
        dependabotAlertsEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "dependabot_alerts_enabled_for_new_repositories", nullable = false),
        dependabotSecurityUpdatesEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "dependabot_security_updates_enabled_for_new_repositories", nullable = false),
        dependencyGraphEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "dependency_graph_enabled_for_new_repositories", nullable = false),
        deployKeysEnabledForRepositoriesState = json.decodeOptional(rawObject, "deploy_keys_enabled_for_repositories", nullable = false),
        diskUsageState = json.decodeOptional(rawObject, "disk_usage", nullable = true),
        displayCommenterFullNameSettingEnabledState = json.decodeOptional(rawObject, "display_commenter_full_name_setting_enabled", nullable = false),
        emailState = json.decodeOptional(rawObject, "email", nullable = false),
        isVerifiedState = json.decodeOptional(rawObject, "is_verified", nullable = false),
        locationState = json.decodeOptional(rawObject, "location", nullable = false),
        membersAllowedRepositoryCreationTypeState = json.decodeOptional(rawObject, "members_allowed_repository_creation_type", nullable = false),
        membersCanChangeRepoVisibilityState = json.decodeOptional(rawObject, "members_can_change_repo_visibility", nullable = false),
        membersCanCreateInternalRepositoriesState = json.decodeOptional(rawObject, "members_can_create_internal_repositories", nullable = false),
        membersCanCreatePagesState = json.decodeOptional(rawObject, "members_can_create_pages", nullable = false),
        membersCanCreatePrivatePagesState = json.decodeOptional(rawObject, "members_can_create_private_pages", nullable = false),
        membersCanCreatePrivateRepositoriesState = json.decodeOptional(rawObject, "members_can_create_private_repositories", nullable = false),
        membersCanCreatePublicPagesState = json.decodeOptional(rawObject, "members_can_create_public_pages", nullable = false),
        membersCanCreatePublicRepositoriesState = json.decodeOptional(rawObject, "members_can_create_public_repositories", nullable = false),
        membersCanCreateRepositoriesState = json.decodeOptional(rawObject, "members_can_create_repositories", nullable = true),
        membersCanCreateTeamsState = json.decodeOptional(rawObject, "members_can_create_teams", nullable = false),
        membersCanDeleteIssuesState = json.decodeOptional(rawObject, "members_can_delete_issues", nullable = false),
        membersCanDeleteRepositoriesState = json.decodeOptional(rawObject, "members_can_delete_repositories", nullable = false),
        membersCanForkPrivateRepositoriesState = json.decodeOptional(rawObject, "members_can_fork_private_repositories", nullable = true),
        membersCanInviteOutsideCollaboratorsState = json.decodeOptional(rawObject, "members_can_invite_outside_collaborators", nullable = false),
        membersCanViewDependencyInsightsState = json.decodeOptional(rawObject, "members_can_view_dependency_insights", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        ownedPrivateReposState = json.decodeOptional(rawObject, "owned_private_repos", nullable = false),
        planState = json.decodeOptional(rawObject, "plan", nullable = false),
        privateGistsState = json.decodeOptional(rawObject, "private_gists", nullable = true),
        readersCanCreateDiscussionsState = json.decodeOptional(rawObject, "readers_can_create_discussions", nullable = false),
        secretScanningEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "secret_scanning_enabled_for_new_repositories", nullable = false),
        secretScanningPushProtectionCustomLinkState = json.decodeOptional(rawObject, "secret_scanning_push_protection_custom_link", nullable = true),
        secretScanningPushProtectionCustomLinkEnabledState = json.decodeOptional(rawObject, "secret_scanning_push_protection_custom_link_enabled", nullable = false),
        secretScanningPushProtectionEnabledForNewRepositoriesState = json.decodeOptional(rawObject, "secret_scanning_push_protection_enabled_for_new_repositories", nullable = false),
        totalPrivateReposState = json.decodeOptional(rawObject, "total_private_repos", nullable = false),
        twitterUsernameState = json.decodeOptional(rawObject, "twitter_username", nullable = true),
        twoFactorRequirementEnabledState = json.decodeOptional(rawObject, "two_factor_requirement_enabled", nullable = true),
        webCommitSignoffRequiredState = json.decodeOptional(rawObject, "web_commit_signoff_required", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: OrganizationFull) {
      val jsonEncoder = encoder.requireJsonEncoder("OrganizationFull")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("archived_at", value.archivedAt?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("avatar_url", value.avatarUrl)
        put("created_at", value.createdAt)
        put("description", value.description?.let { json.encodeToJsonElement(it) } ?: JsonNull)
        put("events_url", value.eventsUrl)
        put("followers", json.encodeToJsonElement(value.followers))
        put("following", json.encodeToJsonElement(value.following))
        put("has_organization_projects", json.encodeToJsonElement(value.hasOrganizationProjects))
        put("has_repository_projects", json.encodeToJsonElement(value.hasRepositoryProjects))
        put("hooks_url", value.hooksUrl)
        put("html_url", value.htmlUrl)
        put("id", json.encodeToJsonElement(value.id))
        put("issues_url", value.issuesUrl)
        put("login", value.login)
        put("members_url", value.membersUrl)
        put("node_id", value.nodeId)
        put("public_gists", json.encodeToJsonElement(value.publicGists))
        put("public_members_url", value.publicMembersUrl)
        put("public_repos", json.encodeToJsonElement(value.publicRepos))
        put("repos_url", value.reposUrl)
        put("type", value.type)
        put("updated_at", value.updatedAt)
        put("url", value.url)
        putState("advanced_security_enabled_for_new_repositories", value.advancedSecurityEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("billing_email", value.billingEmailState, json::encodeToJsonElement)
        putState("blog", value.blogState, json::encodeToJsonElement)
        putState("collaborators", value.collaboratorsState, json::encodeToJsonElement)
        putState("company", value.companyState, json::encodeToJsonElement)
        putState("default_repository_branch", value.defaultRepositoryBranchState, json::encodeToJsonElement)
        putState("default_repository_permission", value.defaultRepositoryPermissionState, json::encodeToJsonElement)
        putState("dependabot_alerts_enabled_for_new_repositories", value.dependabotAlertsEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("dependabot_security_updates_enabled_for_new_repositories", value.dependabotSecurityUpdatesEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("dependency_graph_enabled_for_new_repositories", value.dependencyGraphEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("deploy_keys_enabled_for_repositories", value.deployKeysEnabledForRepositoriesState, json::encodeToJsonElement)
        putState("disk_usage", value.diskUsageState, json::encodeToJsonElement)
        putState("display_commenter_full_name_setting_enabled", value.displayCommenterFullNameSettingEnabledState, json::encodeToJsonElement)
        putState("email", value.emailState, json::encodeToJsonElement)
        putState("is_verified", value.isVerifiedState, json::encodeToJsonElement)
        putState("location", value.locationState, json::encodeToJsonElement)
        putState("members_allowed_repository_creation_type", value.membersAllowedRepositoryCreationTypeState, json::encodeToJsonElement)
        putState("members_can_change_repo_visibility", value.membersCanChangeRepoVisibilityState, json::encodeToJsonElement)
        putState("members_can_create_internal_repositories", value.membersCanCreateInternalRepositoriesState, json::encodeToJsonElement)
        putState("members_can_create_pages", value.membersCanCreatePagesState, json::encodeToJsonElement)
        putState("members_can_create_private_pages", value.membersCanCreatePrivatePagesState, json::encodeToJsonElement)
        putState("members_can_create_private_repositories", value.membersCanCreatePrivateRepositoriesState, json::encodeToJsonElement)
        putState("members_can_create_public_pages", value.membersCanCreatePublicPagesState, json::encodeToJsonElement)
        putState("members_can_create_public_repositories", value.membersCanCreatePublicRepositoriesState, json::encodeToJsonElement)
        putState("members_can_create_repositories", value.membersCanCreateRepositoriesState, json::encodeToJsonElement)
        putState("members_can_create_teams", value.membersCanCreateTeamsState, json::encodeToJsonElement)
        putState("members_can_delete_issues", value.membersCanDeleteIssuesState, json::encodeToJsonElement)
        putState("members_can_delete_repositories", value.membersCanDeleteRepositoriesState, json::encodeToJsonElement)
        putState("members_can_fork_private_repositories", value.membersCanForkPrivateRepositoriesState, json::encodeToJsonElement)
        putState("members_can_invite_outside_collaborators", value.membersCanInviteOutsideCollaboratorsState, json::encodeToJsonElement)
        putState("members_can_view_dependency_insights", value.membersCanViewDependencyInsightsState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("owned_private_repos", value.ownedPrivateReposState, json::encodeToJsonElement)
        putState("plan", value.planState, json::encodeToJsonElement)
        putState("private_gists", value.privateGistsState, json::encodeToJsonElement)
        putState("readers_can_create_discussions", value.readersCanCreateDiscussionsState, json::encodeToJsonElement)
        putState("secret_scanning_enabled_for_new_repositories", value.secretScanningEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection_custom_link", value.secretScanningPushProtectionCustomLinkState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection_custom_link_enabled", value.secretScanningPushProtectionCustomLinkEnabledState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection_enabled_for_new_repositories", value.secretScanningPushProtectionEnabledForNewRepositoriesState, json::encodeToJsonElement)
        putState("total_private_repos", value.totalPrivateReposState, json::encodeToJsonElement)
        putState("twitter_username", value.twitterUsernameState, json::encodeToJsonElement)
        putState("two_factor_requirement_enabled", value.twoFactorRequirementEnabledState, json::encodeToJsonElement)
        putState("web_commit_signoff_required", value.webCommitSignoffRequiredState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun organizationFull(block: OrganizationFull.Builder.() -> Unit): OrganizationFull = OrganizationFull.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("OrganizationFull is missing required property '" + name + "'")
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
    if (!nullable) throw SerializationException("OrganizationFull property '" + name + "' is not nullable")
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
