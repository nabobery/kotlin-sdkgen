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
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations/post/requestBody/conte
 * nt/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1enterprises~1{enterprise}~1code-security~1configurations/post/requestBody/conte
 * nt/application~1json/schema
 */
@Serializable(with = InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23.Serializer::class)
public class InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23(
  /**
   * The name of the code security configuration. Must be unique within the enterprise.
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
      InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295? = null,
  /**
   * The enablement status of code scanning default setup
   */
  public val codeScanningDefaultSetup:
      InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDefaultSetupXc190c8fb? = null,
  public val codeScanningDefaultSetupOptions: CodeScanningDefaultSetupOptions? = null,
  /**
   * The enablement status of code scanning delegated alert dismissal
   */
  public val codeScanningDelegatedAlertDismissal:
      InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8? = null,
  public val codeScanningOptions: CodeScanningOptions? = null,
  /**
   * The enablement status of GitHub Code Security features.
   */
  public val codeSecurity:
      InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a? = null,
  /**
   * The enablement status of Dependabot alerts
   */
  public val dependabotAlerts:
      InlineEnterprisesCodeSecur4e22PostRequestJsonDependabotAlertsX3b675fa7? = null,
  /**
   * The enablement status of Dependabot security updates
   */
  public val dependabotSecurityUpdates:
      InlineEnterprisesCodeSecur4e22PostRequestJsonDependabotSecurityUpc95aXf16d649a? = null,
  /**
   * The enablement status of Dependency Graph
   */
  public val dependencyGraph:
      InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphX6fd1dbac? = null,
  /**
   * The enablement status of Automatic dependency submission
   */
  public val dependencyGraphAutosubmitAction:
      InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutos53b4X6bef6e15? = null,
  /**
   * Feature options for Automatic dependency submission
   */
  public val dependencyGraphAutosubmitActionOptions:
      InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a? = null,
  /**
   * A description of the code security configuration
   */
  public val description: String? = null,
  /**
   * The enforcement status for a security configuration
   */
  public val enforcement:
      InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7? = null,
  /**
   * The enablement status of private vulnerability reporting
   */
  public val privateVulnerabilityReporting:
      InlineEnterprisesCodeSecur4e22PostRequestJsonPrivateVulnerabilitycdadX38dc19b4? = null,
  /**
   * The enablement status of GitHub Secret Protection features.
   */
  public val secretProtection:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretProtectionX1fc9a6fa? = null,
  /**
   * The enablement status of secret scanning
   */
  public val secretScanning:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningX2469742f? = null,
  /**
   * The enablement status of secret scanning delegated alert dismissal
   */
  public val secretScanningDelegatedAlertDismissal:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningDelega870cXc469a306? = null,
  /**
   * The enablement status of secret scanning extended metadata
   */
  public val secretScanningExtendedMetadata:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningExtende828X98899a08? = null,
  /**
   * The enablement status of Copilot secret scanning
   */
  public val secretScanningGenericSecrets:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningGeneria531Xa810495f? = null,
  /**
   * The enablement status of secret scanning non provider patterns
   */
  public val secretScanningNonProviderPatterns:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningNonPro8605X2b56aed1? = null,
  /**
   * The enablement status of secret scanning push protection
   */
  public val secretScanningPushProtection:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningPushPr52c7Xc294484b? = null,
  /**
   * The enablement status of secret scanning validity checks
   */
  public val secretScanningValidityChecks:
      InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningValidi3d40X57af9bd4? = null,
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
        InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295? = null

    /**
     * The enablement status of code scanning default setup
     */
    public var codeScanningDefaultSetup:
        InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDefaultSetupXc190c8fb? = null

    public var codeScanningDefaultSetupOptions: CodeScanningDefaultSetupOptions? = null

    /**
     * The enablement status of code scanning delegated alert dismissal
     */
    public var codeScanningDelegatedAlertDismissal:
        InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8? = null

    public var codeScanningOptions: CodeScanningOptions? = null

    /**
     * The enablement status of GitHub Code Security features.
     */
    public var codeSecurity:
        InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a? = null

    /**
     * The enablement status of Dependabot alerts
     */
    public var dependabotAlerts:
        InlineEnterprisesCodeSecur4e22PostRequestJsonDependabotAlertsX3b675fa7? = null

    /**
     * The enablement status of Dependabot security updates
     */
    public var dependabotSecurityUpdates:
        InlineEnterprisesCodeSecur4e22PostRequestJsonDependabotSecurityUpc95aXf16d649a? = null

    /**
     * The enablement status of Dependency Graph
     */
    public var dependencyGraph:
        InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphX6fd1dbac? = null

    /**
     * The enablement status of Automatic dependency submission
     */
    public var dependencyGraphAutosubmitAction:
        InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutos53b4X6bef6e15? = null

    /**
     * Feature options for Automatic dependency submission
     */
    public var dependencyGraphAutosubmitActionOptions:
        InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a? = null

    /**
     * A description of the code security configuration
     */
    public var description: String? = null

    /**
     * The enforcement status for a security configuration
     */
    public var enforcement:
        InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7? = null

    /**
     * The enablement status of private vulnerability reporting
     */
    public var privateVulnerabilityReporting:
        InlineEnterprisesCodeSecur4e22PostRequestJsonPrivateVulnerabilitycdadX38dc19b4? = null

    /**
     * The enablement status of GitHub Secret Protection features.
     */
    public var secretProtection:
        InlineEnterprisesCodeSecur4e22PostRequestJsonSecretProtectionX1fc9a6fa? = null

    /**
     * The enablement status of secret scanning
     */
    public var secretScanning: InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningX2469742f?
        = null

    /**
     * The enablement status of secret scanning delegated alert dismissal
     */
    public var secretScanningDelegatedAlertDismissal:
        InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningDelega870cXc469a306? = null

    /**
     * The enablement status of secret scanning extended metadata
     */
    public var secretScanningExtendedMetadata:
        InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningExtende828X98899a08? = null

    /**
     * The enablement status of Copilot secret scanning
     */
    public var secretScanningGenericSecrets:
        InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningGeneria531Xa810495f? = null

    /**
     * The enablement status of secret scanning non provider patterns
     */
    public var secretScanningNonProviderPatterns:
        InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningNonPro8605X2b56aed1? = null

    /**
     * The enablement status of secret scanning push protection
     */
    public var secretScanningPushProtection:
        InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningPushPr52c7Xc294484b? = null

    /**
     * The enablement status of secret scanning validity checks
     */
    public var secretScanningValidityChecks:
        InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningValidi3d40X57af9bd4? = null

    public fun build(): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23 {
      check(nameValue != null) { "name is required" }
      return InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23(
        name = name,
        advancedSecurity = advancedSecurity,
        codeScanningDefaultSetup = codeScanningDefaultSetup,
        codeScanningDefaultSetupOptions = codeScanningDefaultSetupOptions,
        codeScanningDelegatedAlertDismissal = codeScanningDelegatedAlertDismissal,
        codeScanningOptions = codeScanningOptions,
        codeSecurity = codeSecurity,
        dependabotAlerts = dependabotAlerts,
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
        secretScanningExtendedMetadata = secretScanningExtendedMetadata,
        secretScanningGenericSecrets = secretScanningGenericSecrets,
        secretScanningNonProviderPatterns = secretScanningNonProviderPatterns,
        secretScanningPushProtection = secretScanningPushProtection,
        secretScanningValidityChecks = secretScanningValidityChecks,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23 must be a JSON object")
      val name = json.decodeRequired<String>(rawObject, "name")
      return InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23(
        name = name,
        advancedSecurity = rawObject["advanced_security"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonAdvancedSecurityX57dd2295>(it) },
        codeScanningDefaultSetup = rawObject["code_scanning_default_setup"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDefaultSetupXc190c8fb>(it) },
        codeScanningDefaultSetupOptions = rawObject["code_scanning_default_setup_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CodeScanningDefaultSetupOptions?>(element) },
        codeScanningDelegatedAlertDismissal = rawObject["code_scanning_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonCodeScanningDelegate8e9dX360f05e8>(it) },
        codeScanningOptions = rawObject["code_scanning_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<CodeScanningOptions?>(element) },
        codeSecurity = rawObject["code_security"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonCodeSecurityX8138d27a>(it) },
        dependabotAlerts = rawObject["dependabot_alerts"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonDependabotAlertsX3b675fa7>(it) },
        dependabotSecurityUpdates = rawObject["dependabot_security_updates"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonDependabotSecurityUpc95aXf16d649a>(it) },
        dependencyGraph = rawObject["dependency_graph"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphX6fd1dbac>(it) },
        dependencyGraphAutosubmitAction = rawObject["dependency_graph_autosubmit_action"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutos53b4X6bef6e15>(it) },
        dependencyGraphAutosubmitActionOptions = rawObject["dependency_graph_autosubmit_action_options"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonDependencyGraphAutosfecdX023e183a>(it) },
        description = rawObject["description"]?.let { json.decodeFromJsonElement<String>(it) },
        enforcement = rawObject["enforcement"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonEnforcementX75dcd0b7>(it) },
        privateVulnerabilityReporting = rawObject["private_vulnerability_reporting"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonPrivateVulnerabilitycdadX38dc19b4>(it) },
        secretProtection = rawObject["secret_protection"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretProtectionX1fc9a6fa>(it) },
        secretScanning = rawObject["secret_scanning"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningX2469742f>(it) },
        secretScanningDelegatedAlertDismissal = rawObject["secret_scanning_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningDelega870cXc469a306>(it) },
        secretScanningExtendedMetadata = rawObject["secret_scanning_extended_metadata"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningExtende828X98899a08>(it) },
        secretScanningGenericSecrets = rawObject["secret_scanning_generic_secrets"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningGeneria531Xa810495f>(it) },
        secretScanningNonProviderPatterns = rawObject["secret_scanning_non_provider_patterns"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningNonPro8605X2b56aed1>(it) },
        secretScanningPushProtection = rawObject["secret_scanning_push_protection"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningPushPr52c7Xc294484b>(it) },
        secretScanningValidityChecks = rawObject["secret_scanning_validity_checks"]?.let { json.decodeFromJsonElement<InlineEnterprisesCodeSecur4e22PostRequestJsonSecretScanningValidi3d40X57af9bd4>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23")
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

public fun inlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23(block: InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23.Builder.() -> Unit): InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23 = InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineEnterprisesCodeSecurityConfigurationsPostRequestJsonX9291dc23 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
