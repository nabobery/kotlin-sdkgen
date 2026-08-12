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
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1amount_details_line_items/get/responses/200/cont
 * ent/application~1json/schema/properties/object
 */
@Serializable(with = InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b.Serializer::class)
public sealed class InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b()

  public companion object {
    public fun fromValue(`value`: String): InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsAmou90b6GetResponse200JsonObjectValueXcf6c195b) {
      encoder.encodeString(value.value)
    }
  }
}
