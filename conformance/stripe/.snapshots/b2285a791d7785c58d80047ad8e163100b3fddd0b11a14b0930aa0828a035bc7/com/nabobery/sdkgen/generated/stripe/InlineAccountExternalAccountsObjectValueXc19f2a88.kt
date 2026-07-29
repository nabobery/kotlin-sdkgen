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
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/external_accounts/properties/object
 */
@Serializable(with = InlineAccountExternalAccountsObjectValueXc19f2a88.Serializer::class)
public sealed class InlineAccountExternalAccountsObjectValueXc19f2a88 {
  public abstract val `value`: String

  /**
   * Documented value. Wire value: `list`.
   */
  public data object List : InlineAccountExternalAccountsObjectValueXc19f2a88() {
    public override val `value`: String = "list"
  }

  public data class SdkUnknown(
    public override val `value`: String,
  ) : InlineAccountExternalAccountsObjectValueXc19f2a88()

  public companion object {
    public fun fromValue(`value`: String): InlineAccountExternalAccountsObjectValueXc19f2a88 = when (value) {
      List.value -> List
      else -> SdkUnknown(value)
    }
  }

  public object Serializer : KSerializer<InlineAccountExternalAccountsObjectValueXc19f2a88> {
    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("com.nabobery.sdkgen.generated.stripe.InlineAccountExternalAccountsObjectValueXc19f2a88", PrimitiveKind.STRING)

    override fun deserialize(decoder: Decoder): InlineAccountExternalAccountsObjectValueXc19f2a88 = fromValue(decoder.decodeString())

    override fun serialize(encoder: Encoder, `value`: InlineAccountExternalAccountsObjectValueXc19f2a88) {
      encoder.encodeString(value.value)
    }
  }
}
