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
 * Forward-compatible enum for sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-alert-sort/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/components/parameters/secret-scanning-alert-sort/schema
 */
@Serializable(with = InlineSecretScanningAlertSortParameterXabb1dc87.Serializer::class)
public sealed class InlineSecretScanningAlertSortParameterXabb1dc87 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineSecretScanningAlertSortParameterXabb1dc87() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineSecretScanningAlertSortParameterXabb1dc87() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineSecretScanningAlertSortParameterXabb1dc87()

  public companion object {
    public fun fromValue(`value`: String): InlineSecretScanningAlertSortParameterXabb1dc87 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineSecretScanningAlertSortParameterXabb1dc87> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.github.generated.InlineSecretScanningAlertSortParameterXabb1dc87", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineSecretScanningAlertSortParameterXabb1dc87 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineSecretScanningAlertSortParameterXabb1dc87) {
      encoder.encodeString(value.value)
    }
  }
}
