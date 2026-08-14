package io.github.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/secret_scanning_delegated_byp
 * ass_options/properties/reviewers/items/properties/mode
 */
@Serializable(with = InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89.Serializer::class)
public sealed class InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `ALWAYS`.
   */
  public data object Always : InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89() {
    public override val `value`: String = "ALWAYS"
  }

  /**
   * Documented value. Wire value: `EXEMPT`.
   */
  public data object Exempt : InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89() {
    public override val `value`: String = "EXEMPT"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89 = when (value) {
      Always.value -> Always
      Exempt.value -> Exempt
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigur9da7SecretScanningDelega7d2cReviewersItemModeXcc9aac89) {
      encoder.encodeString(value.value)
    }
  }
}
