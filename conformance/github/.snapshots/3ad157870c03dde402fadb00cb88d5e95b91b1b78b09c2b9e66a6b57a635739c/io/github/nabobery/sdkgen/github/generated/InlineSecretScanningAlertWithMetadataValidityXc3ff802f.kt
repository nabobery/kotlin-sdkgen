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
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-alert-with-metadata/properties/validity
 */
@Serializable(with = InlineSecretScanningAlertWithMetadataValidityXc3ff802f.Serializer::class)
public sealed class InlineSecretScanningAlertWithMetadataValidityXc3ff802f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `active`.
   */
  public data object Active : InlineSecretScanningAlertWithMetadataValidityXc3ff802f() {
    public override val `value`: String = "active"
  }

  /**
   * Documented value. Wire value: `inactive`.
   */
  public data object Inactive : InlineSecretScanningAlertWithMetadataValidityXc3ff802f() {
    public override val `value`: String = "inactive"
  }

  /**
   * Documented value. Wire value: `unknown`.
   */
  public data object Unknown : InlineSecretScanningAlertWithMetadataValidityXc3ff802f() {
    public override val `value`: String = "unknown"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningAlertWithMetadataValidityXc3ff802f()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningAlertWithMetadataValidityXc3ff802f = when (value) {
      Active.value -> Active
      Inactive.value -> Inactive
      Unknown.value -> Unknown
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningAlertWithMetadataValidityXc3ff802f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineSecretScanningAlertWithMetadataValidityXc3ff802f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningAlertWithMetadataValidityXc3ff802f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningAlertWithMetadataValidityXc3ff802f) {
      encoder.encodeString(value.value)
    }
  }
}
