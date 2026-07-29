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
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_account/properties/object
 */
@Serializable(with = InlineDeletedAccountObjectValueXeedec02e.Serializer::class)
public sealed class InlineDeletedAccountObjectValueXeedec02e {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `account`.
   */
  public data object Account : InlineDeletedAccountObjectValueXeedec02e() {
    public override val `value`: String = "account"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineDeletedAccountObjectValueXeedec02e()

  public companion object {
    public fun fromValue(`value`: String): InlineDeletedAccountObjectValueXeedec02e = when (value) {
      Account.value -> Account
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineDeletedAccountObjectValueXeedec02e> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineDeletedAccountObjectValueXeedec02e", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineDeletedAccountObjectValueXeedec02e = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineDeletedAccountObjectValueXeedec02e) {
      encoder.encodeString(value.value)
    }
  }
}
