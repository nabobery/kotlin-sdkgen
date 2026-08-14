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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-scanning~1alerts/get/parameters/9/schema.
 *
 * Source: sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-scanning~1alerts/get/parameters/9/schema
 */
@Serializable(with = InlineOrgsCodeScanningAlertsGetParameterX915a7987.Serializer::class)
public sealed class InlineOrgsCodeScanningAlertsGetParameterX915a7987 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `created`.
   */
  public data object Created : InlineOrgsCodeScanningAlertsGetParameterX915a7987() {
    public override val `value`: String = "created"
  }

  /**
   * Documented value. Wire value: `updated`.
   */
  public data object Updated : InlineOrgsCodeScanningAlertsGetParameterX915a7987() {
    public override val `value`: String = "updated"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineOrgsCodeScanningAlertsGetParameterX915a7987()

  public companion object {
    public fun fromValue(`value`: String): InlineOrgsCodeScanningAlertsGetParameterX915a7987 = when (value) {
      Created.value -> Created
      Updated.value -> Updated
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineOrgsCodeScanningAlertsGetParameterX915a7987> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.github.generated.InlineOrgsCodeScanningAlertsGetParameterX915a7987", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineOrgsCodeScanningAlertsGetParameterX915a7987 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeScanningAlertsGetParameterX915a7987) {
      encoder.encodeString(value.value)
    }
  }
}
