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
 * Whether to use labeled runners or standard GitHub runners.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/code_scanning_default_setup_o
 * ptions/properties/runner_type
 */
@Serializable(with = InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce.Serializer::class)
public sealed class InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `standard`.
   */
  public data object Standard : InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce() {
    public override val `value`: String = "standard"
  }

  /**
   * Documented value. Wire value: `labeled`.
   */
  public data object Labeled : InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce() {
    public override val `value`: String = "labeled"
  }

  /**
   * Documented value. Wire value: `not_set`.
   */
  public data object NotSet : InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce() {
    public override val `value`: String = "not_set"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce = when (value) {
      Standard.value -> Standard
      Labeled.value -> Labeled
      NotSet.value -> NotSet
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigur9da7CodeScanningDefaultS7103RunnerTypeX29a556ce) {
      encoder.encodeString(value.value)
    }
  }
}
