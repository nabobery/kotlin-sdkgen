package io.github.nabobery.sdkgen.generated.stripe

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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_discount/properties/object
 */
@Serializable(with = InlineDeletedDiscountObjectValueXdc86fb1c.Serializer::class)
public sealed class InlineDeletedDiscountObjectValueXdc86fb1c {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `discount`.
   */
  public data object Discount : InlineDeletedDiscountObjectValueXdc86fb1c() {
    public override val `value`: String = "discount"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedDiscountObjectValueXdc86fb1c()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedDiscountObjectValueXdc86fb1c = when (value) {
      Discount.value -> Discount
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedDiscountObjectValueXdc86fb1c> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedDiscountObjectValueXdc86fb1c", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedDiscountObjectValueXdc86fb1c = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedDiscountObjectValueXdc86fb1c) {
      encoder.encodeString(value.value)
    }
  }
}
