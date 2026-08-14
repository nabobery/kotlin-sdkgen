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
 * Forward-compatible enum for
 * sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1alerts/get/parameters/11/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1repos~1{owner}~1{repo}~1code-scanning~1alerts/get/parameters/11/schema
 */
@Serializable(with = InlineReposCodeScanningAlertsGetParameterXccb2c4bc.Serializer::class)
public sealed class InlineReposCodeScanningAlertsGetParameterXccb2c4bc {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineReposCodeScanningAlertsGetParameterXccb2c4bc() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineReposCodeScanningAlertsGetParameterXccb2c4bc() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineReposCodeScanningAlertsGetParameterXccb2c4bc()

  public companion object {
    public fun fromValue(`value`: String): InlineReposCodeScanningAlertsGetParameterXccb2c4bc = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineReposCodeScanningAlertsGetParameterXccb2c4bc> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineReposCodeScanningAlertsGetParameterXccb2c4bc", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineReposCodeScanningAlertsGetParameterXccb2c4bc = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineReposCodeScanningAlertsGetParameterXccb2c4bc) {
      encoder.encodeString(value.value)
    }
  }
}
