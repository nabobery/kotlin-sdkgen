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
 * `pending` files have not yet been processed, while `complete` means results from the SARIF have been stored. `failed`
 * files have either not been processed at all, or could only be partially processed.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-sarifs-status/properties/processing_status
 */
@Serializable(with = InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f.Serializer::class)
public sealed class InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `pending`.
   */
  public data object Pending : InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f() {
    public override val `value`: String = "pending"
  }

  /**
   * Documented value. Wire value: `complete`.
   */
  public data object Complete : InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f() {
    public override val `value`: String = "complete"
  }

  /**
   * Documented value. Wire value: `failed`.
   */
  public data object Failed : InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f() {
    public override val `value`: String = "failed"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f()

  public companion object {
    public fun fromValue(`value`: String): InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f = when (value) {
      Pending.value -> Pending
      Complete.value -> Complete
      Failed.value -> Failed
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineCodeScanningSarifsStatusProcessingStatusX9cf9371f) {
      encoder.encodeString(value.value)
    }
  }
}
