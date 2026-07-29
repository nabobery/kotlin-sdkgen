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
 * String representing the object's type. Objects of the same type share the same value.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_tax_id/properties/object
 */
@Serializable(with = InlineDeletedTaxIdObjectValueX0eb6fde6.Serializer::class)
public sealed class InlineDeletedTaxIdObjectValueX0eb6fde6 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `tax_id`.
   */
  public data object TaxId : InlineDeletedTaxIdObjectValueX0eb6fde6() {
    public override val `value`: String = "tax_id"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedTaxIdObjectValueX0eb6fde6()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedTaxIdObjectValueX0eb6fde6 = when (value) {
      TaxId.value -> TaxId
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDeletedTaxIdObjectValueX0eb6fde6> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedTaxIdObjectValueX0eb6fde6", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedTaxIdObjectValueX0eb6fde6 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedTaxIdObjectValueX0eb6fde6) {
      encoder.encodeString(value.value)
    }
  }
}
