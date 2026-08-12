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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_apple_pay_domain/properties/object
 */
@Serializable(with = InlineDeletedApplePayDomainObjectValueX5338765b.Serializer::class)
public sealed class InlineDeletedApplePayDomainObjectValueX5338765b {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `apple_pay_domain`.
   */
  public data object ApplePayDomain : InlineDeletedApplePayDomainObjectValueX5338765b() {
    public override val `value`: String = "apple_pay_domain"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedApplePayDomainObjectValueX5338765b()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedApplePayDomainObjectValueX5338765b = when (value) {
      ApplePayDomain.value -> ApplePayDomain
      else -> SdkUnknown(value)
    }
  }

  internal object Serializer : KSerializer<InlineDeletedApplePayDomainObjectValueX5338765b> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedApplePayDomainObjectValueX5338765b", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedApplePayDomainObjectValueX5338765b = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedApplePayDomainObjectValueX5338765b) {
      encoder.encodeString(value.value)
    }
  }
}
