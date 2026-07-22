package com.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-webhook.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-webhook
 */
@Serializable(with = SecretScanningAlertWebhook.Serializer::class)
public class SecretScanningAlertWebhook(
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
  public val createdAt: String? = null,
  public val htmlUrl: String? = null,
  /**
   * The REST API URL of the code locations for this alert.
   */
  public val locationsUrl: String? = null,
  public val metadata: List<InlineSecretScanningAlertMetadataItemX047497f2>? = null,
  /**
   * Whether the detected secret was found in multiple repositories in the same organization or business.
   */
  public val multiRepo: Boolean? = null,
  public val number: Int? = null,
  /**
   * The provider of the secret that was detected.
   */
  public val provider: String? = null,
  /**
   * The slug identifier for the provider of the secret that was detected.
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
   */
  public val pushProtectionBypassedAt: String? = null,
  public val pushProtectionBypassedBy: NullableSimpleUser? = null,
  public val resolution: SecretScanningAlertResolutionWebhook? = null,
  /**
   * An optional comment to resolve an alert.
   */
  public val resolutionComment: String? = null,
  /**
   * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
   */
  public val resolvedAt: String? = null,
  public val resolvedBy: NullableSimpleUser? = null,
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
  public val updatedAt: String? = null,
  public val url: String? = null,
  /**
   * The token status as of the latest validity check.
   */
  public val validity: InlineSecretScanningAlertWebhookValidityXe3c9475d? = null,
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

    public var createdAt: String? = null

    public var htmlUrl: String? = null

    /**
     * The REST API URL of the code locations for this alert.
     */
    public var locationsUrl: String? = null

    public var metadata: List<InlineSecretScanningAlertMetadataItemX047497f2>? = null

    /**
     * Whether the detected secret was found in multiple repositories in the same organization or business.
     */
    public var multiRepo: Boolean? = null

    public var number: Int? = null

    /**
     * The provider of the secret that was detected.
     */
    public var provider: String? = null

    /**
     * The slug identifier for the provider of the secret that was detected.
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
     */
    public var pushProtectionBypassedAt: String? = null

    public var pushProtectionBypassedBy: NullableSimpleUser? = null

    public var resolution: SecretScanningAlertResolutionWebhook? = null

    /**
     * An optional comment to resolve an alert.
     */
    public var resolutionComment: String? = null

    /**
     * The time that the alert was resolved in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     */
    public var resolvedAt: String? = null

    public var resolvedBy: NullableSimpleUser? = null

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

    public var updatedAt: String? = null

    public var url: String? = null

    /**
     * The token status as of the latest validity check.
     */
    public var validity: InlineSecretScanningAlertWebhookValidityXe3c9475d? = null

    public fun build(): SecretScanningAlertWebhook = SecretScanningAlertWebhook(
      assignedTo = assignedTo,
      closureRequestComment = closureRequestComment,
      closureRequestReviewer = closureRequestReviewer,
      closureRequestReviewerComment = closureRequestReviewerComment,
      createdAt = createdAt,
      htmlUrl = htmlUrl,
      locationsUrl = locationsUrl,
      metadata = metadata,
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
      secretType = secretType,
      secretTypeDisplayName = secretTypeDisplayName,
      updatedAt = updatedAt,
      url = url,
      validity = validity,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SecretScanningAlertWebhook = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<SecretScanningAlertWebhook> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningAlertWebhook {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningAlertWebhook")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SecretScanningAlertWebhook must be a JSON object")
      return SecretScanningAlertWebhook(
        assignedTo = rawObject["assigned_to"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        closureRequestComment = rawObject["closure_request_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        closureRequestReviewer = rawObject["closure_request_reviewer"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        closureRequestReviewerComment = rawObject["closure_request_reviewer_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        createdAt = rawObject["created_at"]?.let { json.decodeFromJsonElement<String>(it) },
        htmlUrl = rawObject["html_url"]?.let { json.decodeFromJsonElement<String>(it) },
        locationsUrl = rawObject["locations_url"]?.let { json.decodeFromJsonElement<String>(it) },
        metadata = rawObject["metadata"]?.let { json.decodeFromJsonElement<List<InlineSecretScanningAlertMetadataItemX047497f2>>(it) },
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
        resolution = rawObject["resolution"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<SecretScanningAlertResolutionWebhook?>(element) },
        resolutionComment = rawObject["resolution_comment"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        resolvedAt = rawObject["resolved_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        resolvedBy = rawObject["resolved_by"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<NullableSimpleUser?>(element) },
        secretType = rawObject["secret_type"]?.let { json.decodeFromJsonElement<String>(it) },
        secretTypeDisplayName = rawObject["secret_type_display_name"]?.let { json.decodeFromJsonElement<String>(it) },
        updatedAt = rawObject["updated_at"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        url = rawObject["url"]?.let { json.decodeFromJsonElement<String>(it) },
        validity = rawObject["validity"]?.let { json.decodeFromJsonElement<InlineSecretScanningAlertWebhookValidityXe3c9475d>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningAlertWebhook) {
      val jsonEncoder = encoder.requireJsonEncoder("SecretScanningAlertWebhook")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.assignedTo?.let { put("assigned_to", json.encodeToJsonElement(it)) }
        value.closureRequestComment?.let { put("closure_request_comment", it) }
        value.closureRequestReviewer?.let { put("closure_request_reviewer", json.encodeToJsonElement(it)) }
        value.closureRequestReviewerComment?.let { put("closure_request_reviewer_comment", it) }
        value.createdAt?.let { put("created_at", it) }
        value.htmlUrl?.let { put("html_url", it) }
        value.locationsUrl?.let { put("locations_url", it) }
        value.metadata?.let { put("metadata", json.encodeToJsonElement(it)) }
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
        value.secretType?.let { put("secret_type", it) }
        value.secretTypeDisplayName?.let { put("secret_type_display_name", it) }
        value.updatedAt?.let { put("updated_at", it) }
        value.url?.let { put("url", it) }
        value.validity?.let { put("validity", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun secretScanningAlertWebhook(block: SecretScanningAlertWebhook.Builder.() -> Unit): SecretScanningAlertWebhook = SecretScanningAlertWebhook.build(block)
