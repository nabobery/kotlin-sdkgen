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
 * The type of the bypass reviewer
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_delegated_byp
 * ass_options/properties/reviewers/items/properties/reviewer_type
 */
@Serializable(with = InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f.Serializer::class)
public sealed class InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `TEAM`.
   */
  public data object Team : InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f() {
    public override val `value`: String = "TEAM"
  }

  /**
   * Documented value. Wire value: `ROLE`.
   */
  public data object Role : InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f() {
    public override val `value`: String = "ROLE"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f = when (value) {
      Team.value -> Team
      Role.value -> Role
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewerTypeXddd03a4f) {
      encoder.encodeString(value.value)
    }
  }
}
