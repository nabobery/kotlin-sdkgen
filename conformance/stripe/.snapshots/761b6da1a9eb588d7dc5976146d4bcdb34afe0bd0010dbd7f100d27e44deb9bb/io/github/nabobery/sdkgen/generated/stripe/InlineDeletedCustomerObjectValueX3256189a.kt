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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_customer/properties/object
 */
@Serializable(with = InlineDeletedCustomerObjectValueX3256189a.Serializer::class)
public sealed class InlineDeletedCustomerObjectValueX3256189a {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `customer`.
   */
  public data object Customer : InlineDeletedCustomerObjectValueX3256189a() {
    public override val `value`: String = "customer"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedCustomerObjectValueX3256189a()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedCustomerObjectValueX3256189a = when (value) {
      Customer.value -> Customer
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedCustomerObjectValueX3256189a> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("io.github.nabobery.sdkgen.generated.stripe.InlineDeletedCustomerObjectValueX3256189a", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedCustomerObjectValueX3256189a = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedCustomerObjectValueX3256189a) {
      encoder.encodeString(value.value)
    }
  }
}
