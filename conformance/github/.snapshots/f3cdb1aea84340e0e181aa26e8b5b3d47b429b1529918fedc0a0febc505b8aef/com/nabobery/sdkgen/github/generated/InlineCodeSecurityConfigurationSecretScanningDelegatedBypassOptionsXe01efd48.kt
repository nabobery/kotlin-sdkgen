package com.nabobery.sdkgen.github.generated

import kotlin.Unit
import kotlin.collections.List
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
 * Feature options for secret scanning delegated bypass
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_delegated_byp
 * ass_options
 */
@Serializable(with = InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48.Serializer::class)
public class InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48(
  reviewers: List<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da>? = null,
) {
  /**
   * The bypass reviewers for secret scanning delegated bypass
   */
  public val reviewers:
      List<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da>? =
      reviewers?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var reviewersValue:
        List<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da>? = null

    /**
     * The bypass reviewers for secret scanning delegated bypass
     */
    public var reviewers:
        List<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da>?
      get() = reviewersValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        reviewersValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48 = InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48(
      reviewers = reviewers,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48 must be a JSON object")
      return InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48(
        reviewers = rawObject["reviewers"]?.let { json.decodeFromJsonElement<List<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemX267de7da>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.reviewers?.let { put("reviewers", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48(block: InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48.Builder.() -> Unit): InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48 = InlineCodeSecurityConfigurationSecretScanningDelegatedBypassOptionsXe01efd48.build(block)
