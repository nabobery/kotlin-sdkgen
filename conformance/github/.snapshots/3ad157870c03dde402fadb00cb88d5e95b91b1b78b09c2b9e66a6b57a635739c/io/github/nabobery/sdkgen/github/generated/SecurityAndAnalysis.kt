package io.github.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/security-and-analysis
 */
@Serializable(with = SecurityAndAnalysis.Serializer::class)
public class SecurityAndAnalysis(
  /**
   * Enable or disable GitHub Advanced Security for the repository.
   *
   * For standalone Code Scanning or Secret Protection products, this parameter cannot be used.
   *
   */
  public val advancedSecurity: InlineSecurityAndAnalysisAdvancedSecurityX6054040d? = null,
  public val codeSecurity: InlineSecurityAndAnalysisCodeSecurityX778175bb? = null,
  /**
   * Enable or disable Dependabot security updates for the repository.
   */
  public val dependabotSecurityUpdates:
      InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63? = null,
  public val secretScanning: InlineSecurityAndAnalysisSecretScanningX2f854b26? = null,
  public val secretScanningAiDetection:
      InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01? = null,
  public val secretScanningDelegatedAlertDismissal:
      InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038? = null,
  public val secretScanningDelegatedBypass:
      InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019? = null,
  public val secretScanningDelegatedBypassOptions:
      InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8? = null,
  public val secretScanningNonProviderPatterns:
      InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17? = null,
  public val secretScanningPushProtection:
      InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e? = null,
) {
  public class Builder {
    /**
     * Enable or disable GitHub Advanced Security for the repository.
     *
     * For standalone Code Scanning or Secret Protection products, this parameter cannot be used.
     *
     */
    public var advancedSecurity: InlineSecurityAndAnalysisAdvancedSecurityX6054040d? = null

    public var codeSecurity: InlineSecurityAndAnalysisCodeSecurityX778175bb? = null

    /**
     * Enable or disable Dependabot security updates for the repository.
     */
    public var dependabotSecurityUpdates:
        InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63? = null

    public var secretScanning: InlineSecurityAndAnalysisSecretScanningX2f854b26? = null

    public var secretScanningAiDetection:
        InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01? = null

    public var secretScanningDelegatedAlertDismissal:
        InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038? = null

    public var secretScanningDelegatedBypass:
        InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019? = null

    public var secretScanningDelegatedBypassOptions:
        InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8? = null

    public var secretScanningNonProviderPatterns:
        InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17? = null

    public var secretScanningPushProtection:
        InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e? = null

    public fun build(): SecurityAndAnalysis = SecurityAndAnalysis(
      advancedSecurity = advancedSecurity,
      codeSecurity = codeSecurity,
      dependabotSecurityUpdates = dependabotSecurityUpdates,
      secretScanning = secretScanning,
      secretScanningAiDetection = secretScanningAiDetection,
      secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal,
      secretScanningDelegatedBypass = secretScanningDelegatedBypass,
      secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions,
      secretScanningNonProviderPatterns = secretScanningNonProviderPatterns,
      secretScanningPushProtection = secretScanningPushProtection,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecurityAndAnalysis = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecurityAndAnalysis> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecurityAndAnalysis {
      val jsonDecoder = decoder.requireJsonDecoder("SecurityAndAnalysis")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecurityAndAnalysis must be a JSON object")
      return SecurityAndAnalysis(
        advancedSecurity = rawObject["advanced_security"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisAdvancedSecurityX6054040d>(it) },
        codeSecurity = rawObject["code_security"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisCodeSecurityX778175bb>(it) },
        dependabotSecurityUpdates = rawObject["dependabot_security_updates"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisDependabotSecurityUpdatesX809d7c63>(it) },
        secretScanning = rawObject["secret_scanning"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningX2f854b26>(it) },
        secretScanningAiDetection = rawObject["secret_scanning_ai_detection"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningAiDetectionX32d9bc01>(it) },
        secretScanningDelegatedAlertDismissal = rawObject["secret_scanning_delegated_alert_dismissal"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningDelegatedAlertDismissalX20cc0038>(it) },
        secretScanningDelegatedBypass = rawObject["secret_scanning_delegated_bypass"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningDelegatedBypassXe46ff019>(it) },
        secretScanningDelegatedBypassOptions = rawObject["secret_scanning_delegated_bypass_options"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningDelegatedBypassOptionsX382fa4c8>(it) },
        secretScanningNonProviderPatterns = rawObject["secret_scanning_non_provider_patterns"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningNonProviderPatternsX29429d17>(it) },
        secretScanningPushProtection = rawObject["secret_scanning_push_protection"]?.let { json.decodeFromJsonElement<InlineSecurityAndAnalysisSecretScanningPushProtectionX94de248e>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecurityAndAnalysis) {
      val jsonEncoder = encoder.requireJsonEncoder("SecurityAndAnalysis")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.advancedSecurity?.let { put("advanced_security", json.encodeToJsonElement(it)) }
        value.codeSecurity?.let { put("code_security", json.encodeToJsonElement(it)) }
        value.dependabotSecurityUpdates?.let { put("dependabot_security_updates", json.encodeToJsonElement(it)) }
        value.secretScanning?.let { put("secret_scanning", json.encodeToJsonElement(it)) }
        value.secretScanningAiDetection?.let { put("secret_scanning_ai_detection", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedAlertDismissal?.let { put("secret_scanning_delegated_alert_dismissal", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedBypass?.let { put("secret_scanning_delegated_bypass", json.encodeToJsonElement(it)) }
        value.secretScanningDelegatedBypassOptions?.let { put("secret_scanning_delegated_bypass_options", json.encodeToJsonElement(it)) }
        value.secretScanningNonProviderPatterns?.let { put("secret_scanning_non_provider_patterns", json.encodeToJsonElement(it)) }
        value.secretScanningPushProtection?.let { put("secret_scanning_push_protection", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun securityAndAnalysis(block: SecurityAndAnalysis.Builder.() -> Unit): SecurityAndAnalysis = SecurityAndAnalysis.build(block)
