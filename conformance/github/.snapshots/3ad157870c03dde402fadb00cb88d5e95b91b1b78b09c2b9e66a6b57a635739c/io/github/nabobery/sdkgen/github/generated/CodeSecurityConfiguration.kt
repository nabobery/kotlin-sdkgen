package io.github.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * A code security configuration
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration
 */
@Serializable(with = CodeSecurityConfiguration.Serializer::class)
public class CodeSecurityConfiguration(
  /**
   * The enablement status of GitHub Advanced Security
   */
  public val advancedSecurity: InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c? = null,
  /**
   * The enablement status of code scanning default setup
   */
  public val codeScanningDefaultSetup:
      InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0? = null,
  /**
   * Feature options for code scanning default setup
   */
  public val codeScanningDefaultSetupOptions:
      InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b? = null,
  /**
   * The enablement status of code scanning delegated alert dismissal
   */
  public val codeScanningDelegatedAlertDismissal:
      InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5? = null,
  /**
   * Feature options for code scanning
   */
  public val codeScanningOptions:
      InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  /**
   * The enablement status of Dependabot alerts
   */
  public val dependabotAlerts: InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb? = null,
  /**
   * The enablement status of Dependabot delegated alert dismissal
   */
  public val dependabotDelegatedAlertDismissal:
      InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf? = null,
  /**
   * The enablement status of Dependabot security updates
   */
  public val dependabotSecurityUpdates:
      InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a? = null,
  /**
   * The enablement status of Dependency Graph
   */
  public val dependencyGraph: InlineCodeSecurityConfigurationDependencyGraphX9f745047? = null,
  /**
   * The enablement status of Automatic dependency submission
   */
  public val dependencyGraphAutosubmitAction:
      InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db? = null,
  /**
   * Feature options for Automatic dependency submission
   */
  public val dependencyGraphAutosubmitActionOptions:
      InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983? = null,
  /**
   * A description of the code security configuration
   */
  public val description: String? = null,
  /**
   * The enforcement status for a security configuration
   */
  public val enforcement: InlineCodeSecurityConfigurationEnforcementXb0c1a504? = null,
  /**
   * The URL of the configuration
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  /**
   * The ID of the code security configuration
   */
  public val id: Int? = null,
  /**
   * The name of the code security configuration. Must be unique within the organization.
   */
  public val name: String? = null,
  /**
   * The enablement status of private vulnerability reporting
   */
  public val privateVulnerabilityReporting:
      InlineCodeSecurityConfigurationPrivateVulnerabilityReportingXa0e7be57? = null,
  /**
   * The enablement status of secret scanning
   */
  public val secretScanning: InlineCodeSecurityConfigurationSecretScanningX276838a0? = null,
  /**
   * The enablement status of secret scanning delegated alert dismissal
   */
  public val secretScanningDelegatedAlertDismissal:
      InlineCodeSecurityConfigurationSecretScanningDelegatedAlertDismissalX7e361c4a? = null,
  /**
   * The enablement status of secret scanning delegated bypass
   */
  public val secretScanningDelegatedBypass:
      InlineCodeSecurityConfigurationSecretScanningDelegatedBypassX4df7a559? = null,
  /**
   * Feature options for secret scanning delegated bypass
   */
  public val secretScanningDelegatedBypassOptions:
      InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48? = null,
  /**
   * The enablement status of secret scanning extended metadata
   */
  public val secretScanningExtendedMetadata:
      InlineCodeSecurityConfigurationSecretScanningExtendedMetadataXbb35a7db? = null,
  /**
   * The enablement status of Copilot secret scanning
   */
  public val secretScanningGenericSecrets:
      InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a? = null,
  /**
   * The enablement status of secret scanning non-provider patterns
   */
  public val secretScanningNonProviderPatterns:
      InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c? = null,
  /**
   * The enablement status of secret scanning push protection
   */
  public val secretScanningPushProtection:
      InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f? = null,
  /**
   * The enablement status of secret scanning validity checks
   */
  public val secretScanningValidityChecks:
      InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b? = null,
  /**
   * The type of the code security configuration.
   */
  public val targetType: InlineCodeSecurityConfigurationTargetTypeX36d17511? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  /**
   * The URL of the configuration
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
) {
  public class Builder {
    /**
     * The enablement status of GitHub Advanced Security
     */
    public var advancedSecurity: InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c? = null

    /**
     * The enablement status of code scanning default setup
     */
    public var codeScanningDefaultSetup:
        InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0? = null

    /**
     * Feature options for code scanning default setup
     */
    public var codeScanningDefaultSetupOptions:
        InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b? = null

    /**
     * The enablement status of code scanning delegated alert dismissal
     */
    public var codeScanningDelegatedAlertDismissal:
        InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5? = null

    /**
     * Feature options for code scanning
     */
    public var codeScanningOptions: InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6? =
        null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    /**
     * The enablement status of Dependabot alerts
     */
    public var dependabotAlerts: InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb? = null

    /**
     * The enablement status of Dependabot delegated alert dismissal
     */
    public var dependabotDelegatedAlertDismissal:
        InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf? = null

    /**
     * The enablement status of Dependabot security updates
     */
    public var dependabotSecurityUpdates:
        InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a? = null

    /**
     * The enablement status of Dependency Graph
     */
    public var dependencyGraph: InlineCodeSecurityConfigurationDependencyGraphX9f745047? = null

    /**
     * The enablement status of Automatic dependency submission
     */
    public var dependencyGraphAutosubmitAction:
        InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db? = null

    /**
     * Feature options for Automatic dependency submission
     */
    public var dependencyGraphAutosubmitActionOptions:
        InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983? = null

    /**
     * A description of the code security configuration
     */
    public var description: String? = null

    /**
     * The enforcement status for a security configuration
     */
    public var enforcement: InlineCodeSecurityConfigurationEnforcementXb0c1a504? = null

    /**
     * The URL of the configuration
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    /**
     * The ID of the code security configuration
     */
    public var id: Int? = null

    /**
     * The name of the code security configuration. Must be unique within the organization.
     */
    public var name: String? = null

    /**
     * The enablement status of private vulnerability reporting
     */
    public var privateVulnerabilityReporting:
        InlineCodeSecurityConfigurationPrivateVulnerabilityReportingXa0e7be57? = null

    /**
     * The enablement status of secret scanning
     */
    public var secretScanning: InlineCodeSecurityConfigurationSecretScanningX276838a0? = null

    /**
     * The enablement status of secret scanning delegated alert dismissal
     */
    public var secretScanningDelegatedAlertDismissal:
        InlineCodeSecurityConfigurationSecretScanningDelegatedAlertDismissalX7e361c4a? = null

    /**
     * The enablement status of secret scanning delegated bypass
     */
    public var secretScanningDelegatedBypass:
        InlineCodeSecurityConfigurationSecretScanningDelegatedBypassX4df7a559? = null

    /**
     * Feature options for secret scanning delegated bypass
     */
    public var secretScanningDelegatedBypassOptions:
        InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48? = null

    /**
     * The enablement status of secret scanning extended metadata
     */
    public var secretScanningExtendedMetadata:
        InlineCodeSecurityConfigurationSecretScanningExtendedMetadataXbb35a7db? = null

    /**
     * The enablement status of Copilot secret scanning
     */
    public var secretScanningGenericSecrets:
        InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a? = null

    /**
     * The enablement status of secret scanning non-provider patterns
     */
    public var secretScanningNonProviderPatterns:
        InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c? = null

    /**
     * The enablement status of secret scanning push protection
     */
    public var secretScanningPushProtection:
        InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f? = null

    /**
     * The enablement status of secret scanning validity checks
     */
    public var secretScanningValidityChecks:
        InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b? = null

    /**
     * The type of the code security configuration.
     */
    public var targetType: InlineCodeSecurityConfigurationTargetTypeX36d17511? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    /**
     * The URL of the configuration
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    public fun build(): CodeSecurityConfiguration = CodeSecurityConfiguration(
      advancedSecurity = advancedSecurity,
      codeScanningDefaultSetup = codeScanningDefaultSetup,
      codeScanningDefaultSetupOptions = codeScanningDefaultSetupOptions,
      codeScanningDelegatedAlertDismissal = codeScanningDelegatedAlertDismissal,
      codeScanningOptions = codeScanningOptions,
      createdAt = createdAt,
      dependabotAlerts = dependabotAlerts,
      dependabotDelegatedAlertDismissal = dependabotDelegatedAlertDismissal,
      dependabotSecurityUpdates = dependabotSecurityUpdates,
      dependencyGraph = dependencyGraph,
      dependencyGraphAutosubmitAction = dependencyGraphAutosubmitAction,
      dependencyGraphAutosubmitActionOptions = dependencyGraphAutosubmitActionOptions,
      description = description,
      enforcement = enforcement,
      htmlUrl = htmlUrl,
      id = id,
      name = name,
      privateVulnerabilityReporting = privateVulnerabilityReporting,
      secretScanning = secretScanning,
      secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal,
      secretScanningDelegatedBypass = secretScanningDelegatedBypass,
      secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions,
      secretScanningExtendedMetadata = secretScanningExtendedMetadata,
      secretScanningGenericSecrets = secretScanningGenericSecrets,
      secretScanningNonProviderPatterns = secretScanningNonProviderPatterns,
      secretScanningPushProtection = secretScanningPushProtection,
      secretScanningValidityChecks = secretScanningValidityChecks,
      targetType = targetType,
      updatedAt = updatedAt,
      url = url,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeSecurityConfiguration = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeSecurityConfiguration> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeSecurityConfiguration {
      val jsonDecoder = decoder.requireJsonDecoder("CodeSecurityConfiguration")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeSecurityConfiguration must be a JSON object")
      return CodeSecurityConfiguration(
        advancedSecurity = rawObject["advanced_security"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationAdvancedSecurityX3148d25c>(it) },
        codeScanningDefaultSetup = rawObject["code_scanning_default_setup"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationCodeScanningDefaultSetupX36f1a6e0>(it) },
        codeScanningDefaultSetupOptions = rawObject["code_scanning_default_setup_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeSecurityConfigurationCodeScanningDefaultSetupOptionsX6d15e54b?>(element) },
        codeScanningDelegatedAlertDismissal = rawObject["code_scanning_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationCodeScanningDelegatedAlertDismissalX5cd67cb5>(it) },
        codeScanningOptions = rawObject["code_scanning_options"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeSecurityConfigurationCodeScanningOptionsXc0a882e6?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        dependabotAlerts = rawObject["dependabot_alerts"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationDependabotAlertsX128ebdeb>(it) },
        dependabotDelegatedAlertDismissal = rawObject["dependabot_delegated_alert_dismissal"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineCodeSecurityConfigurationDependabotDelegatedAlertDismissalX6a2cbbbf?>(element) },
        dependabotSecurityUpdates = rawObject["dependabot_security_updates"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationDependabotSecurityUpdatesXc24d550a>(it) },
        dependencyGraph = rawObject["dependency_graph"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationDependencyGraphX9f745047>(it) },
        dependencyGraphAutosubmitAction = rawObject["dependency_graph_autosubmit_action"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionX9ee0c2db>(it) },
        dependencyGraphAutosubmitActionOptions = rawObject["dependency_graph_autosubmit_action_options"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983>(it) },
        description = rawObject["description"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        enforcement = rawObject["enforcement"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationEnforcementXb0c1a504>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        id = rawObject["id"]?.let { json.decodeFromJsonElement<Int>(it) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        privateVulnerabilityReporting = rawObject["private_vulnerability_reporting"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationPrivateVulnerabilityReportingXa0e7be57>(it) },
        secretScanning = rawObject["secret_scanning"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningX276838a0>(it) },
        secretScanningDelegatedAlertDismissal = rawObject["secret_scanning_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningDelegatedAlertDismissalX7e361c4a>(it) },
        secretScanningDelegatedBypass = rawObject["secret_scanning_delegated_bypass"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningDelegatedBypassX4df7a559>(it) },
        secretScanningDelegatedBypassOptions = rawObject["secret_scanning_delegated_bypass_options"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48>(it) },
        secretScanningExtendedMetadata = rawObject["secret_scanning_extended_metadata"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningExtendedMetadataXbb35a7db>(it) },
        secretScanningGenericSecrets = rawObject["secret_scanning_generic_secrets"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningGenericSecretsXc6f5cc0a>(it) },
        secretScanningNonProviderPatterns = rawObject["secret_scanning_non_provider_patterns"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningNonProviderPatternsX6493ac1c>(it) },
        secretScanningPushProtection = rawObject["secret_scanning_push_protection"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningPushProtectionX4421f51f>(it) },
        secretScanningValidityChecks = rawObject["secret_scanning_validity_checks"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationSecretScanningValidityChecksX65fc863b>(it) },
        targetType = rawObject["target_type"]?.let { json.decodeFromJsonElement<InlineCodeSecurityConfigurationTargetTypeX36d17511>(it) },
        updatedAt = rawObject["updated_at"]?.let { json.decodeFromJsonElement<String>(it) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeSecurityConfiguration) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeSecurityConfiguration")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.advancedSecurity?.let { put("advanced_security", json.encodeToJsonElement(it)) }
        value.codeScanningDefaultSetup?.let { put("code_scanning_default_setup", json.encodeToJsonElement(it)) }
        value.codeScanningDefaultSetupOptions?.let { put("code_scanning_default_setup_options", json.encodeToJsonElement(it)) }
        value.codeScanningDelegatedAlertDismissal?.let { put("code_scanning_delegated_alert_dismissal", json.encodeToJsonElement(it)) }
        value.codeScanningOptions?.let { put("code_scanning_options", json.encodeToJsonElement(it)) }
        value.createdAt?.let { put("created_at", it) }
        value.dependabotAlerts?.let { put("dependabot_alerts", json.encodeToJsonElement(it)) }
        value.dependabotDelegatedAlertDismissal?.let { put("dependabot_delegated_alert_dismissal", json.encodeToJsonElement(it)) }
        value.dependabotSecurityUpdates?.let { put("dependabot_security_updates", json.encodeToJsonElement(it)) }
        value.dependencyGraph?.let { put("dependency_graph", json.encodeToJsonElement(it)) }
        value.dependencyGraphAutosubmitAction?.let { put("dependency_graph_autosubmit_action", json.encodeToJsonElement(it)) }
        value.dependencyGraphAutosubmitActionOptions?.let { put("dependency_graph_autosubmit_action_options", json.encodeToJsonElement(it)) }
        value.description?.let { put("description", it) }
        value.enforcement?.let { put("enforcement", json.encodeToJsonElement(it)) }
        value.htmlUrl?.let { put("html_url", it) }
        value.id?.let { put("id", json.encodeToJsonElement(it)) }
        value.name?.let { put("name", it) }
        value.privateVulnerabilityReporting?.let { put("private_vulnerability_reporting", json.encodeToJsonElement(it)) }
        value.secretScanning?.let { put("secret_scanning", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedAlertDismissal?.let { put("secret_scanning_delegated_alert_dismissal", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedBypass?.let { put("secret_scanning_delegated_bypass", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedBypassOptions?.let { put("secret_scanning_delegated_bypass_options", json.encodeToJsonElement(it)) }
        value.secretScanningExtendedMetadata?.let { put("secret_scanning_extended_metadata", json.encodeToJsonElement(it)) }
        value.secretScanningGenericSecrets?.let { put("secret_scanning_generic_secrets", json.encodeToJsonElement(it)) }
        value.secretScanningNonProviderPatterns?.let { put("secret_scanning_non_provider_patterns", json.encodeToJsonElement(it)) }
        value.secretScanningPushProtection?.let { put("secret_scanning_push_protection", json.encodeToJsonElement(it)) }
        value.secretScanningValidityChecks?.let { put("secret_scanning_validity_checks", json.encodeToJsonElement(it)) }
        value.targetType?.let { put("target_type", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeSecurityConfiguration(block: CodeSecurityConfiguration.Builder.() -> Unit): CodeSecurityConfiguration = CodeSecurityConfiguration.build(block)
