package com.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/get/parameters/1/schema/anyOf/1.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/get/parameters/1/schema/anyOf/1
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125.Serializer::class)
public sealed class InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: ``.
   */
  public data object Value : InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125() {
    public override val `value`: String = ""
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125 = when (value) {
      Value.value -> Value
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125) {
      encoder.encodeString(value.value)
    }
  }
}
