package com.nabobery.sdkgen.github.generated

import com.nabobery.sdkgen.github.generated.actions.ActionsClient
import com.nabobery.sdkgen.github.generated.activity.ActivityClient
import com.nabobery.sdkgen.github.generated.agents.AgentsClient
import com.nabobery.sdkgen.github.generated.agenttasks.AgentTasksClient
import com.nabobery.sdkgen.github.generated.apps.AppsClient
import com.nabobery.sdkgen.github.generated.billing.BillingClient
import com.nabobery.sdkgen.github.generated.campaigns.CampaignsClient
import com.nabobery.sdkgen.github.generated.checks.ChecksClient
import com.nabobery.sdkgen.github.generated.classroom.ClassroomClient
import com.nabobery.sdkgen.github.generated.codequality.CodeQualityClient
import com.nabobery.sdkgen.github.generated.codescanning.CodeScanningClient
import com.nabobery.sdkgen.github.generated.codesecurity.CodeSecurityClient
import com.nabobery.sdkgen.github.generated.codesofconduct.CodesOfConductClient
import com.nabobery.sdkgen.github.generated.codespaces.CodespacesClient
import com.nabobery.sdkgen.github.generated.copilot.CopilotClient
import com.nabobery.sdkgen.github.generated.copilotspaces.CopilotSpacesClient
import com.nabobery.sdkgen.github.generated.credentials.CredentialsClient
import com.nabobery.sdkgen.github.generated.dependabot.DependabotClient
import com.nabobery.sdkgen.github.generated.dependencygraph.DependencyGraphClient
import com.nabobery.sdkgen.github.generated.emojis.EmojisClient
import com.nabobery.sdkgen.github.generated.enterpriseteammemberships.EnterpriseTeamMembershipsClient
import com.nabobery.sdkgen.github.generated.enterpriseteamorganizations.EnterpriseTeamOrganizationsClient
import com.nabobery.sdkgen.github.generated.enterpriseteams.EnterpriseTeamsClient
import com.nabobery.sdkgen.github.generated.gists.GistsClient
import com.nabobery.sdkgen.github.generated.git.GitClient
import com.nabobery.sdkgen.github.generated.gitignore.GitignoreClient
import com.nabobery.sdkgen.github.generated.hostedcompute.HostedComputeClient
import com.nabobery.sdkgen.github.generated.interactions.InteractionsClient
import com.nabobery.sdkgen.github.generated.issues.IssuesClient
import com.nabobery.sdkgen.github.generated.licenses.LicensesClient
import com.nabobery.sdkgen.github.generated.markdown.MarkdownClient
import com.nabobery.sdkgen.github.generated.meta.MetaClient
import com.nabobery.sdkgen.github.generated.migrations.MigrationsClient
import com.nabobery.sdkgen.github.generated.oidc.OidcClient
import com.nabobery.sdkgen.github.generated.orgs.OrgsClient
import com.nabobery.sdkgen.github.generated.packages.PackagesClient
import com.nabobery.sdkgen.github.generated.privateregistries.PrivateRegistriesClient
import com.nabobery.sdkgen.github.generated.projects.ProjectsClient
import com.nabobery.sdkgen.github.generated.pulls.PullsClient
import com.nabobery.sdkgen.github.generated.ratelimit.RateLimitClient
import com.nabobery.sdkgen.github.generated.reactions.ReactionsClient
import com.nabobery.sdkgen.github.generated.repos.ReposClient
import com.nabobery.sdkgen.github.generated.search.SearchClient
import com.nabobery.sdkgen.github.generated.secretscanning.SecretScanningClient
import com.nabobery.sdkgen.github.generated.securityadvisories.SecurityAdvisoriesClient
import com.nabobery.sdkgen.github.generated.teams.TeamsClient
import com.nabobery.sdkgen.github.generated.users.UsersClient
import com.nabobery.sdkgen.runtime.SdkAuthentication
import com.nabobery.sdkgen.runtime.SdkTransport
import com.nabobery.sdkgen.runtime.auth.CredentialProvider
import com.nabobery.sdkgen.runtime.auth.TrustedHosts
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.Map

/**
 * Client for GitHub v3 REST API.
 */
public class GitHubClient(
  transport: SdkTransport,
  baseUri: String,
  credentialProviders: Map<String, CredentialProvider> = emptyMap(),
  trustedHosts: TrustedHosts? = null,
  authentication: SdkAuthentication? = null,
) {
  /**
   * Operations tagged/grouped under 'actions'.
   */
  public val actions: ActionsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ActionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'activity'.
   */
  public val activity: ActivityClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ActivityClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'agents'.
   */
  public val agents: AgentsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AgentsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'agent-tasks'.
   */
  public val agentTasks: AgentTasksClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AgentTasksClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'apps'.
   */
  public val apps: AppsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        AppsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'billing'.
   */
  public val billing: BillingClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        BillingClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'campaigns'.
   */
  public val campaigns: CampaignsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CampaignsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'checks'.
   */
  public val checks: ChecksClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ChecksClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'classroom'.
   */
  public val classroom: ClassroomClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ClassroomClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'code-quality'.
   */
  public val codeQuality: CodeQualityClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CodeQualityClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'code-scanning'.
   */
  public val codeScanning: CodeScanningClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CodeScanningClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'code-security'.
   */
  public val codeSecurity: CodeSecurityClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CodeSecurityClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'codes-of-conduct'.
   */
  public val codesOfConduct: CodesOfConductClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CodesOfConductClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'codespaces'.
   */
  public val codespaces: CodespacesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CodespacesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'copilot'.
   */
  public val copilot: CopilotClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CopilotClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'copilot-spaces'.
   */
  public val copilotSpaces: CopilotSpacesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CopilotSpacesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'credentials'.
   */
  public val credentials: CredentialsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        CredentialsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'dependabot'.
   */
  public val dependabot: DependabotClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        DependabotClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'dependency-graph'.
   */
  public val dependencyGraph: DependencyGraphClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        DependencyGraphClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'emojis'.
   */
  public val emojis: EmojisClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EmojisClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'enterprise-team-memberships'.
   */
  public val enterpriseTeamMemberships: EnterpriseTeamMembershipsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        EnterpriseTeamMembershipsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'enterprise-team-organizations'.
   */
  public val enterpriseTeamOrganizations: EnterpriseTeamOrganizationsClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        EnterpriseTeamOrganizationsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'enterprise-teams'.
   */
  public val enterpriseTeams: EnterpriseTeamsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        EnterpriseTeamsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'gists'.
   */
  public val gists: GistsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        GistsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'git'.
   */
  public val git: GitClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        GitClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'gitignore'.
   */
  public val gitignore: GitignoreClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        GitignoreClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'hosted-compute'.
   */
  public val hostedCompute: HostedComputeClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        HostedComputeClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'interactions'.
   */
  public val interactions: InteractionsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        InteractionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'issues'.
   */
  public val issues: IssuesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        IssuesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'licenses'.
   */
  public val licenses: LicensesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        LicensesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'markdown'.
   */
  public val markdown: MarkdownClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        MarkdownClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'meta'.
   */
  public val meta: MetaClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        MetaClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'migrations'.
   */
  public val migrations: MigrationsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        MigrationsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'oidc'.
   */
  public val oidc: OidcClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        OidcClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'orgs'.
   */
  public val orgs: OrgsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        OrgsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'packages'.
   */
  public val packages: PackagesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PackagesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'private-registries'.
   */
  public val privateRegistries: PrivateRegistriesClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PrivateRegistriesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'projects'.
   */
  public val projects: ProjectsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ProjectsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'pulls'.
   */
  public val pulls: PullsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        PullsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'rate-limit'.
   */
  public val rateLimit: RateLimitClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        RateLimitClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'reactions'.
   */
  public val reactions: ReactionsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ReactionsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'repos'.
   */
  public val repos: ReposClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        ReposClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'search'.
   */
  public val search: SearchClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SearchClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'secret-scanning'.
   */
  public val secretScanning: SecretScanningClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        SecretScanningClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'security-advisories'.
   */
  public val securityAdvisories: SecurityAdvisoriesClient by
      lazy(LazyThreadSafetyMode.PUBLICATION) {
        SecurityAdvisoriesClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'teams'.
   */
  public val teams: TeamsClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        TeamsClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }

  /**
   * Operations tagged/grouped under 'users'.
   */
  public val users: UsersClient by lazy(LazyThreadSafetyMode.PUBLICATION) {
        UsersClient(transport, baseUri, credentialProviders, trustedHosts, authentication)
      }
}
