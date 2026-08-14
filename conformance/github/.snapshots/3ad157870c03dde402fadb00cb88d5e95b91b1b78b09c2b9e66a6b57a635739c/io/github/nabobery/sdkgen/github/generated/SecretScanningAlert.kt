package io.github.nabobery.sdkgen.github.generated

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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert
 */
@Serializable(with = SecretScanningAlert.Serializer::class)
public class SecretScanningAlert(
  public val assignedTo: NullableSimpleUser? = null,
  /**
   * An optional comment from the closure request author.
   */
  public val closureRequestComment: String? = null,
  public val closureRequestReviewer: NullableSimpleUser? = null,
  /**
   * An optional comment from the closure request reviewer.
   */
  public val closureRequestReviewerComment: String? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String? = null,
  public val firstLocationDetected: NullableSecretScanningFirstDetectedLocation? = null,
  /**
   * A boolean value representing whether or not the token in the alert was detected in more than one location.
   */
  public val hasMoreLocations: Boolean? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val htmlUrl: String? = null,
  /**
   * A boolean value representing whether or not alert is base64 encoded
   */
  public val isBase64Encoded: Boolean? = null,
  /**
   * The REST API URL of the code locations for this alert.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val locationsUrl: String? = null,
  /**
   * Whether the detected secret was found in multiple repositories under the same organization or enterprise.
   */
  public val multiRepo: Boolean? = null,
  public val number: Int? = null,
  /**
   * The provider of the secret that was detected.
   */
  public val provider: String? = null,
  /**
   * The slug identifier for the provider of the secret that was detected. Use this value for filtering by provider with
   * the `providers` or `exclude_providers` parameters.
   */
  public val providerSlug: String? = null,
  /**
   * Whether the detected secret was publicly leaked.
   */
  public val publiclyLeaked: Boolean? = null,
  /**
   * An optional comment when requesting a push protection bypass.
   */
  public val pushProtectionBypassRequestComment: String? = null,
  /**
   * The URL to a push protection bypass request.
   *
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pushProtectionBypassRequestHtmlUrl: String? = null,
  public val pushProtectionBypassRequestReviewer: NullableSimpleUser? = null,
  /**
   * An optional comment when reviewing a push protection bypass.
   */
  public val pushProtectionBypassRequestReviewerComment: String? = null,
  /**
   * Whether push protection was bypassed for the detected secret.
   */
  public val pushProtectionBypassed: Boolean? = null,
  /**
   * The time that push protection was bypassed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val pushProtectionBypassedAt: String? = null,
  public val pushProtectionBypassedBy: NullableSimpleUser? = null,
  public val resolution: SecretScanningAlertResolution? = null,
  /**
   * An optional comment to resolve an alert.
   */
  public val resolutionComment: String? = null,
  /**
   * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   *
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val resolvedAt: String? = null,
  public val resolvedBy: NullableSimpleUser? = null,
  /**
   * The secret that was detected.
   */
  public val secret: String? = null,
  /**
   * The type of secret that secret scanning detected.
   */
  public val secretType: String? = null,
  /**
   * User-friendly name for the detected secret, matching the `secret_type`.
   * For a list of built-in patterns, see "[Supported secret scanning
   * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#sup
   * ported-secrets)."
   */
  public val secretTypeDisplayName: String? = null,
  public val state: SecretScanningAlertState? = null,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val updatedAt: String? = null,
  /**
   * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val url: String? = null,
  /**
   * The token status as of the latest validity check.
   */
  public val validity: InlineSecretScanningAlertValidityX18ef0d85? = null,
) {
  public class Builder {
    public var assignedTo: NullableSimpleUser? = null

    /**
     * An optional comment from the closure request author.
     */
    public var closureRequestComment: String? = null

    public var closureRequestReviewer: NullableSimpleUser? = null

    /**
     * An optional comment from the closure request reviewer.
     */
    public var closureRequestReviewerComment: String? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var createdAt: String? = null

    public var firstLocationDetected: NullableSecretScanningFirstDetectedLocation? = null

    /**
     * A boolean value representing whether or not the token in the alert was detected in more than one location.
     */
    public var hasMoreLocations: Boolean? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var htmlUrl: String? = null

    /**
     * A boolean value representing whether or not alert is base64 encoded
     */
    public var isBase64Encoded: Boolean? = null

    /**
     * The REST API URL of the code locations for this alert.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var locationsUrl: String? = null

    /**
     * Whether the detected secret was found in multiple repositories under the same organization or enterprise.
     */
    public var multiRepo: Boolean? = null

    public var number: Int? = null

    /**
     * The provider of the secret that was detected.
     */
    public var provider: String? = null

    /**
     * The slug identifier for the provider of the secret that was detected. Use this value for filtering by provider
     * with the `providers` or `exclude_providers` parameters.
     */
    public var providerSlug: String? = null

    /**
     * Whether the detected secret was publicly leaked.
     */
    public var publiclyLeaked: Boolean? = null

    /**
     * An optional comment when requesting a push protection bypass.
     */
    public var pushProtectionBypassRequestComment: String? = null

    /**
     * The URL to a push protection bypass request.
     *
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var pushProtectionBypassRequestHtmlUrl: String? = null

    public var pushProtectionBypassRequestReviewer: NullableSimpleUser? = null

    /**
     * An optional comment when reviewing a push protection bypass.
     */
    public var pushProtectionBypassRequestReviewerComment: String? = null

    /**
     * Whether push protection was bypassed for the detected secret.
     */
    public var pushProtectionBypassed: Boolean? = null

    /**
     * The time that push protection was bypassed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var pushProtectionBypassedAt: String? = null

    public var pushProtectionBypassedBy: NullableSimpleUser? = null

    public var resolution: SecretScanningAlertResolution? = null

    /**
     * An optional comment to resolve an alert.
     */
    public var resolutionComment: String? = null

    /**
     * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     *
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var resolvedAt: String? = null

    public var resolvedBy: NullableSimpleUser? = null

    /**
     * The secret that was detected.
     */
    public var secret: String? = null

    /**
     * The type of secret that secret scanning detected.
     */
    public var secretType: String? = null

    /**
     * User-friendly name for the detected secret, matching the `secret_type`.
     * For a list of built-in patterns, see "[Supported secret scanning
     * patterns](https://docs.github.com/code-security/secret-scanning/introduction/supported-secret-scanning-patterns#s
     * upported-secrets)."
     */
    public var secretTypeDisplayName: String? = null

    public var state: SecretScanningAlertState? = null

    /**
     * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var updatedAt: String? = null

    /**
     * Wire format: `uri`. Represented as `String` in this release; SDKGen does not validate this format.
     */
    public var url: String? = null

    /**
     * The token status as of the latest validity check.
     */
    public var validity: InlineSecretScanningAlertValidityX18ef0d85? = null

    public fun build(): SecretScanningAlert = SecretScanningAlert(
      assignedTo = assignedTo,
      closureRequestComment = closureRequestComment,
      closureRequestReviewer = closureRequestReviewer,
      closureRequestReviewerComment = closureRequestReviewerComment,
      createdAt = createdAt,
      firstLocationDetected = firstLocationDetected,
      hasMoreLocations = hasMoreLocations,
      htmlUrl = htmlUrl,
      isBase64Encoded = isBase64Encoded,
      locationsUrl = locationsUrl,
      multiRepo = multiRepo,
      number = number,
      provider = provider,
      providerSlug = providerSlug,
      publiclyLeaked = publiclyLeaked,
      pushProtectionBypassRequestComment = pushProtectionBypassRequestComment,
      pushProtectionBypassRequestHtmlUrl = pushProtectionBypassRequestHtmlUrl,
      pushProtectionBypassRequestReviewer = pushProtectionBypassRequestReviewer,
      pushProtectionBypassRequestReviewerComment = pushProtectionBypassRequestReviewerComment,
      pushProtectionBypassed = pushProtectionBypassed,
      pushProtectionBypassedAt = pushProtectionBypassedAt,
      pushProtectionBypassedBy = pushProtectionBypassedBy,
      resolution = resolution,
      resolutionComment = resolutionComment,
      resolvedAt = resolvedAt,
      resolvedBy = resolvedBy,
      secret = secret,
      secretType = secretType,
      secretTypeDisplayName = secretTypeDisplayName,
      state = state,
      updatedAt = updatedAt,
      url = url,
      validity = validity,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningAlert = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SecretScanningAlert> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningAlert {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningAlert")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningAlert must be a JSON object")
      return SecretScanningAlert(
        assignedTo = rawObject["assigned_to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        closureRequestComment = rawObject["closure_request_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        closureRequestReviewer = rawObject["closure_request_reviewer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        closureRequestReviewerComment = rawObject["closure_request_reviewer_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        firstLocationDetected = rawObject["first_location_detected"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSecretScanningFirstDetectedLocation?>(element) },
        hasMoreLocations = rawObject["has_more_locations"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        isBase64Encoded = rawObject["is_base64_encoded"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        locationsUrl = rawObject["locations_url"]?.let { json.decodeFromJsonElement<String>(it) },
        multiRepo = rawObject["multi_repo"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        number = rawObject["number"]?.let { json.decodeFromJsonElement<Int>(it) },
        provider = rawObject["provider"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        providerSlug = rawObject["provider_slug"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        publiclyLeaked = rawObject["publicly_leaked"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        pushProtectionBypassRequestComment = rawObject["push_protection_bypass_request_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        pushProtectionBypassRequestHtmlUrl = rawObject["push_protection_bypass_request_html_url"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        pushProtectionBypassRequestReviewer = rawObject["push_protection_bypass_request_reviewer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        pushProtectionBypassRequestReviewerComment = rawObject["push_protection_bypass_request_reviewer_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        pushProtectionBypassed = rawObject["push_protection_bypassed"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<Boolean?>(element) },
        pushProtectionBypassedAt = rawObject["push_protection_bypassed_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        pushProtectionBypassedBy = rawObject["push_protection_bypassed_by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        resolution = rawObject["resolution"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<SecretScanningAlertResolution?>(element) },
        resolutionComment = rawObject["resolution_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        resolvedAt = rawObject["resolved_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        resolvedBy = rawObject["resolved_by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        secret = rawObject["secret"]?.let { json.decodeFromJsonElement<String>(it) },
        secretType = rawObject["secret_type"]?.let { json.decodeFromJsonElement<String>(it) },
        secretTypeDisplayName = rawObject["secret_type_display_name"]?.let { json.decodeFromJsonElement<String>(it) },
        state = rawObject["state"]?.let { json.decodeFromJsonElement<SecretScanningAlertState>(it) },
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        validity = rawObject["validity"]?.let { json.decodeFromJsonElement<InlineSecretScanningAlertValidityX18ef0d85>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningAlert) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningAlert")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.assignedTo?.let { put("assigned_to", json.encodeToJsonElement(it)) }
        value.closureRequestComment?.let { put("closure_request_comment", it) }
        value.closureRequestReviewer?.let { put("closure_request_reviewer", json.encodeToJsonElement(it)) }
        value.closureRequestReviewerComment?.let { put("closure_request_reviewer_comment", it) }
        value.createdAt?.let { put("created_at", it) }
        value.firstLocationDetected?.let { put("first_location_detected", json.encodeToJsonElement(it)) }
        value.hasMoreLocations?.let { put("has_more_locations", json.encodeToJsonElement(it)) }
        value.htmlUrl?.let { put("html_url", it) }
        value.isBase64Encoded?.let { put("is_base64_encoded", json.encodeToJsonElement(it)) }
        value.locationsUrl?.let { put("locations_url", it) }
        value.multiRepo?.let { put("multi_repo", json.encodeToJsonElement(it)) }
        value.number?.let { put("number", json.encodeToJsonElement(it)) }
        value.provider?.let { put("provider", it) }
        value.providerSlug?.let { put("provider_slug", it) }
        value.publiclyLeaked?.let { put("publicly_leaked", json.encodeToJsonElement(it)) }
        value.pushProtectionBypassRequestComment?.let { put("push_protection_bypass_request_comment", it) }
        value.pushProtectionBypassRequestHtmlUrl?.let { put("push_protection_bypass_request_html_url", it) }
        value.pushProtectionBypassRequestReviewer?.let { put("push_protection_bypass_request_reviewer", json.encodeToJsonElement(it)) }
        value.pushProtectionBypassRequestReviewerComment?.let { put("push_protection_bypass_request_reviewer_comment", it) }
        value.pushProtectionBypassed?.let { put("push_protection_bypassed", json.encodeToJsonElement(it)) }
        value.pushProtectionBypassedAt?.let { put("push_protection_bypassed_at", it) }
        value.pushProtectionBypassedBy?.let { put("push_protection_bypassed_by", json.encodeToJsonElement(it)) }
        value.resolution?.let { put("resolution", json.encodeToJsonElement(it)) }
        value.resolutionComment?.let { put("resolution_comment", it) }
        value.resolvedAt?.let { put("resolved_at", it) }
        value.resolvedBy?.let { put("resolved_by", json.encodeToJsonElement(it)) }
        value.secret?.let { put("secret", it) }
        value.secretType?.let { put("secret_type", it) }
        value.secretTypeDisplayName?.let { put("secret_type_display_name", it) }
        value.state?.let { put("state", json.encodeToJsonElement(it)) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.validity?.let { put("validity", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningAlert(block: SecretScanningAlert.Builder.() -> Unit): SecretScanningAlert = SecretScanningAlert.build(block)
