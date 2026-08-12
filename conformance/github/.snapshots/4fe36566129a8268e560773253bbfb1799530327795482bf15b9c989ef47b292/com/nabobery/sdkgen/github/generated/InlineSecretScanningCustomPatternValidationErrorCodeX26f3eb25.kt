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
 * A machine-readable code describing the error.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-custom-pattern-validation-error/properties/code
 */
@Serializable(with = InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25.Serializer::class)
public sealed class InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `none`.
   */
  public data object None : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "none"
  }

  /**
   * Documented value. Wire value: `config_load`.
   */
  public data object ConfigLoad : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "config_load"
  }

  /**
   * Documented value. Wire value: `compile_db`.
   */
  public data object CompileDb : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "compile_db"
  }

  /**
   * Documented value. Wire value: `start_delimiter`.
   */
  public data object StartDelimiter : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "start_delimiter"
  }

  /**
   * Documented value. Wire value: `end_delimiter`.
   */
  public data object EndDelimiter : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "end_delimiter"
  }

  /**
   * Documented value. Wire value: `display_name`.
   */
  public data object DisplayName : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "display_name"
  }

  /**
   * Documented value. Wire value: `must_match`.
   */
  public data object MustMatch : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "must_match"
  }

  /**
   * Documented value. Wire value: `must_not_match`.
   */
  public data object MustNotMatch : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "must_not_match"
  }

  /**
   * Documented value. Wire value: `custom_pattern_version_mismatch`.
   */
  public data object CustomPatternVersionMismatch : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "custom_pattern_version_mismatch"
  }

  /**
   * Documented value. Wire value: `db_size`.
   */
  public data object DbSize : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "db_size"
  }

  /**
   * Documented value. Wire value: `db_size_calculation`.
   */
  public data object DbSizeCalculation : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25() {
    public override val `value`: String = "db_size_calculation"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25 = when (value) {
      None.value -> None
      ConfigLoad.value -> ConfigLoad
      CompileDb.value -> CompileDb
      StartDelimiter.value -> StartDelimiter
      EndDelimiter.value -> EndDelimiter
      DisplayName.value -> DisplayName
      MustMatch.value -> MustMatch
      MustNotMatch.value -> MustNotMatch
      CustomPatternVersionMismatch.value -> CustomPatternVersionMismatch
      DbSize.value -> DbSize
      DbSizeCalculation.value -> DbSizeCalculation
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningCustomPatternValidationErrorCodeX26f3eb25) {
      encoder.encodeString(value.value)
    }
  }
}
