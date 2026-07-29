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
 * The bypass mode for the reviewer
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}/patch/requestBody/content/application~1json/schema/prope
 * rties/security_and_analysis/properties/secret_scanning_delegated_bypass_options/properties/reviewers/items/properties
 * /mode
 */
@Serializable(with = InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f.Serializer::class)
public sealed class InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ALWAYS`.
   */
  public data object Always : InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f() {
    public override val `value`: String = "ALWAYS"
  }

  /**
   * Documented value. Wire value: `EXEMPT`.
   */
  public data object Exempt : InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f() {
    public override val `value`: String = "EXEMPT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f()

  public companion object {
    public fun fromValue(`value`: String): InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f = when (value) {
      Always.value -> Always
      Exempt.value -> Exempt
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposPatchRequestJsonSecurityAndAnalysisModeX6861066f) {
      encoder.encodeString(value.value)
    }
  }
}
