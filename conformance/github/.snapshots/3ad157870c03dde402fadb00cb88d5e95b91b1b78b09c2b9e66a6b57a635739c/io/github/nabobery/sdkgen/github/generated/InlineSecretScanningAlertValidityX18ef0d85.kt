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
 * The token status as of the latest validity check.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert/properties/validity
 */
@Serializable(with = InlineSecretScanningAlertValidityX18ef0d85.Serializer::class)
public sealed class InlineSecretScanningAlertValidityX18ef0d85 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineSecretScanningAlertValidityX18ef0d85() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineSecretScanningAlertValidityX18ef0d85() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineSecretScanningAlertValidityX18ef0d85() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningAlertValidityX18ef0d85()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningAlertValidityX18ef0d85 = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningAlertValidityX18ef0d85> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecretScanningAlertValidityX18ef0d85", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningAlertValidityX18ef0d85 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningAlertValidityX18ef0d85) {
      encoder.encodeString(value.value)
    }
  }
}
