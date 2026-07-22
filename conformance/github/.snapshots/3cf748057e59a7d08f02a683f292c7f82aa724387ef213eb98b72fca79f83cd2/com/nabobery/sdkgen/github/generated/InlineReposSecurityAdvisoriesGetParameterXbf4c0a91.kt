package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

/**
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1security-advisories/get/parameters/7/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1security-advisories/get/parameters/7/schema
 */
@Serializable(with = InlineReposSecurityAdvisoriesGetParameterXbf4c0a91.Serializer::class)
public sealed class InlineReposSecurityAdvisoriesGetParameterXbf4c0a91 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `triage`.
   */
  public data object Triage : InlineReposSecurityAdvisoriesGetParameterXbf4c0a91() {
    public override val `value`: String = "triage"
  }

  /**
   * Documented value. Wire value: `draft`.
   */
  public data object Draft : InlineReposSecurityAdvisoriesGetParameterXbf4c0a91() {
    public override val `value`: String = "draft"
  }

  /**
   * Documented value. Wire value: `published`.
   */
  public data object Published : InlineReposSecurityAdvisoriesGetParameterXbf4c0a91() {
    public override val `value`: String = "published"
  }

  /**
   * Documented value. Wire value: `closed`.
   */
  public data object Closed : InlineReposSecurityAdvisoriesGetParameterXbf4c0a91() {
    public override val `value`: String = "closed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposSecurityAdvisoriesGetParameterXbf4c0a91()

  public companion object {
    public fun fromValue(`value`: String): InlineReposSecurityAdvisoriesGetParameterXbf4c0a91 = when (value) {
      Triage.value -> Triage
      Draft.value -> Draft
      Published.value -> Published
      Closed.value -> Closed
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposSecurityAdvisoriesGetParameterXbf4c0a91> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposSecurityAdvisoriesGetParameterXbf4c0a91", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposSecurityAdvisoriesGetParameterXbf4c0a91 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposSecurityAdvisoriesGetParameterXbf4c0a91) {
      encoder.encodeString(value.value)
    }
  }
}
