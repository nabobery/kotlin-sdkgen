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
 * String representing the object's type. Objects of the same type share the same value. Always has the value `list`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/get/responses/200/content/application~1json/s
 * chema/properties/object
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6.Serializer::class)
public sealed class InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsGetResponse200JsonObjectValueX54f1f8c6) {
      encoder.encodeString(value.value)
    }
  }
}
