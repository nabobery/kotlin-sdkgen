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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations~1{configuration_id}/patch/requestBod
 * y/content/application~1json/schema
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e.Serializer::class)
public class InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e internal constructor(
  private val advancedSecurityState:
      FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405>,
  private val codeScanningDefaultSetupState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469>,
  private val codeScanningDefaultSetupOptionsState: FieldState<CodeScanningDefaultSetupOptions?>,
  private val codeScanningDelegatedAlertDismissalState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDelegate8e9dX9194516b>,
  private val codeScanningOptionsState: FieldState<CodeScanningOptions?>,
  private val codeSecurityState:
      FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc>,
  private val dependabotAlertsState:
      FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9>,
  private val dependabotDelegatedAlertDismissalState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotDelegatedA7d44X031bc3f0>,
  private val dependabotSecurityUpdatesState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotSecurityUpc95aX5cd90d84>,
  private val dependencyGraphState:
      FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependencyGraphXefcfd91d>,
  private val dependencyGraphAutosubmitActionState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutos53b4X8b313b41>,
  private val dependencyGraphAutosubmitActionOptionsState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutosfecdX573e8b73>,
  private val descriptionState: FieldState<String>,
  private val enforcementState:
      FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95>,
  private val nameState: FieldState<String>,
  private val privateVulnerabilityReportingState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonPrivateVulnerabilitycdadXd486f9cf>,
  private val secretProtectionState:
      FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretProtectionX37e95994>,
  private val secretScanningState:
      FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretScanningXf469f8e3>,
  private val secretScanningDelegatedAlertDismissalState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega870cX84293883>,
  private val secretScanningDelegatedBypassState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega621bX39b71736>,
  private val secretScanningDelegatedBypassOptionsState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819>,
  private val secretScanningExtendedMetadataState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningExtende828X7f6569ad>,
  private val secretScanningGenericSecretsState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningGeneria531X211d3775>,
  private val secretScanningNonProviderPatternsState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningNonPro8605X72ca6955>,
  private val secretScanningPushProtectionState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e>,
  private val secretScanningValidityChecksState:
      FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningValidi3d40Xe1499f54>,
) {
  /**
   * The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret
   * Protection features.
   *
   * > [!WARNING]
   * > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual
   * `code_security` and `secret_protection` fields to set the status of these features.
   *
   */
  public val advancedSecurity:
      InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405?
    get() = advancedSecurityState.valueOrNull()

  /**
   * The enablement status of code scanning default setup
   */
  public val codeScanningDefaultSetup:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469?
    get() = codeScanningDefaultSetupState.valueOrNull()

  public val codeScanningDefaultSetupOptions: CodeScanningDefaultSetupOptions?
    get() = codeScanningDefaultSetupOptionsState.valueOrNull()

  /**
   * The enablement status of code scanning delegated alert dismissal
   */
  public val codeScanningDelegatedAlertDismissal:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDelegate8e9dX9194516b?
    get() = codeScanningDelegatedAlertDismissalState.valueOrNull()

  public val codeScanningOptions: CodeScanningOptions?
    get() = codeScanningOptionsState.valueOrNull()

  /**
   * The enablement status of GitHub Code Security features.
   */
  public val codeSecurity:
      InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc?
    get() = codeSecurityState.valueOrNull()

  /**
   * The enablement status of Dependabot alerts
   */
  public val dependabotAlerts:
      InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9?
    get() = dependabotAlertsState.valueOrNull()

  /**
   * The enablement status of Dependabot delegated alert dismissal. Requires Dependabot alerts to be enabled.
   */
  public val dependabotDelegatedAlertDismissal:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotDelegatedA7d44X031bc3f0?
    get() = dependabotDelegatedAlertDismissalState.valueOrNull()

  /**
   * The enablement status of Dependabot security updates
   */
  public val dependabotSecurityUpdates:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotSecurityUpc95aX5cd90d84?
    get() = dependabotSecurityUpdatesState.valueOrNull()

  /**
   * The enablement status of Dependency Graph
   */
  public val dependencyGraph:
      InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependencyGraphXefcfd91d?
    get() = dependencyGraphState.valueOrNull()

  /**
   * The enablement status of Automatic dependency submission
   */
  public val dependencyGraphAutosubmitAction:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutos53b4X8b313b41?
    get() = dependencyGraphAutosubmitActionState.valueOrNull()

  /**
   * Feature options for Automatic dependency submission
   */
  public val dependencyGraphAutosubmitActionOptions:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutosfecdX573e8b73?
    get() = dependencyGraphAutosubmitActionOptionsState.valueOrNull()

  /**
   * A description of the code security configuration
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The enforcement status for a security configuration
   */
  public val enforcement: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95?
    get() = enforcementState.valueOrNull()

  /**
   * The name of the code security configuration. Must be unique within the organization.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The enablement status of private vulnerability reporting
   */
  public val privateVulnerabilityReporting:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonPrivateVulnerabilitycdadXd486f9cf?
    get() = privateVulnerabilityReportingState.valueOrNull()

  /**
   * The enablement status of GitHub Secret Protection features.
   */
  public val secretProtection:
      InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretProtectionX37e95994?
    get() = secretProtectionState.valueOrNull()

  /**
   * The enablement status of secret scanning
   */
  public val secretScanning:
      InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretScanningXf469f8e3?
    get() = secretScanningState.valueOrNull()

  /**
   * The enablement status of secret scanning delegated alert dismissal
   */
  public val secretScanningDelegatedAlertDismissal:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega870cX84293883?
    get() = secretScanningDelegatedAlertDismissalState.valueOrNull()

  /**
   * The enablement status of secret scanning delegated bypass
   */
  public val secretScanningDelegatedBypass:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega621bX39b71736?
    get() = secretScanningDelegatedBypassState.valueOrNull()

  /**
   * Feature options for secret scanning delegated bypass
   */
  public val secretScanningDelegatedBypassOptions:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819?
    get() = secretScanningDelegatedBypassOptionsState.valueOrNull()

  /**
   * The enablement status of secret scanning extended metadata
   */
  public val secretScanningExtendedMetadata:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningExtende828X7f6569ad?
    get() = secretScanningExtendedMetadataState.valueOrNull()

  /**
   * The enablement status of Copilot secret scanning
   */
  public val secretScanningGenericSecrets:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningGeneria531X211d3775?
    get() = secretScanningGenericSecretsState.valueOrNull()

  /**
   * The enablement status of secret scanning non-provider patterns
   */
  public val secretScanningNonProviderPatterns:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningNonPro8605X72ca6955?
    get() = secretScanningNonProviderPatternsState.valueOrNull()

  /**
   * The enablement status of secret scanning push protection
   */
  public val secretScanningPushProtection:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e?
    get() = secretScanningPushProtectionState.valueOrNull()

  /**
   * The enablement status of secret scanning validity checks
   */
  public val secretScanningValidityChecks:
      InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningValidi3d40Xe1499f54?
    get() = secretScanningValidityChecksState.valueOrNull()

  public constructor() : this(advancedSecurityState = FieldState.Absent,
  codeScanningDefaultSetupState = FieldState.Absent,
  codeScanningDefaultSetupOptionsState = FieldState.Absent,
  codeScanningDelegatedAlertDismissalState = FieldState.Absent,
  codeScanningOptionsState = FieldState.Absent,
  codeSecurityState = FieldState.Absent,
  dependabotAlertsState = FieldState.Absent,
  dependabotDelegatedAlertDismissalState = FieldState.Absent,
  dependabotSecurityUpdatesState = FieldState.Absent,
  dependencyGraphState = FieldState.Absent,
  dependencyGraphAutosubmitActionState = FieldState.Absent,
  dependencyGraphAutosubmitActionOptionsState = FieldState.Absent,
  descriptionState = FieldState.Absent,
  enforcementState = FieldState.Absent,
  nameState = FieldState.Absent,
  privateVulnerabilityReportingState = FieldState.Absent,
  secretProtectionState = FieldState.Absent,
  secretScanningState = FieldState.Absent,
  secretScanningDelegatedAlertDismissalState = FieldState.Absent,
  secretScanningDelegatedBypassState = FieldState.Absent,
  secretScanningDelegatedBypassOptionsState = FieldState.Absent,
  secretScanningExtendedMetadataState = FieldState.Absent,
  secretScanningGenericSecretsState = FieldState.Absent,
  secretScanningNonProviderPatternsState = FieldState.Absent,
  secretScanningPushProtectionState = FieldState.Absent,
  secretScanningValidityChecksState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `advanced_security`.
   */
  public fun advancedSecurityPresence(): FieldPresence = advancedSecurityState.presence

  /**
   * Returns the wire presence of `code_scanning_default_setup`.
   */
  public fun codeScanningDefaultSetupPresence(): FieldPresence = codeScanningDefaultSetupState.presence

  /**
   * Returns the wire presence of `code_scanning_default_setup_options`.
   */
  public fun codeScanningDefaultSetupOptionsPresence(): FieldPresence = codeScanningDefaultSetupOptionsState.presence

  /**
   * Returns the wire presence of `code_scanning_delegated_alert_dismissal`.
   */
  public fun codeScanningDelegatedAlertDismissalPresence(): FieldPresence = codeScanningDelegatedAlertDismissalState.presence

  /**
   * Returns the wire presence of `code_scanning_options`.
   */
  public fun codeScanningOptionsPresence(): FieldPresence = codeScanningOptionsState.presence

  /**
   * Returns the wire presence of `code_security`.
   */
  public fun codeSecurityPresence(): FieldPresence = codeSecurityState.presence

  /**
   * Returns the wire presence of `dependabot_alerts`.
   */
  public fun dependabotAlertsPresence(): FieldPresence = dependabotAlertsState.presence

  /**
   * Returns the wire presence of `dependabot_delegated_alert_dismissal`.
   */
  public fun dependabotDelegatedAlertDismissalPresence(): FieldPresence = dependabotDelegatedAlertDismissalState.presence

  /**
   * Returns the wire presence of `dependabot_security_updates`.
   */
  public fun dependabotSecurityUpdatesPresence(): FieldPresence = dependabotSecurityUpdatesState.presence

  /**
   * Returns the wire presence of `dependency_graph`.
   */
  public fun dependencyGraphPresence(): FieldPresence = dependencyGraphState.presence

  /**
   * Returns the wire presence of `dependency_graph_autosubmit_action`.
   */
  public fun dependencyGraphAutosubmitActionPresence(): FieldPresence = dependencyGraphAutosubmitActionState.presence

  /**
   * Returns the wire presence of `dependency_graph_autosubmit_action_options`.
   */
  public fun dependencyGraphAutosubmitActionOptionsPresence(): FieldPresence = dependencyGraphAutosubmitActionOptionsState.presence

  /**
   * Returns the wire presence of `description`.
   */
  public fun descriptionPresence(): FieldPresence = descriptionState.presence

  /**
   * Returns the wire presence of `enforcement`.
   */
  public fun enforcementPresence(): FieldPresence = enforcementState.presence

  /**
   * Returns the wire presence of `name`.
   */
  public fun namePresence(): FieldPresence = nameState.presence

  /**
   * Returns the wire presence of `private_vulnerability_reporting`.
   */
  public fun privateVulnerabilityReportingPresence(): FieldPresence = privateVulnerabilityReportingState.presence

  /**
   * Returns the wire presence of `secret_protection`.
   */
  public fun secretProtectionPresence(): FieldPresence = secretProtectionState.presence

  /**
   * Returns the wire presence of `secret_scanning`.
   */
  public fun secretScanningPresence(): FieldPresence = secretScanningState.presence

  /**
   * Returns the wire presence of `secret_scanning_delegated_alert_dismissal`.
   */
  public fun secretScanningDelegatedAlertDismissalPresence(): FieldPresence = secretScanningDelegatedAlertDismissalState.presence

  /**
   * Returns the wire presence of `secret_scanning_delegated_bypass`.
   */
  public fun secretScanningDelegatedBypassPresence(): FieldPresence = secretScanningDelegatedBypassState.presence

  /**
   * Returns the wire presence of `secret_scanning_delegated_bypass_options`.
   */
  public fun secretScanningDelegatedBypassOptionsPresence(): FieldPresence = secretScanningDelegatedBypassOptionsState.presence

  /**
   * Returns the wire presence of `secret_scanning_extended_metadata`.
   */
  public fun secretScanningExtendedMetadataPresence(): FieldPresence = secretScanningExtendedMetadataState.presence

  /**
   * Returns the wire presence of `secret_scanning_generic_secrets`.
   */
  public fun secretScanningGenericSecretsPresence(): FieldPresence = secretScanningGenericSecretsState.presence

  /**
   * Returns the wire presence of `secret_scanning_non_provider_patterns`.
   */
  public fun secretScanningNonProviderPatternsPresence(): FieldPresence = secretScanningNonProviderPatternsState.presence

  /**
   * Returns the wire presence of `secret_scanning_push_protection`.
   */
  public fun secretScanningPushProtectionPresence(): FieldPresence = secretScanningPushProtectionState.presence

  /**
   * Returns the wire presence of `secret_scanning_validity_checks`.
   */
  public fun secretScanningValidityChecksPresence(): FieldPresence = secretScanningValidityChecksState.presence

  public class Builder {
    private var advancedSecurityState:
        FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405> =
        FieldState.Absent

    /**
     * The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret
     * Protection features.
     *
     * > [!WARNING]
     * > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual
     * `code_security` and `secret_protection` fields to set the status of these features.
     *
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var advancedSecurity:
        InlineOrgsCodeSecurityConfigurationsPatchRequestJsonAdvancedSecurityX5da36405?
      get() = advancedSecurityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "advancedSecurity is not nullable; call unsetAdvancedSecurity() to omit it" }
        advancedSecurityState = FieldState.Value(present)
      }

    private var codeScanningDefaultSetupState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469>
        = FieldState.Absent

    /**
     * The enablement status of code scanning default setup
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeScanningDefaultSetup:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDefaultSetupXeab24469?
      get() = codeScanningDefaultSetupState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "codeScanningDefaultSetup is not nullable; call unsetCodeScanningDefaultSetup() to omit it" }
        codeScanningDefaultSetupState = FieldState.Value(present)
      }

    private var codeScanningDefaultSetupOptionsState: FieldState<CodeScanningDefaultSetupOptions?> =
        FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var codeScanningDefaultSetupOptions: CodeScanningDefaultSetupOptions?
      get() = codeScanningDefaultSetupOptionsState.valueOrNull()
      set(`value`) {
        codeScanningDefaultSetupOptionsState = value.toNullableFieldState()
      }

    private var codeScanningDelegatedAlertDismissalState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDelegate8e9dX9194516b>
        = FieldState.Absent

    /**
     * The enablement status of code scanning delegated alert dismissal
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeScanningDelegatedAlertDismissal:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonCodeScanningDelegate8e9dX9194516b?
      get() = codeScanningDelegatedAlertDismissalState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "codeScanningDelegatedAlertDismissal is not nullable; call unsetCodeScanningDelegatedAlertDismissal() to omit it" }
        codeScanningDelegatedAlertDismissalState = FieldState.Value(present)
      }

    private var codeScanningOptionsState: FieldState<CodeScanningOptions?> = FieldState.Absent

    /**
     * Assigning `null` records present-null; use the unset function to omit the property.
     */
    public var codeScanningOptions: CodeScanningOptions?
      get() = codeScanningOptionsState.valueOrNull()
      set(`value`) {
        codeScanningOptionsState = value.toNullableFieldState()
      }

    private var codeSecurityState:
        FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc> =
        FieldState.Absent

    /**
     * The enablement status of GitHub Code Security features.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeSecurity:
        InlineOrgsCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXcf25b7bc?
      get() = codeSecurityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "codeSecurity is not nullable; call unsetCodeSecurity() to omit it" }
        codeSecurityState = FieldState.Value(present)
      }

    private var dependabotAlertsState:
        FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9> =
        FieldState.Absent

    /**
     * The enablement status of Dependabot alerts
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependabotAlerts:
        InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependabotAlertsX797b63a9?
      get() = dependabotAlertsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependabotAlerts is not nullable; call unsetDependabotAlerts() to omit it" }
        dependabotAlertsState = FieldState.Value(present)
      }

    private var dependabotDelegatedAlertDismissalState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotDelegatedA7d44X031bc3f0>
        = FieldState.Absent

    /**
     * The enablement status of Dependabot delegated alert dismissal. Requires Dependabot alerts to be enabled.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependabotDelegatedAlertDismissal:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotDelegatedA7d44X031bc3f0?
      get() = dependabotDelegatedAlertDismissalState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependabotDelegatedAlertDismissal is not nullable; call unsetDependabotDelegatedAlertDismissal() to omit it" }
        dependabotDelegatedAlertDismissalState = FieldState.Value(present)
      }

    private var dependabotSecurityUpdatesState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotSecurityUpc95aX5cd90d84>
        = FieldState.Absent

    /**
     * The enablement status of Dependabot security updates
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependabotSecurityUpdates:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonDependabotSecurityUpc95aX5cd90d84?
      get() = dependabotSecurityUpdatesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependabotSecurityUpdates is not nullable; call unsetDependabotSecurityUpdates() to omit it" }
        dependabotSecurityUpdatesState = FieldState.Value(present)
      }

    private var dependencyGraphState:
        FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependencyGraphXefcfd91d> =
        FieldState.Absent

    /**
     * The enablement status of Dependency Graph
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependencyGraph:
        InlineOrgsCodeSecurityConfigurationsPatchRequestJsonDependencyGraphXefcfd91d?
      get() = dependencyGraphState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependencyGraph is not nullable; call unsetDependencyGraph() to omit it" }
        dependencyGraphState = FieldState.Value(present)
      }

    private var dependencyGraphAutosubmitActionState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutos53b4X8b313b41>
        = FieldState.Absent

    /**
     * The enablement status of Automatic dependency submission
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependencyGraphAutosubmitAction:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutos53b4X8b313b41?
      get() = dependencyGraphAutosubmitActionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependencyGraphAutosubmitAction is not nullable; call unsetDependencyGraphAutosubmitAction() to omit it" }
        dependencyGraphAutosubmitActionState = FieldState.Value(present)
      }

    private var dependencyGraphAutosubmitActionOptionsState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutosfecdX573e8b73>
        = FieldState.Absent

    /**
     * Feature options for Automatic dependency submission
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependencyGraphAutosubmitActionOptions:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonDependencyGraphAutosfecdX573e8b73?
      get() = dependencyGraphAutosubmitActionOptionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependencyGraphAutosubmitActionOptions is not nullable; call unsetDependencyGraphAutosubmitActionOptions() to omit it" }
        dependencyGraphAutosubmitActionOptionsState = FieldState.Value(present)
      }

    private var descriptionState: FieldState<String> = FieldState.Absent

    /**
     * A description of the code security configuration
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var description: String?
      get() = descriptionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "description is not nullable; call unsetDescription() to omit it" }
        descriptionState = FieldState.Value(present)
      }

    private var enforcementState:
        FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95> =
        FieldState.Absent

    /**
     * The enforcement status for a security configuration
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enforcement:
        InlineOrgsCodeSecurityConfigurationsPatchRequestJsonEnforcementXdf4cbe95?
      get() = enforcementState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enforcement is not nullable; call unsetEnforcement() to omit it" }
        enforcementState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the code security configuration. Must be unique within the organization.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var privateVulnerabilityReportingState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonPrivateVulnerabilitycdadXd486f9cf>
        = FieldState.Absent

    /**
     * The enablement status of private vulnerability reporting
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var privateVulnerabilityReporting:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonPrivateVulnerabilitycdadXd486f9cf?
      get() = privateVulnerabilityReportingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "privateVulnerabilityReporting is not nullable; call unsetPrivateVulnerabilityReporting() to omit it" }
        privateVulnerabilityReportingState = FieldState.Value(present)
      }

    private var secretProtectionState:
        FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretProtectionX37e95994> =
        FieldState.Absent

    /**
     * The enablement status of GitHub Secret Protection features.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretProtection:
        InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretProtectionX37e95994?
      get() = secretProtectionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretProtection is not nullable; call unsetSecretProtection() to omit it" }
        secretProtectionState = FieldState.Value(present)
      }

    private var secretScanningState:
        FieldState<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretScanningXf469f8e3> =
        FieldState.Absent

    /**
     * The enablement status of secret scanning
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanning:
        InlineOrgsCodeSecurityConfigurationsPatchRequestJsonSecretScanningXf469f8e3?
      get() = secretScanningState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanning is not nullable; call unsetSecretScanning() to omit it" }
        secretScanningState = FieldState.Value(present)
      }

    private var secretScanningDelegatedAlertDismissalState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega870cX84293883>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning delegated alert dismissal
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningDelegatedAlertDismissal:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega870cX84293883?
      get() = secretScanningDelegatedAlertDismissalState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningDelegatedAlertDismissal is not nullable; call unsetSecretScanningDelegatedAlertDismissal() to omit it" }
        secretScanningDelegatedAlertDismissalState = FieldState.Value(present)
      }

    private var secretScanningDelegatedBypassState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega621bX39b71736>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning delegated bypass
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningDelegatedBypass:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega621bX39b71736?
      get() = secretScanningDelegatedBypassState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningDelegatedBypass is not nullable; call unsetSecretScanningDelegatedBypass() to omit it" }
        secretScanningDelegatedBypassState = FieldState.Value(present)
      }

    private var secretScanningDelegatedBypassOptionsState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819>
        = FieldState.Absent

    /**
     * Feature options for secret scanning delegated bypass
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningDelegatedBypassOptions:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningDelega7d2cX9011d819?
      get() = secretScanningDelegatedBypassOptionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningDelegatedBypassOptions is not nullable; call unsetSecretScanningDelegatedBypassOptions() to omit it" }
        secretScanningDelegatedBypassOptionsState = FieldState.Value(present)
      }

    private var secretScanningExtendedMetadataState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningExtende828X7f6569ad>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning extended metadata
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningExtendedMetadata:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningExtende828X7f6569ad?
      get() = secretScanningExtendedMetadataState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningExtendedMetadata is not nullable; call unsetSecretScanningExtendedMetadata() to omit it" }
        secretScanningExtendedMetadataState = FieldState.Value(present)
      }

    private var secretScanningGenericSecretsState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningGeneria531X211d3775>
        = FieldState.Absent

    /**
     * The enablement status of Copilot secret scanning
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningGenericSecrets:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningGeneria531X211d3775?
      get() = secretScanningGenericSecretsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningGenericSecrets is not nullable; call unsetSecretScanningGenericSecrets() to omit it" }
        secretScanningGenericSecretsState = FieldState.Value(present)
      }

    private var secretScanningNonProviderPatternsState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningNonPro8605X72ca6955>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning non-provider patterns
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningNonProviderPatterns:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningNonPro8605X72ca6955?
      get() = secretScanningNonProviderPatternsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningNonProviderPatterns is not nullable; call unsetSecretScanningNonProviderPatterns() to omit it" }
        secretScanningNonProviderPatternsState = FieldState.Value(present)
      }

    private var secretScanningPushProtectionState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning push protection
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningPushProtection:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningPushPr52c7X0019e95e?
      get() = secretScanningPushProtectionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningPushProtection is not nullable; call unsetSecretScanningPushProtection() to omit it" }
        secretScanningPushProtectionState = FieldState.Value(present)
      }

    private var secretScanningValidityChecksState:
        FieldState<InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningValidi3d40Xe1499f54>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning validity checks
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningValidityChecks:
        InlineOrgsCodeSecurityConf078bPatchRequestJsonSecretScanningValidi3d40Xe1499f54?
      get() = secretScanningValidityChecksState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningValidityChecks is not nullable; call unsetSecretScanningValidityChecks() to omit it" }
        secretScanningValidityChecksState = FieldState.Value(present)
      }

    /**
     * Omits `advanced_security` from serialized output.
     */
    public fun unsetAdvancedSecurity() {
      advancedSecurityState = FieldState.Absent
    }

    /**
     * Omits `code_scanning_default_setup` from serialized output.
     */
    public fun unsetCodeScanningDefaultSetup() {
      codeScanningDefaultSetupState = FieldState.Absent
    }

    /**
     * Omits `code_scanning_default_setup_options` from serialized output.
     */
    public fun unsetCodeScanningDefaultSetupOptions() {
      codeScanningDefaultSetupOptionsState = FieldState.Absent
    }

    /**
     * Omits `code_scanning_delegated_alert_dismissal` from serialized output.
     */
    public fun unsetCodeScanningDelegatedAlertDismissal() {
      codeScanningDelegatedAlertDismissalState = FieldState.Absent
    }

    /**
     * Omits `code_scanning_options` from serialized output.
     */
    public fun unsetCodeScanningOptions() {
      codeScanningOptionsState = FieldState.Absent
    }

    /**
     * Omits `code_security` from serialized output.
     */
    public fun unsetCodeSecurity() {
      codeSecurityState = FieldState.Absent
    }

    /**
     * Omits `dependabot_alerts` from serialized output.
     */
    public fun unsetDependabotAlerts() {
      dependabotAlertsState = FieldState.Absent
    }

    /**
     * Omits `dependabot_delegated_alert_dismissal` from serialized output.
     */
    public fun unsetDependabotDelegatedAlertDismissal() {
      dependabotDelegatedAlertDismissalState = FieldState.Absent
    }

    /**
     * Omits `dependabot_security_updates` from serialized output.
     */
    public fun unsetDependabotSecurityUpdates() {
      dependabotSecurityUpdatesState = FieldState.Absent
    }

    /**
     * Omits `dependency_graph` from serialized output.
     */
    public fun unsetDependencyGraph() {
      dependencyGraphState = FieldState.Absent
    }

    /**
     * Omits `dependency_graph_autosubmit_action` from serialized output.
     */
    public fun unsetDependencyGraphAutosubmitAction() {
      dependencyGraphAutosubmitActionState = FieldState.Absent
    }

    /**
     * Omits `dependency_graph_autosubmit_action_options` from serialized output.
     */
    public fun unsetDependencyGraphAutosubmitActionOptions() {
      dependencyGraphAutosubmitActionOptionsState = FieldState.Absent
    }

    /**
     * Omits `description` from serialized output.
     */
    public fun unsetDescription() {
      descriptionState = FieldState.Absent
    }

    /**
     * Omits `enforcement` from serialized output.
     */
    public fun unsetEnforcement() {
      enforcementState = FieldState.Absent
    }

    /**
     * Omits `name` from serialized output.
     */
    public fun unsetName() {
      nameState = FieldState.Absent
    }

    /**
     * Omits `private_vulnerability_reporting` from serialized output.
     */
    public fun unsetPrivateVulnerabilityReporting() {
      privateVulnerabilityReportingState = FieldState.Absent
    }

    /**
     * Omits `secret_protection` from serialized output.
     */
    public fun unsetSecretProtection() {
      secretProtectionState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning` from serialized output.
     */
    public fun unsetSecretScanning() {
      secretScanningState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_delegated_alert_dismissal` from serialized output.
     */
    public fun unsetSecretScanningDelegatedAlertDismissal() {
      secretScanningDelegatedAlertDismissalState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_delegated_bypass` from serialized output.
     */
    public fun unsetSecretScanningDelegatedBypass() {
      secretScanningDelegatedBypassState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_delegated_bypass_options` from serialized output.
     */
    public fun unsetSecretScanningDelegatedBypassOptions() {
      secretScanningDelegatedBypassOptionsState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_extended_metadata` from serialized output.
     */
    public fun unsetSecretScanningExtendedMetadata() {
      secretScanningExtendedMetadataState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_generic_secrets` from serialized output.
     */
    public fun unsetSecretScanningGenericSecrets() {
      secretScanningGenericSecretsState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_non_provider_patterns` from serialized output.
     */
    public fun unsetSecretScanningNonProviderPatterns() {
      secretScanningNonProviderPatternsState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_push_protection` from serialized output.
     */
    public fun unsetSecretScanningPushProtection() {
      secretScanningPushProtectionState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_validity_checks` from serialized output.
     */
    public fun unsetSecretScanningValidityChecks() {
      secretScanningValidityChecksState = FieldState.Absent
    }

    public fun build(): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e = InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e(
      advancedSecurityState = advancedSecurityState,
      codeScanningDefaultSetupState = codeScanningDefaultSetupState,
      codeScanningDefaultSetupOptionsState = codeScanningDefaultSetupOptionsState,
      codeScanningDelegatedAlertDismissalState = codeScanningDelegatedAlertDismissalState,
      codeScanningOptionsState = codeScanningOptionsState,
      codeSecurityState = codeSecurityState,
      dependabotAlertsState = dependabotAlertsState,
      dependabotDelegatedAlertDismissalState = dependabotDelegatedAlertDismissalState,
      dependabotSecurityUpdatesState = dependabotSecurityUpdatesState,
      dependencyGraphState = dependencyGraphState,
      dependencyGraphAutosubmitActionState = dependencyGraphAutosubmitActionState,
      dependencyGraphAutosubmitActionOptionsState = dependencyGraphAutosubmitActionOptionsState,
      descriptionState = descriptionState,
      enforcementState = enforcementState,
      nameState = nameState,
      privateVulnerabilityReportingState = privateVulnerabilityReportingState,
      secretProtectionState = secretProtectionState,
      secretScanningState = secretScanningState,
      secretScanningDelegatedAlertDismissalState = secretScanningDelegatedAlertDismissalState,
      secretScanningDelegatedBypassState = secretScanningDelegatedBypassState,
      secretScanningDelegatedBypassOptionsState = secretScanningDelegatedBypassOptionsState,
      secretScanningExtendedMetadataState = secretScanningExtendedMetadataState,
      secretScanningGenericSecretsState = secretScanningGenericSecretsState,
      secretScanningNonProviderPatternsState = secretScanningNonProviderPatternsState,
      secretScanningPushProtectionState = secretScanningPushProtectionState,
      secretScanningValidityChecksState = secretScanningValidityChecksState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e must be a JSON object")
      return InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e(
        advancedSecurityState = json.decodeOptional(rawObject, "advanced_security", nullable = false),
        codeScanningDefaultSetupState = json.decodeOptional(rawObject, "code_scanning_default_setup", nullable = false),
        codeScanningDefaultSetupOptionsState = json.decodeOptional(rawObject, "code_scanning_default_setup_options", nullable = true),
        codeScanningDelegatedAlertDismissalState = json.decodeOptional(rawObject, "code_scanning_delegated_alert_dismissal", nullable = false),
        codeScanningOptionsState = json.decodeOptional(rawObject, "code_scanning_options", nullable = true),
        codeSecurityState = json.decodeOptional(rawObject, "code_security", nullable = false),
        dependabotAlertsState = json.decodeOptional(rawObject, "dependabot_alerts", nullable = false),
        dependabotDelegatedAlertDismissalState = json.decodeOptional(rawObject, "dependabot_delegated_alert_dismissal", nullable = false),
        dependabotSecurityUpdatesState = json.decodeOptional(rawObject, "dependabot_security_updates", nullable = false),
        dependencyGraphState = json.decodeOptional(rawObject, "dependency_graph", nullable = false),
        dependencyGraphAutosubmitActionState = json.decodeOptional(rawObject, "dependency_graph_autosubmit_action", nullable = false),
        dependencyGraphAutosubmitActionOptionsState = json.decodeOptional(rawObject, "dependency_graph_autosubmit_action_options", nullable = false),
        descriptionState = json.decodeOptional(rawObject, "description", nullable = false),
        enforcementState = json.decodeOptional(rawObject, "enforcement", nullable = false),
        nameState = json.decodeOptional(rawObject, "name", nullable = false),
        privateVulnerabilityReportingState = json.decodeOptional(rawObject, "private_vulnerability_reporting", nullable = false),
        secretProtectionState = json.decodeOptional(rawObject, "secret_protection", nullable = false),
        secretScanningState = json.decodeOptional(rawObject, "secret_scanning", nullable = false),
        secretScanningDelegatedAlertDismissalState = json.decodeOptional(rawObject, "secret_scanning_delegated_alert_dismissal", nullable = false),
        secretScanningDelegatedBypassState = json.decodeOptional(rawObject, "secret_scanning_delegated_bypass", nullable = false),
        secretScanningDelegatedBypassOptionsState = json.decodeOptional(rawObject, "secret_scanning_delegated_bypass_options", nullable = false),
        secretScanningExtendedMetadataState = json.decodeOptional(rawObject, "secret_scanning_extended_metadata", nullable = false),
        secretScanningGenericSecretsState = json.decodeOptional(rawObject, "secret_scanning_generic_secrets", nullable = false),
        secretScanningNonProviderPatternsState = json.decodeOptional(rawObject, "secret_scanning_non_provider_patterns", nullable = false),
        secretScanningPushProtectionState = json.decodeOptional(rawObject, "secret_scanning_push_protection", nullable = false),
        secretScanningValidityChecksState = json.decodeOptional(rawObject, "secret_scanning_validity_checks", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("advanced_security", value.advancedSecurityState, json::encodeToJsonElement)
        putState("code_scanning_default_setup", value.codeScanningDefaultSetupState, json::encodeToJsonElement)
        putState("code_scanning_default_setup_options", value.codeScanningDefaultSetupOptionsState, json::encodeToJsonElement)
        putState("code_scanning_delegated_alert_dismissal", value.codeScanningDelegatedAlertDismissalState, json::encodeToJsonElement)
        putState("code_scanning_options", value.codeScanningOptionsState, json::encodeToJsonElement)
        putState("code_security", value.codeSecurityState, json::encodeToJsonElement)
        putState("dependabot_alerts", value.dependabotAlertsState, json::encodeToJsonElement)
        putState("dependabot_delegated_alert_dismissal", value.dependabotDelegatedAlertDismissalState, json::encodeToJsonElement)
        putState("dependabot_security_updates", value.dependabotSecurityUpdatesState, json::encodeToJsonElement)
        putState("dependency_graph", value.dependencyGraphState, json::encodeToJsonElement)
        putState("dependency_graph_autosubmit_action", value.dependencyGraphAutosubmitActionState, json::encodeToJsonElement)
        putState("dependency_graph_autosubmit_action_options", value.dependencyGraphAutosubmitActionOptionsState, json::encodeToJsonElement)
        putState("description", value.descriptionState, json::encodeToJsonElement)
        putState("enforcement", value.enforcementState, json::encodeToJsonElement)
        putState("name", value.nameState, json::encodeToJsonElement)
        putState("private_vulnerability_reporting", value.privateVulnerabilityReportingState, json::encodeToJsonElement)
        putState("secret_protection", value.secretProtectionState, json::encodeToJsonElement)
        putState("secret_scanning", value.secretScanningState, json::encodeToJsonElement)
        putState("secret_scanning_delegated_alert_dismissal", value.secretScanningDelegatedAlertDismissalState, json::encodeToJsonElement)
        putState("secret_scanning_delegated_bypass", value.secretScanningDelegatedBypassState, json::encodeToJsonElement)
        putState("secret_scanning_delegated_bypass_options", value.secretScanningDelegatedBypassOptionsState, json::encodeToJsonElement)
        putState("secret_scanning_extended_metadata", value.secretScanningExtendedMetadataState, json::encodeToJsonElement)
        putState("secret_scanning_generic_secrets", value.secretScanningGenericSecretsState, json::encodeToJsonElement)
        putState("secret_scanning_non_provider_patterns", value.secretScanningNonProviderPatternsState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection", value.secretScanningPushProtectionState, json::encodeToJsonElement)
        putState("secret_scanning_validity_checks", value.secretScanningValidityChecksState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e(block: InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e.Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e = InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineOrgsCodeSecurityConfigurationsPatchRequestJsonXbdfe200e property '" + name + "' is not nullable")
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
