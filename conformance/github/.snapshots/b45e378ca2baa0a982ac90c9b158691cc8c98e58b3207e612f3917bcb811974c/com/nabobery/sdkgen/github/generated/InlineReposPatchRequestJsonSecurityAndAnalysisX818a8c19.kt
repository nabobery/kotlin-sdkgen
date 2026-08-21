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
 * Specify which security and analysis features to enable or disable for the repository.
 *
 * To use this parameter, you must have admin permissions for the repository or be an owner or security manager for the
 * organization that owns the repository. For more information, see "[Managing security managers in your
 * organization](https://docs.github.com/organizations/managing-peoples-access-to-your-organization-with-roles/managing-
 * security-managers-in-your-organization)."
 *
 * For example, to enable GitHub Advanced Security, use this data in the body of the `PATCH` request:
 * `{ "security_and_analysis": {"advanced_security": { "status": "enabled" } } }`.
 *
 * You can check which security and analysis features are currently enabled by using a `GET /repos/{owner}/{repo}`
 * request.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19.Serializer::class)
public class InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19 internal constructor(
  private val advancedSecurityState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07>,
  private val codeSecurityState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisCodeSecurityXdaeb0b6b>,
  private val secretScanningState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningX78d530d0>,
  private val secretScanningAiDetectionState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningAiDetectionX2813f369>,
  private val secretScanningDelegatedAlertDismissalState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432>,
  private val secretScanningDelegatedBypassState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega621bX176105d9>,
  private val secretScanningDelegatedBypassOptionsState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f>,
  private val secretScanningNonProviderPatternsState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningNonPro8605X875d29c1>,
  private val secretScanningPushProtectionState:
      FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb>,
) {
  /**
   * Use the `status` property to enable or disable GitHub Advanced Security for this repository.
   * For more information, see "[About GitHub Advanced
   * Security](/github/getting-started-with-github/learning-about-github/about-github-advanced-security)."
   *
   * For standalone Code Scanning or Secret Protection products, this parameter cannot be used.
   */
  public val advancedSecurity:
      InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07?
    get() = advancedSecurityState.valueOrNull()

  /**
   * Use the `status` property to enable or disable GitHub Code Security for this repository.
   */
  public val codeSecurity: InlineReposPatchRequestJsonSecurityAndAnalysisCodeSecurityXdaeb0b6b?
    get() = codeSecurityState.valueOrNull()

  /**
   * Use the `status` property to enable or disable secret scanning for this repository. For more information, see
   * "[About secret scanning](/code-security/secret-security/about-secret-scanning)."
   */
  public val secretScanning: InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningX78d530d0?
    get() = secretScanningState.valueOrNull()

  /**
   * Use the `status` property to enable or disable secret scanning AI detection for this repository. For more
   * information, see "[Responsible detection of generic secrets with
   * AI](https://docs.github.com/code-security/secret-scanning/using-advanced-secret-scanning-and-push-protection-featur
   * es/generic-secret-detection/responsible-ai-generic-secrets)."
   */
  public val secretScanningAiDetection:
      InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningAiDetectionX2813f369?
    get() = secretScanningAiDetectionState.valueOrNull()

  /**
   * Use the `status` property to enable or disable secret scanning delegated alert dismissal for this repository.
   */
  public val secretScanningDelegatedAlertDismissal:
      InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432?
    get() = secretScanningDelegatedAlertDismissalState.valueOrNull()

  /**
   * Use the `status` property to enable or disable secret scanning delegated bypass for this repository.
   */
  public val secretScanningDelegatedBypass:
      InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega621bX176105d9?
    get() = secretScanningDelegatedBypassState.valueOrNull()

  /**
   * Feature options for secret scanning delegated bypass.
   * This object is only honored when `security_and_analysis.secret_scanning_delegated_bypass.status` is set to
   * `enabled`.
   * You can send this object in the same request as `secret_scanning_delegated_bypass`, or update just the options in a
   * separate request.
   */
  public val secretScanningDelegatedBypassOptions:
      InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f?
    get() = secretScanningDelegatedBypassOptionsState.valueOrNull()

  /**
   * Use the `status` property to enable or disable secret scanning non-provider patterns for this repository. For more
   * information, see "[Supported secret scanning
   * patterns](/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#supported-secrets)."
   */
  public val secretScanningNonProviderPatterns:
      InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningNonPro8605X875d29c1?
    get() = secretScanningNonProviderPatternsState.valueOrNull()

  /**
   * Use the `status` property to enable or disable secret scanning push protection for this repository. For more
   * information, see "[Protecting pushes with secret
   * scanning](/code-security/secret-scanning/protecting-pushes-with-secret-scanning)."
   */
  public val secretScanningPushProtection:
      InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb?
    get() = secretScanningPushProtectionState.valueOrNull()

  public constructor() : this(advancedSecurityState = FieldState.Absent,
  codeSecurityState = FieldState.Absent,
  secretScanningState = FieldState.Absent,
  secretScanningAiDetectionState = FieldState.Absent,
  secretScanningDelegatedAlertDismissalState = FieldState.Absent,
  secretScanningDelegatedBypassState = FieldState.Absent,
  secretScanningDelegatedBypassOptionsState = FieldState.Absent,
  secretScanningNonProviderPatternsState = FieldState.Absent,
  secretScanningPushProtectionState = FieldState.Absent,
  )

  /**
   * Returns the wire presence of `advanced_security`.
   */
  public fun advancedSecurityPresence(): FieldPresence = advancedSecurityState.presence

  /**
   * Returns the wire presence of `code_security`.
   */
  public fun codeSecurityPresence(): FieldPresence = codeSecurityState.presence

  /**
   * Returns the wire presence of `secret_scanning`.
   */
  public fun secretScanningPresence(): FieldPresence = secretScanningState.presence

  /**
   * Returns the wire presence of `secret_scanning_ai_detection`.
   */
  public fun secretScanningAiDetectionPresence(): FieldPresence = secretScanningAiDetectionState.presence

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
   * Returns the wire presence of `secret_scanning_non_provider_patterns`.
   */
  public fun secretScanningNonProviderPatternsPresence(): FieldPresence = secretScanningNonProviderPatternsState.presence

  /**
   * Returns the wire presence of `secret_scanning_push_protection`.
   */
  public fun secretScanningPushProtectionPresence(): FieldPresence = secretScanningPushProtectionState.presence

  public class Builder {
    private var advancedSecurityState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07> =
        FieldState.Absent

    /**
     * Use the `status` property to enable or disable GitHub Advanced Security for this repository.
     * For more information, see "[About GitHub Advanced
     * Security](/github/getting-started-with-github/learning-about-github/about-github-advanced-security)."
     *
     * For standalone Code Scanning or Secret Protection products, this parameter cannot be used.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var advancedSecurity:
        InlineReposPatchRequestJsonSecurityAndAnalysisAdvancedSecurityX79744b07?
      get() = advancedSecurityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "advancedSecurity is not nullable; call unsetAdvancedSecurity() to omit it" }
        advancedSecurityState = FieldState.Value(present)
      }

    private var codeSecurityState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisCodeSecurityXdaeb0b6b> =
        FieldState.Absent

    /**
     * Use the `status` property to enable or disable GitHub Code Security for this repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var codeSecurity: InlineReposPatchRequestJsonSecurityAndAnalysisCodeSecurityXdaeb0b6b?
      get() = codeSecurityState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "codeSecurity is not nullable; call unsetCodeSecurity() to omit it" }
        codeSecurityState = FieldState.Value(present)
      }

    private var secretScanningState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningX78d530d0> =
        FieldState.Absent

    /**
     * Use the `status` property to enable or disable secret scanning for this repository. For more information, see
     * "[About secret scanning](/code-security/secret-security/about-secret-scanning)."
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanning:
        InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningX78d530d0?
      get() = secretScanningState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanning is not nullable; call unsetSecretScanning() to omit it" }
        secretScanningState = FieldState.Value(present)
      }

    private var secretScanningAiDetectionState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningAiDetectionX2813f369>
        = FieldState.Absent

    /**
     * Use the `status` property to enable or disable secret scanning AI detection for this repository. For more
     * information, see "[Responsible detection of generic secrets with
     * AI](https://docs.github.com/code-security/secret-scanning/using-advanced-secret-scanning-and-push-protection-feat
     * ures/generic-secret-detection/responsible-ai-generic-secrets)."
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningAiDetection:
        InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningAiDetectionX2813f369?
      get() = secretScanningAiDetectionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningAiDetection is not nullable; call unsetSecretScanningAiDetection() to omit it" }
        secretScanningAiDetectionState = FieldState.Value(present)
      }

    private var secretScanningDelegatedAlertDismissalState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432>
        = FieldState.Absent

    /**
     * Use the `status` property to enable or disable secret scanning delegated alert dismissal for this repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningDelegatedAlertDismissal:
        InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega870cX0c83a432?
      get() = secretScanningDelegatedAlertDismissalState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningDelegatedAlertDismissal is not nullable; call unsetSecretScanningDelegatedAlertDismissal() to omit it" }
        secretScanningDelegatedAlertDismissalState = FieldState.Value(present)
      }

    private var secretScanningDelegatedBypassState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega621bX176105d9>
        = FieldState.Absent

    /**
     * Use the `status` property to enable or disable secret scanning delegated bypass for this repository.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningDelegatedBypass:
        InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega621bX176105d9?
      get() = secretScanningDelegatedBypassState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningDelegatedBypass is not nullable; call unsetSecretScanningDelegatedBypass() to omit it" }
        secretScanningDelegatedBypassState = FieldState.Value(present)
      }

    private var secretScanningDelegatedBypassOptionsState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f>
        = FieldState.Absent

    /**
     * Feature options for secret scanning delegated bypass.
     * This object is only honored when `security_and_analysis.secret_scanning_delegated_bypass.status` is set to
     * `enabled`.
     * You can send this object in the same request as `secret_scanning_delegated_bypass`, or update just the options in
     * a separate request.
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningDelegatedBypassOptions:
        InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningDelega7d2cXdc4f602f?
      get() = secretScanningDelegatedBypassOptionsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningDelegatedBypassOptions is not nullable; call unsetSecretScanningDelegatedBypassOptions() to omit it" }
        secretScanningDelegatedBypassOptionsState = FieldState.Value(present)
      }

    private var secretScanningNonProviderPatternsState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningNonPro8605X875d29c1>
        = FieldState.Absent

    /**
     * Use the `status` property to enable or disable secret scanning non-provider patterns for this repository. For
     * more information, see "[Supported secret scanning
     * patterns](/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#supported-secrets)."
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningNonProviderPatterns:
        InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningNonPro8605X875d29c1?
      get() = secretScanningNonProviderPatternsState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningNonProviderPatterns is not nullable; call unsetSecretScanningNonProviderPatterns() to omit it" }
        secretScanningNonProviderPatternsState = FieldState.Value(present)
      }

    private var secretScanningPushProtectionState:
        FieldState<InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb>
        = FieldState.Absent

    /**
     * Use the `status` property to enable or disable secret scanning push protection for this repository. For more
     * information, see "[Protecting pushes with secret
     * scanning](/code-security/secret-scanning/protecting-pushes-with-secret-scanning)."
     * Assign a non-null value, or use the unset function to omit the property.
     */
    public var secretScanningPushProtection:
        InlineReposPatchRequestJsonSecurityAndAnalysisSecretScanningPushPr52c7X4e6776eb?
      get() = secretScanningPushProtectionState.valueOrNull()
      set(`value`) {
        val present = requireNotNull(value) { "secretScanningPushProtection is not nullable; call unsetSecretScanningPushProtection() to omit it" }
        secretScanningPushProtectionState = FieldState.Value(present)
      }

    /**
     * Omits `advanced_security` from serialized output.
     */
    public fun unsetAdvancedSecurity() {
      advancedSecurityState = FieldState.Absent
    }

    /**
     * Omits `code_security` from serialized output.
     */
    public fun unsetCodeSecurity() {
      codeSecurityState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning` from serialized output.
     */
    public fun unsetSecretScanning() {
      secretScanningState = FieldState.Absent
    }

    /**
     * Omits `secret_scanning_ai_detection` from serialized output.
     */
    public fun unsetSecretScanningAiDetection() {
      secretScanningAiDetectionState = FieldState.Absent
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

    public fun build(): InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19 = InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19(
      advancedSecurityState = advancedSecurityState,
      codeSecurityState = codeSecurityState,
      secretScanningState = secretScanningState,
      secretScanningAiDetectionState = secretScanningAiDetectionState,
      secretScanningDelegatedAlertDismissalState = secretScanningDelegatedAlertDismissalState,
      secretScanningDelegatedBypassState = secretScanningDelegatedBypassState,
      secretScanningDelegatedBypassOptionsState = secretScanningDelegatedBypassOptionsState,
      secretScanningNonProviderPatternsState = secretScanningNonProviderPatternsState,
      secretScanningPushProtectionState = secretScanningPushProtectionState,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19 must be a JSON object")
      return InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19(
        advancedSecurityState = json.decodeOptional(rawObject, "advanced_security", nullable = false),
        codeSecurityState = json.decodeOptional(rawObject, "code_security", nullable = false),
        secretScanningState = json.decodeOptional(rawObject, "secret_scanning", nullable = false),
        secretScanningAiDetectionState = json.decodeOptional(rawObject, "secret_scanning_ai_detection", nullable = false),
        secretScanningDelegatedAlertDismissalState = json.decodeOptional(rawObject, "secret_scanning_delegated_alert_dismissal", nullable = false),
        secretScanningDelegatedBypassState = json.decodeOptional(rawObject, "secret_scanning_delegated_bypass", nullable = false),
        secretScanningDelegatedBypassOptionsState = json.decodeOptional(rawObject, "secret_scanning_delegated_bypass_options", nullable = false),
        secretScanningNonProviderPatternsState = json.decodeOptional(rawObject, "secret_scanning_non_provider_patterns", nullable = false),
        secretScanningPushProtectionState = json.decodeOptional(rawObject, "secret_scanning_push_protection", nullable = false),
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        putState("advanced_security", value.advancedSecurityState, json::encodeToJsonElement)
        putState("code_security", value.codeSecurityState, json::encodeToJsonElement)
        putState("secret_scanning", value.secretScanningState, json::encodeToJsonElement)
        putState("secret_scanning_ai_detection", value.secretScanningAiDetectionState, json::encodeToJsonElement)
        putState("secret_scanning_delegated_alert_dismissal", value.secretScanningDelegatedAlertDismissalState, json::encodeToJsonElement)
        putState("secret_scanning_delegated_bypass", value.secretScanningDelegatedBypassState, json::encodeToJsonElement)
        putState("secret_scanning_delegated_bypass_options", value.secretScanningDelegatedBypassOptionsState, json::encodeToJsonElement)
        putState("secret_scanning_non_provider_patterns", value.secretScanningNonProviderPatternsState, json::encodeToJsonElement)
        putState("secret_scanning_push_protection", value.secretScanningPushProtectionState, json::encodeToJsonElement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19(block: InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19.Builder.() -> Unit): InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19 = InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19.build(block)

private fun <T> T?.toNullableFieldState(): FieldState<T> = if (this == null) FieldState.Null else FieldState.Value(this)

private inline fun <reified T> Json.decodeOptional(
  raw: JsonObject,
  name: String,
  nullable: Boolean,
): FieldState<T> {
  if (!raw.containsKey(name)) return FieldState.Absent
  val element = requireNotNull(raw[name])
  if (element == JsonNull) {
    if (!nullable) throw SerializationException("InlineReposPatchRequestJsonSecurityAndAnalysisX818a8c19 property '" + name + "' is not nullable")
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
