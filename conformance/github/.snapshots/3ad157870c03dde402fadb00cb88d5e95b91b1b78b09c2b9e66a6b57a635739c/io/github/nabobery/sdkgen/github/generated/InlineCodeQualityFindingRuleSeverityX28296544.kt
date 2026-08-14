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
 * The severity of the rule used to detect the finding.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-finding-rule/properties/severity
 */
@Serializable(with = InlineCodeQualityFindingRuleSeverityX28296544.Serializer::class)
public sealed class InlineCodeQualityFindingRuleSeverityX28296544 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `error`.
   */
  public data object Error : InlineCodeQualityFindingRuleSeverityX28296544() {
    public override val `value`: String = "error"
  }

  /**
   * Documented value. Wire value: `warning`.
   */
  public data object Warning : InlineCodeQualityFindingRuleSeverityX28296544() {
    public override val `value`: String = "warning"
  }

  /**
   * Documented value. Wire value: `note`.
   */
  public data object Note : InlineCodeQualityFindingRuleSeverityX28296544() {
    public override val `value`: String = "note"
  }

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineCodeQualityFindingRuleSeverityX28296544() {
    public override val `value`: String = "none"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeQualityFindingRuleSeverityX28296544()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeQualityFindingRuleSeverityX28296544 = when (value) {
      Error.value -> Error
      Warning.value -> Warning
      Note.value -> Note
      None.value -> None
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeQualityFindingRuleSeverityX28296544> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineCodeQualityFindingRuleSeverityX28296544", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeQualityFindingRuleSeverityX28296544 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeQualityFindingRuleSeverityX28296544) {
      encoder.encodeString(value.value)
    }
  }
}
