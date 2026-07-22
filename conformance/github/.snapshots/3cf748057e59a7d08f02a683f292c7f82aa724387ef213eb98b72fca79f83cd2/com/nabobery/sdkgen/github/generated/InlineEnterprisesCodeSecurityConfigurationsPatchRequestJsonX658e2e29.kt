package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}/pa
 * tch/requestBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations~1{configuration_id}/pa
 * tch/requestBody/content/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29.Serializer::class)
public class InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29 internal constructor(
  private val advancedSecurityState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonAdvancedSecurityXfe33ad84>,
  private val codeScanningDefaultSetupState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDefaultSetupXf4505488>,
  private val codeScanningDefaultSetupOptionsState: FieldState<CodeScanningDefaultSetupOptions?>,
  private val codeScanningDelegatedAlertDismissalState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDelegate8e9dXcd0d9b24>,
  private val codeScanningOptionsState: FieldState<CodeScanningOptions?>,
  private val codeSecurityState:
      FieldState<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111>,
  private val dependabotAlertsState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotAlertsX42a17e88>,
  private val dependabotSecurityUpdatesState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotSecurityUpc95aXf81a58fd>,
  private val dependencyGraphState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d>,
  private val dependencyGraphAutosubmitActionState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutos53b4X49538e65>,
  private val dependencyGraphAutosubmitActionOptionsState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659>,
  private val descriptionState: FieldState<String>,
  private val enforcementState:
      FieldState<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4>,
  private val nameState: FieldState<String>,
  private val privateVulnerabilityReportingState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonPrivateVulnerabilitycdadXf4f41bed>,
  private val secretProtectionState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretProtectionX9c5d158e>,
  private val secretScanningState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningX3855ea60>,
  private val secretScanningDelegatedAlertDismissalState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningDelega870cX2533147b>,
  private val secretScanningExtendedMetadataState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningExtende828X7977cd84>,
  private val secretScanningGenericSecretsState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningGeneria531X51b7d2f1>,
  private val secretScanningNonProviderPatternsState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningNonPro8605X692e2de4>,
  private val secretScanningPushProtectionState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningPushPr52c7X88de0e35>,
  private val secretScanningValidityChecksState:
      FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningValidi3d40Xa31cc2bf>,
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
      InlineEnterprisesCodeSecur4e22PatchRequestJsonAdvancedSecurityXfe33ad84?
    get() = advancedSecurityState.valueOrNull()

  /**
   * The enablement status of code scanning default setup
   */
  public val codeScanningDefaultSetup:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDefaultSetupXf4505488?
    get() = codeScanningDefaultSetupState.valueOrNull()

  public val codeScanningDefaultSetupOptions: CodeScanningDefaultSetupOptions?
    get() = codeScanningDefaultSetupOptionsState.valueOrNull()

  /**
   * The enablement status of code scanning delegated alert dismissal
   */
  public val codeScanningDelegatedAlertDismissal:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDelegate8e9dXcd0d9b24?
    get() = codeScanningDelegatedAlertDismissalState.valueOrNull()

  public val codeScanningOptions: CodeScanningOptions?
    get() = codeScanningOptionsState.valueOrNull()

  /**
   * The enablement status of GitHub Code Security features.
   */
  public val codeSecurity:
      InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111?
    get() = codeSecurityState.valueOrNull()

  /**
   * The enablement status of Dependabot alerts
   */
  public val dependabotAlerts:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotAlertsX42a17e88?
    get() = dependabotAlertsState.valueOrNull()

  /**
   * The enablement status of Dependabot security updates
   */
  public val dependabotSecurityUpdates:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotSecurityUpc95aXf81a58fd?
    get() = dependabotSecurityUpdatesState.valueOrNull()

  /**
   * The enablement status of Dependency Graph
   */
  public val dependencyGraph:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d?
    get() = dependencyGraphState.valueOrNull()

  /**
   * The enablement status of Automatic dependency submission
   */
  public val dependencyGraphAutosubmitAction:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutos53b4X49538e65?
    get() = dependencyGraphAutosubmitActionState.valueOrNull()

  /**
   * Feature options for Automatic dependency submission
   */
  public val dependencyGraphAutosubmitActionOptions:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659?
    get() = dependencyGraphAutosubmitActionOptionsState.valueOrNull()

  /**
   * A description of the code security configuration
   */
  public val description: String?
    get() = descriptionState.valueOrNull()

  /**
   * The enforcement status for a security configuration
   */
  public val enforcement:
      InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4?
    get() = enforcementState.valueOrNull()

  /**
   * The name of the code security configuration. Must be unique across the enterprise.
   */
  public val name: String?
    get() = nameState.valueOrNull()

  /**
   * The enablement status of private vulnerability reporting
   */
  public val privateVulnerabilityReporting:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonPrivateVulnerabilitycdadXf4f41bed?
    get() = privateVulnerabilityReportingState.valueOrNull()

  /**
   * The enablement status of GitHub Secret Protection features.
   */
  public val secretProtection:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretProtectionX9c5d158e?
    get() = secretProtectionState.valueOrNull()

  /**
   * The enablement status of secret scanning
   */
  public val secretScanning: InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningX3855ea60?
    get() = secretScanningState.valueOrNull()

  /**
   * The enablement status of secret scanning delegated alert dismissal
   */
  public val secretScanningDelegatedAlertDismissal:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningDelega870cX2533147b?
    get() = secretScanningDelegatedAlertDismissalState.valueOrNull()

  /**
   * The enablement status of secret scanning extended metadata
   */
  public val secretScanningExtendedMetadata:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningExtende828X7977cd84?
    get() = secretScanningExtendedMetadataState.valueOrNull()

  /**
   * The enablement status of Copilot secret scanning
   */
  public val secretScanningGenericSecrets:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningGeneria531X51b7d2f1?
    get() = secretScanningGenericSecretsState.valueOrNull()

  /**
   * The enablement status of secret scanning non-provider patterns
   */
  public val secretScanningNonProviderPatterns:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningNonPro8605X692e2de4?
    get() = secretScanningNonProviderPatternsState.valueOrNull()

  /**
   * The enablement status of secret scanning push protection
   */
  public val secretScanningPushProtection:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningPushPr52c7X88de0e35?
    get() = secretScanningPushProtectionState.valueOrNull()

  /**
   * The enablement status of secret scanning validity checks
   */
  public val secretScanningValidityChecks:
      InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningValidi3d40Xa31cc2bf?
    get() = secretScanningValidityChecksState.valueOrNull()

  public constructor() : this(advancedSecurityState = FieldState.Absent,
  codeScanningDefaultSetupState = FieldState.Absent,
  codeScanningDefaultSetupOptionsState = FieldState.Absent,
  codeScanningDelegatedAlertDismissalState = FieldState.Absent,
  codeScanningOptionsState = FieldState.Absent,
  codeSecurityState = FieldState.Absent,
  dependabotAlertsState = FieldState.Absent,
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
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonAdvancedSecurityXfe33ad84> =
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
        InlineEnterprisesCodeSecur4e22PatchRequestJsonAdvancedSecurityXfe33ad84?
      get() = advancedSecurityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "advancedSecurity is not nullable; call unsetAdvancedSecurity() to omit it" }
        advancedSecurityState = FieldState.Value(present)
      }

    private var codeScanningDefaultSetupState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDefaultSetupXf4505488>
        = FieldState.Absent

    /**
     * The enablement status of code scanning default setup
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeScanningDefaultSetup:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDefaultSetupXf4505488?
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
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDelegate8e9dXcd0d9b24>
        = FieldState.Absent

    /**
     * The enablement status of code scanning delegated alert dismissal
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeScanningDelegatedAlertDismissal:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonCodeScanningDelegate8e9dXcd0d9b24?
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
        FieldState<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111>
        = FieldState.Absent

    /**
     * The enablement status of GitHub Code Security features.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeSecurity:
        InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonCodeSecurityXe7e26111?
      get() = codeSecurityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "codeSecurity is not nullable; call unsetCodeSecurity() to omit it" }
        codeSecurityState = FieldState.Value(present)
      }

    private var dependabotAlertsState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotAlertsX42a17e88> =
        FieldState.Absent

    /**
     * The enablement status of Dependabot alerts
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependabotAlerts:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotAlertsX42a17e88?
      get() = dependabotAlertsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependabotAlerts is not nullable; call unsetDependabotAlerts() to omit it" }
        dependabotAlertsState = FieldState.Value(present)
      }

    private var dependabotSecurityUpdatesState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotSecurityUpc95aXf81a58fd>
        = FieldState.Absent

    /**
     * The enablement status of Dependabot security updates
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependabotSecurityUpdates:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonDependabotSecurityUpc95aXf81a58fd?
      get() = dependabotSecurityUpdatesState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependabotSecurityUpdates is not nullable; call unsetDependabotSecurityUpdates() to omit it" }
        dependabotSecurityUpdatesState = FieldState.Value(present)
      }

    private var dependencyGraphState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d> =
        FieldState.Absent

    /**
     * The enablement status of Dependency Graph
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependencyGraph:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphX752d143d?
      get() = dependencyGraphState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependencyGraph is not nullable; call unsetDependencyGraph() to omit it" }
        dependencyGraphState = FieldState.Value(present)
      }

    private var dependencyGraphAutosubmitActionState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutos53b4X49538e65>
        = FieldState.Absent

    /**
     * The enablement status of Automatic dependency submission
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependencyGraphAutosubmitAction:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutos53b4X49538e65?
      get() = dependencyGraphAutosubmitActionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "dependencyGraphAutosubmitAction is not nullable; call unsetDependencyGraphAutosubmitAction() to omit it" }
        dependencyGraphAutosubmitActionState = FieldState.Value(present)
      }

    private var dependencyGraphAutosubmitActionOptionsState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659>
        = FieldState.Absent

    /**
     * Feature options for Automatic dependency submission
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var dependencyGraphAutosubmitActionOptions:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonDependencyGraphAutosfecdXa9719659?
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
        FieldState<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4>
        = FieldState.Absent

    /**
     * The enforcement status for a security configuration
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var enforcement:
        InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonEnforcementX9bd02df4?
      get() = enforcementState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "enforcement is not nullable; call unsetEnforcement() to omit it" }
        enforcementState = FieldState.Value(present)
      }

    private var nameState: FieldState<String> = FieldState.Absent

    /**
     * The name of the code security configuration. Must be unique across the enterprise.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var name: String?
      get() = nameState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "name is not nullable; call unsetName() to omit it" }
        nameState = FieldState.Value(present)
      }

    private var privateVulnerabilityReportingState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonPrivateVulnerabilitycdadXf4f41bed>
        = FieldState.Absent

    /**
     * The enablement status of private vulnerability reporting
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var privateVulnerabilityReporting:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonPrivateVulnerabilitycdadXf4f41bed?
      get() = privateVulnerabilityReportingState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "privateVulnerabilityReporting is not nullable; call unsetPrivateVulnerabilityReporting() to omit it" }
        privateVulnerabilityReportingState = FieldState.Value(present)
      }

    private var secretProtectionState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretProtectionX9c5d158e> =
        FieldState.Absent

    /**
     * The enablement status of GitHub Secret Protection features.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretProtection:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretProtectionX9c5d158e?
      get() = secretProtectionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretProtection is not nullable; call unsetSecretProtection() to omit it" }
        secretProtectionState = FieldState.Value(present)
      }

    private var secretScanningState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningX3855ea60> =
        FieldState.Absent

    /**
     * The enablement status of secret scanning
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanning:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningX3855ea60?
      get() = secretScanningState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanning is not nullable; call unsetSecretScanning() to omit it" }
        secretScanningState = FieldState.Value(present)
      }

    private var secretScanningDelegatedAlertDismissalState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningDelega870cX2533147b>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning delegated alert dismissal
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningDelegatedAlertDismissal:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningDelega870cX2533147b?
      get() = secretScanningDelegatedAlertDismissalState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningDelegatedAlertDismissal is not nullable; call unsetSecretScanningDelegatedAlertDismissal() to omit it" }
        secretScanningDelegatedAlertDismissalState = FieldState.Value(present)
      }

    private var secretScanningExtendedMetadataState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningExtende828X7977cd84>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning extended metadata
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningExtendedMetadata:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningExtende828X7977cd84?
      get() = secretScanningExtendedMetadataState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningExtendedMetadata is not nullable; call unsetSecretScanningExtendedMetadata() to omit it" }
        secretScanningExtendedMetadataState = FieldState.Value(present)
      }

    private var secretScanningGenericSecretsState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningGeneria531X51b7d2f1>
        = FieldState.Absent

    /**
     * The enablement status of Copilot secret scanning
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningGenericSecrets:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningGeneria531X51b7d2f1?
      get() = secretScanningGenericSecretsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningGenericSecrets is not nullable; call unsetSecretScanningGenericSecrets() to omit it" }
        secretScanningGenericSecretsState = FieldState.Value(present)
      }

    private var secretScanningNonProviderPatternsState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningNonPro8605X692e2de4>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning non-provider patterns
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningNonProviderPatterns:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningNonPro8605X692e2de4?
      get() = secretScanningNonProviderPatternsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningNonProviderPatterns is not nullable; call unsetSecretScanningNonProviderPatterns() to omit it" }
        secretScanningNonProviderPatternsState = FieldState.Value(present)
      }

    private var secretScanningPushProtectionState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningPushPr52c7X88de0e35>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning push protection
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningPushProtection:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningPushPr52c7X88de0e35?
      get() = secretScanningPushProtectionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningPushProtection is not nullable; call unsetSecretScanningPushProtection() to omit it" }
        secretScanningPushProtectionState = FieldState.Value(present)
      }

    private var secretScanningValidityChecksState:
        FieldState<InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningValidi3d40Xa31cc2bf>
        = FieldState.Absent

    /**
     * The enablement status of secret scanning validity checks
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningValidityChecks:
        InlineEnterprisesCodeSecur4e22PatchRequestJsonSecretScanningValidi3d40Xa31cc2bf?
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

    public fun build(): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29 = InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29(
      advancedSecurityState = advancedSecurityState,
      codeScanningDefaultSetupState = codeScanningDefaultSetupState,
      codeScanningDefaultSetupOptionsState = codeScanningDefaultSetupOptionsState,
      codeScanningDelegatedAlertDismissalState = codeScanningDelegatedAlertDismissalState,
      codeScanningOptionsState = codeScanningOptionsState,
      codeSecurityState = codeSecurityState,
      dependabotAlertsState = dependabotAlertsState,
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
      secretScanningExtendedMetadataState = secretScanningExtendedMetadataState,
      secretScanningGenericSecretsState = secretScanningGenericSecretsState,
      secretScanningNonProviderPatternsState = secretScanningNonProviderPatternsState,
      secretScanningPushProtectionState = secretScanningPushProtectionState,
      secretScanningValidityChecksState = secretScanningValidityChecksState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29 must be a JSON object")
      return InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29(
        advancedSecurityState = json.decodeOptional(rawObject, "advanced_security", nullable = false),
        codeScanningDefaultSetupState = json.decodeOptional(rawObject, "code_scanning_default_setup", nullable = false),
        codeScanningDefaultSetupOptionsState = json.decodeOptional(rawObject, "code_scanning_default_setup_options", nullable = true),
        codeScanningDelegatedAlertDismissalState = json.decodeOptional(rawObject, "code_scanning_delegated_alert_dismissal", nullable = false),
        codeScanningOptionsState = json.decodeOptional(rawObject, "code_scanning_options", nullable = true),
        codeSecurityState = json.decodeOptional(rawObject, "code_security", nullable = false),
        dependabotAlertsState = json.decodeOptional(rawObject, "dependabot_alerts", nullable = false),
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
        secretScanningExtendedMetadataState = json.decodeOptional(rawObject, "secret_scanning_extended_metadata", nullable = false),
        secretScanningGenericSecretsState = json.decodeOptional(rawObject, "secret_scanning_generic_secrets", nullable = false),
        secretScanningNonProviderPatternsState = json.decodeOptional(rawObject, "secret_scanning_non_provider_patterns", nullable = false),
        secretScanningPushProtectionState = json.decodeOptional(rawObject, "secret_scanning_push_protection", nullable = false),
        secretScanningValidityChecksState = json.decodeOptional(rawObject, "secret_scanning_validity_checks", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("advanced_security", value.advancedSecurityState, json::encodeToJsonElement)
        putState("code_scanning_default_setup", value.codeScanningDefaultSetupState, json::encodeToJsonElement)
        putState("code_scanning_default_setup_options", value.codeScanningDefaultSetupOptionsState, json::encodeToJsonElement)
        putState("code_scanning_delegated_alert_dismissal", value.codeScanningDelegatedAlertDismissalState, json::encodeToJsonElement)
        putState("code_scanning_options", value.codeScanningOptionsState, json::encodeToJsonElement)
        putState("code_security", value.codeSecurityState, json::encodeToJsonElement)
        putState("dependabot_alerts", value.dependabotAlertsState, json::encodeToJsonElement)
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

public fun inlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29(block: InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29.Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29 = InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsPatchRequestJsonX658e2e29 property '" + name + "' is not nullable")
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
