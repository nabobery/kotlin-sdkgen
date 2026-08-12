package com.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema
 */
@Serializable(with = InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab.Serializer::class)
public class InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab(
  /**
   * The name of the code security configuration. Must be unique within the organization.
   */
  public val name: String,
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
      InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a? = null,
  /**
   * The enablement status of code scanning default setup
   */
  public val codeScanningDefaultSetup:
      InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDefaultSetupX3e8c552e? = null,
  public val codeScanningDefaultSetupOptions: CodeScanningDefaultSetupOptions? = null,
  /**
   * The enablement status of code scanning delegated alert dismissal
   */
  public val codeScanningDelegatedAlertDismissal:
      InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2? = null,
  public val codeScanningOptions: CodeScanningOptions? = null,
  /**
   * The enablement status of GitHub Code Security features.
   */
  public val codeSecurity:
      InlineOrgsCodeSecurityConfigurationsPostRequestJsonCodeSecurityXfb7a0ef3? = null,
  /**
   * The enablement status of Dependabot alerts
   */
  public val dependabotAlerts:
      InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependabotAlertsX87f2e079? = null,
  /**
   * The enablement status of Dependabot delegated alert dismissal. Requires Dependabot alerts to be enabled.
   */
  public val dependabotDelegatedAlertDismissal:
      InlineOrgsCodeSecurityConf078bPostRequestJsonDependabotDelegatedA7d44X19595824? = null,
  /**
   * The enablement status of Dependabot security updates
   */
  public val dependabotSecurityUpdates:
      InlineOrgsCodeSecurityConf078bPostRequestJsonDependabotSecurityUpc95aXa7bc965d? = null,
  /**
   * The enablement status of Dependency Graph
   */
  public val dependencyGraph:
      InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c? = null,
  /**
   * The enablement status of Automatic dependency submission
   */
  public val dependencyGraphAutosubmitAction:
      InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutos53b4X09f01d90? = null,
  /**
   * Feature options for Automatic dependency submission
   */
  public val dependencyGraphAutosubmitActionOptions:
      InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef? = null,
  /**
   * A description of the code security configuration
   */
  public val description: String? = null,
  /**
   * The enforcement status for a security configuration
   */
  public val enforcement:
      InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4? = null,
  /**
   * The enablement status of private vulnerability reporting
   */
  public val privateVulnerabilityReporting:
      InlineOrgsCodeSecurityConf078bPostRequestJsonPrivateVulnerabilitycdadXf60b602e? = null,
  /**
   * The enablement status of GitHub Secret Protection features.
   */
  public val secretProtection:
      InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4? = null,
  /**
   * The enablement status of secret scanning
   */
  public val secretScanning:
      InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353? = null,
  /**
   * The enablement status of secret scanning delegated alert dismissal
   */
  public val secretScanningDelegatedAlertDismissal:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega870cX96859723? = null,
  /**
   * The enablement status of secret scanning delegated bypass
   */
  public val secretScanningDelegatedBypass:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega621bX7718ddc2? = null,
  /**
   * Feature options for secret scanning delegated bypass
   */
  public val secretScanningDelegatedBypassOptions:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f? = null,
  /**
   * The enablement status of secret scanning extended metadata
   */
  public val secretScanningExtendedMetadata:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningExtende828Xf44544b9? = null,
  /**
   * The enablement status of Copilot secret scanning
   */
  public val secretScanningGenericSecrets:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d? = null,
  /**
   * The enablement status of secret scanning non provider patterns
   */
  public val secretScanningNonProviderPatterns:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc? = null,
  /**
   * The enablement status of secret scanning push protection
   */
  public val secretScanningPushProtection:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningPushPr52c7X64c11147? = null,
  /**
   * The enablement status of secret scanning validity checks
   */
  public val secretScanningValidityChecks:
      InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6? = null,
) {
  public class Builder {
    private var nameValue: String? = null

    public var name: String
      get() = requireNotNull(nameValue) { "name is required" }
      set(`value`) {
        nameValue = value
      }

    /**
     * The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret
     * Protection features.
     *
     * > [!WARNING]
     * > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual
     * `code_security` and `secret_protection` fields to set the status of these features.
     *
     */
    public var advancedSecurity:
        InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a? = null

    /**
     * The enablement status of code scanning default setup
     */
    public var codeScanningDefaultSetup:
        InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDefaultSetupX3e8c552e? = null

    public var codeScanningDefaultSetupOptions: CodeScanningDefaultSetupOptions? = null

    /**
     * The enablement status of code scanning delegated alert dismissal
     */
    public var codeScanningDelegatedAlertDismissal:
        InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2? = null

    public var codeScanningOptions: CodeScanningOptions? = null

    /**
     * The enablement status of GitHub Code Security features.
     */
    public var codeSecurity:
        InlineOrgsCodeSecurityConfigurationsPostRequestJsonCodeSecurityXfb7a0ef3? = null

    /**
     * The enablement status of Dependabot alerts
     */
    public var dependabotAlerts:
        InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependabotAlertsX87f2e079? = null

    /**
     * The enablement status of Dependabot delegated alert dismissal. Requires Dependabot alerts to be enabled.
     */
    public var dependabotDelegatedAlertDismissal:
        InlineOrgsCodeSecurityConf078bPostRequestJsonDependabotDelegatedA7d44X19595824? = null

    /**
     * The enablement status of Dependabot security updates
     */
    public var dependabotSecurityUpdates:
        InlineOrgsCodeSecurityConf078bPostRequestJsonDependabotSecurityUpc95aXa7bc965d? = null

    /**
     * The enablement status of Dependency Graph
     */
    public var dependencyGraph:
        InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c? = null

    /**
     * The enablement status of Automatic dependency submission
     */
    public var dependencyGraphAutosubmitAction:
        InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutos53b4X09f01d90? = null

    /**
     * Feature options for Automatic dependency submission
     */
    public var dependencyGraphAutosubmitActionOptions:
        InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef? = null

    /**
     * A description of the code security configuration
     */
    public var description: String? = null

    /**
     * The enforcement status for a security configuration
     */
    public var enforcement: InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4?
        = null

    /**
     * The enablement status of private vulnerability reporting
     */
    public var privateVulnerabilityReporting:
        InlineOrgsCodeSecurityConf078bPostRequestJsonPrivateVulnerabilitycdadXf60b602e? = null

    /**
     * The enablement status of GitHub Secret Protection features.
     */
    public var secretProtection:
        InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4? = null

    /**
     * The enablement status of secret scanning
     */
    public var secretScanning:
        InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353? = null

    /**
     * The enablement status of secret scanning delegated alert dismissal
     */
    public var secretScanningDelegatedAlertDismissal:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega870cX96859723? = null

    /**
     * The enablement status of secret scanning delegated bypass
     */
    public var secretScanningDelegatedBypass:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega621bX7718ddc2? = null

    /**
     * Feature options for secret scanning delegated bypass
     */
    public var secretScanningDelegatedBypassOptions:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f? = null

    /**
     * The enablement status of secret scanning extended metadata
     */
    public var secretScanningExtendedMetadata:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningExtende828Xf44544b9? = null

    /**
     * The enablement status of Copilot secret scanning
     */
    public var secretScanningGenericSecrets:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d? = null

    /**
     * The enablement status of secret scanning non provider patterns
     */
    public var secretScanningNonProviderPatterns:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc? = null

    /**
     * The enablement status of secret scanning push protection
     */
    public var secretScanningPushProtection:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningPushPr52c7X64c11147? = null

    /**
     * The enablement status of secret scanning validity checks
     */
    public var secretScanningValidityChecks:
        InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6? = null

    public fun build(): InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab {
      check(nameValue != null) { "name is required" }
      return InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab(
        name = name,
        advancedSecurity = advancedSecurity,
        codeScanningDefaultSetup = codeScanningDefaultSetup,
        codeScanningDefaultSetupOptions = codeScanningDefaultSetupOptions,
        codeScanningDelegatedAlertDismissal = codeScanningDelegatedAlertDismissal,
        codeScanningOptions = codeScanningOptions,
        codeSecurity = codeSecurity,
        dependabotAlerts = dependabotAlerts,
        dependabotDelegatedAlertDismissal = dependabotDelegatedAlertDismissal,
        dependabotSecurityUpdates = dependabotSecurityUpdates,
        dependencyGraph = dependencyGraph,
        dependencyGraphAutosubmitAction = dependencyGraphAutosubmitAction,
        dependencyGraphAutosubmitActionOptions = dependencyGraphAutosubmitActionOptions,
        description = description,
        enforcement = enforcement,
        privateVulnerabilityReporting = privateVulnerabilityReporting,
        secretProtection = secretProtection,
        secretScanning = secretScanning,
        secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal,
        secretScanningDelegatedBypass = secretScanningDelegatedBypass,
        secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions,
        secretScanningExtendedMetadata = secretScanningExtendedMetadata,
        secretScanningGenericSecrets = secretScanningGenericSecrets,
        secretScanningNonProviderPatterns = secretScanningNonProviderPatterns,
        secretScanningPushProtection = secretScanningPushProtection,
        secretScanningValidityChecks = secretScanningValidityChecks,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab(
        name = name,
        advancedSecurity = rawObject["advanced_security"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConfigurationsPostRequestJsonAdvancedSecurityX8660438a>(it) },
        codeScanningDefaultSetup = rawObject["code_scanning_default_setup"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDefaultSetupX3e8c552e>(it) },
        codeScanningDefaultSetupOptions = rawObject["code_scanning_default_setup_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CodeScanningDefaultSetupOptions?>(element) },
        codeScanningDelegatedAlertDismissal = rawObject["code_scanning_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonCodeScanningDelegate8e9dXa6f4a1b2>(it) },
        codeScanningOptions = rawObject["code_scanning_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CodeScanningOptions?>(element) },
        codeSecurity = rawObject["code_security"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConfigurationsPostRequestJsonCodeSecurityXfb7a0ef3>(it) },
        dependabotAlerts = rawObject["dependabot_alerts"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependabotAlertsX87f2e079>(it) },
        dependabotDelegatedAlertDismissal = rawObject["dependabot_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonDependabotDelegatedA7d44X19595824>(it) },
        dependabotSecurityUpdates = rawObject["dependabot_security_updates"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonDependabotSecurityUpc95aXa7bc965d>(it) },
        dependencyGraph = rawObject["dependency_graph"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConfigurationsPostRequestJsonDependencyGraphX533be49c>(it) },
        dependencyGraphAutosubmitAction = rawObject["dependency_graph_autosubmit_action"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutos53b4X09f01d90>(it) },
        dependencyGraphAutosubmitActionOptions = rawObject["dependency_graph_autosubmit_action_options"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        enforcement = rawObject["enforcement"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConfigurationsPostRequestJsonEnforcementX300a40b4>(it) },
        privateVulnerabilityReporting = rawObject["private_vulnerability_reporting"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonPrivateVulnerabilitycdadXf60b602e>(it) },
        secretProtection = rawObject["secret_protection"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretProtectionX846a30e4>(it) },
        secretScanning = rawObject["secret_scanning"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConfigurationsPostRequestJsonSecretScanningXc70be353>(it) },
        secretScanningDelegatedAlertDismissal = rawObject["secret_scanning_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega870cX96859723>(it) },
        secretScanningDelegatedBypass = rawObject["secret_scanning_delegated_bypass"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega621bX7718ddc2>(it) },
        secretScanningDelegatedBypassOptions = rawObject["secret_scanning_delegated_bypass_options"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningDelega7d2cX3848280f>(it) },
        secretScanningExtendedMetadata = rawObject["secret_scanning_extended_metadata"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningExtende828Xf44544b9>(it) },
        secretScanningGenericSecrets = rawObject["secret_scanning_generic_secrets"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningGeneria531X22d07b6d>(it) },
        secretScanningNonProviderPatterns = rawObject["secret_scanning_non_provider_patterns"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningNonPro8605Xd80e84bc>(it) },
        secretScanningPushProtection = rawObject["secret_scanning_push_protection"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningPushPr52c7X64c11147>(it) },
        secretScanningValidityChecks = rawObject["secret_scanning_validity_checks"]?.let { json.decodeFromJsonElement<InlineOrgsCodeSecurityConf078bPostRequestJsonSecretScanningValidi3d40Xf5884fa6>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("name", value.name)
        value.advancedSecurity?.let { put("advanced_security", json.encodeToJsonElement(it)) }
        value.codeScanningDefaultSetup?.let { put("code_scanning_default_setup", json.encodeToJsonElement(it)) }
        value.codeScanningDefaultSetupOptions?.let { put("code_scanning_default_setup_options", json.encodeToJsonElement(it)) }
        value.codeScanningDelegatedAlertDismissal?.let { put("code_scanning_delegated_alert_dismissal", json.encodeToJsonElement(it)) }
        value.codeScanningOptions?.let { put("code_scanning_options", json.encodeToJsonElement(it)) }
        value.codeSecurity?.let { put("code_security", json.encodeToJsonElement(it)) }
        value.dependabotAlerts?.let { put("dependabot_alerts", json.encodeToJsonElement(it)) }
        value.dependabotDelegatedAlertDismissal?.let { put("dependabot_delegated_alert_dismissal", json.encodeToJsonElement(it)) }
        value.dependabotSecurityUpdates?.let { put("dependabot_security_updates", json.encodeToJsonElement(it)) }
        value.dependencyGraph?.let { put("dependency_graph", json.encodeToJsonElement(it)) }
        value.dependencyGraphAutosubmitAction?.let { put("dependency_graph_autosubmit_action", json.encodeToJsonElement(it)) }
        value.dependencyGraphAutosubmitActionOptions?.let { put("dependency_graph_autosubmit_action_options", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.enforcement?.let { put("enforcement", json.encodeToJsonElement(it)) }
        value.privateVulnerabilityReporting?.let { put("private_vulnerability_reporting", json.encodeToJsonElement(it)) }
        value.secretProtection?.let { put("secret_protection", json.encodeToJsonElement(it)) }
        value.secretScanning?.let { put("secret_scanning", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedAlertDismissal?.let { put("secret_scanning_delegated_alert_dismissal", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedBypass?.let { put("secret_scanning_delegated_bypass", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedBypassOptions?.let { put("secret_scanning_delegated_bypass_options", json.encodeToJsonElement(it)) }
        value.secretScanningExtendedMetadata?.let { put("secret_scanning_extended_metadata", json.encodeToJsonElement(it)) }
        value.secretScanningGenericSecrets?.let { put("secret_scanning_generic_secrets", json.encodeToJsonElement(it)) }
        value.secretScanningNonProviderPatterns?.let { put("secret_scanning_non_provider_patterns", json.encodeToJsonElement(it)) }
        value.secretScanningPushProtection?.let { put("secret_scanning_push_protection", json.encodeToJsonElement(it)) }
        value.secretScanningValidityChecks?.let { put("secret_scanning_validity_checks", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab(block: InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab.Builder.() -> Unit): InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab = InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsCodeSecurityConfigurationsPostRequestJsonX3a9710ab is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
